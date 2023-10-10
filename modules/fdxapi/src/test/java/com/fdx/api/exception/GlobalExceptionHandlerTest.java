package com.fdx.api.exception;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureMockMvc
class GlobalExceptionHandlerTest {

  @Autowired
  GlobalExceptionHandler globalExceptionHandler;

  @Test
  @Disabled("")
  void testHandleHttpRequestMethodNotSupported() {
    HttpRequestMethodNotSupportedException exception =
        Mockito.mock(HttpRequestMethodNotSupportedException.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    HttpHeaders headers = Mockito.mock(HttpHeaders.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleHttpRequestMethodNotSupported(exception,
        headers, status, request);
    Mockito.when(exception.getMessage()).thenReturn("Method Not Allowed");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("405"));
    assertNotNull(globalExceptionHandler);
    assertEquals(405, status.value());
  }

  @Test
  @Disabled("")
  void testHandleHttpMediaTypeNotSupported() {
    HttpMediaTypeNotSupportedException exception =
        Mockito.mock(HttpMediaTypeNotSupportedException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleHttpMediaTypeNotSupported(exception,
        httpHeaders, status, request);
    Mockito.when(exception.getMessage()).thenReturn("Unsupported Media Type");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("415"));
    assertNotNull(globalExceptionHandler);
    assertEquals(415, status.value());
  }

  @Test
  @Disabled("")
  void testHandleHttpMediaTypeNotAcceptable() {
    HttpMediaTypeNotAcceptableException exception =
        Mockito.mock(HttpMediaTypeNotAcceptableException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleHttpMediaTypeNotAcceptable(exception,
        httpHeaders, status, request);
    Mockito.when(exception.getMessage()).thenReturn("Not Acceptable");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("406"));
    assertNotNull(globalExceptionHandler);
    assertEquals(406, status.value());
  }

  @Test
  @Disabled("")
  void testHandleMissingPathVariable() {
    MissingPathVariableException exception =
        Mockito.mock(MissingPathVariableException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleMissingPathVariable(exception, httpHeaders,
        status, request);
    Mockito.when(exception.getMessage()).thenReturn("Internal Server Error");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("500"));
    assertNotNull(globalExceptionHandler);
    assertEquals(500, status.value());
  }

  @Test
  @Disabled("")
  void testHandleMissingServletRequestParameter() {
    MissingServletRequestParameterException exception =
        Mockito.mock(MissingServletRequestParameterException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleMissingServletRequestParameter(exception,
        httpHeaders, status, request);
    Mockito.when(exception.getMessage()).thenReturn("Bad Request");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("400"));
    assertNotNull(globalExceptionHandler);
    assertEquals(400, status.value());
  }

  @Test
  @Disabled("")
  void testHandleServletRequestBindingException() {
    ServletRequestBindingException exception =
        Mockito.mock(ServletRequestBindingException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleServletRequestBindingException(exception,
        httpHeaders, status, request);
    Mockito.when(exception.getMessage()).thenReturn("Bad Request");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("400"));
    assertNotNull(globalExceptionHandler);
    assertEquals(400, status.value());
  }

  @Test
  @Disabled("")
  void testHandleConversionNotSupported() {
    ConversionNotSupportedException exception =
        Mockito.mock(ConversionNotSupportedException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleConversionNotSupported(exception,
        httpHeaders, status, request);
    Mockito.when(exception.getMessage()).thenReturn("Internal Server Error");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("500"));
    assertNotNull(globalExceptionHandler);
    assertEquals(500, status.value());
  }

  @Test
  @Disabled("")
  void testHandleTypeMismatch() {
    TypeMismatchException exception = Mockito.mock(TypeMismatchException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleTypeMismatch(exception, httpHeaders, status,
        request);
    Mockito.when(exception.getMessage()).thenReturn("Bad Gateway");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("502"));
    assertNotNull(globalExceptionHandler);
    assertEquals(502, status.value());
  }

  @Test
  @Disabled("")
  void testHandleHttpMessageNotReadable() {
    HttpMessageNotReadableException exception =
        Mockito.mock(HttpMessageNotReadableException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleHttpMessageNotReadable(exception,
        httpHeaders, status, request);
    Mockito.when(exception.getMessage()).thenReturn("Expectation Failed");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("417"));
    assertNotNull(globalExceptionHandler);
    assertEquals(417, status.value());
  }

  @Test
  @Disabled("")
  void testHandleHttpMessageNotWritable() {
    HttpMessageNotWritableException exception =
        Mockito.mock(HttpMessageNotWritableException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleHttpMessageNotWritable(exception,
        httpHeaders, status, request);
    Mockito.when(exception.getMessage()).thenReturn("Expectation Failed");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("417"));
    assertNotNull(globalExceptionHandler);
    assertEquals(417, status.value());
  }

  @Test
  @Disabled("")
  void testHandleMethodArgumentNotValid() {
    MethodArgumentNotValidException exception =
        Mockito.mock(MethodArgumentNotValidException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleMethodArgumentNotValid(exception,
        httpHeaders, status, request);
    Mockito.when(exception.getMessage()).thenReturn("Method Not Allowed");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("405"));
    assertNotNull(globalExceptionHandler);
    assertEquals(405, status.value());
  }

  @Test
  @Disabled("")
  void testHandleMissingServletRequestPart() {
    MissingServletRequestPartException exception =
        Mockito.mock(MissingServletRequestPartException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleMissingServletRequestPart(exception,
        httpHeaders, status, request);
    Mockito.when(exception.getMessage()).thenReturn("Bad Request");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("400"));
    assertNotNull(globalExceptionHandler);
    assertEquals(400, status.value());
  }

  @Test
  @Disabled("")
  void testHandleBindException() {
    BindException exception = Mockito.mock(BindException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleBindException(exception, httpHeaders, status
        , request);
    Mockito.when(exception.getMessage()).thenReturn("Bad Gateway");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("502"));
    assertNotNull(globalExceptionHandler);
    assertEquals(502, status.value());
  }

  @Test
  @Disabled("")
  void testHandleAsyncRequestTimeoutException() {
    AsyncRequestTimeoutException exception =
        Mockito.mock(AsyncRequestTimeoutException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleAsyncRequestTimeoutException(exception,
        httpHeaders, status, request);
    Mockito.when(exception.getMessage()).thenReturn("Request Timeout");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("408"));
    assertNotNull(globalExceptionHandler);
    assertEquals(408, status.value());
  }

  @Test
  @Disabled("")
  void testHandleNoHandlerFoundException() {
    NoHandlerFoundException exception =
        Mockito.mock(NoHandlerFoundException.class);
    HttpHeaders httpHeaders = Mockito.mock(HttpHeaders.class);
    HttpStatus status = Mockito.mock(HttpStatus.class);
    WebRequest request = Mockito.mock(WebRequest.class);
    globalExceptionHandler.handleNoHandlerFoundException(exception,
        httpHeaders, status, request);
    Mockito.when(exception.getMessage()).thenReturn("Not Found");
    Mockito.when(status.value()).thenReturn(Integer.valueOf("404"));
    assertNotNull(globalExceptionHandler);
    assertEquals(404, status.value());
  }
}