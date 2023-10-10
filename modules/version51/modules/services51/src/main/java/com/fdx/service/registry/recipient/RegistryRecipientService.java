package com.fdx.service.registry.recipient;

import com.fdx.api.entities.common.Action;
import com.fdx.api.entities.common.HateoasLinkRequest;
import com.fdx.api.entities.common.PageMetadataDTO;
import com.fdx.api.entities.common.PageMetadataLinksDTO;
import com.fdx.api.entities.recipient.Intermediary;
import com.fdx.api.entities.recipient.Recipient;
import com.fdx.api.entities.registry.recipient.RegistryRecipientDTO;
import com.fdx.api.entities.registry.recipient.RegistryRecipientsDTO;
import com.fdx.api.repositories.recipient.RecipientRepository;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxUtil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RegistryRecipientService {

  private final RecipientRepository recipientRepository;

  public RegistryRecipientService(RecipientRepository recipientRepository) {
    this.recipientRepository = recipientRepository;
  }

  /**
   * Returns registry recipient data identified with recipientId.
   *
   * @param recipientId used for search
   * @return registry recipient data as json
   */
  public String getRegistryRecipient(String recipientId) throws FDXException, URISyntaxException {
    Recipient recipient = recipientRepository.findByClientId(recipientId);
    return getRecipient(recipientId, recipient);
  }

  /**
   * Construct recipient json.
   *
   * @param recipientId value
   * @param recipient   to be updated
   * @return recipient serialized object
   * @throws FDXException for errors
   */
  private String getRecipient(String recipientId, Recipient recipient) throws FDXException, URISyntaxException {
    if (recipient != null) {
      return FdxUtil.getSerializedObject(getRegistryRecipientDTO(recipient));
    } else {
      throw new FDXException("No Recipient found for recipientId: " + recipientId, 0);
    }
  }

  private RegistryRecipientDTO getRegistryRecipientDTO(Recipient recipient) throws URISyntaxException {
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
    RegistryRecipientDTO registryRecipientDTO = new RegistryRecipientDTO(recipient.getClientName(),
        recipient.getDescription(), recipient.getRedirectUris(), recipient.getLogoUri() != null ?
        new URI(recipient.getLogoUri()) : null, recipient.getClientUri() != null ?
        new URI(recipient.getClientUri()) : null, recipient.getContacts(),
        recipient.getScope(), null, null, null,
        null, null, recipient.getClientId());
    if (recipient.getDurationTypes() != null) {
      registryRecipientDTO.setDurationType(Arrays.asList(recipient.getDurationTypes()));
    }
    if (recipient.getDurationPeriod() != null) {
      registryRecipientDTO.setDurationPeriod(BigDecimal.valueOf(recipient.getDurationPeriod()));
    }
    if (recipient.getLookbackPeriod() != null) {
      registryRecipientDTO.setLookbackPeriod(BigDecimal.valueOf(recipient.getLookbackPeriod()));
    }
    if (recipient.getRegistryReferences() != null) {
      registryRecipientDTO.setRegistryReferences(new ArrayList<>(recipient.getRegistryReferences()));
    }
    if (recipient.getIntermediaries() != null) {
      registryRecipientDTO.setIntermediaries(new ArrayList<>(recipient.getIntermediaries()));
    }
    return registryRecipientDTO;
  }

  /**
   * GET /recipients : Get Registry Recipients
   *
   * @param offset value
   * @param limit  value
   * @return recipients
   */
  public String getRegistryRecipients(Integer offset, Integer limit) throws FDXException, URISyntaxException {
    Page<Recipient> recipients = recipientRepository.findAll(PageRequest.of(offset, limit));
    if (recipients.isEmpty()) {
      throw new FDXException(1107);
    }
    List<RegistryRecipientDTO> recipientList = new ArrayList<>();
    RegistryRecipientsDTO registryRecipientsDTO = new RegistryRecipientsDTO();
    PageMetadataDTO pageMetadataDTO = new PageMetadataDTO();
    PageMetadataLinksDTO pageMetadataLinksDTO = new PageMetadataLinksDTO();
    pageMetadataDTO.setTotalElements((int) recipients.getTotalElements());
    String baseUrl = ServletUriComponentsBuilder
        .fromRequestUri(((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest())
        .build()
        .toUriString();
    if (recipients.hasNext()) {
      pageMetadataDTO.setNextOffset(String.valueOf(recipients.nextPageable().getPageNumber()));
      String nextUrl = baseUrl + "?offset=" + pageMetadataDTO.getNextOffset() + "&limit=" + limit;
      pageMetadataLinksDTO.setNext(new HateoasLinkRequest(nextUrl, Action.GET));
    }
    if (recipients.hasPrevious()) {
      pageMetadataDTO.setPrevOffset(String.valueOf(recipients.previousPageable().getPageNumber()));
      String prevUrl = baseUrl + "?offset=" + pageMetadataDTO.getPrevOffset() + "&limit=" + limit;
      pageMetadataLinksDTO.setPrev(new HateoasLinkRequest(prevUrl, Action.GET));
    }
    registryRecipientsDTO.setPage(pageMetadataDTO);
    for (Recipient recipient : recipients) {
      recipientList.add(getRegistryRecipientDTO(recipient));
    }
    registryRecipientsDTO.setLinks(pageMetadataLinksDTO);
    registryRecipientsDTO.setRecipients(recipientList);
    return FdxUtil.getSerializedObject(registryRecipientsDTO);
  }
}