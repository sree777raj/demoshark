package com.fdx.api.controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.model51.model.TaxDataList51;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.ResourceUtils;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for TaxFormsApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class TaxFormsApiControllerTest<T> {

  @Autowired
  private TaxFormsApiController taxFormsApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private TaxDataList51<T> taxDataListDao;

  private String searchForTaxFormsJson, getTaxFormsJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File searchForTaxFormsFile = ResourceUtils.getFile("classpath" +
        ":taxformsapicontroller/searchfortaxforms.json");
    searchForTaxFormsJson =
        new String(Files.readAllBytes(searchForTaxFormsFile.toPath()));

    File getTaxFormsFile = ResourceUtils.getFile("classpath" +
        ":taxformsapicontroller/gettaxform.json");
    getTaxFormsJson = new String(Files.readAllBytes(getTaxFormsFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request = taxFormsApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for GET /tax-forms api, SearchForTaxForms's status must be 200
   */
  @Test
  void testSearchForTaxForms() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(searchForTaxFormsJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(taxDataListDao.getTaxForms(Mockito.anyList(),
        Mockito.anyList(), Mockito.anyList(), Mockito.anyString(),
        Mockito.anyString(), Mockito.anyString())).thenReturn((T) node);

    mockMvc.perform(get("/tax-forms").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("taxYears", "2012")
            .param("taxYears", "2013")
            .param("taxYears", "2018")
            .param("taxYears", "2019")
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .servletPath("/tax-forms")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for POST /tax-forms api, CreateTaxForm's status must be 501
   */
  @Test
  void testCreateTaxForm() throws Exception {
    mockMvc.perform(post("/tax-forms").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .param("taxData", (String) null)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isNotImplemented());
  }

  /**
   * Test for GET /tax-forms/{taxFormId} api, GetTaxForm's status must be 200
   */
  @Test
  void testGetTaxForm() throws Exception {
    String taxFormId = "TaxTest2018";

    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(getTaxFormsJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(taxDataListDao.getTaxFormsById(Mockito.anyString(),
        Mockito.any())).thenReturn(node);

    mockMvc.perform(get("/tax-forms/{taxFormId}", taxFormId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("taxFormId", "TaxTest2018")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /tax-forms/{taxFormId} api, GetTaxFormAcceptNull's status
   * must be 400
   */
  @Test
  void testGetTaxFormAcceptNull() throws Exception {
    String taxFormId = "TaxTest2018";

    mockMvc.perform(get("/tax-forms/{taxFormId}", taxFormId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "4.6")
            .param("taxFormId", "TaxTest2018")
            .accept(MediaType.ALL_VALUE))
        .andExpect(status().isBadRequest());
  }

  /**
   * Test for PUT /tax-forms/{taxFormId} api, UpdateTaxForm's status must be 501
   */
  @Test
  void testUpdateTaxForm() throws Exception {
    String taxFormId = "tax123";
    mockMvc.perform(put("/tax-forms/{taxFormId}", taxFormId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("taxFormId", "tax123")
            .param("taxData", "")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isNotImplemented());
  }
}