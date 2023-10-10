package com.fdx.api.repositories.recipient;

import com.fdx.api.entities.common.Party;
import com.fdx.api.entities.common.PartyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JPA repository for consent grant party entity.
 */
@Repository
public interface PartyRepository extends JpaRepository<Party, String> {

  Party findByRegisteredEntityIdAndRegisteredEntityNameAndType(
      String registeredEntityId, String registeredEntityName, PartyType type);
}
