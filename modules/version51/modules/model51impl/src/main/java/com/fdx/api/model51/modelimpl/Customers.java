package com.fdx.api.model51.modelimpl;

import java.util.List;

import com.fdx.common.exception.FDXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.model.Customers51;

import io.swagger.annotations.ApiModel;

/**
 * List of customers
 */
@ApiModel(description = "List of customers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Customers51")
public class Customers implements Customers51<Customers> {

	NamedParameterJdbcTemplate template;

	PaginatedArray paginatedArray = new PaginatedArray();

	@JsonProperty("page")
	private PageMetadata page;

	@JsonProperty("links")
	private PageMetadataLinks links;

	@JsonProperty("customers")
	private List<Customer> customers = null;

	private static final Logger logger = LoggerFactory.getLogger(Accounts.class);

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public PageMetadata getPage(String resultType, String uriPath, int limit, String offset, int count)
			throws Exception {
		return paginatedArray.getPage(null, uriPath, limit, offset, count);
	}

	public void setPage(PageMetadata page) {
		this.page = page;
	}

	public PageMetadataLinks getLinks(String resultType, String uriPath, int limit, String offset, int count)
			throws Exception {
		return paginatedArray.getLinks(null, uriPath, limit, offset, count);
	}

	public void setLinks(PageMetadataLinks links) {
		this.links = links;
	}

	public static Logger getLogger() {
		return logger;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		result = prime * result + ((page == null) ? 0 : page.hashCode());
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
		Customers other = (Customers) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		if (links == null) {
			if (other.links != null)
				return false;
		} else if (!links.equals(other.links))
			return false;
		if (page == null) {
			if (other.page != null)
				return false;
		} else if (!page.equals(other.page))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customers [page=" + page + ", links=" + links + ", customers=" + customers + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Customers.class);

	@Override
	public Customers getCustomers(int limit, String offset, String uriPath) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();;
			String customerId = "customerId";
			SqlParameterSource parameters = new MapSqlParameterSource("customerId", customerId);
			Customers customers = new Customers();
			Customer customer = new Customer();
			List<Customer> customerList = customer.getCustomers(limit, offset, uriPath);
			customers.setCustomers(customerList);
			int count = customer.getCustomerCount();
			PageMetadataLinks paginatedLinks = customers.getLinks(null, uriPath, limit, offset, count);
			PageMetadata pageMetadata = customers.getPage(null, uriPath, limit, offset, count);
			customers.setLinks(paginatedLinks);
			customers.setPage(pageMetadata);
			return customers;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Customers : ", e);
			throw new FDXException(e,500);
		}
	}
}
