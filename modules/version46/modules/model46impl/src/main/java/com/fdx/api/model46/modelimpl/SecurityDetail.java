package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.SecurityDetailRowMapper;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tax information for a single security transaction
 */
@ApiModel(description = "Tax information for a single security transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class SecurityDetail {

	NamedParameterJdbcTemplate template;

	@JsonProperty("securitydetailid")
	private int securitydetailid;

	@JsonProperty("checkboxOnForm8949")
	private String checkboxOnForm8949;

	@JsonProperty("securityName")
	private String securityName;

	@JsonProperty("numberOfShares")
	private Double numberOfShares;

	@JsonProperty("saleDescription")
	private String saleDescription;

	@JsonProperty("dateAcquired")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateAcquired;

	@JsonProperty("variousDatesAcquired")
	@JsonInclude(Include.NON_NULL)
	private Boolean variousDatesAcquired;

	@JsonProperty("dateOfSale")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateOfSale;

	@JsonProperty("salesPrice")
	private Double salesPrice;

	@JsonProperty("accruedMarketDiscount")
	private Double accruedMarketDiscount;

	@JsonProperty("adjustmentCodes")
	@Valid
	private List<CodeAmount> adjustmentCodes = null;

	@JsonProperty("costBasis")
	private Double costBasis;

	@JsonProperty("washSaleLossDisallowed")
	private Double washSaleLossDisallowed;

	@JsonProperty("longOrShort")
	private SaleTermType longOrShort;

	@JsonProperty("ordinary")
	@JsonInclude(Include.NON_NULL)
	private Boolean ordinary;

	@JsonProperty("collectible")
	@JsonInclude(Include.NON_NULL)
	private Boolean collectible;

	@JsonProperty("qof")
	@JsonInclude(Include.NON_NULL)
	private Boolean qof;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("noncoveredSecurity")
	@JsonInclude(Include.NON_NULL)
	private Boolean noncoveredSecurity;

	@JsonProperty("grossOrNet")
	private SaleProceedsType grossOrNet;

	@JsonProperty("lossNotAllowed")
	@JsonInclude(Include.NON_NULL)
	private Boolean lossNotAllowed;

	@JsonProperty("basisReported")
	@JsonInclude(Include.NON_NULL)
	private Boolean basisReported;

	@JsonProperty("stateTaxWithholding")
	@Valid
	private List<StateTaxWithholding> stateTaxWithholding = null;

	@JsonProperty("cusip")
	private String cusip;

	@JsonProperty("foreignAccountTaxCompliance")
	@JsonInclude(Include.NON_NULL)
	private Boolean foreignAccountTaxCompliance;

	public SecurityDetail checkboxOnForm8949(String checkboxOnForm8949) {
		this.checkboxOnForm8949 = checkboxOnForm8949;
		return this;
	}

	/**
	 * Applicable checkbox on Form 8949
	 * 
	 * @return checkboxOnForm8949
	 */
	@ApiModelProperty(value = "Applicable checkbox on Form 8949")

	public String getCheckboxOnForm8949() {
		return checkboxOnForm8949;
	}

	public void setCheckboxOnForm8949(String checkboxOnForm8949) {
		this.checkboxOnForm8949 = checkboxOnForm8949;
	}

	public SecurityDetail securityName(String securityName) {
		this.securityName = securityName;
		return this;
	}

	/**
	 * Security name
	 * 
	 * @return securityName
	 */
	@ApiModelProperty(value = "Security name")

	public String getSecurityName() {
		return securityName;
	}

	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}

	public SecurityDetail numberOfShares(Double numberOfShares) {
		this.numberOfShares = numberOfShares;
		return this;
	}

	/**
	 * Number of shares
	 * 
	 * @return numberOfShares
	 */
	@ApiModelProperty(value = "Number of shares")

	public Double getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(Double numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public SecurityDetail saleDescription(String saleDescription) {
		this.saleDescription = saleDescription;
		return this;
	}

	/**
	 * Box 1a, Description of property
	 * 
	 * @return saleDescription
	 */
	@ApiModelProperty(value = "Box 1a, Description of property")

	public String getSaleDescription() {
		return saleDescription;
	}

	public void setSaleDescription(String saleDescription) {
		this.saleDescription = saleDescription;
	}

	public SecurityDetail dateAcquired(Date dateAcquired) {
		this.dateAcquired = dateAcquired;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return dateAcquired
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public Date getDateAcquired() {
		return dateAcquired;
	}

	public void setDateAcquired(Date dateAcquired) {
		this.dateAcquired = dateAcquired;
	}

	public SecurityDetail variousDatesAcquired(Boolean variousDatesAcquired) {
		this.variousDatesAcquired = variousDatesAcquired;
		return this;
	}

	/**
	 * Box 1b, Date acquired Various
	 * 
	 * @return variousDatesAcquired
	 */
	@ApiModelProperty(value = "Box 1b, Date acquired Various")

	public Boolean getVariousDatesAcquired() {
		return variousDatesAcquired;
	}

	public void setVariousDatesAcquired(Boolean variousDatesAcquired) {
		this.variousDatesAcquired = variousDatesAcquired;
	}

	public SecurityDetail dateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
		return this;
	}

	/**
	 * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included
	 * according to [IETF RFC3339]
	 * (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
	 * 
	 * @return dateOfSale
	 */
	@ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

	@Valid
	@Size(max = 10)
	public Date getDateOfSale() {
		return dateOfSale;
	}

	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

	public SecurityDetail salesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
		return this;
	}

	/**
	 * Box 1d, Proceeds (not price per share)
	 * 
	 * @return salesPrice
	 */
	@ApiModelProperty(value = "Box 1d, Proceeds (not price per share)")

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public SecurityDetail accruedMarketDiscount(Double accruedMarketDiscount) {
		this.accruedMarketDiscount = accruedMarketDiscount;
		return this;
	}

	/**
	 * Box 1f, Accrued market discount
	 * 
	 * @return accruedMarketDiscount
	 */
	@ApiModelProperty(value = "Box 1f, Accrued market discount")

	public Double getAccruedMarketDiscount() {
		return accruedMarketDiscount;
	}

	public void setAccruedMarketDiscount(Double accruedMarketDiscount) {
		this.accruedMarketDiscount = accruedMarketDiscount;
	}

	public SecurityDetail adjustmentCodes(List<CodeAmount> adjustmentCodes) {
		this.adjustmentCodes = adjustmentCodes;
		return this;
	}

	public SecurityDetail addAdjustmentCodesItem(CodeAmount adjustmentCodesItem) {
		if (this.adjustmentCodes == null) {
			this.adjustmentCodes = new ArrayList<>();
		}
		this.adjustmentCodes.add(adjustmentCodesItem);
		return this;
	}

	/**
	 * Other adjustments (code and amount)
	 * 
	 * @return adjustmentCodes
	 */
	@ApiModelProperty(value = "Other adjustments (code and amount)")

	@Valid

	public List<CodeAmount> getAdjustmentCodes() {
		return adjustmentCodes;
	}

	public void setAdjustmentCodes(List<CodeAmount> adjustmentCodes) {
		this.adjustmentCodes = adjustmentCodes;
	}

	public SecurityDetail costBasis(Double costBasis) {
		this.costBasis = costBasis;
		return this;
	}

	/**
	 * Box 1e, Cost or other basis
	 * 
	 * @return costBasis
	 */
	@ApiModelProperty(value = "Box 1e, Cost or other basis")

	public Double getCostBasis() {
		return costBasis;
	}

	public void setCostBasis(Double costBasis) {
		this.costBasis = costBasis;
	}

	public SecurityDetail washSaleLossDisallowed(Double washSaleLossDisallowed) {
		this.washSaleLossDisallowed = washSaleLossDisallowed;
		return this;
	}

	/**
	 * Box 1g, Wash sale loss disallowed
	 * 
	 * @return washSaleLossDisallowed
	 */
	@ApiModelProperty(value = "Box 1g, Wash sale loss disallowed")

	public Double getWashSaleLossDisallowed() {
		return washSaleLossDisallowed;
	}

	public void setWashSaleLossDisallowed(Double washSaleLossDisallowed) {
		this.washSaleLossDisallowed = washSaleLossDisallowed;
	}

	public SecurityDetail longOrShort(SaleTermType longOrShort) {
		this.longOrShort = longOrShort;
		return this;
	}

	/**
	 * Get longOrShort
	 * 
	 * @return longOrShort
	 */
	@ApiModelProperty(value = "")

	@Valid

	public SaleTermType getLongOrShort() {
		return longOrShort;
	}

	public void setLongOrShort(SaleTermType longOrShort) {
		this.longOrShort = longOrShort;
	}

	public SecurityDetail ordinary(Boolean ordinary) {
		this.ordinary = ordinary;
		return this;
	}

	/**
	 * Box 2, Ordinary
	 * 
	 * @return ordinary
	 */
	@ApiModelProperty(value = "Box 2, Ordinary")

	public Boolean getOrdinary() {
		return ordinary;
	}

	public void setOrdinary(Boolean ordinary) {
		this.ordinary = ordinary;
	}

	public SecurityDetail collectible(Boolean collectible) {
		this.collectible = collectible;
		return this;
	}

	/**
	 * Box 3, Collectibles
	 * 
	 * @return collectible
	 */
	@ApiModelProperty(value = "Box 3, Collectibles")

	public Boolean getCollectible() {
		return collectible;
	}

	public void setCollectible(Boolean collectible) {
		this.collectible = collectible;
	}

	public SecurityDetail qof(Boolean qof) {
		this.qof = qof;
		return this;
	}

	/**
	 * Box 3, Qualified Opportunity Fund (QOF)
	 * 
	 * @return qof
	 */
	@ApiModelProperty(value = "Box 3, Qualified Opportunity Fund (QOF)")

	public Boolean getQof() {
		return qof;
	}

	public void setQof(Boolean qof) {
		this.qof = qof;
	}

	public SecurityDetail federalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
		return this;
	}

	/**
	 * Box 4, Federal income tax withheld
	 * 
	 * @return federalTaxWithheld
	 */
	@ApiModelProperty(value = "Box 4, Federal income tax withheld")

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public SecurityDetail noncoveredSecurity(Boolean noncoveredSecurity) {
		this.noncoveredSecurity = noncoveredSecurity;
		return this;
	}

	/**
	 * Box 5, Noncovered security
	 * 
	 * @return noncoveredSecurity
	 */
	@ApiModelProperty(value = "Box 5, Noncovered security")

	public Boolean getNoncoveredSecurity() {
		return noncoveredSecurity;
	}

	public void setNoncoveredSecurity(Boolean noncoveredSecurity) {
		this.noncoveredSecurity = noncoveredSecurity;
	}

	public SecurityDetail grossOrNet(SaleProceedsType grossOrNet) {
		this.grossOrNet = grossOrNet;
		return this;
	}

	/**
	 * Get grossOrNet
	 * 
	 * @return grossOrNet
	 */
	@ApiModelProperty(value = "")

	@Valid

	public SaleProceedsType getGrossOrNet() {
		return grossOrNet;
	}

	public void setGrossOrNet(SaleProceedsType grossOrNet) {
		this.grossOrNet = grossOrNet;
	}

	public SecurityDetail lossNotAllowed(Boolean lossNotAllowed) {
		this.lossNotAllowed = lossNotAllowed;
		return this;
	}

	/**
	 * Box 7, Loss not allowed based on proceeds
	 * 
	 * @return lossNotAllowed
	 */
	@ApiModelProperty(value = "Box 7, Loss not allowed based on proceeds")

	public Boolean getLossNotAllowed() {
		return lossNotAllowed;
	}

	public void setLossNotAllowed(Boolean lossNotAllowed) {
		this.lossNotAllowed = lossNotAllowed;
	}

	public SecurityDetail basisReported(Boolean basisReported) {
		this.basisReported = basisReported;
		return this;
	}

	/**
	 * Box 12, Basis reported to IRS
	 * 
	 * @return basisReported
	 */
	@ApiModelProperty(value = "Box 12, Basis reported to IRS")

	public Boolean getBasisReported() {
		return basisReported;
	}

	public void setBasisReported(Boolean basisReported) {
		this.basisReported = basisReported;
	}

	public SecurityDetail stateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
		return this;
	}

	public SecurityDetail addStateTaxWithholdingItem(StateTaxWithholding stateTaxWithholdingItem) {
		if (this.stateTaxWithholding == null) {
			this.stateTaxWithholding = new ArrayList<>();
		}
		this.stateTaxWithholding.add(stateTaxWithholdingItem);
		return this;
	}

	/**
	 * Boxes 14-16, State withholding
	 * 
	 * @return stateTaxWithholding
	 */
	@ApiModelProperty(value = "Boxes 14-16, State withholding")

	@Valid

	public List<StateTaxWithholding> getStateTaxWithholding() {
		return stateTaxWithholding;
	}

	public void setStateTaxWithholding(List<StateTaxWithholding> stateTaxWithholding) {
		this.stateTaxWithholding = stateTaxWithholding;
	}

	public SecurityDetail cusip(String cusip) {
		this.cusip = cusip;
		return this;
	}

	/**
	 * CUSIP number
	 * 
	 * @return cusip
	 */
	@ApiModelProperty(value = "CUSIP number")

	public String getCusip() {
		return cusip;
	}

	public void setCusip(String cusip) {
		this.cusip = cusip;
	}

	public SecurityDetail foreignAccountTaxCompliance(Boolean foreignAccountTaxCompliance) {
		this.foreignAccountTaxCompliance = foreignAccountTaxCompliance;
		return this;
	}

	/**
	 * Foreign account tax compliance
	 * 
	 * @return foreignAccountTaxCompliance
	 */
	@ApiModelProperty(value = "Foreign account tax compliance")

	public Boolean getForeignAccountTaxCompliance() {
		return foreignAccountTaxCompliance;
	}

	public void setForeignAccountTaxCompliance(Boolean foreignAccountTaxCompliance) {
		this.foreignAccountTaxCompliance = foreignAccountTaxCompliance;
	}

	public int getSecuritydetailid() {
		return securitydetailid;
	}

	public void setSecuritydetailid(int securitydetailid) {
		this.securitydetailid = securitydetailid;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SecurityDetail securityDetail = (SecurityDetail) o;
		return Objects.equals(this.checkboxOnForm8949, securityDetail.checkboxOnForm8949)
				&& Objects.equals(this.securityName, securityDetail.securityName)
				&& Objects.equals(this.numberOfShares, securityDetail.numberOfShares)
				&& Objects.equals(this.saleDescription, securityDetail.saleDescription)
				&& Objects.equals(this.dateAcquired, securityDetail.dateAcquired)
				&& Objects.equals(this.variousDatesAcquired, securityDetail.variousDatesAcquired)
				&& Objects.equals(this.dateOfSale, securityDetail.dateOfSale)
				&& Objects.equals(this.salesPrice, securityDetail.salesPrice)
				&& Objects.equals(this.accruedMarketDiscount, securityDetail.accruedMarketDiscount)
				&& Objects.equals(this.adjustmentCodes, securityDetail.adjustmentCodes)
				&& Objects.equals(this.costBasis, securityDetail.costBasis)
				&& Objects.equals(this.washSaleLossDisallowed, securityDetail.washSaleLossDisallowed)
				&& Objects.equals(this.longOrShort, securityDetail.longOrShort)
				&& Objects.equals(this.ordinary, securityDetail.ordinary)
				&& Objects.equals(this.collectible, securityDetail.collectible)
				&& Objects.equals(this.qof, securityDetail.qof)
				&& Objects.equals(this.federalTaxWithheld, securityDetail.federalTaxWithheld)
				&& Objects.equals(this.noncoveredSecurity, securityDetail.noncoveredSecurity)
				&& Objects.equals(this.grossOrNet, securityDetail.grossOrNet)
				&& Objects.equals(this.lossNotAllowed, securityDetail.lossNotAllowed)
				&& Objects.equals(this.basisReported, securityDetail.basisReported)
				&& Objects.equals(this.stateTaxWithholding, securityDetail.stateTaxWithholding)
				&& Objects.equals(this.cusip, securityDetail.cusip)
				&& Objects.equals(this.foreignAccountTaxCompliance, securityDetail.foreignAccountTaxCompliance);
	}

	@Override
	public int hashCode() {
		return Objects.hash(checkboxOnForm8949, securityName, numberOfShares, saleDescription, dateAcquired,
				variousDatesAcquired, dateOfSale, salesPrice, accruedMarketDiscount, adjustmentCodes, costBasis,
				washSaleLossDisallowed, longOrShort, ordinary, collectible, qof, federalTaxWithheld, noncoveredSecurity,
				grossOrNet, lossNotAllowed, basisReported, stateTaxWithholding, cusip, foreignAccountTaxCompliance);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SecurityDetail {\n");

		sb.append("    checkboxOnForm8949: ").append(toIndentedString(checkboxOnForm8949)).append("\n");
		sb.append("    securityName: ").append(toIndentedString(securityName)).append("\n");
		sb.append("    numberOfShares: ").append(toIndentedString(numberOfShares)).append("\n");
		sb.append("    saleDescription: ").append(toIndentedString(saleDescription)).append("\n");
		sb.append("    dateAcquired: ").append(toIndentedString(dateAcquired)).append("\n");
		sb.append("    variousDatesAcquired: ").append(toIndentedString(variousDatesAcquired)).append("\n");
		sb.append("    dateOfSale: ").append(toIndentedString(dateOfSale)).append("\n");
		sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
		sb.append("    accruedMarketDiscount: ").append(toIndentedString(accruedMarketDiscount)).append("\n");
		sb.append("    adjustmentCodes: ").append(toIndentedString(adjustmentCodes)).append("\n");
		sb.append("    costBasis: ").append(toIndentedString(costBasis)).append("\n");
		sb.append("    washSaleLossDisallowed: ").append(toIndentedString(washSaleLossDisallowed)).append("\n");
		sb.append("    longOrShort: ").append(toIndentedString(longOrShort)).append("\n");
		sb.append("    ordinary: ").append(toIndentedString(ordinary)).append("\n");
		sb.append("    collectible: ").append(toIndentedString(collectible)).append("\n");
		sb.append("    qof: ").append(toIndentedString(qof)).append("\n");
		sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
		sb.append("    noncoveredSecurity: ").append(toIndentedString(noncoveredSecurity)).append("\n");
		sb.append("    grossOrNet: ").append(toIndentedString(grossOrNet)).append("\n");
		sb.append("    lossNotAllowed: ").append(toIndentedString(lossNotAllowed)).append("\n");
		sb.append("    basisReported: ").append(toIndentedString(basisReported)).append("\n");
		sb.append("    stateTaxWithholding: ").append(toIndentedString(stateTaxWithholding)).append("\n");
		sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
		sb.append("    foreignAccountTaxCompliance: ").append(toIndentedString(foreignAccountTaxCompliance))
				.append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(SecurityDetail.class);

	public SecurityDetail getSecurityDetails(int securitydetailid) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("securitydetailid", securitydetailid);
			SecurityDetail securityDetail;
			try {
				securityDetail = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".securitydetail where securitydetailid in (:securitydetailid)", parameters,
						new SecurityDetailRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Security Detail not found", 0);
			}
//			StateTaxWithholding Start
			List<StateTaxWithholding> stateTaxWithholdingList = securityDetail.getStateTaxWithholding();
			List<StateTaxWithholding> stateTaxWithholdingListNew = new ArrayList<>();
			if (securityDetail.getStateTaxWithholding() != null) {
				for (StateTaxWithholding stateTaxWithholdingIterator : stateTaxWithholdingList) {
					StateTaxWithholding stateTaxWithholding = stateTaxWithholdingIterator
							.getStateTaxWIthHolding(stateTaxWithholdingIterator.getStwithheldid());
					stateTaxWithholdingListNew.add(stateTaxWithholding);
				}
				securityDetail.setStateTaxWithholding(stateTaxWithholdingListNew);
			}
//			StateTaxWithholding End

//			SecurityDetail  Start
			List<CodeAmount> codeAmountList = securityDetail.getAdjustmentCodes();
			List<CodeAmount> codeAmountListNew = new ArrayList<>();
			if (securityDetail.getStateTaxWithholding() != null) {
				for (CodeAmount codeAmountIterator : codeAmountList) {
					CodeAmount codeAmount = codeAmountIterator.getCodeAmount(codeAmountIterator.getCodeAmountId());
					codeAmountListNew.add(codeAmount);
				}
				securityDetail.setAdjustmentCodes(codeAmountListNew);
			}
//			SecurityDetail  End

			return securityDetail;

		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("SecurityDetail : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}
}
