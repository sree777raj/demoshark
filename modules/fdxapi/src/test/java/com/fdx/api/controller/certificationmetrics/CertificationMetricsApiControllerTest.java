package com.fdx.api.controller.certificationmetrics;

import com.fdx.common.util.FdxConstants;
import com.fdx.service.certificationmetrics.CertificationMetricService;
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
 * Junit Test for CertificationMetricsApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class CertificationMetricsApiControllerTest {

  @Autowired
  CertificationMetricsApiController certificationMetricsApiController;

  @Autowired
  MockMvc mockMvc;

  @MockBean
  CertificationMetricService certificationMetricService;

  private String getCertificationMetricsJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File getCertificationMetricsFile = ResourceUtils.getFile("classpath" +
        ":certificationmetricsapicontroller/getcertificationmetrics.json");
    getCertificationMetricsJson =
        new String(Files.readAllBytes(getCertificationMetricsFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request =
        certificationMetricsApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for GET /certification-metrics api, GetCertificationMetrics's
   * status must be 200
   */
  @Test
  void testGetCertificationMetrics() throws Exception {
    String operationId = "getCertificationMetrics";
    Mockito.when(certificationMetricService.getCertificationMetrics(Mockito.anyString())).thenReturn(getCertificationMetricsJson);
    mockMvc.perform(get("/certification-metrics", operationId).contentType(FdxConstants.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("operationId", operationId)
            .accept(FdxConstants.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
}