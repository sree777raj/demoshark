package com.fdx.api.repositories.recipient;

import com.fdx.api.entities.recipient.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * JPA repository for recipient entity.
 */
@Repository
public interface RecipientRepository extends JpaRepository<Recipient, String> {

  /**
   * Return recipient by searching given client id.
   *
   * @param clientId to search
   * @return recipient
   */
  Recipient findByClientId(String clientId);

  /**
   * deletes recipient for given client id.
   *
   * @param clientId to search
   */
  @Transactional
  void deleteByClientId(String clientId);
}
