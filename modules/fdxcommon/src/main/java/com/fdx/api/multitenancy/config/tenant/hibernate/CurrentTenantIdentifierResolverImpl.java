package com.fdx.api.multitenancy.config.tenant.hibernate;

import com.fdx.common.util.DeveloperContext;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

/**
 * A callback registered with the org.hibernate.SessionFactory that is responsible
 * for resolving the current tenant identifier for use with CurrentSessionContext
 * and org.hibernate.SessionFactory.getCurrentSession()
 */
@Component("currentTenantIdentifierResolver")
public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {

  /**
   * Resolve the current tenant identifier.
   *
   * @return The current tenant identifier
   */
  @Override
  public String resolveCurrentTenantIdentifier() {
    String developerSchema = DeveloperContext.getDeveloperSchema();
    if (!ObjectUtils.isEmpty(developerSchema)) {
      return developerSchema;
    } else {
      // Allow bootstrapping the EntityManagerFactory, in which case no tenant is needed
      return "BOOTSTRAP";
    }
  }

  /**
   * Validate that the tenant identifier on "current sessions"
   *
   * @return true indicates that the extra validation will be performed; false indicates it will not.
   */
  @Override
  public boolean validateExistingCurrentSessions() {
    return true;
  }
}
