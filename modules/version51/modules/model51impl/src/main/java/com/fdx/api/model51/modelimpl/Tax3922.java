package com.fdx.api.model51.modelimpl;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.Tax3922StatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Transfer of Stock Acquired Through an Employee Stock Purchase Plan under
 * Section 423(c)
 */
@ApiModel(description = "Transfer of Stock Acquired Through an Employee Stock Purchase Plan under Section 423(c)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax3922 {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("corporationNameAddress")
	private NameAddress corporationNameAddress;

	@JsonProperty("corporationTin")
	private String corporationTin;

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

	@JsonProperty("grantMarketValue")
	private Double grantMarketValue;

	@JsonProperty("exerciseMarketValue")
	private Double exerciseMarketValue;

	@JsonProperty("exercisePrice")
	private Double exercisePrice;

	@JsonProperty("numberOfShares")
	private Double numberOfShares;

	@JsonProperty("titleTransferDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date titleTransferDate;

	@JsonProperty("grantDateExercisePrice")
	private Double grantDateExercisePrice;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddress getCorporationNameAddress() {
		return corporationNameAddress;
	}

	public void setCorporationNameAddress(NameAddress corporationNameAddress) {
		this.corporationNameAddress = corporationNameAddress;
	}

	public String getCorporationTin() {
		return corporationTin;
	}

	public void setCorporationTin(String corporationTin) {
		this.corporationTin = corporationTin;
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

	public Double getGrantMarketValue() {
		return grantMarketValue;
	}

	public void setGrantMarketValue(Double grantMarketValue) {
		this.grantMarketValue = grantMarketValue;
	}

	public Double getExerciseMarketValue() {
		return exerciseMarketValue;
	}

	public void setExerciseMarketValue(Double exerciseMarketValue) {
		this.exerciseMarketValue = exerciseMarketValue;
	}

	public Double getExercisePrice() {
		return exercisePrice;
	}

	public void setExercisePrice(Double exercisePrice) {
		this.exercisePrice = exercisePrice;
	}

	public Double getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(Double numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public Date getTitleTransferDate() {
		return titleTransferDate;
	}

	public void setTitleTransferDate(Date titleTransferDate) {
		this.titleTransferDate = titleTransferDate;
	}

	public Double getGrantDateExercisePrice() {
		return grantDateExercisePrice;
	}

	public void setGrantDateExercisePrice(Double grantDateExercisePrice) {
		this.grantDateExercisePrice = grantDateExercisePrice;
	}

	@Override
	public String toString() {
		return "Tax3922 [tax=" + tax + ", corporationNameAddress=" + corporationNameAddress + ", corporationTin="
				+ corporationTin + ", employeeTin=" + employeeTin + ", employeeNameAddress=" + employeeNameAddress
				+ ", accountNumber=" + accountNumber + ", optionGrantDate=" + optionGrantDate + ", optionExerciseDate="
				+ optionExerciseDate + ", grantMarketValue=" + grantMarketValue + ", exerciseMarketValue="
				+ exerciseMarketValue + ", exercisePrice=" + exercisePrice + ", numberOfShares=" + numberOfShares
				+ ", titleTransferDate=" + titleTransferDate + ", grantDateExercisePrice=" + grantDateExercisePrice
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((corporationNameAddress == null) ? 0 : corporationNameAddress.hashCode());
		result = prime * result + ((corporationTin == null) ? 0 : corporationTin.hashCode());
		result = prime * result + ((employeeNameAddress == null) ? 0 : employeeNameAddress.hashCode());
		result = prime * result + ((employeeTin == null) ? 0 : employeeTin.hashCode());
		result = prime * result + ((exerciseMarketValue == null) ? 0 : exerciseMarketValue.hashCode());
		result = prime * result + ((exercisePrice == null) ? 0 : exercisePrice.hashCode());
		result = prime * result + ((grantDateExercisePrice == null) ? 0 : grantDateExercisePrice.hashCode());
		result = prime * result + ((grantMarketValue == null) ? 0 : grantMarketValue.hashCode());
		result = prime * result + ((numberOfShares == null) ? 0 : numberOfShares.hashCode());
		result = prime * result + ((optionExerciseDate == null) ? 0 : optionExerciseDate.hashCode());
		result = prime * result + ((optionGrantDate == null) ? 0 : optionGrantDate.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((titleTransferDate == null) ? 0 : titleTransferDate.hashCode());
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
		Tax3922 other = (Tax3922) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (corporationNameAddress == null) {
			if (other.corporationNameAddress != null)
				return false;
		} else if (!corporationNameAddress.equals(other.corporationNameAddress))
			return false;
		if (corporationTin == null) {
			if (other.corporationTin != null)
				return false;
		} else if (!corporationTin.equals(other.corporationTin))
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
		if (grantDateExercisePrice == null) {
			if (other.grantDateExercisePrice != null)
				return false;
		} else if (!grantDateExercisePrice.equals(other.grantDateExercisePrice))
			return false;
		if (grantMarketValue == null) {
			if (other.grantMarketValue != null)
				return false;
		} else if (!grantMarketValue.equals(other.grantMarketValue))
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
		if (titleTransferDate == null) {
			if (other.titleTransferDate != null)
				return false;
		} else if (!titleTransferDate.equals(other.titleTransferDate))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(Tax3922.class);

	public Tax3922 getTax3922(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax3922 tax3922;
			try {
				tax3922 = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax3922 where internalId in (:internalId)", parameters,
						new Tax3922StatementRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax3922 not found", 0);
			}
//			CorporationNameAddress Start
			NameAddress nameAddress = new NameAddress();
			if (tax3922.getCorporationNameAddress() != null) {
				nameAddress = nameAddress.getNameAddressDetails(tax3922.getCorporationNameAddress().getNameAddressId());
				tax3922.setCorporationNameAddress(nameAddress);
			}
//			CorporationNameAddress End

//			EmployeeNameAddress Start
			NameAddress nameAddressEmployee = new NameAddress();
			if (tax3922.getEmployeeNameAddress() != null) {
				nameAddressEmployee = nameAddressEmployee
						.getNameAddressDetails(tax3922.getEmployeeNameAddress().getNameAddressId());
				tax3922.setEmployeeNameAddress(nameAddressEmployee);
			}
//			EmployeeNameAddress End

			return tax3922;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax3922 : ", e);
			throw new FDXException(e,500);
		}
	}

}
