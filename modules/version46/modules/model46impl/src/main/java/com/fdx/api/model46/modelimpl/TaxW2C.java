package com.fdx.api.model46.modelimpl;

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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.TaxW2CStatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * IRS form W-2c, Corrected Wage and Tax Statement
 */
@ApiModel(description = "IRS form W-2c, Corrected Wage and Tax Statement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxW2C {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private Integer internalId;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("employerNameAddress")
	private NameAddress employerNameAddress;

	@JsonProperty("employerTin")
	private String employerTin;

	@JsonProperty("employeeTin")
	private String employeeTin;

	@JsonProperty("correctedTinOrName")
	@JsonInclude(Include.NON_NULL)
	private Boolean correctedTinOrName;

	@JsonProperty("previousEmployeeTin")
	private String previousEmployeeTin;

	@JsonProperty("previousEmployeeName")
	private IndividualName previousEmployeeName;

	@JsonProperty("employeeName")
	private IndividualName employeeName;

	@JsonProperty("employeeAddress")
	private Address employeeAddress;

	@JsonProperty("originalW2")
	private TaxW2 originalW2;

	@JsonProperty("correctedW2")
	private TaxW2 correctedW2;

	public Integer getInternalId() {
		return internalId;
	}

	public void setInternalId(Integer internalId) {
		this.internalId = internalId;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddress getEmployerNameAddress() {
		return employerNameAddress;
	}

	public void setEmployerNameAddress(NameAddress employerNameAddress) {
		this.employerNameAddress = employerNameAddress;
	}

	public String getEmployerTin() {
		return employerTin;
	}

	public void setEmployerTin(String employerTin) {
		this.employerTin = employerTin;
	}

	public String getEmployeeTin() {
		return employeeTin;
	}

	public void setEmployeeTin(String employeeTin) {
		this.employeeTin = employeeTin;
	}

	public Boolean getCorrectedTinOrName() {
		return correctedTinOrName;
	}

	public void setCorrectedTinOrName(Boolean correctedTinOrName) {
		this.correctedTinOrName = correctedTinOrName;
	}

	public String getPreviousEmployeeTin() {
		return previousEmployeeTin;
	}

	public void setPreviousEmployeeTin(String previousEmployeeTin) {
		this.previousEmployeeTin = previousEmployeeTin;
	}

	public IndividualName getPreviousEmployeeName() {
		return previousEmployeeName;
	}

	public void setPreviousEmployeeName(IndividualName previousEmployeeName) {
		this.previousEmployeeName = previousEmployeeName;
	}

	public IndividualName getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(IndividualName employeeName) {
		this.employeeName = employeeName;
	}

	public Address getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public TaxW2 getOriginalW2() {
		return originalW2;
	}

	public void setOriginalW2(TaxW2 originalW2) {
		this.originalW2 = originalW2;
	}

	public TaxW2 getCorrectedW2() {
		return correctedW2;
	}

	public void setCorrectedW2(TaxW2 correctedW2) {
		this.correctedW2 = correctedW2;
	}

	@Override
	public String toString() {
		return "TaxW2C [ta=" + tax + ", employerNameAddress=" + employerNameAddress + ", employerTin=" + employerTin
				+ ", employeeTin=" + employeeTin + ", correctedTinOrName=" + correctedTinOrName
				+ ", previousEmployeeTin=" + previousEmployeeTin + ", previousEmployeeName=" + previousEmployeeName
				+ ", employeeName=" + employeeName + ", employeeAddress=" + employeeAddress + ", originalW2="
				+ originalW2 + ", correctedW2=" + correctedW2 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correctedTinOrName == null) ? 0 : correctedTinOrName.hashCode());
		result = prime * result + ((correctedW2 == null) ? 0 : correctedW2.hashCode());
		result = prime * result + ((employeeAddress == null) ? 0 : employeeAddress.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + ((employeeTin == null) ? 0 : employeeTin.hashCode());
		result = prime * result + ((employerNameAddress == null) ? 0 : employerNameAddress.hashCode());
		result = prime * result + ((employerTin == null) ? 0 : employerTin.hashCode());
		result = prime * result + ((originalW2 == null) ? 0 : originalW2.hashCode());
		result = prime * result + ((previousEmployeeName == null) ? 0 : previousEmployeeName.hashCode());
		result = prime * result + ((previousEmployeeTin == null) ? 0 : previousEmployeeTin.hashCode());
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
		TaxW2C other = (TaxW2C) obj;
		if (correctedTinOrName == null) {
			if (other.correctedTinOrName != null)
				return false;
		} else if (!correctedTinOrName.equals(other.correctedTinOrName))
			return false;
		if (correctedW2 == null) {
			if (other.correctedW2 != null)
				return false;
		} else if (!correctedW2.equals(other.correctedW2))
			return false;
		if (employeeAddress == null) {
			if (other.employeeAddress != null)
				return false;
		} else if (!employeeAddress.equals(other.employeeAddress))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeTin == null) {
			if (other.employeeTin != null)
				return false;
		} else if (!employeeTin.equals(other.employeeTin))
			return false;
		if (employerNameAddress == null) {
			if (other.employerNameAddress != null)
				return false;
		} else if (!employerNameAddress.equals(other.employerNameAddress))
			return false;
		if (employerTin == null) {
			if (other.employerTin != null)
				return false;
		} else if (!employerTin.equals(other.employerTin))
			return false;
		if (originalW2 == null) {
			if (other.originalW2 != null)
				return false;
		} else if (!originalW2.equals(other.originalW2))
			return false;
		if (previousEmployeeName == null) {
			if (other.previousEmployeeName != null)
				return false;
		} else if (!previousEmployeeName.equals(other.previousEmployeeName))
			return false;
		if (previousEmployeeTin == null) {
			if (other.previousEmployeeTin != null)
				return false;
		} else if (!previousEmployeeTin.equals(other.previousEmployeeTin))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(TaxW2C.class);

	public TaxW2C getTaxW2C(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			TaxW2C taxW2C;
			try {
				taxW2C = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".taxW2C where internalId in (:internalId)",
						parameters, new TaxW2CStatementRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("TaxW2C not found", 0);
			}
//			EmployerNameAddress Start
			NameAddress nameAddress = new NameAddress();
			if (taxW2C.getEmployerNameAddress() != null) {
				nameAddress = nameAddress.getNameAddressDetails(taxW2C.getEmployerNameAddress().getNameAddressId());
				taxW2C.setEmployerNameAddress(nameAddress);
			}
//			EmployerNameAddress End

//			PreviousEmployeeName Start
			IndividualName previousEmployeeName = new IndividualName();
			if (taxW2C.getPreviousEmployeeName() != null) {
				previousEmployeeName = previousEmployeeName
						.getIndividualName(taxW2C.getPreviousEmployeeName().getNameid());
				taxW2C.setPreviousEmployeeName(previousEmployeeName);
			}
//			PreviousEmployeeName End

//			EmployeeName Start
			IndividualName employeeName = new IndividualName();
			if (taxW2C.getEmployeeName() != null) {
				employeeName = employeeName.getIndividualName(taxW2C.getEmployeeName().getNameid());
				taxW2C.setEmployeeName(employeeName);
			}
//			EmployeeName End

//			EmployeeAddress Start
			Address address = new Address();
			if (taxW2C.getEmployeeAddress() != null) {
				address = address.getAddress(taxW2C.getEmployeeAddress().getAddressId());
				taxW2C.setEmployeeAddress(address);
			}
//			EmployeeAddress End

//			OriginalW2 Start
			TaxW2 taxW2Original = new TaxW2();
			if (taxW2C.getOriginalW2() != null) {
				taxW2Original = taxW2Original.getTaxW2(taxW2C.getOriginalW2().getInternalId());
				taxW2C.setOriginalW2(taxW2Original);
			}
//			OriginalW2 End

//			CorrectedW2 Start
			TaxW2 taxW2Corrected = new TaxW2();
			if (taxW2C.getCorrectedW2() != null) {
				taxW2Corrected = taxW2Corrected.getTaxW2(taxW2C.getCorrectedW2().getInternalId());
				taxW2C.setCorrectedW2(taxW2Corrected);
			}
//			CorrectedW2 End

			return taxW2C;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("TaxW2C : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

}
