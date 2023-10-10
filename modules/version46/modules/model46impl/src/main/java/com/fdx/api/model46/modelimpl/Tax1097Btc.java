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
import com.fdx.api.model46.mapper.Tax1097BtcRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Bond Tax Credit
 */
@ApiModel(description = "Bond Tax Credit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1097Btc {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

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

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getIssuerNameAddress() {
		return issuerNameAddress;
	}

	public void setIssuerNameAddress(NameAddressPhone issuerNameAddress) {
		this.issuerNameAddress = issuerNameAddress;
	}

	public String getIssuerTin() {
		return issuerTin;
	}

	public void setIssuerTin(String issuerTin) {
		this.issuerTin = issuerTin;
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

	public Boolean getFilingForCredit() {
		return filingForCredit;
	}

	public void setFilingForCredit(Boolean filingForCredit) {
		this.filingForCredit = filingForCredit;
	}

	public Boolean getAsNominee() {
		return asNominee;
	}

	public void setAsNominee(Boolean asNominee) {
		this.asNominee = asNominee;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getBondCode() {
		return bondCode;
	}

	public void setBondCode(String bondCode) {
		this.bondCode = bondCode;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getBondType() {
		return bondType;
	}

	public void setBondType(String bondType) {
		this.bondType = bondType;
	}

	public List<MonthAmount> getAmounts() {
		return amounts;
	}

	public void setAmounts(List<MonthAmount> amounts) {
		this.amounts = amounts;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amounts == null) ? 0 : amounts.hashCode());
		result = prime * result + ((asNominee == null) ? 0 : asNominee.hashCode());
		result = prime * result + ((bondCode == null) ? 0 : bondCode.hashCode());
		result = prime * result + ((bondType == null) ? 0 : bondType.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((filingForCredit == null) ? 0 : filingForCredit.hashCode());
		result = prime * result + ((issuerNameAddress == null) ? 0 : issuerNameAddress.hashCode());
		result = prime * result + ((issuerTin == null) ? 0 : issuerTin.hashCode());
		result = prime * result + ((recipientNameAddress == null) ? 0 : recipientNameAddress.hashCode());
		result = prime * result + ((recipientTin == null) ? 0 : recipientTin.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
		result = prime * result + ((uniqueId == null) ? 0 : uniqueId.hashCode());
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
		Tax1097Btc other = (Tax1097Btc) obj;
		if (amounts == null) {
			if (other.amounts != null)
				return false;
		} else if (!amounts.equals(other.amounts))
			return false;
		if (asNominee == null) {
			if (other.asNominee != null)
				return false;
		} else if (!asNominee.equals(other.asNominee))
			return false;
		if (bondCode == null) {
			if (other.bondCode != null)
				return false;
		} else if (!bondCode.equals(other.bondCode))
			return false;
		if (bondType == null) {
			if (other.bondType != null)
				return false;
		} else if (!bondType.equals(other.bondType))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (filingForCredit == null) {
			if (other.filingForCredit != null)
				return false;
		} else if (!filingForCredit.equals(other.filingForCredit))
			return false;
		if (issuerNameAddress == null) {
			if (other.issuerNameAddress != null)
				return false;
		} else if (!issuerNameAddress.equals(other.issuerNameAddress))
			return false;
		if (issuerTin == null) {
			if (other.issuerTin != null)
				return false;
		} else if (!issuerTin.equals(other.issuerTin))
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
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		if (uniqueId == null) {
			if (other.uniqueId != null)
				return false;
		} else if (!uniqueId.equals(other.uniqueId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1097Btc [tax=" + tax + ", issuerNameAddress=" + issuerNameAddress + ", issuerTin=" + issuerTin
				+ ", recipientTin=" + recipientTin + ", recipientNameAddress=" + recipientNameAddress
				+ ", filingForCredit=" + filingForCredit + ", asNominee=" + asNominee + ", total=" + total
				+ ", bondCode=" + bondCode + ", uniqueId=" + uniqueId + ", bondType=" + bondType + ", amounts="
				+ amounts + ", comments=" + comments + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1097Btc.class);

	public Tax1097Btc getTax1097Btc(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1097Btc tax1097Btc = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1097Btc where internalId in (:internalId)", parameters,
					new Tax1097BtcRowMapper());

//			MonthAmount Start
			List<MonthAmount> monthAmountListNew = new ArrayList<>();
			if (tax1097Btc.getAmounts() != null) {
				List<MonthAmount> monthAmountList = tax1097Btc.getAmounts();
				for (MonthAmount monthAmountIterator : monthAmountList) {
					MonthAmount monthAmount = monthAmountIterator
							.getMonthAmountDetails(monthAmountIterator.getMonthamountid());
					monthAmountListNew.add(monthAmount);
				}
				tax1097Btc.setAmounts(monthAmountListNew);
			}
//			MonthAmount End 

//			issuerNameAddress Start
			NameAddressPhone issuerNameAddress = new NameAddressPhone();
			if (tax1097Btc.getIssuerNameAddress() != null) {
				issuerNameAddress = issuerNameAddress
						.getNameAddressPhoneDetails(tax1097Btc.getIssuerNameAddress().getNameAddressId());
				tax1097Btc.setIssuerNameAddress(issuerNameAddress);
			}
//			issuerNameAddress End

//			RecipientNameAddress Start
			NameAddress recipientNameAddress = new NameAddress();
			if (tax1097Btc.getRecipientNameAddress() != null) {
				recipientNameAddress = recipientNameAddress
						.getNameAddressDetails(tax1097Btc.getRecipientNameAddress().getNameAddressId());
				tax1097Btc.setRecipientNameAddress(recipientNameAddress);
			}
//			RecipientNameAddress End

			return tax1097Btc;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1097Btc : ", e);
			throw new FDXException(e,500);
		}
	}

}
