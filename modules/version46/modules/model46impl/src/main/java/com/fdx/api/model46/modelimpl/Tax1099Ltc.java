package com.fdx.api.model46.modelimpl;

import java.util.Date;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax1099LtcRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Long-Term Care and Accelerated Death Benefits
 */
@ApiModel(description = "Long-Term Care and Accelerated Death Benefits")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1099Ltc {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

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
	private Date dateCertified;

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

	public String getPolicyholderTin() {
		return policyholderTin;
	}

	public void setPolicyholderTin(String policyholderTin) {
		this.policyholderTin = policyholderTin;
	}

	public NameAddress getPolicyHolderNameAddress() {
		return policyHolderNameAddress;
	}

	public void setPolicyHolderNameAddress(NameAddress policyHolderNameAddress) {
		this.policyHolderNameAddress = policyHolderNameAddress;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getLtcBenefits() {
		return ltcBenefits;
	}

	public void setLtcBenefits(Double ltcBenefits) {
		this.ltcBenefits = ltcBenefits;
	}

	public Double getDeathBenefits() {
		return deathBenefits;
	}

	public void setDeathBenefits(Double deathBenefits) {
		this.deathBenefits = deathBenefits;
	}

	public Boolean getPerDiem() {
		return perDiem;
	}

	public void setPerDiem(Boolean perDiem) {
		this.perDiem = perDiem;
	}

	public Boolean getReimbursedAmount() {
		return reimbursedAmount;
	}

	public void setReimbursedAmount(Boolean reimbursedAmount) {
		this.reimbursedAmount = reimbursedAmount;
	}

	public String getInsuredId() {
		return insuredId;
	}

	public void setInsuredId(String insuredId) {
		this.insuredId = insuredId;
	}

	public NameAddress getInsuredNameAddress() {
		return insuredNameAddress;
	}

	public void setInsuredNameAddress(NameAddress insuredNameAddress) {
		this.insuredNameAddress = insuredNameAddress;
	}

	public Boolean getQualifiedContract() {
		return qualifiedContract;
	}

	public void setQualifiedContract(Boolean qualifiedContract) {
		this.qualifiedContract = qualifiedContract;
	}

	public Boolean getChronicallyIll() {
		return chronicallyIll;
	}

	public void setChronicallyIll(Boolean chronicallyIll) {
		this.chronicallyIll = chronicallyIll;
	}

	public Boolean getTerminallyIll() {
		return terminallyIll;
	}

	public void setTerminallyIll(Boolean terminallyIll) {
		this.terminallyIll = terminallyIll;
	}

	public Date getDateCertified() {
		return dateCertified;
	}

	public void setDateCertified(Date dateCertified) {
		this.dateCertified = dateCertified;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((chronicallyIll == null) ? 0 : chronicallyIll.hashCode());
		result = prime * result + ((dateCertified == null) ? 0 : dateCertified.hashCode());
		result = prime * result + ((deathBenefits == null) ? 0 : deathBenefits.hashCode());
		result = prime * result + ((insuredId == null) ? 0 : insuredId.hashCode());
		result = prime * result + ((insuredNameAddress == null) ? 0 : insuredNameAddress.hashCode());
		result = prime * result + ((ltcBenefits == null) ? 0 : ltcBenefits.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((perDiem == null) ? 0 : perDiem.hashCode());
		result = prime * result + ((policyHolderNameAddress == null) ? 0 : policyHolderNameAddress.hashCode());
		result = prime * result + ((policyholderTin == null) ? 0 : policyholderTin.hashCode());
		result = prime * result + ((qualifiedContract == null) ? 0 : qualifiedContract.hashCode());
		result = prime * result + ((reimbursedAmount == null) ? 0 : reimbursedAmount.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((terminallyIll == null) ? 0 : terminallyIll.hashCode());
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
		Tax1099Ltc other = (Tax1099Ltc) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (chronicallyIll == null) {
			if (other.chronicallyIll != null)
				return false;
		} else if (!chronicallyIll.equals(other.chronicallyIll))
			return false;
		if (dateCertified == null) {
			if (other.dateCertified != null)
				return false;
		} else if (!dateCertified.equals(other.dateCertified))
			return false;
		if (deathBenefits == null) {
			if (other.deathBenefits != null)
				return false;
		} else if (!deathBenefits.equals(other.deathBenefits))
			return false;
		if (insuredId == null) {
			if (other.insuredId != null)
				return false;
		} else if (!insuredId.equals(other.insuredId))
			return false;
		if (insuredNameAddress == null) {
			if (other.insuredNameAddress != null)
				return false;
		} else if (!insuredNameAddress.equals(other.insuredNameAddress))
			return false;
		if (ltcBenefits == null) {
			if (other.ltcBenefits != null)
				return false;
		} else if (!ltcBenefits.equals(other.ltcBenefits))
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
		if (perDiem == null) {
			if (other.perDiem != null)
				return false;
		} else if (!perDiem.equals(other.perDiem))
			return false;
		if (policyHolderNameAddress == null) {
			if (other.policyHolderNameAddress != null)
				return false;
		} else if (!policyHolderNameAddress.equals(other.policyHolderNameAddress))
			return false;
		if (policyholderTin == null) {
			if (other.policyholderTin != null)
				return false;
		} else if (!policyholderTin.equals(other.policyholderTin))
			return false;
		if (qualifiedContract == null) {
			if (other.qualifiedContract != null)
				return false;
		} else if (!qualifiedContract.equals(other.qualifiedContract))
			return false;
		if (reimbursedAmount == null) {
			if (other.reimbursedAmount != null)
				return false;
		} else if (!reimbursedAmount.equals(other.reimbursedAmount))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (terminallyIll == null) {
			if (other.terminallyIll != null)
				return false;
		} else if (!terminallyIll.equals(other.terminallyIll))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1099Ltc [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", policyholderTin=" + policyholderTin + ", policyHolderNameAddress=" + policyHolderNameAddress
				+ ", accountNumber=" + accountNumber + ", ltcBenefits=" + ltcBenefits + ", deathBenefits="
				+ deathBenefits + ", perDiem=" + perDiem + ", reimbursedAmount=" + reimbursedAmount + ", insuredId="
				+ insuredId + ", insuredNameAddress=" + insuredNameAddress + ", qualifiedContract=" + qualifiedContract
				+ ", chronicallyIll=" + chronicallyIll + ", terminallyIll=" + terminallyIll + ", dateCertified="
				+ dateCertified + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1099Ltc.class);

	public Tax1099Ltc getTax1099Ltc(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			Tax1099Ltc tax1099Ltc = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".Tax1099Ltc where internalId in (:internalId)", parameters,
					new Tax1099LtcRowMapper());

//		payerNameAddress Start
			NameAddressPhone payerNameAddress = new NameAddressPhone();
			if (tax1099Ltc.getPayerNameAddress() != null) {
				payerNameAddress = payerNameAddress
						.getNameAddressPhoneDetails(tax1099Ltc.getPayerNameAddress().getNameAddressId());
				tax1099Ltc.setPayerNameAddress(payerNameAddress);
			}
//		payerNameAddress End

//		policyHolderNameAddress Start
			NameAddress policyHolderNameAddress = new NameAddress();
			if (tax1099Ltc.getPolicyHolderNameAddress() != null) {
				policyHolderNameAddress = policyHolderNameAddress
						.getNameAddressDetails(tax1099Ltc.getPolicyHolderNameAddress().getNameAddressId());
				tax1099Ltc.setPolicyHolderNameAddress(policyHolderNameAddress);
			}
//		policyHolderNameAddress End

//		insuredNameAddress Start
			NameAddress insuredNameAddress = new NameAddress();
			if (tax1099Ltc.getInsuredNameAddress() != null) {
				insuredNameAddress = insuredNameAddress
						.getNameAddressDetails(tax1099Ltc.getInsuredNameAddress().getNameAddressId());
				tax1099Ltc.setInsuredNameAddress(insuredNameAddress);
			}
//		insuredNameAddress End

			return tax1099Ltc;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1099Ltc : ", e);
			throw new FDXException(e,500);
		}
	}
}
