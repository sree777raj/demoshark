package com.fdx.service.notification.subscriptions;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.entities.notification.subscriptions.NotificationSubscription;
import com.fdx.api.repositories.notification.subscriptions.NotificationSubscriptionRepository;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxUtil;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationSubscriptionService {

  private final NotificationSubscriptionRepository notificationSubscriptionRepository;

  public NotificationSubscriptionService(NotificationSubscriptionRepository notificationSubscriptionRepository) {
    this.notificationSubscriptionRepository = notificationSubscriptionRepository;
  }

  /**
   * Creates notification subscription entry on the server
   *
   * @param notificationSubscriptionInput (optional)
   * @return notificationSubscription created
   */
  public String createNotificationSubscription(Object notificationSubscriptionInput) throws FDXException {
    ObjectMapper mapper = FdxUtil.getObjectMapper();
    NotificationSubscription notificationSubscription = mapper.convertValue(notificationSubscriptionInput,
        new TypeReference<>() {
        });
    if (!notificationSubscriptionRepository.existsById(notificationSubscription.getSubscriptionId())) {
      notificationSubscription = notificationSubscriptionRepository.save(notificationSubscription);
      return FdxUtil.getSerializedObject(notificationSubscription);
    } else {
      throw new FDXException("Notification Subscription already exist with subscription id: "
          + notificationSubscription.getSubscriptionId(), 0);
    }
  }

  /**
   * GET /notification-subscriptions/{subscriptionId} : Get a notification subscription
   * Call to get notification subscription
   *
   * @param subscriptionId ID of notification subscription (required)
   * @return notification subscription
   */
  public String getNotificationSubscription(String subscriptionId) throws FDXException {
    Optional<NotificationSubscription> notificationSubscription = notificationSubscriptionRepository.findById(subscriptionId);
    if (notificationSubscription.isPresent()) {
      return FdxUtil.getSerializedObject(notificationSubscription.get());
    } else {
      throw new FDXException("Notification Subscription not found for subscription id: "
          + subscriptionId, 0);
    }
  }

  /**
   * DELETE /notification-subscriptions/{subscriptionId} : Delete a notification subscription
   *
   * @param subscriptionId ID of notification subscription (required)
   * @return No Content
   */
  public String deleteNotificationSubscription(String subscriptionId) throws FDXException {
    if (!notificationSubscriptionRepository.existsById(subscriptionId)) {
      throw new FDXException("No Notification Subscription found with subscription id: " + subscriptionId, 0);
    }
    notificationSubscriptionRepository.deleteById(subscriptionId);
    return "No Content";
  }
}
