package com.fdx.api.controller.consent;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.entities.common.PartyType;
import com.fdx.api.entities.consent.ConsentGrantRequest;
import com.fdx.api.entities.consent.ConsentRevocationRequest;
import com.fdx.api.entities.consent.ConsentUpdateReason;
import com.fdx.common.util.FdxConstants;
import com.fdx.service.recipient.ConsentGrantService;
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
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.util.ResourceUtils;
import org.springframework.web.context.request.NativeWebRequest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for ConsentApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ConsentApiControllerTest {

  @Autowired
  private ConsentApiController consentApiController;

  @MockBean
  private ConsentGrantService consentGrantService;

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private ObjectMapper objectMapper;

  private String consentId = "0e67811f9c12468f";
  private File consentGrantFile, consentRevocationFile;
  private String consentGrantJson, consentRevocationJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    consentGrantFile = ResourceUtils.getFile("classpath:consentapicontroller" +
        "/getconsentgrant.json");
    consentGrantJson =
        new String(Files.readAllBytes(consentGrantFile.toPath()));

    consentRevocationFile = ResourceUtils.getFile("classpath" +
        ":consentapicontroller/getconsentrevocation.json");
    consentRevocationJson =
        new String(Files.readAllBytes(consentRevocationFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  @Order(1)
  void testGetRequest() {
    Optional<NativeWebRequest> request = consentApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for GET /consents/{consentId} api, Consent Grant status value is as
   * expected and status must be Ok (status code 200)
   */
  @Test
  @Order(2)
  void testGetConsentGrant() throws Exception {
    Mockito.when(consentGrantService.getConsentGrant(consentId))
        .thenReturn(consentGrantJson);

    mockMvc.perform(MockMvcRequestBuilders.get("/consents/{consentId}",
                consentId)
            .contentType(MediaType.APPLICATION_JSON).header("Api-Version", "5" +
                ".1")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.status").value("ACTIVE"));
  }

  /**
   * Test for GET /consents/{consentId}/revocation api, Consent Revocation
   * status value is as expected and status must be Ok (status code 200)
   */
  @Test
  @Order(3)
  void getConsentRevocation() throws Exception {
    Mockito.when(consentGrantService.getConsentRevocation(consentId))
        .thenReturn(consentRevocationJson);

    mockMvc.perform(MockMvcRequestBuilders.get("/consents/{consentId" +
                "}/revocation", consentId)
            .contentType(MediaType.APPLICATION_JSON).header("Api-Version", "5" +
                ".1")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.status").value("REVOKED"));
  }

  /**
   * Test for PUT /consents/{consentId}/revocation api, Consent Grant status
   * must be 204
   */
  @Test
  @Order(4)
  void testRevokeConsentGrant() throws Exception {
    ConsentRevocationRequest consentRevocationRequest =
        new ConsentRevocationRequest();
    consentRevocationRequest.setReason(ConsentUpdateReason.USER_ACTION);
    consentRevocationRequest.setInitiator(PartyType.INDIVIDUAL);

    String inputResult = "{\n" +
        "  \"reason\": \"USER_ACTION\",\n" +
        "  \"initiator\": \"INDIVIDUAL\"\n" +
        "}";

    Mockito.when(consentGrantService.revokeConsentGrant(consentRevocationRequest, consentId))
        .thenReturn("1");

    mockMvc.perform(MockMvcRequestBuilders.put("/consents/{consentId" +
                "}/revocation", consentId)
            .contentType(MediaType.APPLICATION_JSON).content(inputResult)
            .header("Api-Version", "5.1")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().is(204));
  }

  /**
   * Test for POST /consents api, CreateConsentGrant status
   * must be 201
   */
  @Test
  void testCreateConsentGrant() throws Exception {
    List<String> list = new ArrayList<>();
    list.add("ALL");
    list.add("NONE");
    ConsentGrantRequest consentGrantRequest = new ConsentGrantRequest();
    consentGrantRequest.setRegisteredClientId("Reg204");
    consentGrantRequest.setRegisteredEntityName("ConsentGrant");
    consentGrantRequest.setScopes(list);
    Mockito.when(consentGrantService.postConsentGrant(Mockito.any())).thenReturn("ConsentGrant Created Successfully");

    mockMvc.perform(post("/consents").contentType(FdxConstants.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(consentGrantRequest))
            .header("Api-Version", "5.1")
            .accept(FdxConstants.APPLICATION_JSON))
        .andExpect(status().isCreated());
  }

  /**
   * Test for GET /consents api, GetConsentGrant status
   * must be 200
   */
  @Test
  void testGetConsentGrantId() throws Exception {
    String consentGrantJson = "{\n" +
        "  \"registeredClientId\": \"Reg204\",\n" +
        "  \"principalName\": \"FdxPrincipal\"\n" +
        "}";
    Mockito.when(consentGrantService.getConsentGrantId(Mockito.anyString(),
            Mockito.anyString()))
        .thenReturn(consentGrantJson);

    mockMvc.perform(get("/consents").contentType(MediaType.APPLICATION_JSON)
            .header("Api-Version", "5.1")
            .param("registeredClientId", "Reg204")
            .param("principalName", "FdxPrincipal")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
}