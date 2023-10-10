package com.fdx.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Junit Test for FdxApiApplication Class
 */
@SpringBootTest
class FdxApiApplicationTest {

  @Autowired
  FdxApiApplication fdxApiApplication;

  /**
   * Test for FdxApiApplication,It should not be null
   */
  @Test
  void testMain() {
    FdxApiApplication.main(new String[]{"FdxAPI"});
    assertNotNull(fdxApiApplication);
  }

  /**
   * Test for FdxApiApplication,It should not be null
   */
  @Test
  void testConfigure() {
    fdxApiApplication.configure(new SpringApplicationBuilder());
    assertNotNull(fdxApiApplication);
  }
}