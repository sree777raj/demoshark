package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.FiPortionRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Financial Institution-specific asset allocation
 */
@ApiModel(description = "Financial Institution-specific asset allocation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class FiPortion {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int portionId;

	@JsonProperty("assetClass")
	private String assetClass;

	@JsonProperty("percent")
	private BigDecimal percent;

	public FiPortion assetClass(String assetClass) {
		this.assetClass = assetClass;
		return this;
	}

	/**
	 * Financial Institution-specific asset class
	 * 
	 * @return assetClass
	 */
	@ApiModelProperty(value = "Financial Institution-specific asset class")

	public String getAssetClass() {
		return assetClass;
	}

	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
	}

	public FiPortion percent(BigDecimal percent) {
		this.percent = percent;
		return this;
	}

	/**
	 * Percentage of asset class that falls under this asset
	 * 
	 * @return percent
	 */
	@ApiModelProperty(value = "Percentage of asset class that falls under this asset")

	@Valid

	public BigDecimal getPercent() {
		return percent;
	}

	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}

	public int getPortionId() {
		return portionId;
	}

	public void setPortionId(int portionId) {
		this.portionId = portionId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FiPortion fiPortion = (FiPortion) o;
		return Objects.equals(this.assetClass, fiPortion.assetClass) && Objects.equals(this.percent, fiPortion.percent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assetClass, percent);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FiPortion {\n");

		sb.append("    assetClass: ").append(toIndentedString(assetClass)).append("\n");
		sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(FiPortion.class);

	public FiPortion getPortionDetails(int portionId) throws FDXException {
		FiPortion fiPortion = new FiPortion();
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("portionId", portionId);
			
			template = ConnectionConfigApi51.getTemplate();;

			fiPortion = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".fiportion where portionId in (:portionId)",
					parameters, new FiPortionRowMapper());
		} catch (Exception e) {
			log.error("FiPortion : ", e);
			throw new FDXException(e,500);
		}
		return fiPortion;
	}
}
