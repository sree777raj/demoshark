package com.fdx.api.entities.certificationmetrics;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.entities.common.OperationId;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A single certification performance metric
 */
@Schema(name = "CertificationMetric", description = "A single certification performance metric")
public class CertificationMetricDTO {

  @JsonProperty("reportStartTimestamp")
  private Timestamp reportStartTimestamp;

  @JsonProperty("reportEndTimestamp")
  private Timestamp reportEndTimestamp;

  @JsonProperty("metricsName")
  private String metricsName;

  @JsonProperty("operationIds")
  @Valid
  private List<OperationId> operationIds = null;

  @JsonProperty("responseTimeAverage")
  private BigDecimal responseTimeAverage;

  @JsonProperty("averageUpTime")
  private BigDecimal averageUpTime;

  @JsonProperty("reportTimestamp")
  private Timestamp reportTimestamp;

  public CertificationMetricDTO reportStartTimestamp(Timestamp reportStartTimestamp) {
    this.reportStartTimestamp = reportStartTimestamp;
    return this;
  }

  /**
   * Get reportStartTimestamp
   *
   * @return reportStartTimestamp
   */
  @Valid
  @Schema(name = "reportStartTimestamp", required = false)
  public Timestamp getReportStartTimestamp() {
    return reportStartTimestamp;
  }

  public void setReportStartTimestamp(Timestamp reportStartTimestamp) {
    this.reportStartTimestamp = reportStartTimestamp;
  }

  public CertificationMetricDTO reportEndTimestamp(Timestamp reportEndTimestamp) {
    this.reportEndTimestamp = reportEndTimestamp;
    return this;
  }

  /**
   * Get reportEndTimestamp
   *
   * @return reportEndTimestamp
   */
  @Valid
  @Schema(name = "reportEndTimestamp", required = false)
  public Timestamp getReportEndTimestamp() {
    return reportEndTimestamp;
  }

  public void setReportEndTimestamp(Timestamp reportEndTimestamp) {
    this.reportEndTimestamp = reportEndTimestamp;
  }

  public CertificationMetricDTO metricsName(String metricsName) {
    this.metricsName = metricsName;
    return this;
  }

  /**
   * Any provider descriptive name for the measurement. Optional, can be omitted if operationIds are returned
   *
   * @return metricsName
   */

  @Schema(name = "metricsName", description = "Any provider descriptive name for the measurement. Optional, can be omitted if operationIds are returned", required = false)
  public String getMetricsName() {
    return metricsName;
  }

  public void setMetricsName(String metricsName) {
    this.metricsName = metricsName;
  }

  public CertificationMetricDTO operationIds(List<OperationId> operationIds) {
    this.operationIds = operationIds;
    return this;
  }

  public CertificationMetricDTO addOperationIdsItem(OperationId operationIdsItem) {
    if (this.operationIds == null) {
      this.operationIds = new ArrayList<>();
    }
    this.operationIds.add(operationIdsItem);
    return this;
  }

  /**
   * One or more Operation IDs for which these metrics apply. Optional, can be omitted if metricsName is returned
   *
   * @return operationIds
   */
  @Valid
  @Schema(name = "operationIds", description = "One or more Operation IDs for which these metrics apply. Optional, can be omitted if metricsName is returned", required = false)
  public List<OperationId> getOperationIds() {
    return operationIds;
  }

  public void setOperationIds(List<OperationId> operationIds) {
    this.operationIds = operationIds;
  }

  public CertificationMetricDTO responseTimeAverage(BigDecimal responseTimeAverage) {
    this.responseTimeAverage = responseTimeAverage;
    return this;
  }

  /**
   * The self-reported average response time in milliseconds for all combined data responses
   *
   * @return responseTimeAverage
   */
  @Valid
  @Schema(name = "responseTimeAverage", description = "The self-reported average response time in milliseconds for all combined data responses", required = false)
  public BigDecimal getResponseTimeAverage() {
    return responseTimeAverage;
  }

  public void setResponseTimeAverage(BigDecimal responseTimeAverage) {
    this.responseTimeAverage = responseTimeAverage;
  }

  public CertificationMetricDTO averageUpTime(BigDecimal averageUpTime) {
    this.averageUpTime = averageUpTime;
    return this;
  }

  /**
   * See the Certification Performance section that describes how this measurement will be calculated, defines the % of availability during the measurement
   *
   * @return averageUpTime
   */
  @Valid
  @Schema(name = "averageUpTime", description = "See the Certification Performance section that describes how this measurement will be calculated, defines the % of availability during the measurement", required = false)
  public BigDecimal getAverageUpTime() {
    return averageUpTime;
  }

  public void setAverageUpTime(BigDecimal averageUpTime) {
    this.averageUpTime = averageUpTime;
  }

  public CertificationMetricDTO reportTimestamp(Timestamp reportTimestamp) {
    this.reportTimestamp = reportTimestamp;
    return this;
  }

  /**
   * Get reportTimestamp
   *
   * @return reportTimestamp
   */
  @Valid
  @Schema(name = "reportTimestamp", required = false)
  public Timestamp getReportTimestamp() {
    return reportTimestamp;
  }

  public void setReportTimestamp(Timestamp reportTimestamp) {
    this.reportTimestamp = reportTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificationMetricDTO certificationMetric = (CertificationMetricDTO) o;
    return Objects.equals(this.reportStartTimestamp, certificationMetric.reportStartTimestamp) &&
        Objects.equals(this.reportEndTimestamp, certificationMetric.reportEndTimestamp) &&
        Objects.equals(this.metricsName, certificationMetric.metricsName) &&
        Objects.equals(this.operationIds, certificationMetric.operationIds) &&
        Objects.equals(this.responseTimeAverage, certificationMetric.responseTimeAverage) &&
        Objects.equals(this.averageUpTime, certificationMetric.averageUpTime) &&
        Objects.equals(this.reportTimestamp, certificationMetric.reportTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportStartTimestamp, reportEndTimestamp, metricsName, operationIds, responseTimeAverage, averageUpTime, reportTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificationMetric {\n");
    sb.append("    reportStartTimestamp: ").append(toIndentedString(reportStartTimestamp)).append("\n");
    sb.append("    reportEndTimestamp: ").append(toIndentedString(reportEndTimestamp)).append("\n");
    sb.append("    metricsName: ").append(toIndentedString(metricsName)).append("\n");
    sb.append("    operationIds: ").append(toIndentedString(operationIds)).append("\n");
    sb.append("    responseTimeAverage: ").append(toIndentedString(responseTimeAverage)).append("\n");
    sb.append("    averageUpTime: ").append(toIndentedString(averageUpTime)).append("\n");
    sb.append("    reportTimestamp: ").append(toIndentedString(reportTimestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
