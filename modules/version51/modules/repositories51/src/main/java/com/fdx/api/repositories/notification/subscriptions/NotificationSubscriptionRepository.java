package com.fdx.api.repositories.notification.subscriptions;

import com.fdx.api.entities.notification.subscriptions.NotificationSubscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationSubscriptionRepository extends JpaRepository<NotificationSubscription, String> {
}