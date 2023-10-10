package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fdx.common.exception.FDXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.model.Payees51;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A list of payees
 */
@ApiModel(description = "A list of payees")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Payees51")
public class Payees implements Payees51<Payees> {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private SynchronizableArray synchronizableArray;

	@JsonProperty("payees")
	@Valid
	private List<Payee> payees = new ArrayList<>();

	public SynchronizableArray getSynchronizableArray() {
		return synchronizableArray;
	}

	public void setSynchronizableArray(SynchronizableArray synchronizableArray) {
		this.synchronizableArray = synchronizableArray;
	}

	/**
	 * Payees retrieved by the operation
	 * 
	 * @return payees
	 */
	@ApiModelProperty(required = true, value = "Payees retrieved by the operation")
	@NotNull

	@Valid

	public List<Payee> getPayees() {
		return payees;
	}

	public void setPayees(List<Payee> payees) {
		this.payees = payees;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((payees == null) ? 0 : payees.hashCode());
		result = prime * result + ((synchronizableArray == null) ? 0 : synchronizableArray.hashCode());
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
		Payees other = (Payees) obj;
		if (payees == null) {
			if (other.payees != null)
				return false;
		} else if (!payees.equals(other.payees))
			return false;
		if (synchronizableArray == null) {
			if (other.synchronizableArray != null)
				return false;
		} else if (!synchronizableArray.equals(other.synchronizableArray))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payees [synchronizableArray=" + synchronizableArray + ", payees=" + payees + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Payees.class);

	@Override
	public Payees getPayeesList(String updatedSince, String offset, int limit, String uriPath, String queryResult)
			throws FDXException {
		try {
			SynchronizableArray synchronizableArray = new SynchronizableArray();
			Payee payee = new Payee();
			Payees payees = new Payees();

			List<Payee> payeeList = new ArrayList<>();
			List<Merchant> merchantsResponseList = payee.getPayees(updatedSince, limit, offset);

			if(merchantsResponseList.isEmpty())
				throw new FDXException(1107);

			for (Merchant merchantResponseItaretor : merchantsResponseList) {
				Payee payeeNew = new Payee();
				payeeNew.setMerchant(merchantResponseItaretor);
				payeeList.add(payeeNew);
			}

			int count = payee.getCount(updatedSince);

			synchronizableArray = synchronizableArray.getSynchronizablePaginatedResult("Payees", queryResult, uriPath,
					limit, offset, count);

			payees.setPayees(payeeList);
			payees.setSynchronizableArray(synchronizableArray);

			return payees;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Payees : ", e);
			throw new FDXException(e,500);
		}
	}

}
