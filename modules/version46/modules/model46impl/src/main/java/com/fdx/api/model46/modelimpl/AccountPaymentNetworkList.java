package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;

import com.fdx.common.exception.FDXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.model.AccountPaymentNetworkList46;

import io.swagger.annotations.ApiModel;

/**
 * An optionally paginated array of payment networks supported by the account
 */
@ApiModel(description = "An optionally paginated array of payment networks supported by the account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("AccountPaymentNetworkList46")
public class AccountPaymentNetworkList implements AccountPaymentNetworkList46<AccountPaymentNetworkList> {

	@JsonUnwrapped
	private PaginatedArray paginatedArray;

	@JsonProperty("paymentNetworks")
	private List<AccountPaymentNetwork> paymentNetworks = null;

	public PaginatedArray getPaginatedArray(String query, String resultType, String uriPath, int limit, String offset,
			int count) throws Exception {
		PaginatedArray paginatedArray = new PaginatedArray();
		paginatedArray = paginatedArray.getPaginatedResult(query, uriPath, limit, offset, count);
		return paginatedArray;
	}

	public void setPaginatedArray(PaginatedArray paginatedArray) {
		this.paginatedArray = paginatedArray;
	}

	public List<AccountPaymentNetwork> getPaymentNetworks() {
		return paymentNetworks;
	}

	public void setPaymentNetworks(List<AccountPaymentNetwork> paymentNetworks) {
		this.paymentNetworks = paymentNetworks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((paginatedArray == null) ? 0 : paginatedArray.hashCode());
		result = prime * result + ((paymentNetworks == null) ? 0 : paymentNetworks.hashCode());
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
		AccountPaymentNetworkList other = (AccountPaymentNetworkList) obj;
		if (paginatedArray == null) {
			if (other.paginatedArray != null)
				return false;
		} else if (!paginatedArray.equals(other.paginatedArray))
			return false;
		if (paymentNetworks == null) {
			if (other.paymentNetworks != null)
				return false;
		} else if (!paymentNetworks.equals(other.paymentNetworks))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccountPaymentNetworkList [paginatedArray=" + paginatedArray + ", paymentNetworks=" + paymentNetworks
				+ "]";
	}

	private static final Logger log = LoggerFactory.getLogger(AccountPaymentNetworkList.class);

	@Override
	public AccountPaymentNetworkList getAccountPaymentNetwork(String accountId, Integer limit, String offset,
			String uriPath, String queryInput) throws FDXException {
		AccountPaymentNetworkList accountPaymentNetworkList = new AccountPaymentNetworkList();
		try {
			List<AccountPaymentNetwork> accountPaymentNetworkListResponse = new ArrayList<>();
			AccountPaymentNetwork accountPaymentNetwork = new AccountPaymentNetwork();
			accountPaymentNetworkListResponse = accountPaymentNetwork.getAccountPaymentNetworkList(accountId, offset, limit);
			accountPaymentNetworkList.setPaymentNetworks(accountPaymentNetworkListResponse);

			int count = accountPaymentNetwork.getCount(accountId);

			PaginatedArray paginatedArray = accountPaymentNetworkList.getPaginatedArray(queryInput, null, uriPath,
					limit, offset, count);
			accountPaymentNetworkList.setPaginatedArray(paginatedArray);

		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("AccountPaymentNetworkList : ", e);
			throw new FDXException(e,500);
		}
		return accountPaymentNetworkList;
	}
}
