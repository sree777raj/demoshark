package com.fdx.api.model51.modelimpl;

import java.util.Date;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.Tax1098RowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Mortgage Interest Statement
 */
@ApiModel(description = "Mortgage Interest Statement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1098 {

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

	@JsonProperty("mortgagedProperties")
	private Integer mortgagedProperties;

	@JsonProperty("otherInformation")
	private String otherInformation;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("mortgageInterest")
	private Double mortgageInterest;

	@JsonProperty("outstandingPrincipal")
	private Double outstandingPrincipal;

	@JsonProperty("originationDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date originationDate;

	@JsonProperty("overpaidRefund")
	private Double overpaidRefund;

	@JsonProperty("mortgageInsurance")
	private Double mortgageInsurance;

	@JsonProperty("pointsPaid")
	private Double pointsPaid;

	@JsonProperty("isPropertyAddressSameAsBorrowerAddress")
	@JsonInclude(Include.NON_NULL)
	private Boolean isPropertyAddressSameAsBorrowerAddress;

	@JsonProperty("acquisitionDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date acquisitionDate;

	@JsonProperty("propertyAddress")
	private Address propertyAddress;

	@JsonProperty("propertyTax")
	private Double propertyTax;

	@JsonProperty("propertyDescription")
	private String propertyDescription;

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

	public Integer getMortgagedProperties() {
		return mortgagedProperties;
	}

	public void setMortgagedProperties(Integer mortgagedProperties) {
		this.mortgagedProperties = mortgagedProperties;
	}

	public String getOtherInformation() {
		return otherInformation;
	}

	public void setOtherInformation(String otherInformation) {
		this.otherInformation = otherInformation;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getMortgageInterest() {
		return mortgageInterest;
	}

	public void setMortgageInterest(Double mortgageInterest) {
		this.mortgageInterest = mortgageInterest;
	}

	public Double getOutstandingPrincipal() {
		return outstandingPrincipal;
	}

	public void setOutstandingPrincipal(Double outstandingPrincipal) {
		this.outstandingPrincipal = outstandingPrincipal;
	}

	public Date getOriginationDate() {
		return originationDate;
	}

	public void setOriginationDate(Date originationDate) {
		this.originationDate = originationDate;
	}

	public Double getOverpaidRefund() {
		return overpaidRefund;
	}

	public void setOverpaidRefund(Double overpaidRefund) {
		this.overpaidRefund = overpaidRefund;
	}

	public Double getMortgageInsurance() {
		return mortgageInsurance;
	}

	public void setMortgageInsurance(Double mortgageInsurance) {
		this.mortgageInsurance = mortgageInsurance;
	}

	public Double getPointsPaid() {
		return pointsPaid;
	}

	public void setPointsPaid(Double pointsPaid) {
		this.pointsPaid = pointsPaid;
	}

	public Boolean getIsPropertyAddressSameAsBorrowerAddress() {
		return isPropertyAddressSameAsBorrowerAddress;
	}

	public void setIsPropertyAddressSameAsBorrowerAddress(Boolean isPropertyAddressSameAsBorrowerAddress) {
		this.isPropertyAddressSameAsBorrowerAddress = isPropertyAddressSameAsBorrowerAddress;
	}

	public Date getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(Date acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public Address getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(Address propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public Double getPropertyTax() {
		return propertyTax;
	}

	public void setPropertyTax(Double propertyTax) {
		this.propertyTax = propertyTax;
	}

	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((acquisitionDate == null) ? 0 : acquisitionDate.hashCode());
		result = prime * result + ((borrowerNameAddress == null) ? 0 : borrowerNameAddress.hashCode());
		result = prime * result + ((borrowerTin == null) ? 0 : borrowerTin.hashCode());
		result = prime * result + ((isPropertyAddressSameAsBorrowerAddress == null) ? 0
				: isPropertyAddressSameAsBorrowerAddress.hashCode());
		result = prime * result + ((lenderNameAddress == null) ? 0 : lenderNameAddress.hashCode());
		result = prime * result + ((lenderTin == null) ? 0 : lenderTin.hashCode());
		result = prime * result + ((mortgageInsurance == null) ? 0 : mortgageInsurance.hashCode());
		result = prime * result + ((mortgageInterest == null) ? 0 : mortgageInterest.hashCode());
		result = prime * result + ((mortgagedProperties == null) ? 0 : mortgagedProperties.hashCode());
		result = prime * result + ((originationDate == null) ? 0 : originationDate.hashCode());
		result = prime * result + ((otherInformation == null) ? 0 : otherInformation.hashCode());
		result = prime * result + ((outstandingPrincipal == null) ? 0 : outstandingPrincipal.hashCode());
		result = prime * result + ((overpaidRefund == null) ? 0 : overpaidRefund.hashCode());
		result = prime * result + ((pointsPaid == null) ? 0 : pointsPaid.hashCode());
		result = prime * result + ((propertyAddress == null) ? 0 : propertyAddress.hashCode());
		result = prime * result + ((propertyDescription == null) ? 0 : propertyDescription.hashCode());
		result = prime * result + ((propertyTax == null) ? 0 : propertyTax.hashCode());
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
		Tax1098 other = (Tax1098) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (acquisitionDate == null) {
			if (other.acquisitionDate != null)
				return false;
		} else if (!acquisitionDate.equals(other.acquisitionDate))
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
		if (isPropertyAddressSameAsBorrowerAddress == null) {
			if (other.isPropertyAddressSameAsBorrowerAddress != null)
				return false;
		} else if (!isPropertyAddressSameAsBorrowerAddress.equals(other.isPropertyAddressSameAsBorrowerAddress))
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
		if (mortgageInsurance == null) {
			if (other.mortgageInsurance != null)
				return false;
		} else if (!mortgageInsurance.equals(other.mortgageInsurance))
			return false;
		if (mortgageInterest == null) {
			if (other.mortgageInterest != null)
				return false;
		} else if (!mortgageInterest.equals(other.mortgageInterest))
			return false;
		if (mortgagedProperties == null) {
			if (other.mortgagedProperties != null)
				return false;
		} else if (!mortgagedProperties.equals(other.mortgagedProperties))
			return false;
		if (originationDate == null) {
			if (other.originationDate != null)
				return false;
		} else if (!originationDate.equals(other.originationDate))
			return false;
		if (otherInformation == null) {
			if (other.otherInformation != null)
				return false;
		} else if (!otherInformation.equals(other.otherInformation))
			return false;
		if (outstandingPrincipal == null) {
			if (other.outstandingPrincipal != null)
				return false;
		} else if (!outstandingPrincipal.equals(other.outstandingPrincipal))
			return false;
		if (overpaidRefund == null) {
			if (other.overpaidRefund != null)
				return false;
		} else if (!overpaidRefund.equals(other.overpaidRefund))
			return false;
		if (pointsPaid == null) {
			if (other.pointsPaid != null)
				return false;
		} else if (!pointsPaid.equals(other.pointsPaid))
			return false;
		if (propertyAddress == null) {
			if (other.propertyAddress != null)
				return false;
		} else if (!propertyAddress.equals(other.propertyAddress))
			return false;
		if (propertyDescription == null) {
			if (other.propertyDescription != null)
				return false;
		} else if (!propertyDescription.equals(other.propertyDescription))
			return false;
		if (propertyTax == null) {
			if (other.propertyTax != null)
				return false;
		} else if (!propertyTax.equals(other.propertyTax))
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
		return "Tax1098 [tax=" + tax + ", lenderNameAddress=" + lenderNameAddress + ", lenderTin=" + lenderTin
				+ ", borrowerTin=" + borrowerTin + ", borrowerNameAddress=" + borrowerNameAddress
				+ ", mortgagedProperties=" + mortgagedProperties + ", otherInformation=" + otherInformation
				+ ", accountNumber=" + accountNumber + ", mortgageInterest=" + mortgageInterest
				+ ", outstandingPrincipal=" + outstandingPrincipal + ", originationDate=" + originationDate
				+ ", overpaidRefund=" + overpaidRefund + ", mortgageInsurance=" + mortgageInsurance + ", pointsPaid="
				+ pointsPaid + ", isPropertyAddressSameAsBorrowerAddress=" + isPropertyAddressSameAsBorrowerAddress
				+ ", acquisitionDate=" + acquisitionDate + ", propertyAddress=" + propertyAddress + ", propertyTax="
				+ propertyTax + ", propertyDescription=" + propertyDescription + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1098.class);

	public Tax1098 getTax1098(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1098 tax1098;
			try {
				tax1098 = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1098 where internalId in (:internalId)", parameters,
						new Tax1098RowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1098 not found", 0);
			}
//			Lendernameaddress Start
			NameAddressPhone lendernameaddress = new NameAddressPhone();
			if (tax1098.getLenderNameAddress() != null) {
				lendernameaddress = lendernameaddress
						.getNameAddressPhoneDetails(tax1098.getLenderNameAddress().getNameAddressId());
				tax1098.setLenderNameAddress(lendernameaddress);
			}
//			Lendernameaddress End

//			BorrowerNameAddress Start
			NameAddress borrowerNameAddress = new NameAddress();
			if (tax1098.getBorrowerNameAddress() != null) {
				borrowerNameAddress = borrowerNameAddress
						.getNameAddressDetails(tax1098.getBorrowerNameAddress().getNameAddressId());
				tax1098.setBorrowerNameAddress(borrowerNameAddress);
			}
//			BorrowerNameAddress End

//			PropertyAddress Start
			Address propertyAddress = new Address();
			if (tax1098.getPropertyAddress() != null) {
				propertyAddress = propertyAddress.getAddress(tax1098.getPropertyAddress().getAddressId());
				tax1098.setPropertyAddress(propertyAddress);
			}
//			PropertyAddress End

			return tax1098;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1098 : ", e);
			throw new FDXException(e,500);
		}
	}

}
