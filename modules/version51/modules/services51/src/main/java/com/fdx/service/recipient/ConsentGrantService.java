package com.fdx.service.recipient;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.entities.common.ConsentDurationType;
import com.fdx.api.entities.consent.ConsentGrant;
import com.fdx.api.entities.common.Party;
import com.fdx.api.entities.consent.ConsentGrantRequest;
import com.fdx.api.entities.consent.ConsentGrantResource;
import com.fdx.api.entities.consent.ConsentGrantStatus;
import com.fdx.api.entities.consent.ConsentResourceType;
import com.fdx.api.entities.consent.ConsentRevocation;
import com.fdx.api.entities.consent.ConsentRevocationRequest;
import com.fdx.api.entities.consent.DataCluster;
import com.fdx.api.entities.common.PartyType;
import com.fdx.api.repositories.recipient.PartyRepository;
import com.fdx.api.repositories.recipient.ConsentGrantRepository;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxConstants;
import com.fdx.common.util.FdxUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Service class for consent grant entity.
 */
@Service
public class ConsentGrantService {

  private static final Logger LOGGER = LoggerFactory.getLogger(ConsentGrantService.class);

  @Autowired
  HttpServletRequest request;

  private final ConsentGrantRepository consentGrantRepository;

  private final PartyRepository partyRepository;

  @Value("${fdx.ri.auth.server.uri}")
  private String fdxRIAuthServerURI;

  public ConsentGrantService(ConsentGrantRepository consentGrantRepository,
                             PartyRepository partyRepository) {
    this.consentGrantRepository = consentGrantRepository;
    this.partyRepository = partyRepository;
  }

  /**
   * Returns consent grant data identified with consentId.
   *
   * @param consentId used for search
   * @return consent grant data as json
   */
  public String getConsentGrant(String consentId) throws FDXException {
    return FdxUtil.getSerializedObject(getConsentGrantByConsentId(consentId));
  }

  /**
   * Returns consent grant data identified with consentId.
   *
   * @param consentId used for search
   * @return consent grant data
   * @throws FDXException error
   */
  private ConsentGrant getConsentGrantByConsentId(String consentId) throws FDXException {
    Optional<ConsentGrant> consentGrant = consentGrantRepository.findById(consentId);
    if (consentGrant.isPresent()) {
      return consentGrant.get();
    } else {
      throw new FDXException("No consent grant found for consent id: " + consentId, 0);
    }
  }

  /**
   * Revoke a Consent Grant.
   *
   * @param consentRevocationRequest details of request to revoke consent grant
   * @param consentId                used for search
   * @return No Content if revoke success else error
   */
  public String revokeConsentGrant(Object consentRevocationRequest, String consentId) throws FDXException {
    ConsentGrant consentGrant = consentGrantRepository.findByIdAndStatus(consentId, ConsentGrantStatus.ACTIVE);
    if (consentGrant == null) {
      throw new FDXException("No active consent grant found for consent id: " + consentId, 0);
    }
    ObjectMapper mapper = FdxUtil.getObjectMapper();
    ConsentRevocationRequest consentRevocationRequestInput = mapper.convertValue(consentRevocationRequest,
        new TypeReference<>() {
        });
    consentGrant.setStatus(ConsentGrantStatus.REVOKED);
    consentGrant.setUpdatedTime(Timestamp.from(Instant.now()));
    consentGrant.setReason(consentRevocationRequestInput.getReason());
    consentGrant.setInitiator(consentRevocationRequestInput.getInitiator());
    consentGrant.setAuditInfo(FdxUtil.getAuditInfo(request));
    consentGrantRepository.save(consentGrant);
    revokeOAuth2Consent(consentGrant);
    return "No Content";
  }

  /**
   * Revoke a OAuth2 Consent.
   *
   * @param consentGrant data
   */
  public void revokeOAuth2Consent(@Valid ConsentGrant consentGrant) throws FDXException {
    Party party = consentGrant.getParties().iterator().next();
    ConsentGrantRequest consentGrantRequest =
        new ConsentGrantRequest(party.getRegisteredEntityId(), party.getRegisteredEntityName());
    FdxUtil.putRequest(consentGrantRequest, fdxRIAuthServerURI + "/consent/revoke", request.getHeader(FdxConstants.ORIGIN));
  }

