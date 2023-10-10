package com.fdx.api.controller.notification.subscriptions;

import com.fdx.common.util.FdxConstants;
import com.fdx.service.notification.subscriptions.NotificationSubscriptionService;
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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for NotificationSubscriptionsApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class NotificationSubscriptionsApiControllerTest {

  @Autowired
  private NotificationSubscriptionsApiController notificationSubscriptionsApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private NotificationSubscriptionService notificationSubscriptionService;

  private String createNotificationSubscriptionInputJson,
      createNotificationSubscriptionOutputJson, getNotificationSubscriptionJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File createNotificationSubscriptionInputFile = ResourceUtils.getFile(
        "classpath:notificationsubscriptionsapiController/createnotificationsubscriptioninputj.json");
    createNotificationSubscriptionInputJson =
        new String(Files.readAllBytes(createNotificationSubscriptionInputFile.toPath()));

    File createNotificationSubscriptionOutputFile = ResourceUtils.getFile(
        "classpath:notificationsubscriptionsapiController/createnotificationsubscriptionoutput.json");
    createNotificationSubscriptionOutputJson =
        new String(Files.readAllBytes(createNotificationSubscriptionOutputFile.toPath()));

    File getNotificationSubscriptionFile = ResourceUtils.getFile("classpath" +
        ":notificationsubscriptionsapiController/getnotificationsubscription.json");
    getNotificationSubscriptionJson =
        new String(Files.readAllBytes(getNotificationSubscriptionFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request = notificationSubscriptionsApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for POST /notification-subscriptions api,
   * CreateNotificationSubscription's status must be 201
   */
  @Test
  void testCreateNotificationSubscription() throws Exception {
    Mockito.when(notificationSubscriptionService.createNotificationSubscription(Mockito.any()))
        .thenReturn(createNotificationSubscriptionOutputJson);

    mockMvc.perform(post("/notification-subscriptions").contentType(FdxConstants.APPLICATION_JSON)
            .content(createNotificationSubscriptionInputJson)
            .header("Api-Version", "5.1")
            .accept(FdxConstants.APPLICATION_JSON))
        .andExpect(status().isCreated());
  }

  /**
   * Test for GET /notification-subscriptions/{subscriptionId} api,
   * GetNotificationSubscription's status must be 200
   */
  @Test
  void testGetNotificationSubscription() throws Exception {
    String subscriptionId = "GUID-SubscriptionId1";
    Mockito.when(notificationSubscriptionService.getNotificationSubscription(Mockito.any()))
        .thenReturn(getNotificationSubscriptionJson);

    mockMvc.perform(get("/notification-subscriptions/{subscriptionId}",
            subscriptionId).contentType(FdxConstants.APPLICATION_JSON)
            .header("Api-Version", "5.1")
            .accept(FdxConstants.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for DELETE /notification-subscriptions/{subscriptionId} api,
   * DeleteNotificationSubscription's status must be 204
   */
  @Test
  void testDeleteNotificationSubscription() throws Exception {
    String subscriptionId = "GUID-SubscriptionId1";
    Mockito.when(notificationSubscriptionService.deleteNotificationSubscription(Mockito.any())).thenReturn("1");

    mockMvc.perform(delete("/notification-subscriptions/{subscriptionId}",
            subscriptionId).contentType(FdxConstants.APPLICATION_JSON)
            .header("Api-Version", "5.1")
            .accept(FdxConstants.APPLICATION_JSON))
        .andExpect(status().isNoContent());
  }
}