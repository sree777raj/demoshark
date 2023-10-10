package com.fdx.api.repositories.recipient;

import com.fdx.api.entities.consent.ConsentGrant;
import com.fdx.api.entities.consent.ConsentGrantStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JPA repository for consent grant entity.
 */
@Repository
public interface ConsentGrantRepository extends JpaRepository<ConsentGrant, String> {

  /**
   * Search ConsentGrant by id and status.
   *
   * @param id     used for search
   * @param status used for search
   * @return ConsentGrant
   */
  ConsentGrant findByIdAndStatus(String id, ConsentGrantStatus status);
}
