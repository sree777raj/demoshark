package com.fdx.api.model46.modelimpl;

import com.fdx.common.exception.Errors;
import com.fdx.common.exception.FDXException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fdx.common.exception.FDXException;

import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.HateoasLinkRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * REST application constraint (Hypermedia As The Engine Of Application State)
 */
@ApiModel(description = "REST application constraint (Hypermedia As The Engine Of Application State)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class HateoasLink {

	NamedParameterJdbcTemplate template;

	@JsonProperty(access = Access.WRITE_ONLY)
	private int hateoasLinkId;

	@JsonProperty("href")
	private String href;

	/**
	 * HTTP Method to use for the request
	 */
	public enum ActionEnum {
		GET("GET"),

		POST("POST"),

		PATCH("PATCH"),

		DELETE("DELETE"),

		PUT("PUT");

		private String value;

		ActionEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static ActionEnum fromValue(String value) {
			for (ActionEnum b : ActionEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			throw new IllegalArgumentException(new FDXException("Unexpected value '" + value + "'",401));
		}
	}

	@JsonProperty("action")
	private ActionEnum action;

	@JsonProperty("types")
	@Valid
	private List<ContentTypes> types = null;

	public HateoasLink href(String href) {
		this.href = href;
		return this;
	}

	/**
	 * URL to invoke the action on the resource
	 * 
	 * @return href
	 */
	@ApiModelProperty(example = "https://api.fi.com/fdx/v4/accounts/12345", required = true, value = "URL to invoke the action on the resource")
	@NotNull

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public HateoasLink action(ActionEnum action) {
		this.action = action;
		return this;
	}

	/**
	 * HTTP Method to use for the request
	 * 
	 * @return action
	 */
	@ApiModelProperty(value = "HTTP Method to use for the request")

	public ActionEnum getAction() {
		return action;
	}

	public void setAction(ActionEnum action) {
		this.action = action;
	}

	public HateoasLink types(List<ContentTypes> types) {
		this.types = types;
		return this;
	}

	public HateoasLink addTypesItem(ContentTypes typesItem) {
		if (this.types == null) {
			this.types = new ArrayList<>();
		}
		this.types.add(typesItem);
		return this;
	}

	/**
	 * Content-types that can be used in the Accept header
	 * 
	 * @return types
	 */
	@ApiModelProperty(value = "Content-types that can be used in the Accept header")

	@Valid

	public List<ContentTypes> getTypes() {
		return types;
	}

	public void setTypes(List<ContentTypes> types) {
		this.types = types;
	}

	public int getHateoasLinkId() {
		return hateoasLinkId;
	}

	public void setHateoasLinkId(int hateoasLinkId) {
		this.hateoasLinkId = hateoasLinkId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HateoasLink hateoasLink = (HateoasLink) o;
		return Objects.equals(this.href, hateoasLink.href) && Objects.equals(this.action, hateoasLink.action)
				&& Objects.equals(this.types, hateoasLink.types);
	}

	@Override
	public int hashCode() {
		return Objects.hash(href, action, types);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HateoasLink {\n");

		sb.append("    href: ").append(toIndentedString(href)).append("\n");
		sb.append("    action: ").append(toIndentedString(action)).append("\n");
		sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(HateoasLink.class);

	public HateoasLink getHateoasLinks(int hateoasLinkId) throws FDXException {
		template = ConnectionConfigApi46.getTemplate();;
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("hateoasLinkId", hateoasLinkId);
			return template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".hateoasLink where linkid in (:hateoasLinkId)", parameters,
					new HateoasLinkRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new FDXException(Errors.HATEOAS_LINK_NOT_FOUND, 0);
		} catch (Exception e) {
			log.error("HateoasLinks : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

	public Map<String, Object> addImages() throws FDXException {
		
//		Connection connection = config.getConnection();
		KeyHolder keyHolder = new GeneratedKeyHolder();

		try {
			int i = 0;
			List<ContentTypes> contenttypesArrayList = null;
			if (types != null) {
				ContentTypes[] contenttypesArrayKeyList = new ContentTypes[types.size()];
				for (ContentTypes contentTypeIterator : types) {
					contenttypesArrayKeyList[i++] = contentTypeIterator;
				}
				contenttypesArrayList = Arrays.asList(contenttypesArrayKeyList);
			}

			SqlParameterSource parameters = new MapSqlParameterSource("hateoasLinkId", hateoasLinkId);
			int count = template.update(
					"insert into "+ DeveloperContext.getDeveloperSchema() +".hateoasLink (href,action,types) values ("
							+ ((href != null) ? ("'" + href + "'") : null) + ","
							+ ((action != null) ? ("'" + action + "'") : null) + ","
							+ (contenttypesArrayList != null ? ("array" + contenttypesArrayList + "") : null) + ") ",
					parameters, keyHolder);
			return keyHolder.getKeys();

		} catch (Exception e) {
			log.error("HateoasLinks : ", e);
			throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
