package com.fdx.service.fraud;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.entities.fraud.SuspectedFraudIncident;
import com.fdx.api.repositories.fraud.SuspectedFraudIncidentRepository;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxUtil;
import org.springframework.stereotype.Service;

@Service
public class SuspectedFraudIncidentService {

  private final SuspectedFraudIncidentRepository suspectedFraudIncidentRepository;

  public SuspectedFraudIncidentService(SuspectedFraudIncidentRepository suspectedFraudIncidentRepository) {
    this.suspectedFraudIncidentRepository = suspectedFraudIncidentRepository;
  }

  /**
   * POST /fraud/suspected-incident : Notify Data Provider of fraud
   * Notify Data Provider of suspected fraud
   *
   * @param suspectedFraudIncidentRequest (optional)
   * @return OK (status code 200)
   */
  public String reportSuspectedFraudIncident(Object suspectedFraudIncidentRequest) throws FDXException {
    ObjectMapper mapper = FdxUtil.getObjectMapper();
    SuspectedFraudIncident suspectedFraudIncident = mapper.convertValue(suspectedFraudIncidentRequest,
        new TypeReference<>() {
        });
    if (!suspectedFraudIncidentRepository.existsById(suspectedFraudIncident.getIncidentId())) {
      suspectedFraudIncident.getFiAttributes().forEach(fa -> fa.setSuspectedFraudIncident(suspectedFraudIncident));
      suspectedFraudIncidentRepository.save(suspectedFraudIncident);
      return "OK";
    } else {
      throw new FDXException("Suspected Fraud Incident already exist with incident id: "
          + suspectedFraudIncident.getIncidentId(), 0);
    }
  }
}
