package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

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
import com.fdx.api.model51.mapper.Tax1099RRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Distributions from Pensions, Annuities, Retirement or Profit-Sharing Plans,
 * IRAs, Insurance Contracts, etc.
 */
@ApiModel(description = "Distributions from Pensions, Annuities, Retirement or Profit-Sharing Plans, IRAs, Insurance Contracts, etc.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099R {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("payerNameAddress")
	private NameAddressPhone payerNameAddress;

	@JsonProperty("payerTin")
	private String payerTin;

	@JsonProperty("recipientTin")
	private String recipientTin;

	@JsonProperty("recipientNameAddress")
	private NameAddress recipientNameAddress;

	@JsonProperty("allocableToIRR")
	private Double allocableToIRR;

	@JsonProperty("firstYearOfRoth")
	private Integer firstYearOfRoth;

	@JsonProperty("foreignAccountTaxCompliance")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreignAccountTaxCompliance;

	@JsonProperty("recipientAccountNumber")
	private String recipientAccountNumber;

	@JsonProperty("dateOfPayment")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateOfPayment;

	@JsonProperty("grossDistribution")
	private Double grossDistribution;

	@JsonProperty("taxableAmount")
	private Double taxableAmount;

	@JsonProperty("taxableAmountNotDetermined")
	@JsonInclude(Include.NON_NULL)
	private Boolean taxableAmountNotDetermined;

	@JsonProperty("totalDistribution")
	@JsonInclude(Include.NON_NULL)
	private Boolean totalDistribution;

	@JsonProperty("capitalGain")
	private Double capitalGain;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("employeeContributions")
	private Double employeeContributions;

	@JsonProperty("netUnrealizedAppreciation")
	private Double netUnrealizedAppreciation;

	@JsonProperty("distributionCodes")
	@Valid
	private List<String> distributionCodes = null;

	@JsonProperty("iraSepSimple")
	@JsonInclude(Include.NON_NULL)
	private Boolean iraSepSimple;

	@JsonProperty("otherAmount")
	private Double otherAmount;

	@JsonProperty("otherPercent")
	private Double otherPercent;

	@JsonProperty("yourPercentOfTotal")
	private Double yourPercentOfTotal;

	@JsonProperty("totalEmployeeContributions")
	private Double totalEmployeeContributions;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("localTaxWithholding")
	@Valid
	private List<LocalTaxWithholding> localTaxWithholding = null;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getPayerNameAddress() {
		return payerNameAddress;
	}

	public void setPayerNameAddress(NameAddressPhone payerNameAddress) {
		this.payerNameAddress = payerNameAddress;
	}

	public String getPayerTin() {
		return payerTin;
	}

	public void setPayerTin(String payerTin) {
		this.payerTin = payerTin;
	}

	public String getRecipientTin() {
		return recipientTin;
	}

	public void setRecipientTin(String recipientTin) {
		this.recipientTin = recipientTin;
	}

	public NameAddress getRecipientNameAddress() {
		return recipientNameAddress;
	}

	public void setRecipientNameAddress(NameAddress recipientNameAddress) {
		this.recipientNameAddress = recipientNameAddress;
	}

	public Double getAllocableToIRR() {
		return allocableToIRR;
	}

	public void setAllocableToIRR(Double allocableToIRR) {
		this.allocableToIRR = allocableToIRR;
	}

	public Integer getFirstYearOfRoth() {
		return firstYearOfRoth;
	}

	public void setFirstYearOfRoth(Integer firstYearOfRoth) {
		this.firstYearOfRoth = firstYearOfRoth;
	}

	public Boolean getForeignAccountTaxCompliance() {
		return foreignAccountTaxCompliance;
	}

	public void setForeignAccountTaxCompliance(Boolean foreignAccountTaxCompliance) {
		this.foreignAccountTaxCompliance = foreignAccountTaxCompliance;
	}

	public String getRecipientAccountNumber() {
		return recipientAccountNumber;
	}

	public void setRecipientAccountNumber(String recipientAccountNumber) {
		this.recipientAccountNumber = recipientAccountNumber;
	}

	public Date getDateOfPayment() {
		return dateOfPayment;
	}

	public void setDateOfPayment(Date dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}

	public Double getGrossDistribution() {
		return grossDistribution;
	}

	public void setGrossDistribution(Double grossDistribution) {
		this.grossDistribution = grossDistribution;
	}

	public Double getTaxableAmount() {
		return taxableAmount;
	}

	public void setTaxableAmount(Double taxableAmount) {
		this.taxableAmount = taxableAmount;
	}

	public Boolean getTaxableAmountNotDetermined() {
		return taxableAmountNotDetermined;
	}

	public void setTaxableAmountNotDetermined(Boolean taxableAmountNotDetermined) {
		this.taxableAmountNotDetermined = taxableAmountNotDetermined;
	}

	public Boolean getTotalDistribution() {
		return totalDistribution;
	}

	public void setTotalDistribution(Boolean totalDistribution) {
		this.totalDistribution = totalDistribution;
	}

	public Double getCapitalGain() {
		return capitalGain;
	}

	public void setCapitalGain(Double capitalGain) {
		this.capitalGain = capitalGain;
	}

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public Double getEmployeeContributions() {
		return employeeContributions;
	}

	public void setEmployeeContributions(Double employeeContributions) {
		this.employeeContributions = employeeContributions;
	}

	public Double getNetUnrealizedAppreciation() {
		return netUnrealizedAppreciation;
	}

	public void setNetUnrealizedAppreciation(Double netUnrealizedAppreciation) {
		this.netUnrealizedAppreciation = netUnrealizedAppreciation;
	}

	public List<String> getDistributionCodes() {
		return distributionCodes;
	}

	public void setDistributionCodes(List<String> distributionCodes) {
		this.distributionCodes = distributionCodes;
	}

	public Boolean getIraSepSimple() {
		return iraSepSimple;
	}

	public void setIraSepSimple(Boolean iraSepSimple) {
		this.iraSepSimple = iraSepSimple;
	}

	public Double getOtherAmount() {
		return otherAmount;
	}

	public void setOtherAmount(Double otherAmount) {
		this.otherAmount = otherAmount;
	}

	public Double getOtherPercent() {
		return otherPercent;
	}

	public void setOtherPercent(Double otherPercent) {
		this.otherPercent = otherPercent;
	}

	public Double getYourPercentOfTotal() {
		return yourPercentOfTotal;
	}

	public void setYourPercentOfTotal(Double yourPercentOfTotal) {
		this.yourPercentOfTotal = yourPercentOfTotal;
	}

	public Double getTotalEmployeeContributions() {
		return totalEmployeeContributions;
	}

	public void setTotalEmployeeContributions(Double totalEmployeeContributions) {
		this.totalEmployeeContributions = totalEmployeeContributions;
	}

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public List<LocalTaxWithholding> getLocalTaxWithholding() {
		return localTaxWithholding;
	}

	public void setLocalTaxWithholding(List<LocalTaxWithholding> localTaxWithholding) {
		this.localTaxWithholding = localTaxWithholding;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allocableToIRR == null) ? 0 : allocableToIRR.hashCode());
		result = prime * result + ((capitalGain == null) ? 0 : capitalGain.hashCode());
		result = prime * result + ((dateOfPayment == null) ? 0 : dateOfPayment.hashCode());
		result = prime * result + ((distributionCodes == null) ? 0 : distributionCodes.hashCode());
		result = prime * result + ((employeeContributions == null) ? 0 : employeeContributions.hashCode());
		result = prime * result + ((federalTaxWithheld == null) ? 0 : federalTaxWithheld.hashCode());
		result = prime * result + ((firstYearOfRoth == null) ? 0 : firstYearOfRoth.hashCode());
		result = prime * result + ((foreignAccountTaxCompliance == null) ? 0 : foreignAccountTaxCompliance.hashCode());
		result = prime * result + ((grossDistribution == null) ? 0 : grossDistribution.hashCode());
		result = prime * result + ((iraSepSimple == null) ? 0 : iraSepSimple.hashCode());
		result = prime * result + ((localTaxWithholding == null) ? 0 : localTaxWithholding.hashCode());
		result = prime * result + ((netUnrealizedAppreciation == null) ? 0 : netUnrealizedAppreciation.hashCode());
		result = prime * result + ((otherAmount == null) ? 0 : otherAmount.hashCode());
		result = prime * result + ((otherPercent == null) ? 0 : otherPercent.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((recipientAccountNumber == null) ? 0 : recipientAccountNumber.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((stateTaxWithholding == null) ? 0 : stateTaxWithholding.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((taxableAmount == null) ? 0 : taxableAmount.hashCode());
		result = prime * result + ((taxableAmountNotDetermined == null) ? 0 : taxableAmountNotDetermined.hashCode());
		result = prime * result + ((totalDistribution == null) ? 0 : totalDistribution.hashCode());
		result = prime * result + ((totalEmployeeContributions == null) ? 0 : totalEmployeeContributions.hashCode());
		result = prime * result + ((yourPercentOfTotal == null) ? 0 : yourPercentOfTotal.hashCode());
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
		Tax1099R other = (Tax1099R) obj;
		if (allocableToIRR == null) {
			if (other.allocableToIRR != null)
				return false;
		} else if (!allocableToIRR.equals(other.allocableToIRR))
			return false;
		if (capitalGain == null) {
			if (other.capitalGain != null)
				return false;
		} else if (!capitalGain.equals(other.capitalGain))
			return false;
		if (dateOfPayment == null) {
			if (other.dateOfPayment != null)
				return false;
		} else if (!dateOfPayment.equals(other.dateOfPayment))
			return false;
		if (distributionCodes == null) {
			if (other.distributionCodes != null)
				return false;
		} else if (!distributionCodes.equals(other.distributionCodes))
			return false;
		if (employeeContributions == null) {
			if (other.employeeContributions != null)
				return false;
		} else if (!employeeContributions.equals(other.employeeContributions))
			return false;
		if (federalTaxWithheld == null) {
			if (other.federalTaxWithheld != null)
				return false;
		} else if (!federalTaxWithheld.equals(other.federalTaxWithheld))
			return false;
		if (firstYearOfRoth == null) {
			if (other.firstYearOfRoth != null)
				return false;
		} else if (!firstYearOfRoth.equals(other.firstYearOfRoth))
			return false;
		if (foreignAccountTaxCompliance == null) {
			if (other.foreignAccountTaxCompliance != null)
				return false;
		} else if (!foreignAccountTaxCompliance.equals(other.foreignAccountTaxCompliance))
			return false;
		if (grossDistribution == null) {
			if (other.grossDistribution != null)
				return false;
		} else if (!grossDistribution.equals(other.grossDistribution))
			return false;
		if (iraSepSimple == null) {
			if (other.iraSepSimple != null)
				return false;
		} else if (!iraSepSimple.equals(other.iraSepSimple))
			return false;
		if (localTaxWithholding == null) {
			if (other.localTaxWithholding != null)
				return false;
		} else if (!localTaxWithholding.equals(other.localTaxWithholding))
			return false;
		if (netUnrealizedAppreciation == null) {
			if (other.netUnrealizedAppreciation != null)
				return false;
		} else if (!netUnrealizedAppreciation.equals(other.netUnrealizedAppreciation))
			return false;
		if (otherAmount == null) {
			if (other.otherAmount != null)
				return false;
		} else if (!otherAmount.equals(other.otherAmount))
			return false;
		if (otherPercent == null) {
			if (other.otherPercent != null)
				return false;
		} else if (!otherPercent.equals(other.otherPercent))
			return false;
		if (payerNameAddress == null) {
			if (other.payerNameAddress != null)
				return false;
		} else if (!payerNameAddress.equals(other.payerNameAddress))
			return false;
		if (payerTin == null) {
			if (other.payerTin != null)
				return false;
		} else if (!payerTin.equals(other.payerTin))
			return false;
		if (recipientAccountNumber == null) {
			if (other.recipientAccountNumber != null)
				return false;
		} else if (!recipientAccountNumber.equals(other.recipientAccountNumber))
			return false;
		if (recipientNameAddress == null) {
			if (other.recipientNameAddress != null)
				return false;
		} else if (!recipientNameAddress.equals(other.recipientNameAddress))
			return false;
		if (recipientTin == null) {
			if (other.recipientTin != null)
				return false;
		} else if (!recipientTin.equals(other.recipientTin))
			return false;
		if (stateTaxWithholding == null) {
			if (other.stateTaxWithholding != null)
				return false;
		} else if (!stateTaxWithholding.equals(other.stateTaxWithholding))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (taxableAmount == null) {
			if (other.taxableAmount != null)
				return false;
		} else if (!taxableAmount.equals(other.taxableAmount))
			return false;
		if (taxableAmountNotDetermined == null) {
			if (other.taxableAmountNotDetermined != null)
				return false;
		} else if (!taxableAmountNotDetermined.equals(other.taxableAmountNotDetermined))
			return false;
		if (totalDistribution == null) {
			if (other.totalDistribution != null)
				return false;
		} else if (!totalDistribution.equals(other.totalDistribution))
			return false;
		if (totalEmployeeContributions == null) {
			if (other.totalEmployeeContributions != null)
				return false;
		} else if (!totalEmployeeContributions.equals(other.totalEmployeeContributions))
			return false;
		if (yourPercentOfTotal == null) {
			if (other.yourPercentOfTotal != null)
				return false;
		} else if (!yourPercentOfTotal.equals(other.yourPercentOfTotal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1099R [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", allocableToIRR=" + allocableToIRR + ", firstYearOfRoth=" + firstYearOfRoth
				+ ", foreignAccountTaxCompliance=" + foreignAccountTaxCompliance + ", recipientAccountNumber="
				+ recipientAccountNumber + ", dateOfPayment=" + dateOfPayment + ", grossDistribution="
				+ grossDistribution + ", taxableAmount=" + taxableAmount + ", taxableAmountNotDetermined="
				+ taxableAmountNotDetermined + ", totalDistribution=" + totalDistribution + ", capitalGain="
				+ capitalGain + ", federalTaxWithheld=" + federalTaxWithheld + ", employeeContributions="
				+ employeeContributions + ", netUnrealizedAppreciation=" + netUnrealizedAppreciation
				+ ", distributionCodes=" + distributionCodes + ", iraSepSimple=" + iraSepSimple + ", otherAmount="
				+ otherAmount + ", otherPercent=" + otherPercent + ", yourPercentOfTotal=" + yourPercentOfTotal
				+ ", totalEmployeeContributions=" + totalEmployeeContributions + ", stateTaxWithholding="
				+ stateTaxWithholding + ", localTaxWithholding=" + localTaxWithholding + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099R.class);

	public Tax1099R getTax1099R(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1099R tax1099R;
			try {
				tax1099R = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".Tax1099R where internalId in (:internalId)", parameters,
						new Tax1099RRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1099R not found", 0);
			}
//			payerNameAddress Start
			NameAddressPhone payerNameAddress = new NameAddressPhone();
			if (tax1099R.getPayerNameAddress() != null) {
				payerNameAddress = payerNameAddress
						.getNameAddressPhoneDetails(tax1099R.getPayerNameAddress().getNameAddressId());
				tax1099R.setPayerNameAddress(payerNameAddress);
			}
//			payerNameAddress End

//			recipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1099R.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1099R.getRecipientNameAddress().getNameAddressId());
				tax1099R.setRecipientNameAddress(recipientNameAddress);
			}
//			recipientNameAddress End

//			StateTaxWithholding Start
			List<StateTaxWithholding> stateTaxWithholdingList = tax1099R.getStateTaxWithholding();
			List<StateTaxWithholding> stateTaxWithholdingListNew = new ArrayList<>();
			if (tax1099R.getStateTaxWithholding() != null) {
				for (StateTaxWithholding stateTaxWithholdingIterator : stateTaxWithholdingList) {
					StateTaxWithholding stateTaxWithholding = stateTaxWithholdingIterator
							.getStateTaxWIthHolding(stateTaxWithholdingIterator.getStwithheldid());
					stateTaxWithholdingListNew.add(stateTaxWithholding);
				}
				tax1099R.setStateTaxWithholding(stateTaxWithholdingListNew);
			}
//			StateTaxWithholding End

//			LocalTaxWithholding Start
			List<LocalTaxWithholding> localTaxWithholdingList = tax1099R.getLocalTaxWithholding();
			List<LocalTaxWithholding> localTaxWithholdingListNew = new ArrayList<>();
			if (tax1099R.getLocalTaxWithholding() != null) {
				for (LocalTaxWithholding LocalTaxWithholdingIterator : localTaxWithholdingList) {
					LocalTaxWithholding LocalTaxWithholding = LocalTaxWithholdingIterator
							.getLocalTaxWIthHolding(LocalTaxWithholdingIterator.getLtwithheldid());
					localTaxWithholdingListNew.add(LocalTaxWithholding);
				}
				tax1099R.setLocalTaxWithholding(localTaxWithholdingListNew);
			}
//			LocalTaxWithholding End

			return tax1099R;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099R : ", e);
			throw new FDXException(e,500);
		}
	}

}
