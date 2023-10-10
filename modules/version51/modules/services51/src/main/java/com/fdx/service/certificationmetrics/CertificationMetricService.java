package com.fdx.service.certificationmetrics;

import com.fdx.api.entities.certificationmetrics.CertificationMetric;
import com.fdx.api.entities.certificationmetrics.CertificationMetricDTO;
import com.fdx.api.entities.certificationmetrics.CertificationMetricsDTO;
import com.fdx.api.entities.common.OperationId;
import com.fdx.api.repositories.certificationmetrics.CertificationMetricRepository;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxUtil;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CertificationMetricService {

  private final ModelMapper modelMapper;

  private final CertificationMetricRepository certificationMetricRepository;

  public CertificationMetricService(ModelMapper modelMapper,
                                    CertificationMetricRepository certificationMetricRepository) {
    this.modelMapper = modelMapper;
    this.certificationMetricRepository = certificationMetricRepository;
  }

  /**
   * GET /certification-metrics : Get certification performance metrics
   * Get certification performance metrics for this implementer's APIs
   *
   * @param operationId Specific operationId for which to get the metrics. Optional (optional)
   * @return Array of api's certification metrics
   */
  public String getCertificationMetrics(String operationId) throws FDXException {
    try {
      if (operationId != null) {
        // Throws exception if enum value is not valid
        OperationId operationIdEnum = OperationId.fromValue(operationId);
        operationId = operationIdEnum.name();
      }
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new FDXException(illegalArgumentException, 401);
    }
    List<CertificationMetric> certificationMetrics =
        operationId == null ? certificationMetricRepository.findAll()
            : certificationMetricRepository.findAllCertificationMetricsByOperationIds(operationId);
    List<CertificationMetricDTO> certificationMetricDTOList = certificationMetrics.stream()
        .map(this::convertToDto)
        .collect(Collectors.toList());
    CertificationMetricsDTO certificationMetricsDTO = new CertificationMetricsDTO();
    certificationMetricsDTO.setMetrics(certificationMetricDTOList);
    return FdxUtil.getSerializedObject(certificationMetricsDTO);
  }

  private CertificationMetricDTO convertToDto(CertificationMetric certificationMetric) {
    return modelMapper.map(certificationMetric, CertificationMetricDTO.class);
  }
}
