package com.fdx.api.repositories.certificationmetrics;

import com.fdx.api.entities.certificationmetrics.CertificationMetric;
import com.fdx.common.exception.FDXException;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class CustomCertificationMetricRepositoryImpl implements CustomCertificationMetricRepository {

  @PersistenceContext
  private EntityManager entityManager;

  /**
   * As JPA Repository does not support custom type def in queries so this workaround is done
   * ref <a href="https://github.com/spring-projects/spring-data-jpa/issues/2221">
   * JPARepository does not use TypeDef definitions in Entity</a>
   *
   * @param operationId param
   * @return certificationMetrics
   */
  @Override
  @SuppressWarnings("unchecked")
  public List<CertificationMetric> findAllCertificationMetricsByOperationIds(String operationId) throws FDXException {
    try {
      return entityManager
          .createQuery(
              "from CertificationMetric cm where " +
                  "fn_operation_ids_contains(cm.operationIds, '{" +
                  operationId + "}') = true", CertificationMetric.class)
          .unwrap(Query.class)
          .getResultList();
    } catch (Exception e) {
      throw new FDXException(500);
    }
  }
}
