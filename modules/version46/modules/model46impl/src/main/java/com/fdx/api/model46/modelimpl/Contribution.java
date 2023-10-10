package com.fdx.api.model46.modelimpl;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.ContributionRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contribution information to an investment account
 */
@ApiModel(description = "Contribution information to an investment account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Contribution {

	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int contributionId;

	@JsonProperty("securityId")
	private String securityId;

	@JsonProperty("securityIdType")
	private SecurityIdType securityIdType;

	@JsonProperty("employerMatchPercentage")
	private BigDecimal employerMatchPercentage;

	@JsonProperty("employerMatchAmount")
	private BigDecimal employerMatchAmount;

	@JsonProperty("employeePreTaxAmount")
	private BigDecimal employeePreTaxAmount;

	@JsonProperty("employeePreTaxPercentage")
	private BigDecimal employeePreTaxPercentage;

	@JsonProperty("employeeAfterTaxAmount")
	private BigDecimal employeeAfterTaxAmount;

	@JsonProperty("employeeAfterTaxPercentage")
	private BigDecimal employeeAfterTaxPercentage;

	@JsonProperty("employeeDeferPreTaxAmount")
	private BigDecimal employeeDeferPreTaxAmount;

	@JsonProperty("employeeDeferPreTaxPercentage")
	private BigDecimal employeeDeferPreTaxPercentage;

	@JsonProperty("employeeYearToDate")
	private BigDecimal employeeYearToDate;

	@JsonProperty("employerYearToDate")
	private BigDecimal employerYearToDate;

	@JsonProperty("rolloverContributionPercentage")
	private BigDecimal rolloverContributionPercentage;

	@JsonProperty("rolloverContributionAmount")
	private BigDecimal rolloverContributionAmount;

	public Contribution securityId(String securityId) {
		this.securityId = securityId;
		return this;
	}

	/**
	 * Unique identifier of security
	 * 
	 * @return securityId
	 */
	@ApiModelProperty(value = "Unique identifier of security")

	public String getSecurityId() {
		return securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	public Contribution securityIdType(SecurityIdType securityIdType) {
		this.securityIdType = securityIdType;
		return this;
	}

	/**
	 * Get securityIdType
	 * 
	 * @return securityIdType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public SecurityIdType getSecurityIdType() {
		return securityIdType;
	}

	public void setSecurityIdType(SecurityIdType securityIdType) {
		this.securityIdType = securityIdType;
	}

	public Contribution employerMatchPercentage(BigDecimal employerMatchPercentage) {
		this.employerMatchPercentage = employerMatchPercentage;
		return this;
	}

	/**
	 * Employer contribution match percentage
	 * 
	 * @return employerMatchPercentage
	 */
	@ApiModelProperty(value = "Employer contribution match percentage")

	@Valid

	public BigDecimal getEmployerMatchPercentage() {
		return employerMatchPercentage;
	}

	public void setEmployerMatchPercentage(BigDecimal employerMatchPercentage) {
		this.employerMatchPercentage = employerMatchPercentage;
	}

	public Contribution employerMatchAmount(BigDecimal employerMatchAmount) {
		this.employerMatchAmount = employerMatchAmount;
		return this;
	}

	/**
	 * Employer contribution match amount
	 * 
	 * @return employerMatchAmount
	 */
	@ApiModelProperty(value = "Employer contribution match amount")

	@Valid

	public BigDecimal getEmployerMatchAmount() {
		return employerMatchAmount;
	}

	public void setEmployerMatchAmount(BigDecimal employerMatchAmount) {
		this.employerMatchAmount = employerMatchAmount;
	}

	public Contribution employeePreTaxAmount(BigDecimal employeePreTaxAmount) {
		this.employeePreTaxAmount = employeePreTaxAmount;
		return this;
	}

	/**
	 * Employee pre-tax contribution amount
	 * 
	 * @return employeePreTaxAmount
	 */
	@ApiModelProperty(value = "Employee pre-tax contribution amount")

	@Valid

	public BigDecimal getEmployeePreTaxAmount() {
		return employeePreTaxAmount;
	}

	public void setEmployeePreTaxAmount(BigDecimal employeePreTaxAmount) {
		this.employeePreTaxAmount = employeePreTaxAmount;
	}

	public Contribution employeePreTaxPercentage(BigDecimal employeePreTaxPercentage) {
		this.employeePreTaxPercentage = employeePreTaxPercentage;
		return this;
	}

	/**
	 * Employee pre-tax contribution percentage
	 * 
	 * @return employeePreTaxPercentage
	 */
	@ApiModelProperty(value = "Employee pre-tax contribution percentage")

	@Valid

	public BigDecimal getEmployeePreTaxPercentage() {
		return employeePreTaxPercentage;
	}

	public void setEmployeePreTaxPercentage(BigDecimal employeePreTaxPercentage) {
		this.employeePreTaxPercentage = employeePreTaxPercentage;
	}

	public Contribution employeeAfterTaxAmount(BigDecimal employeeAfterTaxAmount) {
		this.employeeAfterTaxAmount = employeeAfterTaxAmount;
		return this;
	}

	/**
	 * Employee after tax contribution amount
	 * 
	 * @return employeeAfterTaxAmount
	 */
	@ApiModelProperty(value = "Employee after tax contribution amount")

	@Valid

	public BigDecimal getEmployeeAfterTaxAmount() {
		return employeeAfterTaxAmount;
	}

	public void setEmployeeAfterTaxAmount(BigDecimal employeeAfterTaxAmount) {
		this.employeeAfterTaxAmount = employeeAfterTaxAmount;
	}

	public Contribution employeeAfterTaxPercentage(BigDecimal employeeAfterTaxPercentage) {
		this.employeeAfterTaxPercentage = employeeAfterTaxPercentage;
		return this;
	}

	/**
	 * Employee after tax contribution percentage
	 * 
	 * @return employeeAfterTaxPercentage
	 */
	@ApiModelProperty(value = "Employee after tax contribution percentage")

	@Valid

	public BigDecimal getEmployeeAfterTaxPercentage() {
		return employeeAfterTaxPercentage;
	}

	public void setEmployeeAfterTaxPercentage(BigDecimal employeeAfterTaxPercentage) {
		this.employeeAfterTaxPercentage = employeeAfterTaxPercentage;
	}

	public Contribution employeeDeferPreTaxAmount(BigDecimal employeeDeferPreTaxAmount) {
		this.employeeDeferPreTaxAmount = employeeDeferPreTaxAmount;
		return this;
	}

	/**
	 * Employee defer pre-tax contribution match amount
	 * 
	 * @return employeeDeferPreTaxAmount
	 */
	@ApiModelProperty(value = "Employee defer pre-tax contribution match amount")

	@Valid

	public BigDecimal getEmployeeDeferPreTaxAmount() {
		return employeeDeferPreTaxAmount;
	}

	public void setEmployeeDeferPreTaxAmount(BigDecimal employeeDeferPreTaxAmount) {
		this.employeeDeferPreTaxAmount = employeeDeferPreTaxAmount;
	}

	public Contribution employeeDeferPreTaxPercentage(BigDecimal employeeDeferPreTaxPercentage) {
		this.employeeDeferPreTaxPercentage = employeeDeferPreTaxPercentage;
		return this;
	}

	/**
	 * Employee defer pre-tax contribution match percentage
	 * 
	 * @return employeeDeferPreTaxPercentage
	 */
	@ApiModelProperty(value = "Employee defer pre-tax contribution match percentage")

	@Valid

	public BigDecimal getEmployeeDeferPreTaxPercentage() {
		return employeeDeferPreTaxPercentage;
	}

	public void setEmployeeDeferPreTaxPercentage(BigDecimal employeeDeferPreTaxPercentage) {
		this.employeeDeferPreTaxPercentage = employeeDeferPreTaxPercentage;
	}

	public Contribution employeeYearToDate(BigDecimal employeeYearToDate) {
		this.employeeYearToDate = employeeYearToDate;
		return this;
	}

	/**
	 * Employee total year to date contribution
	 * 
	 * @return employeeYearToDate
	 */
	@ApiModelProperty(value = "Employee total year to date contribution")

	@Valid

	public BigDecimal getEmployeeYearToDate() {
		return employeeYearToDate;
	}

	public void setEmployeeYearToDate(BigDecimal employeeYearToDate) {
		this.employeeYearToDate = employeeYearToDate;
	}

	public Contribution employerYearToDate(BigDecimal employerYearToDate) {
		this.employerYearToDate = employerYearToDate;
		return this;
	}

	/**
	 * Employer total year to date contribution
	 * 
	 * @return employerYearToDate
	 */
	@ApiModelProperty(value = "Employer total year to date contribution")

	@Valid

	public BigDecimal getEmployerYearToDate() {
		return employerYearToDate;
	}

	public void setEmployerYearToDate(BigDecimal employerYearToDate) {
		this.employerYearToDate = employerYearToDate;
	}

	public Contribution rolloverContributionPercentage(BigDecimal rolloverContributionPercentage) {
		this.rolloverContributionPercentage = rolloverContributionPercentage;
		return this;
	}

	/**
	 * Rollover contribution percentage
	 * 
	 * @return rolloverContributionPercentage
	 */
	@ApiModelProperty(value = "Rollover contribution percentage")

	@Valid

	public BigDecimal getRolloverContributionPercentage() {
		return rolloverContributionPercentage;
	}

	public void setRolloverContributionPercentage(BigDecimal rolloverContributionPercentage) {
		this.rolloverContributionPercentage = rolloverContributionPercentage;
	}

	public Contribution rolloverContributionAmount(BigDecimal rolloverContributionAmount) {
		this.rolloverContributionAmount = rolloverContributionAmount;
		return this;
	}

	/**
	 * Rollover contribution Amount
	 * 
	 * @return rolloverContributionAmount
	 */
	@ApiModelProperty(value = "Rollover contribution Amount")

	@Valid

	public BigDecimal getRolloverContributionAmount() {
		return rolloverContributionAmount;
	}

	public void setRolloverContributionAmount(BigDecimal rolloverContributionAmount) {
		this.rolloverContributionAmount = rolloverContributionAmount;
	}

	public int getContributionId() {
		return contributionId;
	}

	public void setContributionId(int contributionId) {
		this.contributionId = contributionId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Contribution contribution = (Contribution) o;
		return Objects.equals(this.securityId, contribution.securityId)
				&& Objects.equals(this.securityIdType, contribution.securityIdType)
				&& Objects.equals(this.employerMatchPercentage, contribution.employerMatchPercentage)
				&& Objects.equals(this.employerMatchAmount, contribution.employerMatchAmount)
				&& Objects.equals(this.employeePreTaxAmount, contribution.employeePreTaxAmount)
				&& Objects.equals(this.employeePreTaxPercentage, contribution.employeePreTaxPercentage)
				&& Objects.equals(this.employeeAfterTaxAmount, contribution.employeeAfterTaxAmount)
				&& Objects.equals(this.employeeAfterTaxPercentage, contribution.employeeAfterTaxPercentage)
				&& Objects.equals(this.employeeDeferPreTaxAmount, contribution.employeeDeferPreTaxAmount)
				&& Objects.equals(this.employeeDeferPreTaxPercentage, contribution.employeeDeferPreTaxPercentage)
				&& Objects.equals(this.employeeYearToDate, contribution.employeeYearToDate)
				&& Objects.equals(this.employerYearToDate, contribution.employerYearToDate)
				&& Objects.equals(this.rolloverContributionPercentage, contribution.rolloverContributionPercentage)
				&& Objects.equals(this.rolloverContributionAmount, contribution.rolloverContributionAmount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(securityId, securityIdType, employerMatchPercentage, employerMatchAmount,
				employeePreTaxAmount, employeePreTaxPercentage, employeeAfterTaxAmount, employeeAfterTaxPercentage,
				employeeDeferPreTaxAmount, employeeDeferPreTaxPercentage, employeeYearToDate, employerYearToDate,
				rolloverContributionPercentage, rolloverContributionAmount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Contribution {\n");

		sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
		sb.append("    securityIdType: ").append(toIndentedString(securityIdType)).append("\n");
		sb.append("    employerMatchPercentage: ").append(toIndentedString(employerMatchPercentage)).append("\n");
		sb.append("    employerMatchAmount: ").append(toIndentedString(employerMatchAmount)).append("\n");
		sb.append("    employeePreTaxAmount: ").append(toIndentedString(employeePreTaxAmount)).append("\n");
		sb.append("    employeePreTaxPercentage: ").append(toIndentedString(employeePreTaxPercentage)).append("\n");
		sb.append("    employeeAfterTaxAmount: ").append(toIndentedString(employeeAfterTaxAmount)).append("\n");
		sb.append("    employeeAfterTaxPercentage: ").append(toIndentedString(employeeAfterTaxPercentage)).append("\n");
		sb.append("    employeeDeferPreTaxAmount: ").append(toIndentedString(employeeDeferPreTaxAmount)).append("\n");
		sb.append("    employeeDeferPreTaxPercentage: ").append(toIndentedString(employeeDeferPreTaxPercentage))
				.append("\n");
		sb.append("    employeeYearToDate: ").append(toIndentedString(employeeYearToDate)).append("\n");
		sb.append("    employerYearToDate: ").append(toIndentedString(employerYearToDate)).append("\n");
		sb.append("    rolloverContributionPercentage: ").append(toIndentedString(rolloverContributionPercentage))
				.append("\n");
		sb.append("    rolloverContributionAmount: ").append(toIndentedString(rolloverContributionAmount)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(Contribution.class);

	public Contribution getContribution(int contributionId) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("contributionId", contributionId);
			template = ConnectionConfigApi46.getTemplate();;
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".contribution where contributionId in (:contributionId)", parameters,
					new ContributionRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException("Contribution not found", 0);
		} catch (Exception e) {
			log.error("Contribution : ", e);
			throw new FDXException(e,500);
		}
	}
}
