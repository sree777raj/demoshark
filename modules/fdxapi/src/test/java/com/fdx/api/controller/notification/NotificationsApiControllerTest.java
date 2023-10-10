package com.fdx.api.controller.notification;

import com.fdx.common.util.FdxConstants;
import com.fdx.service.notification.NotificationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.ResourceUtils;
import org.springframework.web.context.request.NativeWebRequest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for NotificationsApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class NotificationsApiControllerTest {

  @Autowired
  private NotificationsApiController notificationsApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private NotificationService notificationService;

  private String publishNotificationInputJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File publishNotificationInputFile = ResourceUtils.getFile("classpath" +
        ":notification/publishnotificationinput.json");
    publishNotificationInputJson =
        new String(Files.readAllBytes(publishNotificationInputFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request = notificationsApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for POST /notifications api,
   * PublishNotification's status must be 204
   */
  @Test
  void testPublishNotification() throws Exception {
    Mockito.when(notificationService.publishNotification(Mockito.any()))
        .thenReturn("1");

    mockMvc.perform(post("/notifications").contentType(FdxConstants.APPLICATION_JSON)
            .content(publishNotificationInputJson)
            .header("Api-Version", "5.1")
            .accept(FdxConstants.APPLICATION_JSON))
        .andExpect(status().isNoContent());
  }
}