  /**
   * Retrieve Consent Revocation record.
   *
   * @param consentId Consent Grant ID (required)
   * @return ConsentRevocation as json
   * @throws FDXException error
   */
  public String getConsentRevocation(String consentId) throws FDXException {
    ConsentGrant consentGrant = consentGrantRepository.findByIdAndStatus(consentId, ConsentGrantStatus.REVOKED);
    if (consentGrant != null) {
      ConsentRevocation consentRevocation = new ConsentRevocation();
      consentRevocation.setInitiator(consentGrant.getInitiator());
      consentRevocation.setReason(consentGrant.getReason());
      consentRevocation.setStatus(consentGrant.getStatus());
      consentRevocation.setUpdatedTime(consentGrant.getUpdatedTime());
      return FdxUtil.getSerializedObject(consentRevocation);
    } else {
      throw new FDXException("No consent revocation found for consent id: " + consentId, 0);
    }
  }

  /**
   * Create a Consent Grant.
   *
   * @param consentGrantRequest details of request
   * @return ConsentGrantRequest
   * @throws FDXException error
   */
  public String postConsentGrant(Object consentGrantRequest) throws FDXException {
    try {
      ObjectMapper mapper = FdxUtil.getObjectMapper();
      ConsentGrantRequest consentGrantRequestInput = mapper.convertValue(consentGrantRequest,
          new TypeReference<>() {
          });
      ConsentGrant consentGrant = new ConsentGrant();
      consentGrant.setId(FdxUtil.generateUniqueId());
      consentGrant.setStatus(ConsentGrantStatus.ACTIVE);
      consentGrant.durationType(ConsentDurationType.TIME_BOUND);
      consentGrant.setDurationPeriod(FdxConstants.OAUTH2_DEFAULT_CONSENT_DURATION_DAYS);
      consentGrant.setLookbackPeriod(FdxConstants.OAUTH2_DEFAULT_CONSENT_DURATION_DAYS);
      consentGrant.setCreatedTime(Timestamp.from(Instant.now()));
      consentGrant.setExpirationTime(Timestamp.from(Instant.now()
          .plus(FdxConstants.OAUTH2_DEFAULT_CONSENT_DURATION_DAYS, ChronoUnit.DAYS)));
      addConsentGrantParty(consentGrant, consentGrantRequestInput);
      addConsentGrantResource(consentGrant);
      consentGrant.setAuditInfo(FdxUtil.getAuditInfo(request));
      return FdxUtil.getSerializedObject(consentGrantRepository.save(consentGrant));
    } catch (Exception e) {
      LOGGER.error("ConsentGrantService.postConsentGrant ", e);
      throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
    }
  }

  /**
   * Add consent grant resource.
   *
   * @param consentGrant value
   */
  private static void addConsentGrantResource(ConsentGrant consentGrant) {
    ConsentGrantResource consentGrantResource = new ConsentGrantResource();
    consentGrantResource.setResourceId(FdxUtil.generateUniqueId());
    consentGrantResource.setResourceType(ConsentResourceType.CUSTOMER);
    DataCluster[] dataClusters = {DataCluster.ALL};
    consentGrantResource.setDataClusters(dataClusters);
    consentGrantResource.setConsentGrant(consentGrant);
    Set<ConsentGrantResource> consentGrantResources = new HashSet<>();
    consentGrantResources.add(consentGrantResource);
    consentGrant.setResources(consentGrantResources);
  }

  /**
   * Add consent grant party.
   *
   * @param consentGrant             value
   * @param consentGrantRequestInput value
   */
  private static void addConsentGrantParty(ConsentGrant consentGrant,
                                    ConsentGrantRequest consentGrantRequestInput) {
    Party party = new Party();
    party.setRegisteredEntityId(consentGrantRequestInput.getRegisteredClientId());
    party.setRegisteredEntityName(consentGrantRequestInput.getRegisteredEntityName());
    party.setType(PartyType.INDIVIDUAL);
    party.setConsentGrant(consentGrant);
    Set<Party> parties = new HashSet<>();
    parties.add(party);
    consentGrant.setParties(parties);
  }

  /**
   * Get Consent Grant Id.
   *
   * @param registeredClientId value
   * @param principalName      value
   * @return consentId
   * @throws FDXException error
   */
  public String getConsentGrantId(String registeredClientId,
                                  String principalName) throws FDXException {
    try {
      Party party = partyRepository
          .findByRegisteredEntityIdAndRegisteredEntityNameAndType(
              registeredClientId, principalName, PartyType.INDIVIDUAL);
      return party.getConsentGrant().getId();
    } catch (Exception e) {
      LOGGER.error("ConsentGrantService.getConsentGrantId : ", e);
      throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
    }
  }
}
