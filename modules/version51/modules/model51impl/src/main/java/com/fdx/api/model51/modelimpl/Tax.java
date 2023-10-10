package com.fdx.api.model51.modelimpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.*;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.TaxRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Base entity for all IRS Tax forms
 */
@ApiModel(description = "Base entity for all IRS Tax forms")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax {

	private static final Logger log = LoggerFactory.getLogger(Tax.class);

	NamedParameterJdbcTemplate template;

	@JsonIgnore
	private Integer internalId;

	@JsonProperty("taxYear")
	private Integer taxYear;

	@JsonProperty("corrected")
	@JsonInclude(Include.NON_NULL)
	private Boolean corrected;

	@JsonProperty("accountId")
	private String accountId;

	@JsonProperty("taxFormId")
	private String taxFormId;

	@JsonProperty("taxFormDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date taxFormDate;

	@JsonProperty("description")
	private String description;

	@JsonProperty("additionalInformation")
	private String additionalInformation;

	@JsonProperty("taxFormType")
	private TaxFormType taxFormType;

	@JsonProperty("attributes")
	@Valid
	private List<TaxFormAttribute> attributes = null;

	@JsonProperty("error")
	private Error error;

	@JsonProperty("links")
	private TaxLinks links;

	public Integer getInternalId() {
		return internalId;
	}

	public void setInternalId(Integer internalId) {
		this.internalId = internalId;
	}

	public Tax taxYear(Integer taxYear) {
		this.taxYear = taxYear;
		return this;
	}

	/**
	 * Year for which taxes are being paid
	 * 
	 * @return taxYear
	 */
	@ApiModelProperty(value = "Year for which taxes are being paid")

	public Integer getTaxYear() {
		return taxYear;
	}

	public void setTaxYear(Integer taxYear) {
		this.taxYear = taxYear;
	}

	public Tax corrected(Boolean corrected) {
		this.corrected = corrected;
		return this;
	}

	/**
	 * True to indicate this is a corrected tax form
	 * 
	 * @return corrected
	 */
	@ApiModelProperty(value = "True to indicate this is a corrected tax form")

	public Boolean getCorrected() {
		return corrected;
	}

	public void setCorrected(Boolean corrected) {
		this.corrected = corrected;
	}

	public Tax accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return accountId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Tax taxFormId(String taxFormId) {
		this.taxFormId = taxFormId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return taxFormId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getTaxFormId() {
		return taxFormId;
	}

	public void setTaxFormId(String taxFormId) {
		this.taxFormId = taxFormId;
	}

	public Tax taxFormDate(Date taxFormDate) {
		this.taxFormDate = taxFormDate;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return taxFormDate
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public Date getTaxFormDate() {
		return taxFormDate;
	}

	public void setTaxFormDate(Date taxFormDate) {
		this.taxFormDate = taxFormDate;
	}

	public Tax description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the tax document
	 * 
	 * @return description
	 */
	@ApiModelProperty(value = "Description of the tax document")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Tax additionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	/**
	 * Additional explanation text or content for taxpayer or preparer or IRS about
	 * the tax document
	 * 
	 * @return additionalInformation
	 */
	@ApiModelProperty(value = "Additional explanation text or content for taxpayer or preparer or IRS about the tax document")

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	public Tax taxFormType(TaxFormType taxFormType) {
		this.taxFormType = taxFormType;
		return this;
	}

	/**
	 * Get taxFormType
	 * 
	 * @return taxFormType
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TaxFormType getTaxFormType() {
		return taxFormType;
	}

	public void setTaxFormType(TaxFormType taxFormType) {
		this.taxFormType = taxFormType;
	}

	public Tax attributes(List<TaxFormAttribute> attributes) {
		this.attributes = attributes;
		return this;
	}

	public Tax addAttributesItem(TaxFormAttribute attributesItem) {
		if (this.attributes == null) {
			this.attributes = new ArrayList<>();
		}
		this.attributes.add(attributesItem);
		return this;
	}

	/**
	 * Additional tax form attributes when defined fields are not available
	 * 
	 * @return attributes
	 */
	@ApiModelProperty(value = "Additional tax form attributes when defined fields are not available")

	@Valid

	public List<TaxFormAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<TaxFormAttribute> attributes) {
		this.attributes = attributes;
	}

	public Tax error(Error error) {
		this.error = error;
		return this;
	}

	/**
	 * Get error
	 * 
	 * @return error
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public Tax links(TaxLinks links) {
		this.links = links;
		return this;
	}

	/**
	 * Get links
	 * 
	 * @return links
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TaxLinks getLinks() {
		return links;
	}

	public void setLinks(TaxLinks links) {
		this.links = links;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Tax tax = (Tax) o;
		return Objects.equals(this.taxYear, tax.taxYear) && Objects.equals(this.corrected, tax.corrected)
				&& Objects.equals(this.accountId, tax.accountId) && Objects.equals(this.taxFormId, tax.taxFormId)
				&& Objects.equals(this.taxFormDate, tax.taxFormDate)
				&& Objects.equals(this.description, tax.description)
				&& Objects.equals(this.additionalInformation, tax.additionalInformation)
				&& Objects.equals(this.taxFormType, tax.taxFormType) && Objects.equals(this.attributes, tax.attributes)
				&& Objects.equals(this.error, tax.error) && Objects.equals(this.links, tax.links);
	}

	@Override
	public int hashCode() {
		return Objects.hash(taxYear, corrected, accountId, taxFormId, taxFormDate, description, additionalInformation,
				taxFormType, attributes, error, links);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Tax {\n");

		sb.append("    taxYear: ").append(toIndentedString(taxYear)).append("\n");
		sb.append("    corrected: ").append(toIndentedString(corrected)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    taxFormId: ").append(toIndentedString(taxFormId)).append("\n");
		sb.append("    taxFormDate: ").append(toIndentedString(taxFormDate)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
		sb.append("    taxFormType: ").append(toIndentedString(taxFormType)).append("\n");
		sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
		sb.append("    error: ").append(toIndentedString(error)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	public Tax getTaxData(int internalId) throws FDXException {
		template = ConnectionConfigApi51.getTemplate();
		Tax tax = new Tax();
		SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
		try {
			tax = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".tax where internalId in (:internalId)", parameters,
					new TaxRowMapper());
		} catch (Exception e) {
			log.error("Tax : ", e);
			Error error = new Error();
			error.setCode("121");
			error.setMessage("Tax Details not found");
			tax.setError(error);
		}
		try {
//		Attributes
			List<TaxFormAttribute> taxFormAttributeList = tax.getAttributes();
			List<TaxFormAttribute> taxFormAttributeListNew = new ArrayList<>();
			if (tax.getAttributes() != null) {
				for (TaxFormAttribute taxFormAttributeIterator : taxFormAttributeList) {
					TaxFormAttribute taxFormAttribute = taxFormAttributeIterator
							.getTaxFormAttribute(taxFormAttributeIterator.getTaxAttrId());
					taxFormAttributeListNew.add(taxFormAttribute);
				}
				tax.setAttributes(taxFormAttributeListNew);
			}
			Error error = new Error();
			if (tax.getError() != null)
				tax.setError(error.getError(tax.getError().getCode()));
			TaxLinks taxLinks = new TaxLinks();
			HateoasLink hateoasLink = new HateoasLink();
			if (tax.getLinks() != null) {
				hateoasLink = hateoasLink.getHateoasLinks(tax.getLinks().getSelf().getHateoasLinkId());
				taxLinks.setSelf(hateoasLink);
				tax.setLinks(taxLinks);
			}
			return tax;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax : ", e);
			throw new FDXException(e,500);
		}
	}

	public List<Integer> getDistinctGroupId(String taxformid) throws FDXException {
		template = ConnectionConfigApi51.getTemplate();;
		List<Integer> distinctGroups = new ArrayList<>();
		try {
			Tax tax = new Tax();
			SqlParameterSource parameters = new MapSqlParameterSource("taxformid", taxformid);
			distinctGroups = template.queryForList(
					"select distinct(groupId) from "+ DeveloperContext.getDeveloperSchema() +".tax where taxformid in (:taxformid)", parameters,
					Integer.class);
			return distinctGroups;
		} catch (Exception e) {
			log.error("Tax : ", e);
			throw new FDXException(e,500);
		}
	}
}
