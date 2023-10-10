package com.fdx.api.entities.certificationmetrics;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Response object for /certification-metrics API
 */
@Schema(name = "CertificationMetrics", description = "Response object for /certification-metrics API")
public class CertificationMetricsDTO {

  @JsonProperty("metrics")
  @Valid
  private List<CertificationMetricDTO> metrics = null;

  public CertificationMetricsDTO metrics(List<CertificationMetricDTO> metrics) {
    this.metrics = metrics;
    return this;
  }

  public CertificationMetricsDTO addMetricsItem(CertificationMetricDTO metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

  /**
   * Zero or more certification performance metrics
   *
   * @return metrics
   */
  @Valid
  @Schema(name = "metrics", description = "Zero or more certification performance metrics", required = false)
  public List<CertificationMetricDTO> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<CertificationMetricDTO> metrics) {
    this.metrics = metrics;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificationMetricsDTO certificationMetrics = (CertificationMetricsDTO) o;
    return Objects.equals(this.metrics, certificationMetrics.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificationMetrics {\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
