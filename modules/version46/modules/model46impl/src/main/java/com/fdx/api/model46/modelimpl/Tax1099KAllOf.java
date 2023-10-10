package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1099KAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099KAllOf {
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

	public Tax1099KAllOf filerNameAddress(NameAddressPhone filerNameAddress) {
		this.filerNameAddress = filerNameAddress;
		return this;
	}

	/**
	 * Get filerNameAddress
	 * 
	 * @return filerNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddressPhone getFilerNameAddress() {
		return filerNameAddress;
	}

	public void setFilerNameAddress(NameAddressPhone filerNameAddress) {
		this.filerNameAddress = filerNameAddress;
	}

	public Tax1099KAllOf paymentSettlementEntity(Boolean paymentSettlementEntity) {
		this.paymentSettlementEntity = paymentSettlementEntity;
		return this;
	}

	/**
	 * Check to indicate if FILER is a Payment Settlement Entity (PSE)
	 * 
	 * @return paymentSettlementEntity
	 */
	@ApiModelProperty(value = "Check to indicate if FILER is a Payment Settlement Entity (PSE)")

	public Boolean getPaymentSettlementEntity() {
		return paymentSettlementEntity;
	}

	public void setPaymentSettlementEntity(Boolean paymentSettlementEntity) {
		this.paymentSettlementEntity = paymentSettlementEntity;
	}

	public Tax1099KAllOf electronicPaymentFacilitator(Boolean electronicPaymentFacilitator) {
		this.electronicPaymentFacilitator = electronicPaymentFacilitator;
		return this;
	}

	/**
	 * Check to indicate if FILER is an Electronic Payment Facilitator (EPF) / Other
	 * third party
	 * 
	 * @return electronicPaymentFacilitator
	 */
	@ApiModelProperty(value = "Check to indicate if FILER is an Electronic Payment Facilitator (EPF) / Other third party")

	public Boolean getElectronicPaymentFacilitator() {
		return electronicPaymentFacilitator;
	}

	public void setElectronicPaymentFacilitator(Boolean electronicPaymentFacilitator) {
		this.electronicPaymentFacilitator = electronicPaymentFacilitator;
	}

	public Tax1099KAllOf paymentCard(Boolean paymentCard) {
		this.paymentCard = paymentCard;
		return this;
	}

	/**
	 * Check to indicate transactions reported are: Payment card
	 * 
	 * @return paymentCard
	 */
	@ApiModelProperty(value = "Check to indicate transactions reported are: Payment card")

	public Boolean getPaymentCard() {
		return paymentCard;
	}

	public void setPaymentCard(Boolean paymentCard) {
		this.paymentCard = paymentCard;
	}

	public Tax1099KAllOf thirdPartyNetwork(Boolean thirdPartyNetwork) {
		this.thirdPartyNetwork = thirdPartyNetwork;
		return this;
	}

	/**
	 * Check to indicate transactions reported are: Third party network
	 * 
	 * @return thirdPartyNetwork
	 */
	@ApiModelProperty(value = "Check to indicate transactions reported are: Third party network")

	public Boolean getThirdPartyNetwork() {
		return thirdPartyNetwork;
	}

	public void setThirdPartyNetwork(Boolean thirdPartyNetwork) {
		this.thirdPartyNetwork = thirdPartyNetwork;
	}

	public Tax1099KAllOf payeeNameAddress(NameAddress payeeNameAddress) {
		this.payeeNameAddress = payeeNameAddress;
		return this;
	}

	/**
	 * Get payeeNameAddress
	 * 
	 * @return payeeNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getPayeeNameAddress() {
		return payeeNameAddress;
	}

	public void setPayeeNameAddress(NameAddress payeeNameAddress) {
		this.payeeNameAddress = payeeNameAddress;
	}

	public Tax1099KAllOf pseName(String pseName) {
		this.pseName = pseName;
		return this;
	}

	/**
	 * PSE's name
	 * 
	 * @return pseName
	 */
	@ApiModelProperty(value = "PSE's name")

	public String getPseName() {
		return pseName;
	}

	public void setPseName(String pseName) {
		this.pseName = pseName;
	}

	public Tax1099KAllOf accountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		return this;
	}

	/**
	 * Account number
	 * 
	 * @return accountNumber
	 */
	@ApiModelProperty(value = "Account number")

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Tax1099KAllOf filerTin(String filerTin) {
		this.filerTin = filerTin;
		return this;
	}

	/**
	 * FILER'S TIN
	 * 
	 * @return filerTin
	 */
	@ApiModelProperty(value = "FILER'S TIN")

	public String getFilerTin() {
		return filerTin;
	}

	public void setFilerTin(String filerTin) {
		this.filerTin = filerTin;
	}

	public Tax1099KAllOf payeeFederalId(String payeeFederalId) {
		this.payeeFederalId = payeeFederalId;
		return this;
	}

	/**
	 * PAYEE'S taxpayer identification no. (deprecated for rename to payeeTin,
	 * removing in FDX v5.0)
	 * 
	 * @return payeeFederalId
	 */
	@ApiModelProperty(value = "PAYEE'S taxpayer identification no. (deprecated for rename to payeeTin, removing in FDX v5.0)")

	public String getPayeeFederalId() {
		return payeeFederalId;
	}

	public void setPayeeFederalId(String payeeFederalId) {
		this.payeeFederalId = payeeFederalId;
	}

	public Tax1099KAllOf payeeTin(String payeeTin) {
		this.payeeTin = payeeTin;
		return this;
	}

	/**
	 * PAYEE'S TIN
	 * 
	 * @return payeeTin
	 */
	@ApiModelProperty(value = "PAYEE'S TIN")

	public String getPayeeTin() {
		return payeeTin;
	}

	public void setPayeeTin(String payeeTin) {
		this.payeeTin = payeeTin;
	}

	public Tax1099KAllOf grossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
		return this;
	}

	/**
	 * Box 1a, Gross amount of payment card/third party network transactions
	 * 
	 * @return grossAmount
	 */
	@ApiModelProperty(value = "Box 1a, Gross amount of payment card/third party network transactions")

	public Double getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}

	public Tax1099KAllOf cardNotPresent(Double cardNotPresent) {
		this.cardNotPresent = cardNotPresent;
		return this;
	}

	/**
	 * Box 1b, Card Not Present Transactions
	 * 
	 * @return cardNotPresent
	 */
	@ApiModelProperty(value = "Box 1b, Card Not Present Transactions")

	public Double getCardNotPresent() {
		return cardNotPresent;
	}

	public void setCardNotPresent(Double cardNotPresent) {
		this.cardNotPresent = cardNotPresent;
	}

	public Tax1099KAllOf merchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
		return this;
	}

	/**
	 * Box 2, Merchant category code
	 * 
	 * @return merchantCategoryCode
	 */
	@ApiModelProperty(value = "Box 2, Merchant category code")

	public String getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public Tax1099KAllOf numberOfTransactions(Double numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
		return this;
	}

	/**
	 * Box 3, Number of purchase transactions
	 * 
	 * @return numberOfTransactions
	 */
	@ApiModelProperty(value = "Box 3, Number of purchase transactions")

	public Double getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public void setNumberOfTransactions(Double numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
	}

	public Tax1099KAllOf federalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
		return this;
	}

	/**
	 * Box 4, Federal income tax withheld
	 * 
	 * @return federalTaxWithheld
	 */
	@ApiModelProperty(value = "Box 4, Federal income tax withheld")

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public Tax1099KAllOf monthAmounts(List<MonthAmount> monthAmounts) {
		this.monthAmounts = monthAmounts;
		return this;
	}

	public Tax1099KAllOf addMonthAmountsItem(MonthAmount monthAmountsItem) {
		if (this.monthAmounts == null) {
			this.monthAmounts = new ArrayList<>();
		}
		this.monthAmounts.add(monthAmountsItem);
		return this;
	}

	/**
	 * Box 5, Monthly amounts
	 * 
	 * @return monthAmounts
	 */
	@ApiModelProperty(value = "Box 5, Monthly amounts")

	@Valid

	public List<MonthAmount> getMonthAmounts() {
		return monthAmounts;
	}

	public void setMonthAmounts(List<MonthAmount> monthAmounts) {
		this.monthAmounts = monthAmounts;
	}

	public Tax1099KAllOf stateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
		return this;
	}

	public Tax1099KAllOf addStateTaxWithholdingItem(StateTaxWithholding stateTaxWithholdingItem) {
		if (this.stateTaxWithholding == null) {
			this.stateTaxWithholding = new ArrayList<>();
		}
		this.stateTaxWithholding.add(stateTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 6-8, State tax withholding
	 * 
	 * @return stateTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 6-8, State tax withholding")

	@Valid

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public Tax1099KAllOf psePhone(TelephoneNumberPlusExtension psePhone) {
		this.psePhone = psePhone;
		return this;
	}

	/**
	 * Get psePhone
	 * 
	 * @return psePhone
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TelephoneNumberPlusExtension getPsePhone() {
		return psePhone;
	}

	public void setPsePhone(TelephoneNumberPlusExtension psePhone) {
		this.psePhone = psePhone;
	}

	public Tax1099KAllOf secondTinNotice(Boolean secondTinNotice) {
		this.secondTinNotice = secondTinNotice;
		return this;
	}

	/**
	 * Second TIN Notice
	 * 
	 * @return secondTinNotice
	 */
	@ApiModelProperty(value = "Second TIN Notice")

	public Boolean getSecondTinNotice() {
		return secondTinNotice;
	}

	public void setSecondTinNotice(Boolean secondTinNotice) {
		this.secondTinNotice = secondTinNotice;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1099KAllOf tax1099KAllOf = (Tax1099KAllOf) o;
		return Objects.equals(this.filerNameAddress, tax1099KAllOf.filerNameAddress)
				&& Objects.equals(this.paymentSettlementEntity, tax1099KAllOf.paymentSettlementEntity)
				&& Objects.equals(this.electronicPaymentFacilitator, tax1099KAllOf.electronicPaymentFacilitator)
				&& Objects.equals(this.paymentCard, tax1099KAllOf.paymentCard)
				&& Objects.equals(this.thirdPartyNetwork, tax1099KAllOf.thirdPartyNetwork)
				&& Objects.equals(this.payeeNameAddress, tax1099KAllOf.payeeNameAddress)
				&& Objects.equals(this.pseName, tax1099KAllOf.pseName)
				&& Objects.equals(this.accountNumber, tax1099KAllOf.accountNumber)
				&& Objects.equals(this.filerTin, tax1099KAllOf.filerTin)
				&& Objects.equals(this.payeeFederalId, tax1099KAllOf.payeeFederalId)
				&& Objects.equals(this.payeeTin, tax1099KAllOf.payeeTin)
				&& Objects.equals(this.grossAmount, tax1099KAllOf.grossAmount)
				&& Objects.equals(this.cardNotPresent, tax1099KAllOf.cardNotPresent)
				&& Objects.equals(this.merchantCategoryCode, tax1099KAllOf.merchantCategoryCode)
				&& Objects.equals(this.numberOfTransactions, tax1099KAllOf.numberOfTransactions)
				&& Objects.equals(this.federalTaxWithheld, tax1099KAllOf.federalTaxWithheld)
				&& Objects.equals(this.monthAmounts, tax1099KAllOf.monthAmounts)
				&& Objects.equals(this.stateTaxWithholding, tax1099KAllOf.stateTaxWithholding)
				&& Objects.equals(this.psePhone, tax1099KAllOf.psePhone)
				&& Objects.equals(this.secondTinNotice, tax1099KAllOf.secondTinNotice);
	}

	@Override
	public int hashCode() {
		return Objects.hash(filerNameAddress, paymentSettlementEntity, electronicPaymentFacilitator, paymentCard,
				thirdPartyNetwork, payeeNameAddress, pseName, accountNumber, filerTin, payeeFederalId, payeeTin,
				grossAmount, cardNotPresent, merchantCategoryCode, numberOfTransactions, federalTaxWithheld,
				monthAmounts, stateTaxWithholding, psePhone, secondTinNotice);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099KAllOf {\n");

		sb.append("    filerNameAddress: ").append(toIndentedString(filerNameAddress)).append("\n");
		sb.append("    paymentSettlementEntity: ").append(toIndentedString(paymentSettlementEntity)).append("\n");
		sb.append("    electronicPaymentFacilitator: ").append(toIndentedString(electronicPaymentFacilitator))
				.append("\n");
		sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
		sb.append("    thirdPartyNetwork: ").append(toIndentedString(thirdPartyNetwork)).append("\n");
		sb.append("    payeeNameAddress: ").append(toIndentedString(payeeNameAddress)).append("\n");
		sb.append("    pseName: ").append(toIndentedString(pseName)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    filerTin: ").append(toIndentedString(filerTin)).append("\n");
		sb.append("    payeeFederalId: ").append(toIndentedString(payeeFederalId)).append("\n");
		sb.append("    payeeTin: ").append(toIndentedString(payeeTin)).append("\n");
		sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
		sb.append("    cardNotPresent: ").append(toIndentedString(cardNotPresent)).append("\n");
		sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
		sb.append("    numberOfTransactions: ").append(toIndentedString(numberOfTransactions)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    monthAmounts: ").append(toIndentedString(monthAmounts)).append("\n");
		sb.append("    stateTaxWithholding: ").append(toIndentedString(stateTaxWithholding)).append("\n");
		sb.append("    psePhone: ").append(toIndentedString(psePhone)).append("\n");
		sb.append("    secondTinNotice: ").append(toIndentedString(secondTinNotice)).append("\n");
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
}
