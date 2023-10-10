package com.fdx.api.model46.modelimpl;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax2439StatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Notice to Shareholder of Undistributed Long-Term Capital Gains
 */
@ApiModel(description = "Notice to Shareholder of Undistributed Long-Term Capital Gains")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax2439 {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("fiscalYearBegin")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date fiscalYearBegin;

	@JsonProperty("fiscalYearEnd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date fiscalYearEnd;

	@JsonProperty("ricOrReitNameAddress")
	private NameAddressPhone ricOrReitNameAddress;

	@JsonProperty("ricOrReitTin")
	private String ricOrReitTin;

	@JsonProperty("shareholderNameAddress")
	private NameAddress shareholderNameAddress;

	@JsonProperty("shareholderTin")
	private String shareholderTin;

	@JsonProperty("undistributedLongTermCapitalGains")
	private Double undistributedLongTermCapitalGains;

	@JsonProperty("unrecaptured1250Gain")
	private Double unrecaptured1250Gain;

	@JsonProperty("section1202Gain")
	private Double section1202Gain;

	@JsonProperty("collectiblesGain")
	private Double collectiblesGain;

	@JsonProperty("taxPaid")
	private Double taxPaid;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public Date getFiscalYearBegin() {
		return fiscalYearBegin;
	}

	public void setFiscalYearBegin(Date fiscalYearBegin) {
		this.fiscalYearBegin = fiscalYearBegin;
	}

	public Date getFiscalYearEnd() {
		return fiscalYearEnd;
	}

	public void setFiscalYearEnd(Date fiscalYearEnd) {
		this.fiscalYearEnd = fiscalYearEnd;
	}

	public NameAddressPhone getRicOrReitNameAddress() {
		return ricOrReitNameAddress;
	}

	public void setRicOrReitNameAddress(NameAddressPhone ricOrReitNameAddress) {
		this.ricOrReitNameAddress = ricOrReitNameAddress;
	}

	public String getRicOrReitTin() {
		return ricOrReitTin;
	}

	public void setRicOrReitTin(String ricOrReitTin) {
		this.ricOrReitTin = ricOrReitTin;
	}

	public NameAddress getShareholderNameAddress() {
		return shareholderNameAddress;
	}

	public void setShareholderNameAddress(NameAddress shareholderNameAddress) {
		this.shareholderNameAddress = shareholderNameAddress;
	}

	public String getShareholderTin() {
		return shareholderTin;
	}

	public void setShareholderTin(String shareholderTin) {
		this.shareholderTin = shareholderTin;
	}

	public Double getUndistributedLongTermCapitalGains() {
		return undistributedLongTermCapitalGains;
	}

	public void setUndistributedLongTermCapitalGains(Double undistributedLongTermCapitalGains) {
		this.undistributedLongTermCapitalGains = undistributedLongTermCapitalGains;
	}

	public Double getUnrecaptured1250Gain() {
		return unrecaptured1250Gain;
	}

	public void setUnrecaptured1250Gain(Double unrecaptured1250Gain) {
		this.unrecaptured1250Gain = unrecaptured1250Gain;
	}

	public Double getSection1202Gain() {
		return section1202Gain;
	}

	public void setSection1202Gain(Double section1202Gain) {
		this.section1202Gain = section1202Gain;
	}

	public Double getCollectiblesGain() {
		return collectiblesGain;
	}

	public void setCollectiblesGain(Double collectiblesGain) {
		this.collectiblesGain = collectiblesGain;
	}

	public Double getTaxPaid() {
		return taxPaid;
	}

	public void setTaxPaid(Double taxPaid) {
		this.taxPaid = taxPaid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collectiblesGain == null) ? 0 : collectiblesGain.hashCode());
		result = prime * result + ((fiscalYearBegin == null) ? 0 : fiscalYearBegin.hashCode());
		result = prime * result + ((fiscalYearEnd == null) ? 0 : fiscalYearEnd.hashCode());
		result = prime * result + ((ricOrReitNameAddress == null) ? 0 : ricOrReitNameAddress.hashCode());
		result = prime * result + ((ricOrReitTin == null) ? 0 : ricOrReitTin.hashCode());
		result = prime * result + ((section1202Gain == null) ? 0 : section1202Gain.hashCode());
		result = prime * result + ((shareholderNameAddress == null) ? 0 : shareholderNameAddress.hashCode());
		result = prime * result + ((shareholderTin == null) ? 0 : shareholderTin.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((taxPaid == null) ? 0 : taxPaid.hashCode());
		result = prime * result
				+ ((undistributedLongTermCapitalGains == null) ? 0 : undistributedLongTermCapitalGains.hashCode());
		result = prime * result + ((unrecaptured1250Gain == null) ? 0 : unrecaptured1250Gain.hashCode());
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
		Tax2439 other = (Tax2439) obj;
		if (collectiblesGain == null) {
			if (other.collectiblesGain != null)
				return false;
		} else if (!collectiblesGain.equals(other.collectiblesGain))
			return false;
		if (fiscalYearBegin == null) {
			if (other.fiscalYearBegin != null)
				return false;
		} else if (!fiscalYearBegin.equals(other.fiscalYearBegin))
			return false;
		if (fiscalYearEnd == null) {
			if (other.fiscalYearEnd != null)
				return false;
		} else if (!fiscalYearEnd.equals(other.fiscalYearEnd))
			return false;
		if (ricOrReitNameAddress == null) {
			if (other.ricOrReitNameAddress != null)
				return false;
		} else if (!ricOrReitNameAddress.equals(other.ricOrReitNameAddress))
			return false;
		if (ricOrReitTin == null) {
			if (other.ricOrReitTin != null)
				return false;
		} else if (!ricOrReitTin.equals(other.ricOrReitTin))
			return false;
		if (section1202Gain == null) {
			if (other.section1202Gain != null)
				return false;
		} else if (!section1202Gain.equals(other.section1202Gain))
			return false;
		if (shareholderNameAddress == null) {
			if (other.shareholderNameAddress != null)
				return false;
		} else if (!shareholderNameAddress.equals(other.shareholderNameAddress))
			return false;
		if (shareholderTin == null) {
			if (other.shareholderTin != null)
				return false;
		} else if (!shareholderTin.equals(other.shareholderTin))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (taxPaid == null) {
			if (other.taxPaid != null)
				return false;
		} else if (!taxPaid.equals(other.taxPaid))
			return false;
		if (undistributedLongTermCapitalGains == null) {
			if (other.undistributedLongTermCapitalGains != null)
				return false;
		} else if (!undistributedLongTermCapitalGains.equals(other.undistributedLongTermCapitalGains))
			return false;
		if (unrecaptured1250Gain == null) {
			if (other.unrecaptured1250Gain != null)
				return false;
		} else if (!unrecaptured1250Gain.equals(other.unrecaptured1250Gain))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax2439 [tax=" + tax + ", fiscalYearBegin=" + fiscalYearBegin + ", fiscalYearEnd=" + fiscalYearEnd
				+ ", ricOrReitNameAddress=" + ricOrReitNameAddress + ", ricOrReitTin=" + ricOrReitTin
				+ ", shareholderNameAddress=" + shareholderNameAddress + ", shareholderTin=" + shareholderTin
				+ ", undistributedLongTermCapitalGains=" + undistributedLongTermCapitalGains + ", unrecaptured1250Gain="
				+ unrecaptured1250Gain + ", section1202Gain=" + section1202Gain + ", collectiblesGain="
				+ collectiblesGain + ", taxPaid=" + taxPaid + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax2439.class);

	public Tax2439 getTax2439(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax2439 tax2439;
			try {
				tax2439 = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax2439 where internalId in (:internalId)", parameters,
						new Tax2439StatementRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax2439 not found", 0);
			}
//			ricOrReitNameAddress Start
			NameAddressPhone nameAddressPhone = new NameAddressPhone();
			if (tax2439.getRicOrReitNameAddress() != null) {
				nameAddressPhone = nameAddressPhone
						.getNameAddressPhoneDetails(tax2439.getRicOrReitNameAddress().getNameAddressId());
				tax2439.setRicOrReitNameAddress(nameAddressPhone);
			}
//			ricOrReitNameAddress End

//			shareholderNameAddress Start
			NameAddress shareholderNameAddress = new NameAddress();
			if (tax2439.getShareholderNameAddress() != null) {
				shareholderNameAddress = shareholderNameAddress
						.getNameAddressDetails(tax2439.getShareholderNameAddress().getNameAddressId());
				tax2439.setShareholderNameAddress(shareholderNameAddress);
			}
//			fiduciaryNameAddress End

			return tax2439;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax2439 : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

}
