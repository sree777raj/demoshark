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
 * Tax1097BtcAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1097BtcAllOf {
	@JsonProperty("issuerNameAddress")
	private NameAddressPhone issuerNameAddress;

	@JsonProperty("issuerTin")
	private String issuerTin;

	@JsonProperty("recipientTin")
	private String recipientTin;

	@JsonProperty("recipientNameAddress")
	private NameAddress recipientNameAddress;

	@JsonProperty("filingForCredit")
	@JsonInclude(Include.NON_NULL)
	private Boolean filingForCredit;

	@JsonProperty("asNominee")
	@JsonInclude(Include.NON_NULL)
	private Boolean asNominee;

	@JsonProperty("total")
	private Double total;

	@JsonProperty("bondCode")
	private String bondCode;

	@JsonProperty("uniqueId")
	private String uniqueId;

	@JsonProperty("bondType")
	private String bondType;

	@JsonProperty("amounts")
	@Valid
	private List<MonthAmount> amounts = null;

	@JsonProperty("comments")
	private String comments;

	public Tax1097BtcAllOf issuerNameAddress(NameAddressPhone issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
		return this;
	}

	/**
	 * Get issuerNameAddress
	 * 
	 * @return issuerNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddressPhone getIssuerNameAddress() {
		return issuerNameAddress;
	}

	public void setIssuerNameAddress(NameAddressPhone issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
	}

	public Tax1097BtcAllOf issuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
		return this;
	}

	/**
	 * FORM 1097-BTC ISSUER'S TIN
	 * 
	 * @return issuerTin
	 */
	@ApiModelProperty(value = "FORM 1097-BTC ISSUER'S TIN")

	public String getIssuerTin() {
		return issuerTin;
	}

	public void setIssuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
	}

	public Tax1097BtcAllOf recipientTin(String recipientTin) {
		this.recipientTin = recipientTin;
		return this;
	}

	/**
	 * RECIPIENT'S TIN
	 * 
	 * @return recipientTin
	 */
	@ApiModelProperty(value = "RECIPIENT'S TIN")

	public String getRecipientTin() {
		return recipientTin;
	}

	public void setRecipientTin(String recipientTin) {
		this.recipientTin = recipientTin;
	}

	public Tax1097BtcAllOf recipientNameAddress(NameAddress recipientNameAddress) {
		this.recipientNameAddress = recipientNameAddress;
		return this;
	}

	/**
	 * Get recipientNameAddress
	 * 
	 * @return recipientNameAddress
	 */
	@ApiModelProperty(value = "")

	@Valid

	public NameAddress getRecipientNameAddress() {
		return recipientNameAddress;
	}

	public void setRecipientNameAddress(NameAddress recipientNameAddress) {
		this.recipientNameAddress = recipientNameAddress;
	}

	public Tax1097BtcAllOf filingForCredit(Boolean filingForCredit) {
		this.filingForCredit = filingForCredit;
		return this;
	}

	/**
	 * Form 1097-BTC issuer is: Issuer of bond or its agent filing current year Form
	 * 1097-BTC for credit being reported
	 * 
	 * @return filingForCredit
	 */
	@ApiModelProperty(value = "Form 1097-BTC issuer is: Issuer of bond or its agent filing current year Form 1097-BTC for credit being reported")

	public Boolean getFilingForCredit() {
		return filingForCredit;
	}

	public void setFilingForCredit(Boolean filingForCredit) {
		this.filingForCredit = filingForCredit;
	}

	public Tax1097BtcAllOf asNominee(Boolean asNominee) {
		this.asNominee = asNominee;
		return this;
	}

	/**
	 * Form 1097-BTC issuer is: An entity or a person that received or should have
	 * received a current year Form 1097-BTC and is distributing part or all of that
	 * credit to others
	 * 
	 * @return asNominee
	 */
	@ApiModelProperty(value = "Form 1097-BTC issuer is: An entity or a person that received or should have received a current year Form 1097-BTC and is distributing part or all of that credit to others")

	public Boolean getAsNominee() {
		return asNominee;
	}

	public void setAsNominee(Boolean asNominee) {
		this.asNominee = asNominee;
	}

	public Tax1097BtcAllOf total(Double total) {
		this.total = total;
		return this;
	}

	/**
	 * Box 1, Total
	 * 
	 * @return total
	 */
	@ApiModelProperty(value = "Box 1, Total")

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Tax1097BtcAllOf bondCode(String bondCode) {
		this.bondCode = bondCode;
		return this;
	}

	/**
	 * Box 2a, Code
	 * 
	 * @return bondCode
	 */
	@ApiModelProperty(value = "Box 2a, Code")

	public String getBondCode() {
		return bondCode;
	}

	public void setBondCode(String bondCode) {
		this.bondCode = bondCode;
	}

	public Tax1097BtcAllOf uniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
		return this;
	}

	/**
	 * Box 2b, Unique Identifier
	 * 
	 * @return uniqueId
	 */
	@ApiModelProperty(value = "Box 2b, Unique Identifier")

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public Tax1097BtcAllOf bondType(String bondType) {
		this.bondType = bondType;
		return this;
	}

	/**
	 * Box 3, Bond type
	 * 
	 * @return bondType
	 */
	@ApiModelProperty(value = "Box 3, Bond type")

	public String getBondType() {
		return bondType;
	}

	public void setBondType(String bondType) {
		this.bondType = bondType;
	}

	public Tax1097BtcAllOf amounts(List<MonthAmount> amounts) {
		this.amounts = amounts;
		return this;
	}

	public Tax1097BtcAllOf addAmountsItem(MonthAmount amountsItem) {
		if (this.amounts == null) {
			this.amounts = new ArrayList<>();
		}
		this.amounts.add(amountsItem);
		return this;
	}

	/**
	 * Box 5, Amounts by month
	 * 
	 * @return amounts
	 */
	@ApiModelProperty(value = "Box 5, Amounts by month")

	@Valid

	public List<MonthAmount> getAmounts() {
		return amounts;
	}

	public void setAmounts(List<MonthAmount> amounts) {
		this.amounts = amounts;
	}

	public Tax1097BtcAllOf comments(String comments) {
		this.comments = comments;
		return this;
	}

	/**
	 * Box 6, Comments
	 * 
	 * @return comments
	 */
	@ApiModelProperty(value = "Box 6, Comments")

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax1097BtcAllOf tax1097BtcAllOf = (Tax1097BtcAllOf) o;
		return Objects.equals(this.issuerNameAddress, tax1097BtcAllOf.issuerNameAddress)
				&& Objects.equals(this.issuerTin, tax1097BtcAllOf.issuerTin)
				&& Objects.equals(this.recipientTin, tax1097BtcAllOf.recipientTin)
				&& Objects.equals(this.recipientNameAddress, tax1097BtcAllOf.recipientNameAddress)
				&& Objects.equals(this.filingForCredit, tax1097BtcAllOf.filingForCredit)
				&& Objects.equals(this.asNominee, tax1097BtcAllOf.asNominee)
				&& Objects.equals(this.total, tax1097BtcAllOf.total)
				&& Objects.equals(this.bondCode, tax1097BtcAllOf.bondCode)
				&& Objects.equals(this.uniqueId, tax1097BtcAllOf.uniqueId)
				&& Objects.equals(this.bondType, tax1097BtcAllOf.bondType)
				&& Objects.equals(this.amounts, tax1097BtcAllOf.amounts)
				&& Objects.equals(this.comments, tax1097BtcAllOf.comments);
	}

	@Override
	public int hashCode() {
		return Objects.hash(issuerNameAddress, issuerTin, recipientTin, recipientNameAddress, filingForCredit,
				asNominee, total, bondCode, uniqueId, bondType, amounts, comments);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax1097BtcAllOf {\n");

		sb.append("    issuerNameAddress: ").append(toIndentedString(issuerNameAddress)).append("\n");
		sb.append("    issuerTin: ").append(toIndentedString(issuerTin)).append("\n");
		sb.append("    recipientTin: ").append(toIndentedString(recipientTin)).append("\n");
		sb.append("    recipientNameAddress: ").append(toIndentedString(recipientNameAddress)).append("\n");
		sb.append("    filingForCredit: ").append(toIndentedString(filingForCredit)).append("\n");
		sb.append("    asNominee: ").append(toIndentedString(asNominee)).append("\n");
		sb.append("    total: ").append(toIndentedString(total)).append("\n");
		sb.append("    bondCode: ").append(toIndentedString(bondCode)).append("\n");
		sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
		sb.append("    bondType: ").append(toIndentedString(bondType)).append("\n");
		sb.append("    amounts: ").append(toIndentedString(amounts)).append("\n");
		sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
