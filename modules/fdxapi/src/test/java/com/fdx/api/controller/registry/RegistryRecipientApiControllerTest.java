package com.fdx.api.controller.registry;

import com.fdx.common.util.FdxConstants;
import com.fdx.service.registry.recipient.RegistryRecipientService;
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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for RegistryRecipientApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class RegistryRecipientApiControllerTest {

  @Autowired
  private RegistryRecipientApiController registryRecipientApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private RegistryRecipientService registryRecipientService;

  private String getRegistryRecipientJson, getRegistryRecipientsJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File getRegistryRecipientFile = ResourceUtils.getFile("classpath" +
        ":registryrecipientapicontroller/getregistryrecipient.json");
    getRegistryRecipientJson =
        new String(Files.readAllBytes(getRegistryRecipientFile.toPath()));

    File getRegistryRecipientsFile = ResourceUtils.getFile("classpath" +
        ":registryrecipientapicontroller/getregistryrecipients.json");
    getRegistryRecipientsJson =
        new String(Files.readAllBytes(getRegistryRecipientsFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request =
        registryRecipientApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for GET /recipients/{recipientId} api,
   * GetRegistryRecipient's status must be 200
   */
  @Test
  void testGetRegistryRecipient() throws Exception {
    String recipientId = "Ganishas";
    Mockito.when(registryRecipientService.getRegistryRecipient(Mockito.anyString()))
        .thenReturn(getRegistryRecipientJson);

    mockMvc.perform(get("/recipients/{recipientId}", recipientId).contentType(FdxConstants.APPLICATION_JSON)
            .header("Api-Version", "5.1")
            .accept(FdxConstants.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /recipients api,
   * GetRegistryRecipients's status must be 200
   */
  @Test
  void testGetRegistryRecipients() throws Exception {
    Mockito.when(registryRecipientService.getRegistryRecipients(Mockito.anyInt(), Mockito.anyInt()))
        .thenReturn(getRegistryRecipientsJson);

    mockMvc.perform(get("/recipients").contentType(FdxConstants.APPLICATION_JSON)
            .header("Api-Version", "5.1")
            .param("offset", (String) null)
            .param("limit", "10")
            .accept(FdxConstants.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
}