package com.fdx.api.controller;

import com.fdx.api.model51.model.Customer51;
import com.fdx.api.model51.model.Customers51;
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
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Junit Test for CustomersApiController Class
 */
@SpringBootTest
@AutoConfigureMockMvc
class CustomersApiControllerTest<T> {

  @Autowired
  private CustomersApiController customersApiController;

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private Customers51<T> customersDao;

  @MockBean
  private Customer51<T> customerDao;

  private String getCustomersJson, getCustomerJson, getCustomerInfoJson;

  /**
   * Executes Before each method
   */
  @BeforeEach
  void setUp() throws IOException {
    File getCustomersFile = ResourceUtils.getFile("classpath" +
        ":customersapicontroller/getcustomers.json");
    getCustomersJson =
        new String(Files.readAllBytes(getCustomersFile.toPath()));

    File getCustomerFile = ResourceUtils.getFile("classpath" +
        ":customersapicontroller/getcustomer.json");
    getCustomerJson = new String(Files.readAllBytes(getCustomerFile.toPath()));

    File getCustomerInfoFile = ResourceUtils.getFile("classpath" +
        ":customersapicontroller/getcustomerInfo.json");
    getCustomerInfoJson =
        new String(Files.readAllBytes(getCustomerInfoFile.toPath()));
  }

  /**
   * Test for request is not null
   */
  @Test
  void testGetRequest() {
    Optional<NativeWebRequest> request = customersApiController.getRequest();
    assertNotNull(request);
  }

  /**
   * Test for GET /customers api, GetCustomers's status must be 200
   */
  @Test
  void testGetCustomers() throws Exception {
    when(customersDao.getCustomers(Mockito.anyInt(), Mockito.anyString(),
        Mockito.anyString()))
        .thenReturn(getCustomersJson);

    mockMvc.perform(get("/customers").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("offset", (String) null)
            .param("limit", "10")
            .requestAttr("httpServletRequest", HttpServletRequest.class)
            .servletPath("/customers")
            .param("query", "null")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /customers/{customerId} api, GetCustomer's status must be 200
   */
  @Test
  void testGetCustomer() throws Exception {
    String customerId = "00T105";
    when(customerDao.getCustomerDetails(Mockito.anyString())).thenReturn(getCustomerJson);

    mockMvc.perform(get("/customers/{customerId}", customerId).contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .param("customerId", customerId)
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  /**
   * Test for GET /customers/current api, GetCustomerInfo's status must be 200
   */
  @Test
  void testGetCustomerInfo() throws Exception {
    when(customerDao.getCurrentCustomerInfo()).thenReturn((T) getCustomerInfoJson);

    mockMvc.perform(get("/customers/current").contentType(MediaType.APPLICATION_JSON)
            .header("Api-version", "5.1")
            .accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }
}