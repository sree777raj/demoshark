package com.fdx.api.model51.modelimpl;

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
import com.fdx.api.model51.mapper.HealthInsuranceCoverageRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Used on Form 1095-A Part III
 */
@ApiModel(description = "Used on Form 1095-A Part III")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class HealthInsuranceCoverage {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int hicid;

	@JsonProperty("enrollmentPremium")
	private Double enrollmentPremium;

	@JsonProperty("slcspPremium")
	private Double slcspPremium;

	@JsonProperty("advancePremiumTaxCreditPayment")
	private Double advancePremiumTaxCreditPayment;

	@JsonProperty("month")
	private CoverageMonth month;

	public int getHicid() {
		return hicid;
	}

	public void setHicid(int hicid) {
		this.hicid = hicid;
	}

	public Double getEnrollmentPremium() {
		return enrollmentPremium;
	}

	public void setEnrollmentPremium(Double enrollmentPremium) {
		this.enrollmentPremium = enrollmentPremium;
	}

	public Double getSlcspPremium() {
		return slcspPremium;
	}

	public void setSlcspPremium(Double slcspPremium) {
		this.slcspPremium = slcspPremium;
	}

	public Double getAdvancePremiumTaxCreditPayment() {
		return advancePremiumTaxCreditPayment;
	}

	public void setAdvancePremiumTaxCreditPayment(Double advancePremiumTaxCreditPayment) {
		this.advancePremiumTaxCreditPayment = advancePremiumTaxCreditPayment;
	}

	public CoverageMonth getMonth() {
		return month;
	}

	public void setMonth(CoverageMonth month) {
		this.month = month;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((advancePremiumTaxCreditPayment == null) ? 0 : advancePremiumTaxCreditPayment.hashCode());
		result = prime * result + ((enrollmentPremium == null) ? 0 : enrollmentPremium.hashCode());
		result = prime * result + hicid;
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + ((slcspPremium == null) ? 0 : slcspPremium.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HealthInsuranceCoverage other = (HealthInsuranceCoverage) obj;
		if (advancePremiumTaxCreditPayment == null) {
			if (other.advancePremiumTaxCreditPayment != null)
				return false;
		} else if (!advancePremiumTaxCreditPayment.equals(other.advancePremiumTaxCreditPayment))
			return false;
		if (enrollmentPremium == null) {
			if (other.enrollmentPremium != null)
				return false;
		} else if (!enrollmentPremium.equals(other.enrollmentPremium))
			return false;
		if (hicid != other.hicid)
			return false;
		if (month != other.month)
			return false;
		if (slcspPremium == null) {
			if (other.slcspPremium != null)
				return false;
		} else if (!slcspPremium.equals(other.slcspPremium))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HealthInsuranceCoverage [hicid=" + hicid + ", enrollmentPremium=" + enrollmentPremium
				+ ", slcspPremium=" + slcspPremium + ", advancePremiumTaxCreditPayment="
				+ advancePremiumTaxCreditPayment + ", month=" + month + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(HealthInsuranceCoverage.class);

	public HealthInsuranceCoverage getHicidDetails(int hicid) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("hicid", hicid);
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".healthInsuranceCoverage where hicid in (:hicid)", parameters,
					new HealthInsuranceCoverageRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.HEALTH_INSURANCE_COVERAGE_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("HealthInsuranceCoverage : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
