package com.fdx.api.repositories.fraud;

import com.fdx.api.entities.fraud.SuspectedFraudIncident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuspectedFraudIncidentRepository extends JpaRepository<SuspectedFraudIncident, String> {
}