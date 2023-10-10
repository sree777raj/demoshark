package com.fdx.service.recipient;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fdx.api.entities.recipient.Intermediary;
import com.fdx.api.entities.recipient.Recipient;
import com.fdx.api.entities.recipient.RegistryReference;
import com.fdx.api.entities.recipient.RegistryReferenceMapping;
import com.fdx.api.repositories.recipient.RecipientRepository;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxConstants;
import com.fdx.common.util.FdxUtil;
import org.apache.hc.client5.http.classic.methods.HttpDelete;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * Service class for recipient entity.
 */
@Service
public class RecipientService {

  private static final Logger LOGGER = LoggerFactory.getLogger(RecipientService.class);

  @Autowired
  HttpServletRequest request;

  @Value("${fdx.ri.auth.server.uri}")
  private String fdxRIAuthServerURI;

  private final RecipientRepository recipientRepository;

  public RecipientService(RecipientRepository recipientRepository) {
    this.recipientRepository = recipientRepository;
  }

  /**
   * Creates a Recipient Record.
   *
   * @param recipientRequest data used for creation
   * @return created recipient data as json
   */
  public String postRecipient(Object recipientRequest) throws FDXException {
    ObjectMapper mapper = FdxUtil.getObjectMapper();
    Recipient recipientInput = mapper.convertValue(recipientRequest,
        new TypeReference<>() {
        });
    if (recipientRepository.existsById(recipientInput.getClientId())) {
      throw new FDXException("Recipient already exist with client_id: " + recipientInput.getClientId(), 0);
    }
    addRegisteredClientValues(recipientRequest, recipientInput);
    recipientInput.setAuditInfo(FdxUtil.getAuditInfo(request));
    recipientInput.setStatus("Approved");
    if (recipientInput.getDurationPeriod() == null) {
      recipientInput.setDurationPeriod(FdxConstants.OAUTH2_DEFAULT_CONSENT_DURATION_DAYS);
    }
    if (recipientInput.getRegistryReferences() != null && !recipientInput.getRegistryReferences().isEmpty()) {
      RegistryReferenceMapping recipientRegistryReferenceMapping =
          new RegistryReferenceMapping();
      for (RegistryReference registryReference :
          recipientInput.getRegistryReferences()) {
        registryReference.setRegistryReferenceMapping(recipientRegistryReferenceMapping);
      }
      recipientRegistryReferenceMapping.setRegistryReferences(recipientInput.getRegistryReferences());
      recipientInput.setRegistryReferenceMapping(recipientRegistryReferenceMapping);
    }
    saveIntermediaries(recipientInput);
    Recipient recipient = recipientRepository.save(recipientInput);
    return getRecipient(recipientInput.getClientId(), recipient);
  }

  /**
   * Adds registered client values to the recipient.
   *
   * @param recipientRequest value
   * @param recipientInput   value
   * @throws FDXException exception
   */
  private void addRegisteredClientValues(Object recipientRequest, Recipient recipientInput) throws FDXException {
    ObjectNode registeredClientObjectNode = null;
    try (CloseableHttpResponse closeableHttpResponse = postClientRegistration(recipientRequest)) {
      String jsonRegisteredClient = EntityUtils.toString(closeableHttpResponse.getEntity());
      JsonNode registeredClientNode = new ObjectMapper().readTree(jsonRegisteredClient);
      if (registeredClientNode.isObject()) {
        registeredClientObjectNode = (ObjectNode) registeredClientNode;
      }
    } catch (Exception e) {
      LOGGER.error("addRegisteredClientValues : ", e);
      throw new FDXException("Unknown error", 0);
    }
    if (registeredClientObjectNode != null) {
      ArrayNode clientAuthenticationMethods = (ArrayNode) registeredClientObjectNode.get("clientAuthenticationMethods");
      ArrayNode authorizationGrantTypes = (ArrayNode) registeredClientObjectNode.get("authorizationGrantTypes");
      List<String> clientAuthenticationMethodsList = clientAuthenticationMethods.findValuesAsText("value");
      List<String> authorizationGrantTypesList = authorizationGrantTypes.findValuesAsText("value");
      recipientInput.setTokenEndpointAuthMethod(clientAuthenticationMethodsList.get(0));
      recipientInput.setGrantTypes(authorizationGrantTypesList);
    }
  }

