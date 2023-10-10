package com.fdx.api.model51.modelimpl;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fdx.common.exception.Errors;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.OfferOfHealthInsuranceCoverageRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Health insurance coverage offer for part II of IRS Form 1095-C
 */
@ApiModel(description = "Health insurance coverage offer for part II of IRS Form 1095-C")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class OfferOfHealthInsuranceCoverage {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int oohicid;

	@JsonProperty("coverageCode")
	private String coverageCode;

	@JsonProperty("requiredContribution")
	private Double requiredContribution;

	@JsonProperty("section4980HCode")
	private String section4980HCode;

	@JsonProperty("postalCode")
	private String postalCode;

	@JsonProperty("month")
	private CoverageMonth month;

	public OfferOfHealthInsuranceCoverage coverageCode(String coverageCode) {
		this.coverageCode = coverageCode;
		return this;
	}

	/**
	 * Offer of Coverage (enter required code)
	 * 
	 * @return coverageCode
	 */
	@ApiModelProperty(value = "Offer of Coverage (enter required code)")

	public String getCoverageCode() {
		return coverageCode;
	}

	public void setCoverageCode(String coverageCode) {
		this.coverageCode = coverageCode;
	}

	public OfferOfHealthInsuranceCoverage requiredContribution(Double requiredContribution) {
		this.requiredContribution = requiredContribution;
		return this;
	}

	/**
	 * Employee required contribution
	 * 
	 * @return requiredContribution
	 */
	@ApiModelProperty(value = "Employee required contribution")

	public Double getRequiredContribution() {
		return requiredContribution;
	}

	public void setRequiredContribution(Double requiredContribution) {
		this.requiredContribution = requiredContribution;
	}

	public OfferOfHealthInsuranceCoverage section4980HCode(String section4980HCode) {
		this.section4980HCode = section4980HCode;
		return this;
	}

	/**
	 * Section 4980H Safe Harbor and Other Relief (enter code)
	 * 
	 * @return section4980HCode
	 */
	@ApiModelProperty(value = "Section 4980H Safe Harbor and Other Relief (enter code)")

	public String getSection4980HCode() {
		return section4980HCode;
	}

	public void setSection4980HCode(String section4980HCode) {
		this.section4980HCode = section4980HCode;
	}

	public OfferOfHealthInsuranceCoverage postalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}

	/**
	 * Box 17, ZIP Code
	 * 
	 * @return postalCode
	 */
	@ApiModelProperty(value = "Box 17, ZIP Code")

	@Size(max = 10)
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public OfferOfHealthInsuranceCoverage month(CoverageMonth month) {
		this.month = month;
		return this;
	}

	/**
	 * Get month
	 * 
	 * @return month
	 */
	@ApiModelProperty(value = "")

	@Valid

	public CoverageMonth getMonth() {
		return month;
	}

	public void setMonth(CoverageMonth month) {
		this.month = month;
	}

	public int getOohicid() {
		return oohicid;
	}

	public void setOohicid(int oohicid) {
		this.oohicid = oohicid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OfferOfHealthInsuranceCoverage offerOfHealthInsuranceCoverage = (OfferOfHealthInsuranceCoverage) o;
		return Objects.equals(this.coverageCode, offerOfHealthInsuranceCoverage.coverageCode)
				&& Objects.equals(this.requiredContribution, offerOfHealthInsuranceCoverage.requiredContribution)
				&& Objects.equals(this.section4980HCode, offerOfHealthInsuranceCoverage.section4980HCode)
				&& Objects.equals(this.postalCode, offerOfHealthInsuranceCoverage.postalCode)
				&& Objects.equals(this.month, offerOfHealthInsuranceCoverage.month);
	}

	@Override
	public int hashCode() {
		return Objects.hash(coverageCode, requiredContribution, section4980HCode, postalCode, month);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OfferOfHealthInsuranceCoverage {\n");

		sb.append("    coverageCode: ").append(toIndentedString(coverageCode)).append("\n");
		sb.append("    requiredContribution: ").append(toIndentedString(requiredContribution)).append("\n");
		sb.append("    section4980HCode: ").append(toIndentedString(section4980HCode)).append("\n");
		sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
		sb.append("    month: ").append(toIndentedString(month)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(OfferOfHealthInsuranceCoverage.class);

	public OfferOfHealthInsuranceCoverage getOohicidDetails(int oohicid) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("oohicid", oohicid);
			OfferOfHealthInsuranceCoverage offerOfHealthInsuranceCoverage = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".OfferOfHealthInsuranceCoverage where oohicid in (:oohicid)", parameters,
					new OfferOfHealthInsuranceCoverageRowMapper());
			return offerOfHealthInsuranceCoverage;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.OFFER_OF_HEALTH_INSURANCE_COVERAGE_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("OfferOfHealthInsuranceCoverage : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
