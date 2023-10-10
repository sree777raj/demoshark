package com.fdx.api.model51.modelimpl;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.FiAttrRowMapper;
import com.fdx.api.model51.mapper.TransactionRowMapper;
import com.fdx.api.model51.model.Transaction51;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Base entity for financial transactions
 */
@ApiModel(description = "Base entity for financial transactions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
@Repository("Transaction51")
public class Transaction implements Transaction51<Object> {

	NamedParameterJdbcTemplate template;

	@Value("${server.port}")
	private int appServerPort;

	@JsonProperty("accountId")
	private String accountId;

	@JsonProperty("transactionId")
	private String transactionId;

	@JsonProperty("referenceTransactionId")
	private String referenceTransactionId;

	@JsonProperty("postedTimestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp postedTimestamp;

	@JsonProperty("transactionTimestamp")
	@JsonFormat(shape = JsonFormat.Shape.STRING, lenient = OptBoolean.FALSE)
	private java.sql.Timestamp transactionTimestamp;

	@JsonProperty("description")
	private String description;

	@JsonProperty("memo")
	private String memo;

	@JsonProperty("debitCreditMemo")
	private DebitCreditMemo debitCreditMemo;

	@JsonProperty("category")
	private String category;

	@JsonProperty("subCategory")
	private String subCategory;

	@JsonProperty("reference")
	private String reference;

	@JsonProperty("status")
	private TransactionStatus status;

	@JsonProperty("amount")
	private BigDecimal amount;

	@JsonProperty("foreignAmount")
	private BigDecimal foreignAmount;

	@JsonProperty("foreignCurrency")
	private Iso4217Code foreignCurrency;

	@JsonProperty("imageIds")
	@Valid
	private List<String> imageIds = null;

	@JsonProperty("lineItem")
	@Valid
	private List<LineItem> lineItem = null;

	@JsonProperty("fiAttributes")
	@Valid
	private List<FiAttribute> fiAttributes = null;

	@JsonProperty("links")
	private TransactionLinks links;

	@JsonProperty("reward")
	private TransactionReward reward;

	public Transaction accountId(String accountId) {
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

	public Transaction transactionId(String transactionId) {
		this.transactionId = transactionId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return transactionId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Transaction referenceTransactionId(String referenceTransactionId) {
		this.referenceTransactionId = referenceTransactionId;
		return this;
	}

	/**
	 * Value for a unique identifier
	 * 
	 * @return referenceTransactionId
	 */
	@ApiModelProperty(value = "Value for a unique identifier")

	@Size(max = 256)
	public String getReferenceTransactionId() {
		return referenceTransactionId;
	}

	public void setReferenceTransactionId(String referenceTransactionId) {
		this.referenceTransactionId = referenceTransactionId;
	}

	public Transaction postedTimestamp(java.sql.Timestamp postedTimestamp) {
		this.postedTimestamp = postedTimestamp;
		return this;
	}

	/**
	 * Get postedTimestamp
	 * 
	 * @return postedTimestamp
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getPostedTimestamp() {
		return postedTimestamp;
	}

	public void setPostedTimestamp(java.sql.Timestamp postedTimestamp) {
		this.postedTimestamp = postedTimestamp;
	}

	public Transaction transactionTimestamp(java.sql.Timestamp transactionTimestamp) {
		this.transactionTimestamp = transactionTimestamp;
		return this;
	}

	/**
	 * Get transactionTimestamp
	 * 
	 * @return transactionTimestamp
	 */
	@ApiModelProperty(value = "")

	@Valid

	public java.sql.Timestamp getTransactionTimestamp() {
		return transactionTimestamp;
	}

	public void setTransactionTimestamp(java.sql.Timestamp transactionTimestamp) {
		this.transactionTimestamp = transactionTimestamp;
	}

	public Transaction description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * The description of the transaction
	 * 
	 * @return description
	 */
	@ApiModelProperty(value = "The description of the transaction")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Transaction memo(String memo) {
		this.memo = memo;
		return this;
	}

	/**
	 * String of maximum length 255
	 * 
	 * @return memo
	 */
	@ApiModelProperty(value = "String of maximum length 255")

	@Size(max = 255)
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Transaction debitCreditMemo(DebitCreditMemo debitCreditMemo) {
		this.debitCreditMemo = debitCreditMemo;
		return this;
	}

	/**
	 * Get debitCreditMemo
	 * 
	 * @return debitCreditMemo
	 */
	@ApiModelProperty(value = "")

	@Valid

	public DebitCreditMemo getDebitCreditMemo() {
		return debitCreditMemo;
	}

	public void setDebitCreditMemo(DebitCreditMemo debitCreditMemo) {
		this.debitCreditMemo = debitCreditMemo;
	}

	public Transaction category(String category) {
		this.category = category;
		return this;
	}

	/**
	 * Transaction category, preferably MCC or SIC.
	 * 
	 * @return category
	 */
	@ApiModelProperty(value = "Transaction category, preferably MCC or SIC.")

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Transaction subCategory(String subCategory) {
		this.subCategory = subCategory;
		return this;
	}

	/**
	 * Transaction category detail
	 * 
	 * @return subCategory
	 */
	@ApiModelProperty(value = "Transaction category detail")

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public Transaction reference(String reference) {
		this.reference = reference;
		return this;
	}

	/**
	 * A tracking reference identifier
	 * 
	 * @return reference
	 */
	@ApiModelProperty(value = "A tracking reference identifier")

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Transaction status(TransactionStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TransactionStatus getStatus() {
		return status;
	}

	public void setStatus(TransactionStatus status) {
		this.status = status;
	}

	public Transaction amount(BigDecimal amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * The amount of money in the account currency
	 * 
	 * @return amount
	 */
	@ApiModelProperty(value = "The amount of money in the account currency")

	@Valid

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Transaction foreignAmount(BigDecimal foreignAmount) {
		this.foreignAmount = foreignAmount;
		return this;
	}

	/**
	 * The amount of money in the foreign currency
	 * 
	 * @return foreignAmount
	 */
	@ApiModelProperty(value = "The amount of money in the foreign currency")

	@Valid

	public BigDecimal getForeignAmount() {
		return foreignAmount;
	}

	public void setForeignAmount(BigDecimal foreignAmount) {
		this.foreignAmount = foreignAmount;
	}

	public Transaction foreignCurrency(Iso4217Code foreignCurrency) {
		this.foreignCurrency = foreignCurrency;
		return this;
	}

	/**
	 * Get foreignCurrency
	 * 
	 * @return foreignCurrency
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Iso4217Code getForeignCurrency() {
		return foreignCurrency;
	}

	public void setForeignCurrency(Iso4217Code foreignCurrency) {
		this.foreignCurrency = foreignCurrency;
	}

	public Transaction imageIds(List<String> imageIds) {
		this.imageIds = imageIds;
		return this;
	}

	public Transaction addImageIdsItem(String imageIdsItem) {
		if (this.imageIds == null) {
			this.imageIds = new ArrayList<>();
		}
		this.imageIds.add(imageIdsItem);
		return this;
	}

	/**
	 * Array of Image Identifiers (unique to this transaction) used to retrieve
	 * Images of check or transaction receipt
	 * 
	 * @return imageIds
	 */
	@ApiModelProperty(value = "Array of Image Identifiers (unique to this transaction) used to retrieve Images of check or transaction receipt")

	public List<String> getImageIds() {
		return imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;
	}

	public Transaction lineItem(List<LineItem> lineItem) {
		this.lineItem = lineItem;
		return this;
	}

	public Transaction addLineItemItem(LineItem lineItemItem) {
		if (this.lineItem == null) {
			this.lineItem = new ArrayList<>();
		}
		this.lineItem.add(lineItemItem);
		return this;
	}

	/**
	 * Breakdown of the transaction details
	 * 
	 * @return lineItem
	 */
	@ApiModelProperty(value = "Breakdown of the transaction details")

	@Valid

	public List<LineItem> getLineItem() {
		return lineItem;
	}

	public void setLineItem(List<LineItem> lineItem) {
		this.lineItem = lineItem;
	}

	public Transaction fiAttributes(List<FiAttribute> fiAttributes) {
		this.fiAttributes = fiAttributes;
		return this;
	}

	public Transaction addFiAttributesItem(FiAttribute fiAttributesItem) {
		if (this.fiAttributes == null) {
			this.fiAttributes = new ArrayList<>();
		}
		this.fiAttributes.add(fiAttributesItem);
		return this;
	}

	/**
	 * Array of FI-specific attributes
	 * 
	 * @return fiAttributes
	 */
	@ApiModelProperty(value = "Array of FI-specific attributes")

	@Valid

	public List<FiAttribute> getFiAttributes() {
		return fiAttributes;
	}

	public void setFiAttributes(List<FiAttribute> fiAttributes) {
		this.fiAttributes = fiAttributes;
	}

	public Transaction links(TransactionLinks links) {
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

	public TransactionLinks getLinks() {
		return links;
	}

	public void setLinks(TransactionLinks links) {
		this.links = links;
	}

	public TransactionReward getReward() {
		return reward;
	}

	public void setReward(TransactionReward reward) {
		this.reward = reward;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Transaction transaction = (Transaction) o;
		return Objects.equals(this.accountId, transaction.accountId)
				&& Objects.equals(this.transactionId, transaction.transactionId)
				&& Objects.equals(this.referenceTransactionId, transaction.referenceTransactionId)
				&& Objects.equals(this.postedTimestamp, transaction.postedTimestamp)
				&& Objects.equals(this.transactionTimestamp, transaction.transactionTimestamp)
				&& Objects.equals(this.description, transaction.description)
				&& Objects.equals(this.memo, transaction.memo)
				&& Objects.equals(this.debitCreditMemo, transaction.debitCreditMemo)
				&& Objects.equals(this.category, transaction.category)
				&& Objects.equals(this.subCategory, transaction.subCategory)
				&& Objects.equals(this.reference, transaction.reference)
				&& Objects.equals(this.status, transaction.status) && Objects.equals(this.amount, transaction.amount)
				&& Objects.equals(this.foreignAmount, transaction.foreignAmount)
				&& Objects.equals(this.foreignCurrency, transaction.foreignCurrency)
				&& Objects.equals(this.imageIds, transaction.imageIds)
				&& Objects.equals(this.lineItem, transaction.lineItem)
				&& Objects.equals(this.fiAttributes, transaction.fiAttributes)
				&& Objects.equals(this.links, transaction.links);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountId, transactionId, referenceTransactionId, postedTimestamp, transactionTimestamp,
				description, memo, debitCreditMemo, category, subCategory, reference, status, amount, foreignAmount,
				foreignCurrency, imageIds, lineItem, fiAttributes, links);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Transaction {\n");

		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
		sb.append("    referenceTransactionId: ").append(toIndentedString(referenceTransactionId)).append("\n");
		sb.append("    postedTimestamp: ").append(toIndentedString(postedTimestamp)).append("\n");
		sb.append("    transactionTimestamp: ").append(toIndentedString(transactionTimestamp)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
		sb.append("    debitCreditMemo: ").append(toIndentedString(debitCreditMemo)).append("\n");
		sb.append("    category: ").append(toIndentedString(category)).append("\n");
		sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
		sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("    foreignAmount: ").append(toIndentedString(foreignAmount)).append("\n");
		sb.append("    foreignCurrency: ").append(toIndentedString(foreignCurrency)).append("\n");
		sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
		sb.append("    lineItem: ").append(toIndentedString(lineItem)).append("\n");
		sb.append("    fiAttributes: ").append(toIndentedString(fiAttributes)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(Transaction.class);

	public Transaction getTransaction(String transactionId, String accountId, LocalDate startTime, LocalDate endTime)
			throws FDXException {
		Transaction transaction = new Transaction();
		try {
			SqlParameterSource parameters = new MapSqlParameterSource("transactionId", transactionId);
			template = ConnectionConfigApi51.getTemplate();
			try {
				StringBuffer transactionQuery = new StringBuffer();
				transactionQuery.append(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".transaction where transactionid in (:transactionId) and accountid in (:accountId)");
				if (startTime != null & endTime != null) {
					transactionQuery.append(" and transactiontimestamp between (:startTime) and (:endTime)");
					transaction = template.queryForObject(transactionQuery.toString(),
							new MapSqlParameterSource().addValue("transactionId", transactionId)
									.addValue("accountId", accountId).addValue("startTime", startTime)
									.addValue("endTime", endTime),
							new TransactionRowMapper());
				} else
					transaction = template.queryForObject(
							transactionQuery.toString(), new MapSqlParameterSource()
									.addValue("transactionId", transactionId).addValue("accountId", accountId),
							new TransactionRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Transaction not found", 0);
			}
			if (transaction.getLineItem() != null) {
				List<LineItem> lineItemList = transaction.getLineItem();
				List<LineItem> lineItemListNew = new ArrayList<>();
				if (transaction.getLineItem() != null) {
					for (LineItem lineItemIterator : lineItemList) {
						LineItem lineItem = lineItemIterator.getLineItem(lineItemIterator.getLineItemId());
						lineItemListNew.add(lineItem);
					}
					transaction.setLineItem(lineItemListNew);
				}
			}
			// FIAttributes start
			if (transaction.getFiAttributes() != null) {
				List<FiAttribute> fiAttrList = transaction.getFiAttributes();
				List<FiAttribute> fiAttrListNew = new ArrayList<>();
				for (FiAttribute fiAttribute : fiAttrList) {
					FiAttrEntity fiAttrEntity = new FiAttrEntity();
					FiAttribute fiAttributeNew = new FiAttribute();
					int name = Integer.valueOf(fiAttribute.getName()).intValue();
					parameters = new MapSqlParameterSource("fiAttributes", name);
					try {
						fiAttrEntity = (FiAttrEntity) template.queryForObject(
								"select * from "+ DeveloperContext.getDeveloperSchema() +".fiattribute where attrid in (:fiAttributes)", parameters,
								new FiAttrRowMapper());
					} catch (EmptyResultDataAccessException e) {
						throw new FDXException("Fi Attribute not found", 0);
					}
					fiAttributeNew.setName(fiAttrEntity.getName());
					fiAttributeNew.setValue(fiAttrEntity.getValue());
					fiAttrListNew.add(fiAttributeNew);
				}
				transaction.setFiAttributes(fiAttrListNew);
			}
			if (transaction.getReward() != null) {
				TransactionReward transactionReward = new TransactionReward();
				if (transaction.getReward() != null) {
					transactionReward = transactionReward.getReward(transaction.getReward().getRewardId());
				}
				transaction.setReward(transactionReward);
			}
			if (transaction.getLinks() != null) {
				TransactionLinks transactionLinks = new TransactionLinks();
				HateoasLink hateoasLink = new HateoasLink();
				List<HateoasLink> hateoasLinkList = new ArrayList<>();
				if (transaction.getLinks() != null) {
					for (HateoasLink hateoasLinkIterator : transaction.getLinks().getImage()) {
						hateoasLink = transaction.getLinks().getLinks(hateoasLinkIterator);
						hateoasLinkList.add(hateoasLink);
					}
					transactionLinks.setImage(hateoasLinkList);
					transaction.setLinks(transactionLinks);
				}
			}
			return transaction;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Transaction : ", e);
			throw new FDXException(e,500);
		}
	}

	@Override
	public Object getTransactionImage(String accountId, String imageId) throws FDXException {
		try {
			template = ConnectionConfigApi51.getTemplate();
			List<String> hateoasLinkList = new ArrayList<>();
			HateoasLink hateoasLink = new HateoasLink();
			Transaction transaction;
			int count = template.queryForObject(
					"select count(*) from "+ DeveloperContext.getDeveloperSchema() +".transaction where accountid in (:accountId)",
					new MapSqlParameterSource().addValue("accountId", accountId), Integer.class);
			if (count == 0) {
				throw new FDXException(701);
			}
			try {
				transaction = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".transaction where accountId=(:accountId) and (:imageIds)=ANY(imageIds)",
						new MapSqlParameterSource().addValue("imageIds", imageId).addValue("accountId", accountId),
						new TransactionRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException(e,406);
			}
			int i = transaction.getImageIds().indexOf(imageId);
			for (HateoasLink hateoasLinkIterator : transaction.getLinks().getImage()) {
				hateoasLink = transaction.getLinks().getLinks(hateoasLinkIterator);
				hateoasLinkList.add(hateoasLink.getHref());
			}
			StringBuffer hrefString = new StringBuffer();
			if (i < hateoasLinkList.size()) {
				String href = hateoasLinkList.get(i);
				final URI u = new URI(hateoasLinkList.get(i));
				InetAddress inetAddress = InetAddress.getLocalHost();
				if (!u.isAbsolute()) {
					hrefString.append("http://" + inetAddress.getHostName() + ":" + appServerPort + "/fdxapi/" + href);
					return hrefString.toString();
				}
				return href;
			}
			return "";
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Transaction : ", e);
			throw new FDXException(e,500);
		}
	}

	public Map<String, Object> postTransaction() throws FDXException {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		try {
			template = ConnectionConfigApi51.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("paymentId", null);
			String sql = "insert into "+ DeveloperContext.getDeveloperSchema() +".transaction (accountid,transactionId,postedtimestamp,transactiontimestamp,description,debitcreditmemo,memo,status,amount) values ("
					+ ((accountId != null) ? ("'" + accountId + "'") : null) + ","
					+ ((transactionId != null) ? ("'" + transactionId + "'") : null) + ","
					+ ((postedTimestamp != null) ? ("'" + postedTimestamp + "'") : null) + ","
					+ ((transactionTimestamp != null) ? ("'" + transactionTimestamp + "'") : null) + ","
					+ ((description != null) ? ("'" + description + "'") : null) + ","
					+ ((debitCreditMemo != null) ? ("'" + debitCreditMemo + "'") : null) + ","
					+ ((memo != null) ? ("'" + memo + "'") : null) + ","
					+ ((status != null) ? ("'" + status + "'") : null) + "," + amount + ")";
			int count = template.update(sql, parameters, keyHolder);
			return keyHolder.getKeys();
		} catch (Exception e) {
			log.error("Transaction : ", e);
			throw new FDXException(e,500);
		}
	}

	public int getTransactionCount(String accountId, LocalDate startTime, LocalDate endTime){
		template = ConnectionConfigApi51.getTemplate();
		return template.queryForObject(
				"select count(*) from "+ DeveloperContext.getDeveloperSchema() +".transaction where accountid in (:accountId) and transactiontimestamp between (:startTime) and (:endTime)",
				new MapSqlParameterSource().addValue("accountId", accountId).addValue("startTime", startTime)
						.addValue("endTime", endTime), Integer.class);
	}
	
	public List<String> getUniqueAccountIdsFromTransaction(List<String> accountIds, LocalDate startTime, LocalDate endTime, int limit, String offset) {
		template = ConnectionConfigApi51.getTemplate();
		if (accountIds != null)
			return template.queryForList(
					"select  DISTINCT accountid from "+ DeveloperContext.getDeveloperSchema() +".transaction where accountid in (:accountId) and  " +
							"transactiontimestamp between (:startTime) and (:endTime) order by accountid limit " + limit + " offset " + offset,
					new MapSqlParameterSource().addValue("accountId", accountIds).addValue("startTime", startTime).addValue("endTime", endTime), String.class);
		else
			return template.queryForList(
					"select  DISTINCT accountid from "+ DeveloperContext.getDeveloperSchema() +".transaction where transactiontimestamp between " +
							"(:startTime) and (:endTime) order by accountid limit " + limit + " offset " + offset,
					new MapSqlParameterSource().addValue("startTime", startTime).addValue("endTime", endTime), String.class);
	}
}