package com.fdx.api.model51.modelimpl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.CustomerNameRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * The name of an individual in their role as a customer
 */
@ApiModel(description = "The name of an individual in their role as a customer")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class CustomerName {

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private int nameId;

	@JsonUnwrapped
	@JsonProperty("individualName")
	private IndividualName individualName;

	@JsonProperty("prefix")
	private String prefix;

	@JsonProperty("company")
	private String company;

	public int getNameId() {
		return nameId;
	}

	public void setNameId(int nameId) {
		this.nameId = nameId;
	}

	public IndividualName getIndividualName() {
		return individualName;
	}

	public void setIndividualName(IndividualName individualName) {
		this.individualName = individualName;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((individualName == null) ? 0 : individualName.hashCode());
		result = prime * result + nameId;
		result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());
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
		CustomerName other = (CustomerName) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (individualName == null) {
			if (other.individualName != null)
				return false;
		} else if (!individualName.equals(other.individualName))
			return false;
		if (nameId != other.nameId)
			return false;
		if (prefix == null) {
			if (other.prefix != null)
				return false;
		} else if (!prefix.equals(other.prefix))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerName [template=" + template + ", nameId=" + nameId + ", individualName=" + individualName
				+ ", prefix=" + prefix + ", company=" + company + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(CustomerName.class);

	public CustomerName getCustomerName(int customerNameId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("customerNameId", customerNameId);
			IndividualName individualName = new IndividualName();

			CustomerName customerName = new CustomerName();
			CustomerName customerNameResponse = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".customerName where custemerNameId in (:customerNameId)", parameters,
					new CustomerNameRowMapper());

			individualName = individualName.getIndividualName(customerNameResponse.getNameId());
			customerName.setIndividualName(individualName);

			customerName.setPrefix(customerNameResponse.getPrefix());
			customerName.setCompany(customerNameResponse.getCompany());
			customerName.setNameId(customerNameResponse.getNameId());
			return customerName;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("CustomerName : ", e);
			throw new FDXException(e,500);
		}
	}

	public Map<String, Object> updateCustomer(MerchantForUpdate merchantForUpdate, Merchant merchant, Field field) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			IndividualName individualName = new IndividualName();

			int nameId = 0;
			field.setAccessible(true);
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);

			StringBuffer nameQuery = new StringBuffer();
			nameQuery.append("update "+ DeveloperContext.getDeveloperSchema() +".customername set ");
			List<String> changedPropertiesName = new ArrayList<>();

			for (Field nameField : merchantForUpdate.getName().getClass().getDeclaredFields()) {
				nameField.setAccessible(true);

				Object name1 = nameField.get(merchantForUpdate.getName());
				if (merchant.getMerchantForUpdate().getName() == null) {
					Map<String, Object> keys = merchantForUpdate.getName().insertCustomerName();
					return keys;
				}
				Object name2 = nameField.get(merchant.getMerchantForUpdate().getName());
				if ((nameField.getName()).equals("nameId"))
					nameId = (int) merchant.getMerchantForUpdate().getNameId();
				if (!((nameField.getName()).equals("individualName") || (nameField.getName()).equals("nameId"))) {
					if (name1 != null && name2 != null) {
						if (!Objects.equals(name1, name2)) {
							changedPropertiesName.add(nameField.getName());
							nameQuery.append(nameField.getName() + "='" + name1 + "',");
						}
					}
				}
				if ((nameField.getName()).equals("individualName")
						&& merchantForUpdate.getName().getIndividualName() != null) {
					Map<String, Object> keys = merchantForUpdate.getName().getIndividualName().updateIndividualName(merchantForUpdate, merchant, field);
					if (keys != null) {
						changedPropertiesName.add(field.getName());
						nameQuery.append("nameid=" + (int) keys.get("nameId") + ",");
					}
				}
			}
			int countName = 0;
			StringBuffer newNameQuery = new StringBuffer(nameQuery.substring(0, nameQuery.length()-1));
			if (changedPropertiesName.size() != 0) {
				newNameQuery.append(" where custemernameid='" + nameId + "'");
				countName = template.update(newNameQuery.toString(), parameters);
			}
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("CustomerName : ", e);
			throw new FDXException(e,500);
		}
		return null;

	}

	public Map<String, Object> insertCustomerName() throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();

		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			Map<String, Object> keys = null;
			SqlParameterSource parameters = new MapSqlParameterSource("payeeId", null);

//			IndividualName Start
			int individualNameArrayKey = 0;
			if (individualName != null) {
				keys = individualName.insertIndividualName();
				individualNameArrayKey = (int) keys.get("nameId");
			}
//			IndividualName End

			int count = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".customerName (prefix, company,nameid) values ("
							+ ((prefix != null) ? ("'" + prefix + "'") : null) + ",'" + company + "',"
							+ ((individualName != null) ? ("'" + individualNameArrayKey + "'") : null) + ")",
					parameters, keyHolder);

		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("CustomerName : ", e);
			throw new FDXException(e,500);
		}
		return keyHolder.getKeys();
	}
}
