package com.fdx.api.controller.fraud;

import com.fdx.common.util.FdxConstants;
import com.fdx.service.fraud.SuspectedFraudIncidentService;
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
 * Junit Test for FraudApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class FraudApiControllerTest {

  @Autowired
  private FraudApiController fraudApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private SuspectedFraudIncidentService suspectedFraudIncidentService;

  private String reportSuspectedFraudIncidentInputJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File reportSuspectedFraudIncidentInputFile = ResourceUtils.getFile(
        "classpath:fraud/reportsuspectedfraudincident.json");
    reportSuspectedFraudIncidentInputJson =
        new String(Files.readAllBytes(reportSuspectedFraudIncidentInputFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request = fraudApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for POST /fraud/suspected-incident api,
   * ReportSuspectedFraudIncident's status must be 200
   */
  @Test
  void testReportSuspectedFraudIncident() throws Exception {
    Mockito.when(suspectedFraudIncidentService.reportSuspectedFraudIncident(Mockito.any()))
        .thenReturn("Ok");

    mockMvc.perform(post("/fraud/suspected-incident").contentType(FdxConstants.APPLICATION_JSON)
            .content(reportSuspectedFraudIncidentInputJson)
            .header("Api-Version", "5.1")
            .accept(FdxConstants.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
}