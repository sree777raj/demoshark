package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.model.Payments51;

import io.swagger.annotations.ApiModel;

/**
 * A list of payments
 */
@ApiModel(description = "A list of payments")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Payments51")
public class Payments implements Payments51<Payments> {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private SynchronizableArray synchronizableArray;

	@JsonProperty("payments")
	@Valid
	private List<Payment> payments = new ArrayList<>();

	public SynchronizableArray getSynchronizableArray() {
		return synchronizableArray;
	}

	public void setSynchronizableArray(SynchronizableArray synchronizableArray) {
		this.synchronizableArray = synchronizableArray;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((payments == null) ? 0 : payments.hashCode());
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
		Payments other = (Payments) obj;
		if (payments == null) {
			if (other.payments != null)
				return false;
		} else if (!payments.equals(other.payments))
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
		return "Payments [synchronizableArray=" + synchronizableArray + ", payments=" + payments + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Payments.class);

	@Override
	public Payments getPaymentsList(String updatedSince, String offset, Integer limit, String uriPath,
			String queryResult) throws FDXException {
		try {
			SynchronizableArray synchronizableArray = new SynchronizableArray();
			Payment payment = new Payment();
			Payments payments = new Payments();

			List<Payment> paymentResponseList = payment.getPayment(updatedSince, limit, offset);

			int count = payment.getCount(updatedSince, null);

			synchronizableArray = synchronizableArray.getSynchronizablePaginatedResult("Payments", queryResult, uriPath,
					limit, offset, count);
			payments.setPayments(paymentResponseList);
			payments.setSynchronizableArray(synchronizableArray);

			return payments;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Payments : ", e);
			throw new FDXException(e,500);
		}
	}

	@Override
	public Payments getPaymentsByRecurringPaymentId(String recurringPaymentId, String updatedSince, String offset,
			Integer limit, String uriPath, String queryResult) throws FDXException {
		try {
			SynchronizableArray synchronizableArray = new SynchronizableArray();
			Payment payment = new Payment();
			Payments payments = new Payments();

			List<Payment> paymentResponseList = payment.getPaymentByRecurringPaymentId(recurringPaymentId, updatedSince,
					limit, offset);

			int count = payment.getCount(updatedSince, recurringPaymentId);

			synchronizableArray = synchronizableArray.getSynchronizablePaginatedResult("Payments", queryResult, uriPath,
					limit, offset, count);
			payments.setPayments(paymentResponseList);
			payments.setSynchronizableArray(synchronizableArray);

			return payments;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Payments : ", e);
			throw new FDXException(e,500);
		}
	}
}
