package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.MerchantRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Business or person to whom bill payments can be sent for products or services
 */
@ApiModel(description = "Business or person to whom bill payments can be sent for products or services")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Merchant {

	@JsonIgnore
	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private MerchantForUpdate merchantForUpdate;

	@JsonProperty("payeeId")
	private String payeeId;

	@JsonProperty("status")
	private PayeeStatus status;

	@JsonProperty("expiresTimestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp expiresTimestamp;

	public MerchantForUpdate getMerchantForUpdate() {
		return merchantForUpdate;
	}

	public void setMerchantForUpdate(MerchantForUpdate merchantForUpdate) {
		this.merchantForUpdate = merchantForUpdate;
	}

	public String getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}

	public PayeeStatus getStatus() {
		return status;
	}

	public void setStatus(PayeeStatus status) {
		this.status = status;
	}

	public java.sql.Timestamp getExpiresTimestamp() {
		return expiresTimestamp;
	}

	public void setExpiresTimestamp(java.sql.Timestamp expiresTimestamp) {
		this.expiresTimestamp = expiresTimestamp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expiresTimestamp == null) ? 0 : expiresTimestamp.hashCode());
		result = prime * result + ((merchantForUpdate == null) ? 0 : merchantForUpdate.hashCode());
		result = prime * result + ((payeeId == null) ? 0 : payeeId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Merchant other = (Merchant) obj;
		if (expiresTimestamp == null) {
			if (other.expiresTimestamp != null)
				return false;
		} else if (!expiresTimestamp.equals(other.expiresTimestamp))
			return false;
		if (merchantForUpdate == null) {
			if (other.merchantForUpdate != null)
				return false;
		} else if (!merchantForUpdate.equals(other.merchantForUpdate))
			return false;
		if (payeeId == null) {
			if (other.payeeId != null)
				return false;
		} else if (!payeeId.equals(other.payeeId))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Merchant [merchantForUpdate=" + merchantForUpdate + ", payeeId=" + payeeId + ", status=" + status
				+ ", expiresTimestamp=" + expiresTimestamp + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Merchant.class);

	public List<Merchant> getMerchants(int limit, String updatedSince, String offset) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("updatedSince", updatedSince);
			List<Merchant> merchantList = new ArrayList<>();
			StringBuffer query = new StringBuffer("select * from "+ DeveloperContext.getDeveloperSchema() +".merchant ");
			if (updatedSince != null) {
				query.append(" where payeeid >= '" + updatedSince + "'");
			}
			query.append(" order by payeeid limit " + limit + " offset " + offset);
			List<Merchant> merchantResponseList = template.query(query.toString(), parameters, new MerchantRowMapper());
			for (Merchant merchant : merchantResponseList) {
				MerchantForUpdate merchantForUpdate = new MerchantForUpdate();
				merchantForUpdate = merchantForUpdate
						.getMerchantForUpdateDetails(merchant.getMerchantForUpdate().getPayeeId());
				merchant.setMerchantForUpdate(merchantForUpdate);
				merchantList.add(merchant);
			}
			return merchantList;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Merchant : ", e);
			throw new FDXException(e,500);
		}
	}

	public int getMerchantsCount(String updatedSince) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("updatedSince", updatedSince);
			int count = 0;
			if (updatedSince != null)
				count = template.queryForObject(
						"select count(*) from "+ DeveloperContext.getDeveloperSchema() +".merchant  where payeeid >= '" + updatedSince + "'", parameters,
						Integer.class);
			else
				count = template.queryForObject("select count(*) from "+ DeveloperContext.getDeveloperSchema() +".merchant", parameters, Integer.class);
			return count;
		} catch (Exception e) {
			log.error("Merchant : ", e);
			throw new FDXException(e,500);
		}
	}

	public Merchant getMerchant(String payeeId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", payeeId);
			Merchant merchant;
			try {
				merchant = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".merchant where payeeId ='" + payeeId + "'", parameters,
						new MerchantRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException(e, 800);
			}
			MerchantForUpdate merchantForUpdate = new MerchantForUpdate();
			merchantForUpdate = merchantForUpdate
					.getMerchantForUpdateDetails(merchant.getMerchantForUpdate().getPayeeId());
			merchant.setMerchantForUpdate(merchantForUpdate);
			return merchant;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Merchant : ", e);
			throw new FDXException(e,500);
		}
	}

	public Merchant deleteMerchant(String payeeId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			Merchant merchant = new Merchant();
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", payeeId);
			int count = template.update("update "+ DeveloperContext.getDeveloperSchema() +".merchant set status ='DELETED' where payeeId in (:payeeId)",
					parameters);
			if (count == 0) {
				throw new FDXException(800);
			} else if (count != 1) {
				log.error("Merchant : Unable to set status for payeeid " + payeeId);
				throw new FDXException(500);
			} else {
				merchant = merchant.getMerchant(payeeId);
				return merchant;
			}
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Merchant : ", e);
			throw new FDXException(e,500);
		}
	}

	public Merchant insertMerchant(String payeeId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			Merchant merchant = new Merchant();
			java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", payeeId);
			// TODO set the status to PENDING initial and in the money movement prcess set to active
			int count = template.update("insert into "+ DeveloperContext.getDeveloperSchema() +".merchant (payeeId,status,expirestimestamp) values ('"
					+ payeeId + "','ACTIVE','" + date + "')", parameters);
			if (count != 1) {
				log.error("Merchant : Unable to insert for payeeid " + payeeId);
				throw new FDXException(500);
			} else {
				merchant = merchant.getMerchant(payeeId);
				return merchant;
			}
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Merchant : ", e);
			throw new FDXException(e,500);
		}
	}

}
