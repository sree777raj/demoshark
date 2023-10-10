package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

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
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax1099KRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Merchant Card and Third-Party Network Payments
 */
@ApiModel(description = "Merchant Card and Third-Party Network Payments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099K {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("filerNameAddress")
	private NameAddressPhone filerNameAddress;

	@JsonProperty("paymentSettlementEntity")
	@JsonInclude(Include.NON_NULL)
	private Boolean paymentSettlementEntity;

	@JsonProperty("electronicPaymentFacilitator")
	@JsonInclude(Include.NON_NULL)
	private Boolean electronicPaymentFacilitator;

	@JsonProperty("paymentCard")
	@JsonInclude(Include.NON_NULL)
	private Boolean paymentCard;

	@JsonProperty("thirdPartyNetwork")
	@JsonInclude(Include.NON_NULL)
	private Boolean thirdPartyNetwork;

	@JsonProperty("payeeNameAddress")
	private NameAddress payeeNameAddress;

	@JsonProperty("pseName")
	private String pseName;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("filerTin")
	private String filerTin;

	@JsonProperty("payeeFederalId")
	private String payeeFederalId;

	@JsonProperty("payeeTin")
	private String payeeTin;

	@JsonProperty("grossAmount")
	private Double grossAmount;

	@JsonProperty("cardNotPresent")
	private Double cardNotPresent;

	@JsonProperty("merchantCategoryCode")
	private String merchantCategoryCode;

	@JsonProperty("numberOfTransactions")
	private Double numberOfTransactions;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("monthAmounts")
	@Valid
	private List<MonthAmount> monthAmounts = null;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("psePhone")
	private TelephoneNumberPlusExtension psePhone;

	@JsonProperty("secondTinNotice")
	@JsonInclude(Include.NON_NULL)
	private Boolean secondTinNotice;

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

	public Boolean getPaymentSettlementEntity() {
		return paymentSettlementEntity;
	}

	public void setPaymentSettlementEntity(Boolean paymentSettlementEntity) {
		this.paymentSettlementEntity = paymentSettlementEntity;
	}

	public Boolean getElectronicPaymentFacilitator() {
		return electronicPaymentFacilitator;
	}

	public void setElectronicPaymentFacilitator(Boolean electronicPaymentFacilitator) {
		this.electronicPaymentFacilitator = electronicPaymentFacilitator;
	}

	public Boolean getPaymentCard() {
		return paymentCard;
	}

	public void setPaymentCard(Boolean paymentCard) {
		this.paymentCard = paymentCard;
	}

	public Boolean getThirdPartyNetwork() {
		return thirdPartyNetwork;
	}

	public void setThirdPartyNetwork(Boolean thirdPartyNetwork) {
		this.thirdPartyNetwork = thirdPartyNetwork;
	}

	public NameAddress getPayeeNameAddress() {
		return payeeNameAddress;
	}

	public void setPayeeNameAddress(NameAddress payeeNameAddress) {
		this.payeeNameAddress = payeeNameAddress;
	}

	public String getPseName() {
		return pseName;
	}

	public void setPseName(String pseName) {
		this.pseName = pseName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFilerTin() {
		return filerTin;
	}

	public void setFilerTin(String filerTin) {
		this.filerTin = filerTin;
	}

	public String getPayeeFederalId() {
		return payeeFederalId;
	}

	public void setPayeeFederalId(String payeeFederalId) {
		this.payeeFederalId = payeeFederalId;
	}

	public String getPayeeTin() {
		return payeeTin;
	}

	public void setPayeeTin(String payeeTin) {
		this.payeeTin = payeeTin;
	}

	public Double getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}

	public Double getCardNotPresent() {
		return cardNotPresent;
	}

	public void setCardNotPresent(Double cardNotPresent) {
		this.cardNotPresent = cardNotPresent;
	}

	public String getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public Double getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public void setNumberOfTransactions(Double numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
	}

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public List<MonthAmount> getMonthAmounts() {
		return monthAmounts;
	}

	public void setMonthAmounts(List<MonthAmount> monthAmounts) {
		this.monthAmounts = monthAmounts;
	}

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public TelephoneNumberPlusExtension getPsePhone() {
		return psePhone;
	}

	public void setPsePhone(TelephoneNumberPlusExtension psePhone) {
		this.psePhone = psePhone;
	}

	public Boolean getSecondTinNotice() {
		return secondTinNotice;
	}

	public void setSecondTinNotice(Boolean secondTinNotice) {
		this.secondTinNotice = secondTinNotice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((cardNotPresent == null) ? 0 : cardNotPresent.hashCode());
		result = prime * result
				+ ((electronicPaymentFacilitator == null) ? 0 : electronicPaymentFacilitator.hashCode());
		result = prime * result + ((federalTaxWithheld == null) ? 0 : federalTaxWithheld.hashCode());
		result = prime * result + ((filerNameAddress == null) ? 0 : filerNameAddress.hashCode());
		result = prime * result + ((filerTin == null) ? 0 : filerTin.hashCode());
		result = prime * result + ((grossAmount == null) ? 0 : grossAmount.hashCode());
		result = prime * result + ((merchantCategoryCode == null) ? 0 : merchantCategoryCode.hashCode());
		result = prime * result + ((monthAmounts == null) ? 0 : monthAmounts.hashCode());
		result = prime * result + ((numberOfTransactions == null) ? 0 : numberOfTransactions.hashCode());
		result = prime * result + ((payeeFederalId == null) ? 0 : payeeFederalId.hashCode());
		result = prime * result + ((payeeNameAddress == null) ? 0 : payeeNameAddress.hashCode());
		result = prime * result + ((payeeTin == null) ? 0 : payeeTin.hashCode());
		result = prime * result + ((paymentCard == null) ? 0 : paymentCard.hashCode());
		result = prime * result + ((paymentSettlementEntity == null) ? 0 : paymentSettlementEntity.hashCode());
		result = prime * result + ((pseName == null) ? 0 : pseName.hashCode());
		result = prime * result + ((psePhone == null) ? 0 : psePhone.hashCode());
		result = prime * result + ((secondTinNotice == null) ? 0 : secondTinNotice.hashCode());
		result = prime * result + ((stateTaxWithholding == null) ? 0 : stateTaxWithholding.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((thirdPartyNetwork == null) ? 0 : thirdPartyNetwork.hashCode());
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
		Tax1099K other = (Tax1099K) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (cardNotPresent == null) {
			if (other.cardNotPresent != null)
				return false;
		} else if (!cardNotPresent.equals(other.cardNotPresent))
			return false;
		if (electronicPaymentFacilitator == null) {
			if (other.electronicPaymentFacilitator != null)
				return false;
		} else if (!electronicPaymentFacilitator.equals(other.electronicPaymentFacilitator))
			return false;
		if (federalTaxWithheld == null) {
			if (other.federalTaxWithheld != null)
				return false;
		} else if (!federalTaxWithheld.equals(other.federalTaxWithheld))
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
		if (grossAmount == null) {
			if (other.grossAmount != null)
				return false;
		} else if (!grossAmount.equals(other.grossAmount))
			return false;
		if (merchantCategoryCode == null) {
			if (other.merchantCategoryCode != null)
				return false;
		} else if (!merchantCategoryCode.equals(other.merchantCategoryCode))
			return false;
		if (monthAmounts == null) {
			if (other.monthAmounts != null)
				return false;
		} else if (!monthAmounts.equals(other.monthAmounts))
			return false;
		if (numberOfTransactions == null) {
			if (other.numberOfTransactions != null)
				return false;
		} else if (!numberOfTransactions.equals(other.numberOfTransactions))
			return false;
		if (payeeFederalId == null) {
			if (other.payeeFederalId != null)
				return false;
		} else if (!payeeFederalId.equals(other.payeeFederalId))
			return false;
		if (payeeNameAddress == null) {
			if (other.payeeNameAddress != null)
				return false;
		} else if (!payeeNameAddress.equals(other.payeeNameAddress))
			return false;
		if (payeeTin == null) {
			if (other.payeeTin != null)
				return false;
		} else if (!payeeTin.equals(other.payeeTin))
			return false;
		if (paymentCard == null) {
			if (other.paymentCard != null)
				return false;
		} else if (!paymentCard.equals(other.paymentCard))
			return false;
		if (paymentSettlementEntity == null) {
			if (other.paymentSettlementEntity != null)
				return false;
		} else if (!paymentSettlementEntity.equals(other.paymentSettlementEntity))
			return false;
		if (pseName == null) {
			if (other.pseName != null)
				return false;
		} else if (!pseName.equals(other.pseName))
			return false;
		if (psePhone == null) {
			if (other.psePhone != null)
				return false;
		} else if (!psePhone.equals(other.psePhone))
			return false;
		if (secondTinNotice == null) {
			if (other.secondTinNotice != null)
				return false;
		} else if (!secondTinNotice.equals(other.secondTinNotice))
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
		if (thirdPartyNetwork == null) {
			if (other.thirdPartyNetwork != null)
				return false;
		} else if (!thirdPartyNetwork.equals(other.thirdPartyNetwork))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1099K [tax=" + tax + ", filerNameAddress=" + filerNameAddress + ", paymentSettlementEntity="
				+ paymentSettlementEntity + ", electronicPaymentFacilitator=" + electronicPaymentFacilitator
				+ ", paymentCard=" + paymentCard + ", thirdPartyNetwork=" + thirdPartyNetwork + ", payeeNameAddress="
				+ payeeNameAddress + ", pseName=" + pseName + ", accountNumber=" + accountNumber + ", filerTin="
				+ filerTin + ", payeeFederalId=" + payeeFederalId + ", payeeTin=" + payeeTin + ", grossAmount="
				+ grossAmount + ", cardNotPresent=" + cardNotPresent + ", merchantCategoryCode=" + merchantCategoryCode
				+ ", numberOfTransactions=" + numberOfTransactions + ", federalTaxWithheld=" + federalTaxWithheld
				+ ", monthAmounts=" + monthAmounts + ", stateTaxWithholding=" + stateTaxWithholding + ", psePhone="
				+ psePhone + ", secondTinNotice=" + secondTinNotice + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099K.class);

	public Tax1099K getTax1099K(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1099K tax1099K = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1099K where internalId in (:internalId)", parameters,
					new Tax1099KRowMapper());

//		filerNameAddress Start
			NameAddressPhone filerNameAddress = new NameAddressPhone();
			if (tax1099K.getFilerNameAddress() != null) {
				filerNameAddress = filerNameAddress
						.getNameAddressPhoneDetails(tax1099K.getFilerNameAddress().getNameAddressId());
				tax1099K.setFilerNameAddress(filerNameAddress);
			}
//		filerNameAddress End

//		payeeNameAddress Start
			NameAddress payeeNameAddress = new NameAddress();
			if (tax1099K.getPayeeNameAddress() != null) {
				payeeNameAddress = payeeNameAddress
						.getNameAddressDetails(tax1099K.getPayeeNameAddress().getNameAddressId());
				tax1099K.setPayeeNameAddress(payeeNameAddress);
			}
//		payeeNameAddress End

//			StateTaxWithholding Start
			List<StateTaxWithholding> stateTaxWithholdingList = tax1099K.getStateTaxWithholding();
			List<StateTaxWithholding> stateTaxWithholdingListNew = new ArrayList<>();
			if (tax1099K.getStateTaxWithholding() != null) {
				for (StateTaxWithholding stateTaxWithholdingIterator : stateTaxWithholdingList) {
					StateTaxWithholding stateTaxWithholding = stateTaxWithholdingIterator
							.getStateTaxWIthHolding(stateTaxWithholdingIterator.getStwithheldid());
					stateTaxWithholdingListNew.add(stateTaxWithholding);
				}
				tax1099K.setStateTaxWithholding(stateTaxWithholdingListNew);
			}

//			StateTaxWithholding End

//			psePhone Start
			TelephoneNumberPlusExtension psePhone = new TelephoneNumberPlusExtension();
			if (tax1099K.getPsePhone() != null) {
				psePhone = psePhone.getTelephoneNumberPlusExtension(tax1099K.getPsePhone().getPhoneId());
				tax1099K.setPsePhone(psePhone);
			}
//			psePhone End

//			MonthAmount Start
			List<MonthAmount> monthAmountList = tax1099K.getMonthAmounts();
			List<MonthAmount> monthAmountListNew = new ArrayList<>();
			if (tax1099K.getMonthAmounts() != null) {
				for (MonthAmount monthAmountIterator : monthAmountList) {
					MonthAmount monthAmount = monthAmountIterator
							.getMonthAmountDetails(monthAmountIterator.getMonthamountid());
					monthAmountListNew.add(monthAmount);
				}
				tax1099K.setMonthAmounts(monthAmountListNew);
			}
//			MonthAmount End

			return tax1099K;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099K : ", e);
			throw new FDXException(e,500);
		}
	}
}
