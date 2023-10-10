package com.fdx.api.controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.model51.model.RewardCategories51;
import com.fdx.api.model51.model.RewardProgram51;
import com.fdx.api.model51.model.RewardPrograms51;
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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for RewardProgramsApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class RewardProgramsApiControllerTest<T> {

  @Autowired
  private RewardProgramsApiController rewardProgramsApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private RewardCategories51<T> rewardCategoriesDao;

  @MockBean
  private RewardProgram51<T> rewardProgramDao;

  @MockBean
  private RewardPrograms51<T> rewardProgramsDao;

  private String getRewardProgramCategoriesJson, getRewardProgramJson,
      searchRewardProgramsJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File getRewardProgramCategoriesFile = ResourceUtils.getFile("classpath:rewardprogramsapicontroller/getrewardprogramcategories.json");
    getRewardProgramCategoriesJson = new String(Files.readAllBytes(getRewardProgramCategoriesFile.toPath()));

    File getRewardProgramFile = ResourceUtils.getFile("classpath:rewardprogramsapicontroller/getrewardprogram.json");
    getRewardProgramJson = new String(Files.readAllBytes(getRewardProgramFile.toPath()));

    File searchRewardProgramsFile = ResourceUtils.getFile("classpath:rewardprogramsapicontroller/searchrewardprograms.json");
    searchRewardProgramsJson = new String(Files.readAllBytes(searchRewardProgramsFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request = rewardProgramsApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for GET /reward-programs/{rewardProgramId}/categories api, GetRewardProgramCategories's status must be 200
   */
  @Test
  void testGetRewardProgramCategories() throws Exception {
    String rewardProgramId = "327";
    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(getRewardProgramCategoriesJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(rewardCategoriesDao.getRewardProgramCategories(Mockito.anyString(), Mockito.anyInt(), Mockito.anyString(),
        Mockito.anyString())).thenReturn((T) node);

    mockMvc.perform(get("/reward-programs/{rewardProgramId}/categories",rewardProgramId)
            .contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("rewardProgramId", rewardProgramId)
            .param("offset", (String) null)
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .param("limit", "10")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /reward-programs/{rewardProgramId}/categories api, GetRewardProgram's status must be 200
   */
  @Test
  void testGetRewardProgram() throws Exception {
    String rewardProgramId = "327";
    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(getRewardProgramJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(rewardProgramDao.getRewardProgram(Mockito.anyString())).thenReturn((T) node);

    mockMvc.perform(get("/reward-programs/{rewardProgramId}",rewardProgramId)
            .contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("rewardProgramId", rewardProgramId)
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /reward-programs api, SearchRewardPrograms's status must be 200
   */
  @Test
  void testSearchRewardPrograms() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JsonFactory factory = mapper.getFactory();
    JsonParser jsonParser = factory.createParser(searchRewardProgramsJson);
    JsonNode node = mapper.readTree(jsonParser);

    Mockito.when(rewardProgramsDao.getRewardPrograms(Mockito.anyString())).thenReturn((T) node);

    mockMvc.perform(get("/reward-programs").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
}