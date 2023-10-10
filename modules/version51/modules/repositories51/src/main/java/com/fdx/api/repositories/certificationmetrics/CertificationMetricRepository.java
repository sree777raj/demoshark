package com.fdx.api.repositories.certificationmetrics;

import com.fdx.api.entities.certificationmetrics.CertificationMetric;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificationMetricRepository extends JpaRepository<CertificationMetric, Long>, CustomCertificationMetricRepository {

}