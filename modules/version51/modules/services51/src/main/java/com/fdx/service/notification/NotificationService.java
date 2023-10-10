package com.fdx.service.notification;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.entities.notification.Notification;
import com.fdx.api.repositories.notification.NotificationRepository;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxUtil;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

  private final NotificationRepository notificationRepository;

  public NotificationService(NotificationRepository notificationRepository) {
    this.notificationRepository = notificationRepository;
  }

  /**
   * Publish a notification.
   *
   * @param notificationRequest object
   * @return No Content
   */
  public String publishNotification(Object notificationRequest) throws FDXException {
    ObjectMapper mapper = FdxUtil.getObjectMapper();
    Notification notification = mapper.convertValue(notificationRequest,
        new TypeReference<>() {
        });
    if (!notificationRepository.existsById(notification.getNotificationId())) {
      notificationRepository.save(notification);
      return "No Content";
    } else {
      throw new FDXException("Notification already exist with notificationId: " + notification.getNotificationId(), 0);
    }
  }
}