  /**
   * Construct intermediary registry reference mapping and set to intermediary.
   *
   * @param recipientInput value
   */
  private void saveIntermediaries(Recipient recipientInput) {
    if (recipientInput.getIntermediaries() != null && !recipientInput.getIntermediaries().isEmpty()) {
      for (Intermediary intermediary :
          recipientInput.getIntermediaries()) {
        intermediary.setRecipient(recipientInput);
        if (intermediary.getRegistryReferences() != null && !intermediary.getRegistryReferences().isEmpty()) {
          RegistryReferenceMapping intermediaryRegistryReferenceMapping =
              new RegistryReferenceMapping();
          for (RegistryReference registryReference :
              intermediary.getRegistryReferences()) {
            registryReference.setRegistryReferenceMapping(intermediaryRegistryReferenceMapping);
          }
          intermediaryRegistryReferenceMapping.setRegistryReferences(intermediary.getRegistryReferences());
          intermediary.setRegistryReferenceMapping(intermediaryRegistryReferenceMapping);
        }
      }
    }
  }

  /**
   * Returns recipient data identified with clientId.
   *
   * @param clientId used for search
   * @return recipient data as json
   */
  public String getRecipient(String clientId) throws FDXException {
    Recipient recipient = recipientRepository.findByClientId(clientId);
    return getRecipient(clientId, recipient);
  }

  /**
   * Construct recipient json.
   *
   * @param clientId  value
   * @param recipient to be updated
   * @return recipient serialized object
   * @throws FDXException for errors
   */
  private String getRecipient(String clientId, Recipient recipient) throws FDXException {
    if (recipient != null) {
      if (recipient.getRegistryReferenceMapping() != null) {
        recipient.setRegistryReferences
            (recipient.getRegistryReferenceMapping().getRegistryReferences());
      }
      if (recipient.getIntermediaries() != null && !recipient.getIntermediaries().isEmpty()) {
        for (Intermediary intermediary :
            recipient.getIntermediaries()) {
          if (intermediary.getRegistryReferenceMapping() != null) {
            intermediary.setRegistryReferences
                (intermediary.getRegistryReferenceMapping().getRegistryReferences());
          }
        }
      }
      return FdxUtil.getSerializedObject(recipient);
    } else {
      throw new FDXException("No Recipient found for clientId: " + clientId, 0);
    }
  }

  /**
   * Deletes recipient identified with clientId.
   *
   * @param clientId used for search
   * @return success if deleted else return error.
   */
  public String deleteRecipient(String clientId) throws FDXException {
    if (!recipientRepository.existsById(clientId)) {
      throw new FDXException("No Recipient found with client_id: " + clientId, 0);
    }
    deleteClientRegistration(clientId);
    recipientRepository.deleteByClientId(clientId);
    return "No Content";
  }

  /**
   * Updates a Recipient Record.
   *
   * @param recipientRequest data to be updated
   * @param clientId         used for search
   * @return updated recipient data as json
   */
  public String updateRecipient(Object recipientRequest, String clientId) throws FDXException {
    Recipient existingRecipient = recipientRepository.findByClientId(clientId);
    if (existingRecipient == null) {
      return "Not found";
    }
    ObjectMapper mapper = FdxUtil.getObjectMapper();
    Recipient recipientInput = mapper.convertValue(recipientRequest,
        new TypeReference<>() {
        });
    existingRecipient.setClientUri(recipientInput.getClientUri());
    existingRecipient.setClientName(recipientInput.getClientName());
    existingRecipient.setContacts(recipientInput.getContacts());
    existingRecipient.setDescription(recipientInput.getDescription());
    existingRecipient.setDurationPeriod(recipientInput.getDurationPeriod());
    existingRecipient.setDurationTypes(recipientInput.getDurationTypes());
    existingRecipient.setLookbackPeriod(recipientInput.getLookbackPeriod());
    existingRecipient.setLogoUri(recipientInput.getLogoUri());
    existingRecipient.setRedirectUris(recipientInput.getRedirectUris());
    existingRecipient.setScope(recipientInput.getScope());
    existingRecipient.getRegistryReferenceMapping().getRegistryReferences().clear();
    if (recipientInput.getRegistryReferences() != null && !recipientInput.getRegistryReferences().isEmpty()) {
      for (RegistryReference registryReference :
          recipientInput.getRegistryReferences()) {
        registryReference.setRegistryReferenceMapping(existingRecipient.getRegistryReferenceMapping());
      }
      existingRecipient.getRegistryReferenceMapping().getRegistryReferences().addAll(recipientInput.getRegistryReferences());
    }
    updateIntermediaries(existingRecipient, recipientInput);
    updateClientRegistration(existingRecipient, clientId);
    existingRecipient.setAuditInfo(FdxUtil.getAuditInfo(request));
    Recipient recipient = recipientRepository.save(existingRecipient);
    return getRecipient(recipient.getClientId(), recipient);
  }

