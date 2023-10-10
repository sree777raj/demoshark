package com.fdx.api.controller;

import com.fdx.api.model51.model.Availability51;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for AvailabilityApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class AvailabilityApiControllerTest<T> {

  @Autowired
  private AvailabilityApiController availabilityApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private Availability51<T> availabilityDao;

  private String getAvailabilityJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File getAvailabilityFile = ResourceUtils.getFile("classpath" +
        ":availabilityapicontroller/getavailability.json");
    getAvailabilityJson =
        new String(Files.readAllBytes(getAvailabilityFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request = availabilityApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for GET /availability api, GetAvailability's status must be 200
   */
  @Test
  void testGetAvailability() throws Exception {
    when(availabilityDao.getAvailability()).thenReturn((T) getAvailabilityJson);

    mockMvc.perform(get("/availability").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
}