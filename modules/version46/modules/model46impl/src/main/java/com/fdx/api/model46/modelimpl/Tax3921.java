package com.fdx.api.model46.modelimpl;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax3921StatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Exercise of an Incentive Stock Option Under Section 422(b)
 */
@ApiModel(description = "Exercise of an Incentive Stock Option Under Section 422(b)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax3921 {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("transferorNameAddress")
	private NameAddress transferorNameAddress;

	@JsonProperty("transferorTin")
	private String transferorTin;

	@JsonProperty("employeeTin")
	private String employeeTin;

	@JsonProperty("employeeNameAddress")
	private NameAddress employeeNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("optionGrantDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date optionGrantDate;

	@JsonProperty("optionExerciseDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date optionExerciseDate;

	@JsonProperty("exercisePrice")
	private Double exercisePrice;

	@JsonProperty("exerciseMarketValue")
	private Double exerciseMarketValue;

	@JsonProperty("numberOfShares")
	private Double numberOfShares;

	@JsonProperty("corporateNameAddress")
	private NameAddress corporateNameAddress;

	@JsonProperty("corporateTin")
	private String corporateTin;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddress getTransferorNameAddress() {
		return transferorNameAddress;
	}

	public void setTransferorNameAddress(NameAddress transferorNameAddress) {
		this.transferorNameAddress = transferorNameAddress;
	}

	public String getTransferorTin() {
		return transferorTin;
	}

	public void setTransferorTin(String transferorTin) {
		this.transferorTin = transferorTin;
	}

	public String getEmployeeTin() {
		return employeeTin;
	}

	public void setEmployeeTin(String employeeTin) {
		this.employeeTin = employeeTin;
	}

	public NameAddress getEmployeeNameAddress() {
		return employeeNameAddress;
	}

	public void setEmployeeNameAddress(NameAddress employeeNameAddress) {
		this.employeeNameAddress = employeeNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getOptionGrantDate() {
		return optionGrantDate;
	}

	public void setOptionGrantDate(Date optionGrantDate) {
		this.optionGrantDate = optionGrantDate;
	}

	public Date getOptionExerciseDate() {
		return optionExerciseDate;
	}

	public void setOptionExerciseDate(Date optionExerciseDate) {
		this.optionExerciseDate = optionExerciseDate;
	}

	public Double getExercisePrice() {
		return exercisePrice;
	}

	public void setExercisePrice(Double exercisePrice) {
		this.exercisePrice = exercisePrice;
	}

	public Double getExerciseMarketValue() {
		return exerciseMarketValue;
	}

	public void setExerciseMarketValue(Double exerciseMarketValue) {
		this.exerciseMarketValue = exerciseMarketValue;
	}

	public Double getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(Double numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public NameAddress getCorporateNameAddress() {
		return corporateNameAddress;
	}

	public void setCorporateNameAddress(NameAddress corporateNameAddress) {
		this.corporateNameAddress = corporateNameAddress;
	}

	public String getCorporateTin() {
		return corporateTin;
	}

	public void setCorporateTin(String corporateTin) {
		this.corporateTin = corporateTin;
	}

	@Override
	public String toString() {
		return "Tax3921 [tax=" + tax + ", transferorNameAddress=" + transferorNameAddress + ", transferorTin="
				+ transferorTin + ", employeeTin=" + employeeTin + ", employeeNameAddress=" + employeeNameAddress
				+ ", accountNumber=" + accountNumber + ", optionGrantDate=" + optionGrantDate + ", optionExerciseDate="
				+ optionExerciseDate + ", exercisePrice=" + exercisePrice + ", exerciseMarketValue="
				+ exerciseMarketValue + ", numberOfShares=" + numberOfShares + ", corporateNameAddress="
				+ corporateNameAddress + ", corporateTin=" + corporateTin + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((corporateNameAddress == null) ? 0 : corporateNameAddress.hashCode());
		result = prime * result + ((corporateTin == null) ? 0 : corporateTin.hashCode());
		result = prime * result + ((employeeNameAddress == null) ? 0 : employeeNameAddress.hashCode());
		result = prime * result + ((employeeTin == null) ? 0 : employeeTin.hashCode());
		result = prime * result + ((exerciseMarketValue == null) ? 0 : exerciseMarketValue.hashCode());
		result = prime * result + ((exercisePrice == null) ? 0 : exercisePrice.hashCode());
		result = prime * result + ((numberOfShares == null) ? 0 : numberOfShares.hashCode());
		result = prime * result + ((optionExerciseDate == null) ? 0 : optionExerciseDate.hashCode());
		result = prime * result + ((optionGrantDate == null) ? 0 : optionGrantDate.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((transferorNameAddress == null) ? 0 : transferorNameAddress.hashCode());
		result = prime * result + ((transferorTin == null) ? 0 : transferorTin.hashCode());
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
		Tax3921 other = (Tax3921) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (corporateNameAddress == null) {
			if (other.corporateNameAddress != null)
				return false;
		} else if (!corporateNameAddress.equals(other.corporateNameAddress))
			return false;
		if (corporateTin == null) {
			if (other.corporateTin != null)
				return false;
		} else if (!corporateTin.equals(other.corporateTin))
			return false;
		if (employeeNameAddress == null) {
			if (other.employeeNameAddress != null)
				return false;
		} else if (!employeeNameAddress.equals(other.employeeNameAddress))
			return false;
		if (employeeTin == null) {
			if (other.employeeTin != null)
				return false;
		} else if (!employeeTin.equals(other.employeeTin))
			return false;
		if (exerciseMarketValue == null) {
			if (other.exerciseMarketValue != null)
				return false;
		} else if (!exerciseMarketValue.equals(other.exerciseMarketValue))
			return false;
		if (exercisePrice == null) {
			if (other.exercisePrice != null)
				return false;
		} else if (!exercisePrice.equals(other.exercisePrice))
			return false;
		if (numberOfShares == null) {
			if (other.numberOfShares != null)
				return false;
		} else if (!numberOfShares.equals(other.numberOfShares))
			return false;
		if (optionExerciseDate == null) {
			if (other.optionExerciseDate != null)
				return false;
		} else if (!optionExerciseDate.equals(other.optionExerciseDate))
			return false;
		if (optionGrantDate == null) {
			if (other.optionGrantDate != null)
				return false;
		} else if (!optionGrantDate.equals(other.optionGrantDate))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (transferorNameAddress == null) {
			if (other.transferorNameAddress != null)
				return false;
		} else if (!transferorNameAddress.equals(other.transferorNameAddress))
			return false;
		if (transferorTin == null) {
			if (other.transferorTin != null)
				return false;
		} else if (!transferorTin.equals(other.transferorTin))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(Tax3921.class);

	public Tax3921 getTax3921(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax3921 tax3921 = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax3921 where internalId in (:internalId)", parameters,
					new Tax3921StatementRowMapper());

//			CorporateNameAddress Start
			NameAddress nameAddress = new NameAddress();
			if (tax3921.getCorporateNameAddress() != null) {
				nameAddress = nameAddress.getNameAddressDetails(tax3921.getCorporateNameAddress().getNameAddressId());
				tax3921.setCorporateNameAddress(nameAddress);
			}
//			CorporateNameAddress End

//			EmployeeNameAddress Start
			NameAddress nameAddressEmployee = new NameAddress();
			if (tax3921.getEmployeeNameAddress() != null) {
				nameAddressEmployee = nameAddressEmployee
						.getNameAddressDetails(tax3921.getEmployeeNameAddress().getNameAddressId());
				tax3921.setEmployeeNameAddress(nameAddressEmployee);
			}
//			EmployeeNameAddress End

//			TransferorNameAddress Start
			NameAddress nameAddressTransferor = new NameAddress();
			if (tax3921.getTransferorNameAddress() != null) {
				nameAddressTransferor = nameAddressTransferor
						.getNameAddressDetails(tax3921.getTransferorNameAddress().getNameAddressId());
				tax3921.setTransferorNameAddress(nameAddressTransferor);
			}
//			TransferorNameAddress End

			return tax3921;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax3921 : ", e);
			throw new FDXException(e,500);
		}
	}

}
