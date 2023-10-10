package com.fdx.api.repositories.notification;

import com.fdx.api.entities.notification.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, String> {
}