  /**
   * Update existing intermediaries using recipient input.
   *
   * @param existingRecipient value
   * @param recipientInput    value
   */
  private void updateIntermediaries(Recipient existingRecipient,
                                    Recipient recipientInput) {
    existingRecipient.getIntermediaries().clear();
    if (recipientInput.getIntermediaries() != null && !recipientInput.getIntermediaries().isEmpty()) {
      for (Intermediary intermediary :
          recipientInput.getIntermediaries()) {
        intermediary.setRecipient(existingRecipient);
        if (intermediary.getRegistryReferences() != null && !intermediary.getRegistryReferences().isEmpty()) {
          RegistryReferenceMapping intermediaryRegistryReferenceMapping =
              new RegistryReferenceMapping();
          for (RegistryReference registryReference :
              intermediary.getRegistryReferences()) {
            registryReference.setRegistryReferenceMapping(intermediaryRegistryReferenceMapping);
          }
          intermediaryRegistryReferenceMapping.setRegistryReferences(intermediary.getRegistryReferences());
          intermediary.setRegistryReferenceMapping(intermediaryRegistryReferenceMapping);
        }
      }
      existingRecipient.getIntermediaries().addAll(recipientInput.getIntermediaries());
    }
  }

  /**
   * Creates client register entry in FDX Authorization Server.
   *
   * @param recipientRequest values
   */
  public CloseableHttpResponse postClientRegistration(Object recipientRequest) throws FDXException {
    try (CloseableHttpClient client = HttpClients.createDefault()) {
      HttpPost httpPost = new HttpPost(fdxRIAuthServerURI + "/client/register");
      String payloadRecipientRequest = new ObjectMapper().writeValueAsString(recipientRequest);
      StringEntity entity = new StringEntity(payloadRecipientRequest, ContentType.APPLICATION_JSON);
      httpPost.setEntity(entity);
      httpPost.setHeader(FdxConstants.ACCEPT, FdxConstants.APPLICATION_JSON);
      httpPost.setHeader(FdxConstants.CONTENT_TYPE, FdxConstants.APPLICATION_JSON);
      String origin = request.getHeader(FdxConstants.ORIGIN);
      if (origin != null) {
        httpPost.setHeader(FdxConstants.ORIGIN, origin);
      }
      CloseableHttpResponse response = client.execute(httpPost);
      Assert.notNull(response, "response can't be null");
      return response;
    } catch (IOException e) {
      LOGGER.error("RecipientService.postClientRegistration : ", e);
      throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
    }
  }

  /**
   * Updates client register entry in FDX Authorization Server.
   *
   * @param recipientRequest values
   * @param clientId         value
   * @throws FDXException error
   */
  public void updateClientRegistration(Object recipientRequest,
                                       String clientId) throws FDXException {
    String authServerURI = fdxRIAuthServerURI + "/client/register/" + clientId;
    FdxUtil.putRequest(recipientRequest, authServerURI, request.getHeader(FdxConstants.ORIGIN));
  }

  /**
   * Deletes client register entry in FDX Authorization Server.
   *
   * @param clientId value
   * @throws FDXException error
   */
  public void deleteClientRegistration(String clientId) throws FDXException {
    try (CloseableHttpClient client = HttpClients.createDefault()) {
      String authServerURI = fdxRIAuthServerURI + "/client/register/" +
          clientId;
      HttpDelete httpDelete = new HttpDelete(authServerURI);
      httpDelete.setHeader(FdxConstants.ACCEPT, FdxConstants.APPLICATION_JSON);
      httpDelete.setHeader(FdxConstants.CONTENT_TYPE, FdxConstants.APPLICATION_JSON);
      CloseableHttpResponse response = client.execute(httpDelete);
      Assert.notNull(response, "response can't be null");
    } catch (IOException e) {
      LOGGER.error("RecipientService.deleteClientRegistration : ", e);
      throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
    }
  }
}