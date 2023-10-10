package com.fdx.api.entities.certificationmetrics;

import com.fdx.api.entities.common.OperationId;
import com.vladmihalcea.hibernate.type.array.ListArrayType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * A single certification performance metric
 */
@Entity
@Table(name = "certification_metric")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name = "CertificationMetric", description = "A single certification performance metric")
public class CertificationMetric {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "report_start_timestamp")
  private Timestamp reportStartTimestamp;

  @Column(name = "report_end_timestamp")
  private Timestamp reportEndTimestamp;

  @Column(name = "metrics_name")
  private String metricsName;

  @Type(
      type = "com.vladmihalcea.hibernate.type.array.ListArrayType",
      parameters = {
          @Parameter(
              name = ListArrayType.SQL_ARRAY_TYPE,
              value = "operation_ids"
          )
      }
  )
  @Column(
      name = "operation_ids",
      columnDefinition = "operation_ids[]"
  )
  private List<OperationId> operationIds;

  @Column(name = "response_time_average")
  private BigDecimal responseTimeAverage;

  @Column(name = "average_up_time")
  private BigDecimal averageUpTime;

  @Column(name = "report_timestamp")
  private Timestamp reportTimestamp;
}
