package com.fdx.api.multitenancy.repository;

import com.fdx.api.multitenancy.domain.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Developer repository
 */
public interface DeveloperRepository extends JpaRepository<Developer, String> {

    /**
     * Search developer by developer id.
     *
     * @param developerId value used for search
     * @return Optional developer
     */
    @Query("select d from Developer d where d.developerId = :developerId")
    Optional<Developer> findByDeveloperId(@Param("developerId") String developerId);
}
