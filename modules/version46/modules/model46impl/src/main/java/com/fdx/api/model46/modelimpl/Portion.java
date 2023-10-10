package com.fdx.api.model46.modelimpl;

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
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.PortionRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An asset allocation with class and percentage
 */
@ApiModel(description = "An asset allocation with class and percentage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Portion {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int portionId;

	@JsonProperty("assetClass")
	private AssetClass assetClass;

	@JsonProperty("percent")
	private BigDecimal percent;

	public Portion assetClass(AssetClass assetClass) {
		this.assetClass = assetClass;
		return this;
	}

	/**
	 * Get assetClass
	 * 
	 * @return assetClass
	 */
	@ApiModelProperty(value = "")

	@Valid

	public AssetClass getAssetClass() {
		return assetClass;
	}

	public void setAssetClass(AssetClass assetClass) {
		this.assetClass = assetClass;
	}

	public Portion percent(BigDecimal percent) {
		this.percent = percent;
		return this;
	}

	/**
	 * The percentage of this allocation
	 * 
	 * @return percent
	 */
	@ApiModelProperty(value = "The percentage of this allocation")

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
		Portion portion = (Portion) o;
		return Objects.equals(this.assetClass, portion.assetClass) && Objects.equals(this.percent, portion.percent);
	}

	@Override
	public int hashCode() {
		return Objects.hash(assetClass, percent);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Portion {\n");

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

	private static final Logger log = LoggerFactory.getLogger(Portion.class);

	public Portion getPortionDetails(int portionId) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("portionId", portionId);
			
			template = ConnectionConfigApi46.getTemplate();;

			Portion portion = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".portion where portionid in (:portionId)",
					parameters, new PortionRowMapper());

			return portion;
		} catch (Exception e) {
			log.error("Portion : ", e);
			throw new FDXException(e,500);
		}
	}
}
