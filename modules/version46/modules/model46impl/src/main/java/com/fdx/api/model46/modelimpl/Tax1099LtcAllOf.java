package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.OptBoolean;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tax1099LtcAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099LtcAllOf {
	@JsonProperty("payerNameAddress")
	private NameAddressPhone payerNameAddress;

	@JsonProperty("payerTin")
	private String payerTin;

	@JsonProperty("policyholderTin")
	private String policyholderTin;

	@JsonProperty("policyHolderNameAddress")
	private NameAddress policyHolderNameAddress;

	@JsonProperty("accountNumber")
	private String accountNumber;

	@JsonProperty("ltcBenefits")
	private Double ltcBenefits;

	@JsonProperty("deathBenefits")
	private Double deathBenefits;

	@JsonProperty("perDiem")
	@JsonInclude(Include.NON_NULL)
	private Boolean perDiem;

	@JsonProperty("reimbursedAmount")
	@JsonInclude(Include.NON_NULL)
	private Boolean reimbursedAmount;

	@JsonProperty("insuredId")
	private String insuredId;

	@JsonProperty("insuredNameAddress")
	private NameAddress insuredNameAddress;

	@JsonProperty("qualifiedContract")
	@JsonInclude(Include.NON_NULL)
	private Boolean qualifiedContract;

	@JsonProperty("chronicallyIll")
	@JsonInclude(Include.NON_NULL)
	private Boolean chronicallyIll;

	@JsonProperty("terminallyIll")
	@JsonInclude(Include.NON_NULL)
	private Boolean terminallyIll;

	@JsonProperty("dateCertified")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private LocalDate dateCertified;

	public Tax1099LtcAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
		this.payerNameAddress = payerNameAddress;
		return this;
	}

	/**
	 * Get payerNameAddress
	 * 
	 * @return payerNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddressPhone getPayerNameAddress() {
		return payerNameAddress;
	}

	public void setPayerNameAddress(NameAddressPhone payerNameAddress) {
		this.payerNameAddress = payerNameAddress;
	}

	public Tax1099LtcAllOf payerTin(String payerTin) {
		this.payerTin = payerTin;
		return this;
	}

	/**
	 * PAYER'S TIN
	 * 
	 * @return payerTin
	 */
	@ApiModelProperty(value = "PAYER'S TIN")

	public String getPayerTin() {
		return payerTin;
	}

	public void setPayerTin(String payerTin) {
		this.payerTin = payerTin;
	}

	public Tax1099LtcAllOf policyholderTin(String policyholderTin) {
		this.policyholderTin = policyholderTin;
		return this;
	}

	/**
	 * POLICYHOLDER'S TIN
	 * 
	 * @return policyholderTin
	 */
	@ApiModelProperty(value = "POLICYHOLDER'S TIN")

	public String getPolicyholderTin() {
		return policyholderTin;
	}

	public void setPolicyholderTin(String policyholderTin) {
		this.policyholderTin = policyholderTin;
	}

	public Tax1099LtcAllOf policyHolderNameAddress(NameAddress policyHolderNameAddress) {
		this.policyHolderNameAddress = policyHolderNameAddress;
		return this;
	}

	/**
	 * Get policyHolderNameAddress
	 * 
	 * @return policyHolderNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getPolicyHolderNameAddress() {
		return policyHolderNameAddress;
	}

	public void setPolicyHolderNameAddress(NameAddress policyHolderNameAddress) {
		this.policyHolderNameAddress = policyHolderNameAddress;
	}

	public Tax1099LtcAllOf accountNumber(String accountNumber) {
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

	public Tax1099LtcAllOf ltcBenefits(Double ltcBenefits) {
		this.ltcBenefits = ltcBenefits;
		return this;
	}

	/**
	 * Box 1, Gross long-term care benefits paid
	 * 
	 * @return ltcBenefits
	 */
	@ApiModelProperty(value = "Box 1, Gross long-term care benefits paid")

	public Double getLtcBenefits() {
		return ltcBenefits;
	}

	public void setLtcBenefits(Double ltcBenefits) {
		this.ltcBenefits = ltcBenefits;
	}

	public Tax1099LtcAllOf deathBenefits(Double deathBenefits) {
		this.deathBenefits = deathBenefits;
		return this;
	}

	/**
	 * Box 2, Accelerated death benefits paid
	 * 
	 * @return deathBenefits
	 */
	@ApiModelProperty(value = "Box 2, Accelerated death benefits paid")

	public Double getDeathBenefits() {
		return deathBenefits;
	}

	public void setDeathBenefits(Double deathBenefits) {
		this.deathBenefits = deathBenefits;
	}

	public Tax1099LtcAllOf perDiem(Boolean perDiem) {
		this.perDiem = perDiem;
		return this;
	}

	/**
	 * Box 3, Per diem
	 * 
	 * @return perDiem
	 */
	@ApiModelProperty(value = "Box 3, Per diem")

	public Boolean getPerDiem() {
		return perDiem;
	}

	public void setPerDiem(Boolean perDiem) {
		this.perDiem = perDiem;
	}

	public Tax1099LtcAllOf reimbursedAmount(Boolean reimbursedAmount) {
		this.reimbursedAmount = reimbursedAmount;
		return this;
	}

	/**
	 * Box 3, Reimbursed amount
	 * 
	 * @return reimbursedAmount
	 */
	@ApiModelProperty(value = "Box 3, Reimbursed amount")

	public Boolean getReimbursedAmount() {
		return reimbursedAmount;
	}

	public void setReimbursedAmount(Boolean reimbursedAmount) {
		this.reimbursedAmount = reimbursedAmount;
	}

	public Tax1099LtcAllOf insuredId(String insuredId) {
		this.insuredId = insuredId;
		return this;
	}

	/**
	 * INSURED'S taxpayer identification no.
	 * 
	 * @return insuredId
	 */
	@ApiModelProperty(value = "INSURED'S taxpayer identification no.")

	public String getInsuredId() {
		return insuredId;
	}

	public void setInsuredId(String insuredId) {
		this.insuredId = insuredId;
	}

	public Tax1099LtcAllOf insuredNameAddress(NameAddress insuredNameAddress) {
		this.insuredNameAddress = insuredNameAddress;
		return this;
	}

	/**
	 * Get insuredNameAddress
	 * 
	 * @return insuredNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getInsuredNameAddress() {
		return insuredNameAddress;
	}

	public void setInsuredNameAddress(NameAddress insuredNameAddress) {
		this.insuredNameAddress = insuredNameAddress;
	}

	public Tax1099LtcAllOf qualifiedContract(Boolean qualifiedContract) {
		this.qualifiedContract = qualifiedContract;
		return this;
	}

	/**
	 * Box 4, Qualified contract
	 * 
	 * @return qualifiedContract
	 */
	@ApiModelProperty(value = "Box 4, Qualified contract")

	public Boolean getQualifiedContract() {
		return qualifiedContract;
	}

	public void setQualifiedContract(Boolean qualifiedContract) {
		this.qualifiedContract = qualifiedContract;
	}

	public Tax1099LtcAllOf chronicallyIll(Boolean chronicallyIll) {
		this.chronicallyIll = chronicallyIll;
		return this;
	}

	/**
	 * Box 5, Chronically ill
	 * 
	 * @return chronicallyIll
	 */
	@ApiModelProperty(value = "Box 5, Chronically ill")

	public Boolean getChronicallyIll() {
		return chronicallyIll;
	}

	public void setChronicallyIll(Boolean chronicallyIll) {
		this.chronicallyIll = chronicallyIll;
	}

	public Tax1099LtcAllOf terminallyIll(Boolean terminallyIll) {
		this.terminallyIll = terminallyIll;
		return this;
	}

	/**
	 * Box 5, Terminally ill
	 * 
	 * @return terminallyIll
	 */
	@ApiModelProperty(value = "Box 5, Terminally ill")

	public Boolean getTerminallyIll() {
		return terminallyIll;
	}

	public void setTerminallyIll(Boolean terminallyIll) {
		this.terminallyIll = terminallyIll;
	}

	public Tax1099LtcAllOf dateCertified(LocalDate dateCertified) {
		this.dateCertified = dateCertified;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return dateCertified
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public LocalDate getDateCertified() {
		return dateCertified;
	}

	public void setDateCertified(LocalDate dateCertified) {
		this.dateCertified = dateCertified;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1099LtcAllOf tax1099LtcAllOf = (Tax1099LtcAllOf) o;
		return Objects.equals(this.payerNameAddress, tax1099LtcAllOf.payerNameAddress)
				&& Objects.equals(this.payerTin, tax1099LtcAllOf.payerTin)
				&& Objects.equals(this.policyholderTin, tax1099LtcAllOf.policyholderTin)
				&& Objects.equals(this.policyHolderNameAddress, tax1099LtcAllOf.policyHolderNameAddress)
				&& Objects.equals(this.accountNumber, tax1099LtcAllOf.accountNumber)
				&& Objects.equals(this.ltcBenefits, tax1099LtcAllOf.ltcBenefits)
				&& Objects.equals(this.deathBenefits, tax1099LtcAllOf.deathBenefits)
				&& Objects.equals(this.perDiem, tax1099LtcAllOf.perDiem)
				&& Objects.equals(this.reimbursedAmount, tax1099LtcAllOf.reimbursedAmount)
				&& Objects.equals(this.insuredId, tax1099LtcAllOf.insuredId)
				&& Objects.equals(this.insuredNameAddress, tax1099LtcAllOf.insuredNameAddress)
				&& Objects.equals(this.qualifiedContract, tax1099LtcAllOf.qualifiedContract)
				&& Objects.equals(this.chronicallyIll, tax1099LtcAllOf.chronicallyIll)
				&& Objects.equals(this.terminallyIll, tax1099LtcAllOf.terminallyIll)
				&& Objects.equals(this.dateCertified, tax1099LtcAllOf.dateCertified);
	}

	@Override
	public int hashCode() {
		return Objects.hash(payerNameAddress, payerTin, policyholderTin, policyHolderNameAddress, accountNumber,
				ltcBenefits, deathBenefits, perDiem, reimbursedAmount, insuredId, insuredNameAddress, qualifiedContract,
				chronicallyIll, terminallyIll, dateCertified);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1099LtcAllOf {\n");

		sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
		sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
		sb.append("    policyholderTin: ").append(toIndentedString(policyholderTin)).append("\n");
		sb.append("    policyHolderNameAddress: ").append(toIndentedString(policyHolderNameAddress)).append("\n");
		sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
		sb.append("    ltcBenefits: ").append(toIndentedString(ltcBenefits)).append("\n");
		sb.append("    deathBenefits: ").append(toIndentedString(deathBenefits)).append("\n");
		sb.append("    perDiem: ").append(toIndentedString(perDiem)).append("\n");
		sb.append("    reimbursedAmount: ").append(toIndentedString(reimbursedAmount)).append("\n");
		sb.append("    insuredId: ").append(toIndentedString(insuredId)).append("\n");
		sb.append("    insuredNameAddress: ").append(toIndentedString(insuredNameAddress)).append("\n");
		sb.append("    qualifiedContract: ").append(toIndentedString(qualifiedContract)).append("\n");
		sb.append("    chronicallyIll: ").append(toIndentedString(chronicallyIll)).append("\n");
		sb.append("    terminallyIll: ").append(toIndentedString(terminallyIll)).append("\n");
		sb.append("    dateCertified: ").append(toIndentedString(dateCertified)).append("\n");
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
