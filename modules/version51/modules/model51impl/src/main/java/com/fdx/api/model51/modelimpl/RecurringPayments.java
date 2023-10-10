package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.model.RecurringPayments51;

import io.swagger.annotations.ApiModel;

/**
 * A list of recurring payments
 */
@ApiModel(description = "A list of recurring payments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("RecurringPayments51")
public class RecurringPayments implements RecurringPayments51<RecurringPayments> {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private SynchronizableArray synchronizableArray;

	@JsonProperty("recurringPayments")
	@Valid
	private List<RecurringPayment> recurringPayments = new ArrayList<>();

	public SynchronizableArray getSynchronizableArray() {
		return synchronizableArray;
	}

	public void setSynchronizableArray(SynchronizableArray synchronizableArray) {
		this.synchronizableArray = synchronizableArray;
	}

	public List<RecurringPayment> getRecurringPayments() {
		return recurringPayments;
	}

	public void setRecurringPayments(List<RecurringPayment> recurringPayments) {
		this.recurringPayments = recurringPayments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((recurringPayments == null) ? 0 : recurringPayments.hashCode());
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
		RecurringPayments other = (RecurringPayments) obj;
		if (recurringPayments == null) {
			if (other.recurringPayments != null)
				return false;
		} else if (!recurringPayments.equals(other.recurringPayments))
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
		return "RecurringPayments [synchronizableArray=" + synchronizableArray + ", recurringPayments="
				+ recurringPayments + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(RecurringPayments.class);

	@Override
	public RecurringPayments getRecurringPaymentsList(String updatedSince, String offset, Integer limit, String uriPath,
			String queryResult) throws FDXException {
		try {
			SynchronizableArray synchronizableArray = new SynchronizableArray();
			RecurringPayment recurringPayment = new RecurringPayment();
			RecurringPayments recurringPayments = new RecurringPayments();
			List<RecurringPayment> recurringPaymentResponseList = recurringPayment.getRecurringPayment(updatedSince,
					limit, offset);
			int count = recurringPayment.getCount(updatedSince);
			synchronizableArray = synchronizableArray.getSynchronizablePaginatedResult("RecurringPayments", queryResult,
					uriPath, limit, offset, count);
			recurringPayments.setRecurringPayments(recurringPaymentResponseList);
			recurringPayments.setSynchronizableArray(synchronizableArray);
			return recurringPayments;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RecurringPayments : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
