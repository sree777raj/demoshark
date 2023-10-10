package com.fdx.api.model51.modelimpl;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.Tax1098ERowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Student Loan Interest Statement
 */
@ApiModel(description = "Student Loan Interest Statement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1098E {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("lenderNameAddress")
	private NameAddressPhone lenderNameAddress;

	@JsonProperty("lenderTin")
	private String lenderTin;

	@JsonProperty("borrowerTin")
	private String borrowerTin;

	@JsonProperty("borrowerNameAddress")
	private NameAddress borrowerNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("studentLoanInterest")
	private Double studentLoanInterest;

	@JsonProperty("box1ExcludesFees")
	@JsonInclude(Include.NON_NULL)
	private Boolean box1ExcludesFees;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getLenderNameAddress() {
		return lenderNameAddress;
	}

	public void setLenderNameAddress(NameAddressPhone lenderNameAddress) {
		this.lenderNameAddress = lenderNameAddress;
	}

	public String getLenderTin() {
		return lenderTin;
	}

	public void setLenderTin(String lenderTin) {
		this.lenderTin = lenderTin;
	}

	public String getBorrowerTin() {
		return borrowerTin;
	}

	public void setBorrowerTin(String borrowerTin) {
		this.borrowerTin = borrowerTin;
	}

	public NameAddress getBorrowerNameAddress() {
		return borrowerNameAddress;
	}

	public void setBorrowerNameAddress(NameAddress borrowerNameAddress) {
		this.borrowerNameAddress = borrowerNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getStudentLoanInterest() {
		return studentLoanInterest;
	}

	public void setStudentLoanInterest(Double studentLoanInterest) {
		this.studentLoanInterest = studentLoanInterest;
	}

	public Boolean getBox1ExcludesFees() {
		return box1ExcludesFees;
	}

	public void setBox1ExcludesFees(Boolean box1ExcludesFees) {
		this.box1ExcludesFees = box1ExcludesFees;
	}

	@Override
	public String toString() {
		return "Tax1098E [tax=" + tax + ", lenderNameAddress=" + lenderNameAddress + ", lenderTin=" + lenderTin
				+ ", borrowerTin=" + borrowerTin + ", borrowerNameAddress=" + borrowerNameAddress + ", accountNumber="
				+ accountNumber + ", studentLoanInterest=" + studentLoanInterest + ", box1ExcludesFees="
				+ box1ExcludesFees + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((borrowerNameAddress == null) ? 0 : borrowerNameAddress.hashCode());
		result = prime * result + ((borrowerTin == null) ? 0 : borrowerTin.hashCode());
		result = prime * result + ((box1ExcludesFees == null) ? 0 : box1ExcludesFees.hashCode());
		result = prime * result + ((lenderNameAddress == null) ? 0 : lenderNameAddress.hashCode());
		result = prime * result + ((lenderTin == null) ? 0 : lenderTin.hashCode());
		result = prime * result + ((studentLoanInterest == null) ? 0 : studentLoanInterest.hashCode());
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
		Tax1098E other = (Tax1098E) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (borrowerNameAddress == null) {
			if (other.borrowerNameAddress != null)
				return false;
		} else if (!borrowerNameAddress.equals(other.borrowerNameAddress))
			return false;
		if (borrowerTin == null) {
			if (other.borrowerTin != null)
				return false;
		} else if (!borrowerTin.equals(other.borrowerTin))
			return false;
		if (box1ExcludesFees == null) {
			if (other.box1ExcludesFees != null)
				return false;
		} else if (!box1ExcludesFees.equals(other.box1ExcludesFees))
			return false;
		if (lenderNameAddress == null) {
			if (other.lenderNameAddress != null)
				return false;
		} else if (!lenderNameAddress.equals(other.lenderNameAddress))
			return false;
		if (lenderTin == null) {
			if (other.lenderTin != null)
				return false;
		} else if (!lenderTin.equals(other.lenderTin))
			return false;
		if (studentLoanInterest == null) {
			if (other.studentLoanInterest != null)
				return false;
		} else if (!studentLoanInterest.equals(other.studentLoanInterest))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1098E.class);

	public Tax1098E getTax1098E(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1098E tax1098E = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1098E where internalId in (:internalId)", parameters,
					new Tax1098ERowMapper());

//		LenderNameAddress Start
			NameAddressPhone lenderNameAddress = new NameAddressPhone();
			if (tax1098E.getLenderNameAddress() != null) {
				lenderNameAddress = lenderNameAddress
						.getNameAddressPhoneDetails(tax1098E.getLenderNameAddress().getNameAddressId());
				tax1098E.setLenderNameAddress(lenderNameAddress);
			}
//		LenderNameAddress End

//		BorrowerNameAddress Start
			NameAddress borrowerNameAddress = new NameAddress();
			if (tax1098E.getBorrowerNameAddress() != null) {
				borrowerNameAddress = borrowerNameAddress
						.getNameAddressDetails(tax1098E.getBorrowerNameAddress().getNameAddressId());
				tax1098E.setBorrowerNameAddress(borrowerNameAddress);
			}
//		BorrowerNameAddress End

			return tax1098E;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1098E : ", e);
			throw new FDXException(e,500);
		}
	}

}
