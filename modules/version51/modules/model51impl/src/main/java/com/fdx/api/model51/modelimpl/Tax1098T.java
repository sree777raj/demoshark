package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.Tax1098TRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Tuition Statement
 */
@ApiModel(description = "Tuition Statement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1098T {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("filerNameAddress")
	private NameAddressPhone filerNameAddress;

	@JsonProperty("filerTin")
	private String filerTin;

	@JsonProperty("studentTin")
	private String studentTin;

	@JsonProperty("studentTinCertification")
	@JsonInclude(Include.NON_NULL)
	private Boolean studentTinCertification;

	@JsonProperty("studentNameAddress")
	private NameAddress studentNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("halfTime")
	@JsonInclude(Include.NON_NULL)
	private Boolean halfTime;

	@JsonProperty("qualifiedTuitionFees")
	private Double qualifiedTuitionFees;

	@JsonProperty("adjustmentPriorYear")
	private Double adjustmentPriorYear;

	@JsonProperty("scholarship")
	private Double scholarship;

	@JsonProperty("adjustScholarship")
	private Double adjustScholarship;

	@JsonProperty("includeJanMar")
	@JsonInclude(Include.NON_NULL)
	private Boolean includeJanMar;

	@JsonProperty("graduate")
	@JsonInclude(Include.NON_NULL)
	private Boolean graduate;

	@JsonProperty("insuranceRefund")
	private Double insuranceRefund;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getFilerNameAddress() {
		return filerNameAddress;
	}

	public void setFilerNameAddress(NameAddressPhone filerNameAddress) {
		this.filerNameAddress = filerNameAddress;
	}

	public String getFilerTin() {
		return filerTin;
	}

	public void setFilerTin(String filerTin) {
		this.filerTin = filerTin;
	}

	public String getStudentTin() {
		return studentTin;
	}

	public void setStudentTin(String studentTin) {
		this.studentTin = studentTin;
	}

	public Boolean getStudentTinCertification() {
		return studentTinCertification;
	}

	public void setStudentTinCertification(Boolean studentTinCertification) {
		this.studentTinCertification = studentTinCertification;
	}

	public NameAddress getStudentNameAddress() {
		return studentNameAddress;
	}

	public void setStudentNameAddress(NameAddress studentNameAddress) {
		this.studentNameAddress = studentNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Boolean getHalfTime() {
		return halfTime;
	}

	public void setHalfTime(Boolean halfTime) {
		this.halfTime = halfTime;
	}

	public Double getQualifiedTuitionFees() {
		return qualifiedTuitionFees;
	}

	public void setQualifiedTuitionFees(Double qualifiedTuitionFees) {
		this.qualifiedTuitionFees = qualifiedTuitionFees;
	}

	public Double getAdjustmentPriorYear() {
		return adjustmentPriorYear;
	}

	public void setAdjustmentPriorYear(Double adjustmentPriorYear) {
		this.adjustmentPriorYear = adjustmentPriorYear;
	}

	public Double getScholarship() {
		return scholarship;
	}

	public void setScholarship(Double scholarship) {
		this.scholarship = scholarship;
	}

	public Double getAdjustScholarship() {
		return adjustScholarship;
	}

	public void setAdjustScholarship(Double adjustScholarship) {
		this.adjustScholarship = adjustScholarship;
	}

	public Boolean getIncludeJanMar() {
		return includeJanMar;
	}

	public void setIncludeJanMar(Boolean includeJanMar) {
		this.includeJanMar = includeJanMar;
	}

	public Boolean getGraduate() {
		return graduate;
	}

	public void setGraduate(Boolean graduate) {
		this.graduate = graduate;
	}

	public Double getInsuranceRefund() {
		return insuranceRefund;
	}

	public void setInsuranceRefund(Double insuranceRefund) {
		this.insuranceRefund = insuranceRefund;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((adjustScholarship == null) ? 0 : adjustScholarship.hashCode());
		result = prime * result + ((adjustmentPriorYear == null) ? 0 : adjustmentPriorYear.hashCode());
		result = prime * result + ((filerNameAddress == null) ? 0 : filerNameAddress.hashCode());
		result = prime * result + ((filerTin == null) ? 0 : filerTin.hashCode());
		result = prime * result + ((graduate == null) ? 0 : graduate.hashCode());
		result = prime * result + ((halfTime == null) ? 0 : halfTime.hashCode());
		result = prime * result + ((includeJanMar == null) ? 0 : includeJanMar.hashCode());
		result = prime * result + ((insuranceRefund == null) ? 0 : insuranceRefund.hashCode());
		result = prime * result + ((qualifiedTuitionFees == null) ? 0 : qualifiedTuitionFees.hashCode());
		result = prime * result + ((scholarship == null) ? 0 : scholarship.hashCode());
		result = prime * result + ((studentNameAddress == null) ? 0 : studentNameAddress.hashCode());
		result = prime * result + ((studentTin == null) ? 0 : studentTin.hashCode());
		result = prime * result + ((studentTinCertification == null) ? 0 : studentTinCertification.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
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
		Tax1098T other = (Tax1098T) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (adjustScholarship == null) {
			if (other.adjustScholarship != null)
				return false;
		} else if (!adjustScholarship.equals(other.adjustScholarship))
			return false;
		if (adjustmentPriorYear == null) {
			if (other.adjustmentPriorYear != null)
				return false;
		} else if (!adjustmentPriorYear.equals(other.adjustmentPriorYear))
			return false;
		if (filerNameAddress == null) {
			if (other.filerNameAddress != null)
				return false;
		} else if (!filerNameAddress.equals(other.filerNameAddress))
			return false;
		if (filerTin == null) {
			if (other.filerTin != null)
				return false;
		} else if (!filerTin.equals(other.filerTin))
			return false;
		if (graduate == null) {
			if (other.graduate != null)
				return false;
		} else if (!graduate.equals(other.graduate))
			return false;
		if (halfTime == null) {
			if (other.halfTime != null)
				return false;
		} else if (!halfTime.equals(other.halfTime))
			return false;
		if (includeJanMar == null) {
			if (other.includeJanMar != null)
				return false;
		} else if (!includeJanMar.equals(other.includeJanMar))
			return false;
		if (insuranceRefund == null) {
			if (other.insuranceRefund != null)
				return false;
		} else if (!insuranceRefund.equals(other.insuranceRefund))
			return false;
		if (qualifiedTuitionFees == null) {
			if (other.qualifiedTuitionFees != null)
				return false;
		} else if (!qualifiedTuitionFees.equals(other.qualifiedTuitionFees))
			return false;
		if (scholarship == null) {
			if (other.scholarship != null)
				return false;
		} else if (!scholarship.equals(other.scholarship))
			return false;
		if (studentNameAddress == null) {
			if (other.studentNameAddress != null)
				return false;
		} else if (!studentNameAddress.equals(other.studentNameAddress))
			return false;
		if (studentTin == null) {
			if (other.studentTin != null)
				return false;
		} else if (!studentTin.equals(other.studentTin))
			return false;
		if (studentTinCertification == null) {
			if (other.studentTinCertification != null)
				return false;
		} else if (!studentTinCertification.equals(other.studentTinCertification))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1098T [tax=" + tax + ", filerNameAddress=" + filerNameAddress + ", filerTin=" + filerTin
				+ ", studentTin=" + studentTin + ", studentTinCertification=" + studentTinCertification
				+ ", studentNameAddress=" + studentNameAddress + ", accountNumber=" + accountNumber + ", halfTime="
				+ halfTime + ", qualifiedTuitionFees=" + qualifiedTuitionFees + ", adjustmentPriorYear="
				+ adjustmentPriorYear + ", scholarship=" + scholarship + ", adjustScholarship=" + adjustScholarship
				+ ", includeJanMar=" + includeJanMar + ", graduate=" + graduate + ", insuranceRefund=" + insuranceRefund
				+ "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1098T.class);

	public Tax1098T getTax1098T(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1098T tax1098T;
			try {
				tax1098T = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1098T where internalId in (:internalId)", parameters,
						new Tax1098TRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1098T not found", 0);
			}
//		filerNameAddress Start
			NameAddressPhone filerNameAddress = new NameAddressPhone();
			if (tax1098T.getFilerNameAddress() != null) {
				filerNameAddress = filerNameAddress
						.getNameAddressPhoneDetails(tax1098T.getFilerNameAddress().getNameAddressId());
				tax1098T.setFilerNameAddress(filerNameAddress);
			}
//		filerNameAddress End

//		studentNameAddress Start
			NameAddress studentNameAddress = new NameAddress();
			if (tax1098T.getStudentNameAddress() != null) {
				studentNameAddress = studentNameAddress
						.getNameAddressDetails(tax1098T.getStudentNameAddress().getNameAddressId());
				tax1098T.setStudentNameAddress(studentNameAddress);
			}
//		studentNameAddress End

			return tax1098T;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1098T : ", e);
			throw new FDXException(e,500);
		}
	}
}
