package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.TaxRowMapper;
import com.fdx.api.model46.model.TaxDataList46;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Paginated array of tax data
 */
@ApiModel(description = "Paginated array of tax data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("TaxDataList46")
public class TaxDataList implements TaxDataList46<TaxDataList> {
	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private PaginatedArray paginatedArray;

	@JsonProperty("page")
	private PageMetadata page;

	@JsonProperty("links")
	private PageMetadataLinks links;

	@JsonProperty("forms")
	@Valid
	private List<TaxData> forms = null;

	public TaxDataList page(PageMetadata page) {
		this.page = page;
		return this;
	}

	public PaginatedArray getPaginatedArray(String resultType, String uriPath, int limit, String offset, int count) throws Exception {
		PaginatedArray paginatedArray = new PaginatedArray();
		paginatedArray = paginatedArray.getPaginatedResult(resultType, uriPath, limit, offset, count);
		return paginatedArray;
	}

	public void setPaginatedArray(PaginatedArray paginatedArray) {
		this.paginatedArray = paginatedArray;
	}

	/**
	 * Get page
	 * 
	 * @return page
	 */
	@ApiModelProperty(value = "")

	@Valid

	public PageMetadata getPage() {
		return page;
	}

	public void setPage(PageMetadata page) {
		this.page = page;
	}

	public TaxDataList links(PageMetadataLinks links) {
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

	public PageMetadataLinks getLinks() {
		return links;
	}

	public void setLinks(PageMetadataLinks links) {
		this.links = links;
	}

	public TaxDataList forms(List<TaxData> forms) {
		this.forms = forms;
		return this;
	}

	public TaxDataList addFormsItem(TaxData formsItem) {
		if (this.forms == null) {
			this.forms = new ArrayList<>();
		}
		this.forms.add(formsItem);
		return this;
	}

	/**
	 * The list of tax forms
	 * 
	 * @return forms
	 */
	@ApiModelProperty(value = "The list of tax forms")

	@Valid

	public List<TaxData> getForms() {
		return forms;
	}

	public void setForms(List<TaxData> forms) {
		this.forms = forms;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((forms == null) ? 0 : forms.hashCode());
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
		TaxDataList other = (TaxDataList) obj;
		if (forms == null) {
			if (other.forms != null)
				return false;
		} else if (!forms.equals(other.forms))
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
		return "TaxDataList [page=" + page + ", links=" + links + ", forms=" + forms + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(TaxDataList.class);

	@Override
	public TaxDataList getTaxForms(List<Integer> taxYears, List<String> taxForms, List<String> contentTypes,
			String uriPath, String resultType, String query) throws FDXException {
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("groupId", null);
			template = ConnectionConfigApi46.getTemplate();
			List<TaxData> taxDataListResponse = new ArrayList<>();
			TaxData taxData = new TaxData();
			TaxDataList taxDataList = new TaxDataList();
			int maxGroupId = template.queryForObject("select max(groupId) from "+ DeveloperContext.getDeveloperSchema() +".tax", parameters,
					Integer.class);
			for (int groupId = 1; groupId <= maxGroupId; groupId++) {
				parameters = new MapSqlParameterSource("groupId", groupId);
				if (taxYears == null && taxForms == null) {
					List<Tax> taxList = new ArrayList<>();
					taxList = template.query("select * from "+ DeveloperContext.getDeveloperSchema() +".tax where groupId in (:groupId)", parameters,
							new TaxRowMapper());
					TaxData taxDataResponse = new TaxData();
					if (taxList != null && taxList.size() != 0) {
						taxDataResponse = taxData.getTaxData(taxList, resultType);
						if (taxDataListResponse != null)
							taxDataListResponse.add(taxDataResponse);
					}
				} else if (taxYears == null) {
					List<Tax> taxList = new ArrayList<>();
					for (String taxFormType : taxForms) {
						taxList = template.query(
								"select * from "+ DeveloperContext.getDeveloperSchema() +".tax where taxFormType in (:taxFormType) and groupId in (:groupId)",
								new MapSqlParameterSource().addValue("taxFormType",
												TaxFormType.valueOf(taxFormType.toUpperCase()), java.sql.Types.OTHER)
										.addValue("groupId", groupId),
								new TaxRowMapper());
						TaxData taxDataResponse = new TaxData();
						if (taxList != null && taxList.size() != 0) {
							taxDataResponse = taxData.getTaxData(taxList, resultType);
							if (taxDataListResponse != null)
								taxDataListResponse.add(taxDataResponse);
						}
					}
				} else if (taxForms == null) {
					List<Tax> taxList = new ArrayList<>();
					for (int taxYear : taxYears) {
						taxList = template.query(
								"select * from "+ DeveloperContext.getDeveloperSchema() +".tax where taxYear in ('" + taxYear + "') and groupId in ('"
										+ groupId + "')",
								new MapSqlParameterSource().addValue("taxYear", taxYear).addValue("groupId", groupId),
								new TaxRowMapper());
						TaxData taxDataResponse = new TaxData();
						if (taxList != null && taxList.size() != 0) {
							taxDataResponse = taxData.getTaxData(taxList, resultType);
							if (taxDataListResponse != null)
								taxDataListResponse.add(taxDataResponse);
						}
					}
				} else {
					for (int taxYear : taxYears) {
						List<Tax> taxList = new ArrayList<>();
						StringBuffer taxFormsNew = new StringBuffer();
						for (String taxForm : taxForms) {
							taxFormsNew.append("'" + TaxFormType.valueOf(taxForm.toUpperCase()) + "',");
						}
						String taxFormsString = taxFormsNew.substring(0, taxFormsNew.length() - 1);
						taxList = template.query(
								"select * from "+ DeveloperContext.getDeveloperSchema() +".tax where taxyear in (:taxyear) and taxFormType in ("
										+ taxFormsString + ") and groupId in (:groupId)",
								new MapSqlParameterSource().addValue("taxyear", taxYear).addValue("groupId",
										groupId),
								new TaxRowMapper());
						TaxData taxDataResponse = new TaxData();
						if (taxList != null && taxList.size() != 0) {
							taxDataResponse = taxData.getTaxData(taxList, resultType);
							if (taxDataListResponse != null)
								taxDataListResponse.add(taxDataResponse);
						}
					}
				}
			}
			taxDataList.setForms(taxDataListResponse);
			PaginatedArray paginatedArray = new PaginatedArray();
			PageMetadata page = new PageMetadata();
			page.setTotalElements(taxDataListResponse.size());
			paginatedArray.setPage(page);
			taxDataList.setPaginatedArray(paginatedArray);
			if (taxDataList.getForms().isEmpty()) {
				throw new FDXException(1107);
			}
			return taxDataList;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(e,1105);
		} catch (Exception e) {
			log.error("TaxDataList : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	@Override
	public Object getTaxFormsById(String taxFormId, Object accept) throws FDXException {
		try {
			Tax tax = new Tax();
			List<Integer> distinctGroupIds = tax.getDistinctGroupId(taxFormId);
			if (distinctGroupIds.isEmpty()) {
				throw new FDXException(1105);
			}
			template = ConnectionConfigApi46.getTemplate();
			List<TaxData> taxDataListResponse = new ArrayList<>();
			TaxData taxData = new TaxData();
			TaxDataList taxDataList = new TaxDataList();
			for (Integer groupId : distinctGroupIds) {
				List<Tax> taxResponse = template.query(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax where taxFormId in (:taxFormId) and groupid in (:groupid)",
						new MapSqlParameterSource().addValue("taxFormId", taxFormId).addValue("groupid", groupId),
						new TaxRowMapper());
				taxData = taxData.getTaxDataById(taxResponse);
				taxDataListResponse.add(taxData);
			}
			taxDataList.setForms(taxDataListResponse);
			if (taxDataList.getForms().isEmpty()) {
				throw new FDXException(1105);
			}
			return taxDataList;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("TaxDataList : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	@Override
	// TODO move me to general validation code :)
	public String getStringValueOfTaxForms(List<String> taxForms) throws FDXException {
		if (taxForms != null) {
			StringBuffer taxFormsStringBuffer = new StringBuffer();
			for (String taxForm : taxForms) {
				try {
					taxFormsStringBuffer.append("'" + TaxFormType.valueOf(taxForm.toUpperCase()) + "',");
				} catch (Exception e) {
					throw new FDXException(e, 401);
				}
			}
			return taxFormsStringBuffer.toString();
		}
		return null;
	}

	@Override
	// TODO move me to general validation code :)
	public String getStringValueOfContentTypes(List<String> contentTypes) throws FDXException {
		if (contentTypes != null) {
			StringBuffer contentTypesStringBuffer = new StringBuffer();
			for (String contentType : contentTypes) {
				try {
					contentTypesStringBuffer.append("'" + ContentTypes.valueOf(contentType.toUpperCase()) + "',");
				} catch (Exception e) {
					throw new FDXException(e, 401);
				}
			}
			return contentTypesStringBuffer.toString();
		}
		return null;
	}
}
