package com.fdx.api.controller.recipient;

import com.fdx.api.entities.recipient.RecipientRequest;
import com.fdx.service.recipient.RecipientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for RecipientApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RecipientApiControllerTest {

  @Autowired
  private RecipientApiController recipientApiController;

  @MockBean
  private RecipientService recipientService;

  @Autowired
  private MockMvc mockMvc;

  private File createRecipientInputFile, createRecipientOutputFile,
      getRecipientFile, updateRecipientInputFile, updateRecipientOutputFile;
  private String createRecipientInputJson, createRecipientOutputJson,
      getRecipientJson, updateRecipientInputJson, updateRecipientOutputJson;
  private String clientId = "V8tvEkZWhDAdxSaKGUJKM";

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    createRecipientInputFile = ResourceUtils.getFile("classpath" +
        ":recipientapicontroller/createrecipientinput.json");
    createRecipientInputJson =
        new String(Files.readAllBytes(createRecipientInputFile.toPath()));

    createRecipientOutputFile = ResourceUtils.getFile("classpath" +
        ":recipientapicontroller/createrecipientoutput.json");
    createRecipientOutputJson =
        new String(Files.readAllBytes(createRecipientOutputFile.toPath()));

    getRecipientFile = ResourceUtils.getFile("classpath" +
        ":recipientapicontroller/getrecipient.json");
    getRecipientJson =
        new String(Files.readAllBytes(getRecipientFile.toPath()));

    updateRecipientInputFile = ResourceUtils.getFile("classpath" +
        ":recipientapicontroller/updaterecipientinput.json");
    updateRecipientInputJson =
        new String(Files.readAllBytes(updateRecipientInputFile.toPath()));

    updateRecipientOutputFile = ResourceUtils.getFile("classpath" +
        ":recipientapicontroller/updaterecipientoutput.json");
    updateRecipientOutputJson =
        new String(Files.readAllBytes(updateRecipientOutputFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  @Order(1)
  void testGetRequest() {
    Optional<NativeWebRequest> request = recipientApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for POST /register api,Recipient's expected value must match with
   * actual value
   * and status must be Created (status code 201)
   */
  @Test
  @Order(2)
  void testCreateRecipient() throws Exception {
    Mockito.when(recipientService.postRecipient(Mockito.any(RecipientRequest.class))).thenReturn(createRecipientOutputJson);

    mockMvc.perform(post("/register")
            .contentType(MediaType.APPLICATION_JSON)
            .content(createRecipientInputJson)
            .header("Api-Version", "5.1")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isCreated())
        .andExpect(jsonPath("$.client_id").value("V8tvEkZWhDAdxSaKGUJKM"));
  }

  /**
   * Test for GET /register/{clientId} api,Recipient's expected value must
   * match with actual value
   * and status must be ok (status code 200)
   */
  @Test
  @Order(3)
  void testGetRecipient() throws Exception {
    Mockito.when(recipientService.getRecipient(clientId)).thenReturn(getRecipientJson);

    mockMvc.perform(get("/register/{clientId}", clientId)
            .contentType(MediaType.APPLICATION_JSON)
            .header("Api-Version", "5.1")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.client_id").value("V8tvEkZWhDAdxSaKGUJKM"));
  }

  /**
   * Test for PUT /register/{clientId} api,Recipient's expected value must
   * match with actual value
   * and status must be ok (status code 200)
   */
  @Test
  @Order(4)
  void testUpdateRecipient() throws Exception {
    Mockito.when(recipientService.updateRecipient(Mockito.any(RecipientRequest.class), Mockito.anyString())).thenReturn(updateRecipientOutputJson);

    mockMvc.perform(put("/register/{clientId}", clientId)
            .contentType(MediaType.APPLICATION_JSON)
            .content(updateRecipientInputJson)
            .header("Api-Version", "5.1")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.client_id").value("V8tvEkZWhDAdxSaKGUJKM"));
  }

  /**
   * Test for DELETE /register/{clientId} api, Recipient's status must be 204
   */
  @Test
  @Order(5)
  void testDeleteRecipient() throws Exception {
    Mockito.when(recipientService.deleteRecipient(clientId)).thenReturn("1");

    mockMvc.perform(delete("/register/{clientId}", clientId)
            .contentType(MediaType.APPLICATION_JSON)
            .header("Api-Version", "5.1")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().is(204));
  }
}