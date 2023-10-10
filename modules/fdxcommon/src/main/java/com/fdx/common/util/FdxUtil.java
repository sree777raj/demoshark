package com.fdx.common.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fdx.common.exception.FDXException;
import org.apache.commons.lang3.StringUtils;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.util.Assert;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;


public class FdxUtil {

  private static final Logger logger = LoggerFactory.getLogger(FdxUtil.class);

  /**
   * It can contain multiple values as we implement more versions.
   *
   * @return list of implemented versions
   */
  public static List<String> getImplementedVersions() {
    return Arrays.asList("4.6", "5.1");
  }

  /**
   * Returns latest implemented version.
   *
   * @return latest implemented version
   */
  public static String getLatestVersion() {
    return FdxConstants.VERSION_51;
  }

  /**
   * Return ObjectMapper.
   *
   * @return ObjectMapper
   */
  public static ObjectMapper getObjectMapper() {
    return JsonMapper.builder()
        .disable(MapperFeature.ALLOW_COERCION_OF_SCALARS)
        .build().registerModule(new JsonNullableModule())
        .registerModule(new JavaTimeModule())
        .setTimeZone(TimeZone.getDefault());
  }

  /**
   * Return serialized object of response.
   *
   * @param response to be used
   * @return SerializedObject
   * @throws FDXException thrown
   */
  public static String getSerializedObject(Object response) throws FDXException {
    try {
      ObjectMapper objectMapper = getObjectMapper();
      objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
      objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
      objectMapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
      objectMapper.registerModule(new Jdk8Module());
      return objectMapper.writeValueAsString(response);
    } catch (Exception e) {
      logger.error("FdxUtil.getSerializedObject : ", e);
      throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
    }
  }

  /**
   * Check headers for media type should be "Accept" and if version exist in
   * request header return it else return latest implemented version.
   *
   * @param request for headers
   * @return Version
   */
  public static String getVersion(NativeWebRequest request) {
    for (
        MediaType mediaType : MediaType.parseMediaTypes(request.getHeader(
        FdxConstants.ACCEPT))) {
      if (mediaType.isCompatibleWith(MediaType.valueOf(FdxConstants.APPLICATION_JSON))) {
        String version = request.getHeader(FdxConstants.API_VERSION);
        if (StringUtils.isBlank(version)) {
          version = getLatestVersion();
        }
        if (FdxUtil.getImplementedVersions().contains(version)) {
          return version;
        }
      }
    }
    return null;
  }

  /**
   * Return limit value.
   *
   * @param limit value
   * @return limit
   */
  public static Integer getLimit(Integer limit) {
    if ((limit == null || limit == 0)) {
      limit = 10;
    } else if (limit > 50) {
      limit = 50;
    }
    return limit;
  }

  /**
   * Generate unique id.
   *
   * @return generated unique id
   */
  public static String generateUniqueId() {
    Date currentDateTime = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyMMddhhmmssMs");
    StringBuilder requestURIStr;
    requestURIStr = new StringBuilder();
    requestURIStr.append(formatter.format(currentDateTime));
    requestURIStr.append("-");
    requestURIStr.append(UUID.randomUUID());
    return requestURIStr.toString();
  }

  /**
   * Creates & calls put request.
   *
   * @param requestObject details
   * @param url           to connect
   * @param origin        origin
   * @throws FDXException error
   */
  public static void putRequest(Object requestObject, String url, String origin) throws FDXException {
    try (CloseableHttpClient client = HttpClients.createDefault()) {
      HttpPut httpPut = new HttpPut(url);
      String payloadRequest = new ObjectMapper().writeValueAsString(requestObject);
      StringEntity entity = new StringEntity(payloadRequest, ContentType.APPLICATION_JSON);
      httpPut.setEntity(entity);
      httpPut.setHeader(FdxConstants.ACCEPT, FdxConstants.APPLICATION_JSON);
      httpPut.setHeader(FdxConstants.CONTENT_TYPE, FdxConstants.APPLICATION_JSON);
      if (origin != null) {
        httpPut.setHeader(FdxConstants.ORIGIN, origin);
      }
      CloseableHttpResponse response = client.execute(httpPut);
      Assert.notNull(response, "response can't be null");
    } catch (IOException e) {
      logger.error("FdxUtil.putRequest : ", e);
      throw new FDXException(FdxConstants.HTTP_ERROR_CODE_500);
    }
  }

  /**
   * Read audit data from request header and return.
   *
   */
  public static String getAuditInfo(HttpServletRequest request) {
    StringBuilder auditInfo = new StringBuilder();
    String xRealIP = request.getHeader(FdxConstants.X_REAL_IP);
    if (xRealIP != null) {
      auditInfo.append(FdxConstants.X_REAL_IP).append(FdxConstants.EQUAL)
          .append(xRealIP).append(FdxConstants.COMMA);
    }
    String host = request.getHeader(FdxConstants.HOST);
    if (host != null) {
      auditInfo.append(FdxConstants.HOST).append(FdxConstants.EQUAL)
          .append(host).append(FdxConstants.COMMA);
    }
    String userAgent = request.getHeader(FdxConstants.USER_AGENT);
    if (userAgent != null) {
      auditInfo.append(FdxConstants.USER_AGENT)
          .append(FdxConstants.EQUAL).append(userAgent).append(FdxConstants.COMMA);
    }
    String origin = request.getHeader(FdxConstants.ORIGIN);
    if (origin != null) {
      auditInfo.append(FdxConstants.ORIGIN)
          .append(FdxConstants.EQUAL).append(origin).append(FdxConstants.COMMA);
    }
    String referer = request.getHeader(FdxConstants.REFERER);
    if (referer != null) {
      auditInfo.append(FdxConstants.REFERER)
          .append(FdxConstants.EQUAL).append(referer).append(FdxConstants.COMMA);
    }
    String developer = request.getHeader(FdxConstants.DEVELOPER);
    if (developer != null) {
      auditInfo.append(FdxConstants.DEVELOPER)
          .append(FdxConstants.EQUAL).append(developer).append(FdxConstants.COMMA);
    }
    return auditInfo.toString();
  }
}
