package com.fdx.api.repositories.certificationmetrics;

import com.fdx.api.entities.certificationmetrics.CertificationMetric;
import com.fdx.common.exception.FDXException;

import java.util.List;

public interface CustomCertificationMetricRepository {

  List<CertificationMetric> findAllCertificationMetricsByOperationIds(String operationId) throws FDXException;

}
