package com.fdx.api.model46.modelimpl;

import java.util.Date;

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
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.Tax1098CRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Contributions of Motor Vehicles, Boats, and Airplanes
 */
@ApiModel(description = "Contributions of Motor Vehicles, Boats, and Airplanes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class Tax1098C {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("doneeNameAddress")
	private NameAddressPhone doneeNameAddress;

	@JsonProperty("doneeTin")
	private String doneeTin;

	@JsonProperty("donorTin")
	private String donorTin;

	@JsonProperty("donorNameAddress")
	private NameAddress donorNameAddress;

	@JsonProperty("dateOfContribution")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateOfContribution;

	@JsonProperty("odometerMileage")
	private Integer odometerMileage;

	@JsonProperty("carYear")
	private Integer carYear;

	@JsonProperty("make")
	private String make;

	@JsonProperty("model")
	private String model;

	@JsonProperty("vin")
	private String vin;

	@JsonProperty("armsLengthTransaction")
	@JsonInclude(Include.NON_NULL)
	private Boolean armsLengthTransaction;

	@JsonProperty("dateOfSale")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateOfSale;

	@JsonProperty("grossProceeds")
	private Double grossProceeds;

	@JsonProperty("notTransferredBefore")
	@JsonInclude(Include.NON_NULL)
	private Boolean notTransferredBefore;

	@JsonProperty("needyIndividual")
	@JsonInclude(Include.NON_NULL)
	private Boolean needyIndividual;

	@JsonProperty("descriptionOfImprovements")
	private String descriptionOfImprovements;

	@JsonProperty("goodsInExchange")
	@JsonInclude(Include.NON_NULL)
	private Boolean goodsInExchange;

	@JsonProperty("valueOfExchange")
	private Double valueOfExchange;

	@JsonProperty("intangibleReligious")
	@JsonInclude(Include.NON_NULL)
	private Boolean intangibleReligious;

	@JsonProperty("descriptionOfGoods")
	private String descriptionOfGoods;

	@JsonProperty("maxDeductionApplies")
	@JsonInclude(Include.NON_NULL)
	private Boolean maxDeductionApplies;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getDoneeNameAddress() {
		return doneeNameAddress;
	}

	public void setDoneeNameAddress(NameAddressPhone doneeNameAddress) {
		this.doneeNameAddress = doneeNameAddress;
	}

	public String getDoneeTin() {
		return doneeTin;
	}

	public void setDoneeTin(String doneeTin) {
		this.doneeTin = doneeTin;
	}

	public String getDonorTin() {
		return donorTin;
	}

	public void setDonorTin(String donorTin) {
		this.donorTin = donorTin;
	}

	public NameAddress getDonorNameAddress() {
		return donorNameAddress;
	}

	public void setDonorNameAddress(NameAddress donorNameAddress) {
		this.donorNameAddress = donorNameAddress;
	}

	public Date getDateOfContribution() {
		return dateOfContribution;
	}

	public void setDateOfContribution(Date dateOfContribution) {
		this.dateOfContribution = dateOfContribution;
	}

	public Integer getOdometerMileage() {
		return odometerMileage;
	}

	public void setOdometerMileage(Integer odometerMileage) {
		this.odometerMileage = odometerMileage;
	}

	public Integer getCarYear() {
		return carYear;
	}

	public void setCarYear(Integer carYear) {
		this.carYear = carYear;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Boolean getArmsLengthTransaction() {
		return armsLengthTransaction;
	}

	public void setArmsLengthTransaction(Boolean armsLengthTransaction) {
		this.armsLengthTransaction = armsLengthTransaction;
	}

	public Date getDateOfSale() {
		return dateOfSale;
	}

	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

	public Double getGrossProceeds() {
		return grossProceeds;
	}

	public void setGrossProceeds(Double grossProceeds) {
		this.grossProceeds = grossProceeds;
	}

	public Boolean getNotTransferredBefore() {
		return notTransferredBefore;
	}

	public void setNotTransferredBefore(Boolean notTransferredBefore) {
		this.notTransferredBefore = notTransferredBefore;
	}

	public Boolean getNeedyIndividual() {
		return needyIndividual;
	}

	public void setNeedyIndividual(Boolean needyIndividual) {
		this.needyIndividual = needyIndividual;
	}

	public String getDescriptionOfImprovements() {
		return descriptionOfImprovements;
	}

	public void setDescriptionOfImprovements(String descriptionOfImprovements) {
		this.descriptionOfImprovements = descriptionOfImprovements;
	}

	public Boolean getGoodsInExchange() {
		return goodsInExchange;
	}

	public void setGoodsInExchange(Boolean goodsInExchange) {
		this.goodsInExchange = goodsInExchange;
	}

	public Double getValueOfExchange() {
		return valueOfExchange;
	}

	public void setValueOfExchange(Double valueOfExchange) {
		this.valueOfExchange = valueOfExchange;
	}

	public Boolean getIntangibleReligious() {
		return intangibleReligious;
	}

	public void setIntangibleReligious(Boolean intangibleReligious) {
		this.intangibleReligious = intangibleReligious;
	}

	public String getDescriptionOfGoods() {
		return descriptionOfGoods;
	}

	public void setDescriptionOfGoods(String descriptionOfGoods) {
		this.descriptionOfGoods = descriptionOfGoods;
	}

	public Boolean getMaxDeductionApplies() {
		return maxDeductionApplies;
	}

	public void setMaxDeductionApplies(Boolean maxDeductionApplies) {
		this.maxDeductionApplies = maxDeductionApplies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((armsLengthTransaction == null) ? 0 : armsLengthTransaction.hashCode());
		result = prime * result + ((carYear == null) ? 0 : carYear.hashCode());
		result = prime * result + ((dateOfContribution == null) ? 0 : dateOfContribution.hashCode());
		result = prime * result + ((dateOfSale == null) ? 0 : dateOfSale.hashCode());
		result = prime * result + ((descriptionOfGoods == null) ? 0 : descriptionOfGoods.hashCode());
		result = prime * result + ((descriptionOfImprovements == null) ? 0 : descriptionOfImprovements.hashCode());
		result = prime * result + ((doneeNameAddress == null) ? 0 : doneeNameAddress.hashCode());
		result = prime * result + ((doneeTin == null) ? 0 : doneeTin.hashCode());
		result = prime * result + ((donorNameAddress == null) ? 0 : donorNameAddress.hashCode());
		result = prime * result + ((donorTin == null) ? 0 : donorTin.hashCode());
		result = prime * result + ((goodsInExchange == null) ? 0 : goodsInExchange.hashCode());
		result = prime * result + ((grossProceeds == null) ? 0 : grossProceeds.hashCode());
		result = prime * result + ((intangibleReligious == null) ? 0 : intangibleReligious.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((maxDeductionApplies == null) ? 0 : maxDeductionApplies.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((needyIndividual == null) ? 0 : needyIndividual.hashCode());
		result = prime * result + ((notTransferredBefore == null) ? 0 : notTransferredBefore.hashCode());
		result = prime * result + ((odometerMileage == null) ? 0 : odometerMileage.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((valueOfExchange == null) ? 0 : valueOfExchange.hashCode());
		result = prime * result + ((vin == null) ? 0 : vin.hashCode());
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
		Tax1098C other = (Tax1098C) obj;
		if (armsLengthTransaction == null) {
			if (other.armsLengthTransaction != null)
				return false;
		} else if (!armsLengthTransaction.equals(other.armsLengthTransaction))
			return false;
		if (carYear == null) {
			if (other.carYear != null)
				return false;
		} else if (!carYear.equals(other.carYear))
			return false;
		if (dateOfContribution == null) {
			if (other.dateOfContribution != null)
				return false;
		} else if (!dateOfContribution.equals(other.dateOfContribution))
			return false;
		if (dateOfSale == null) {
			if (other.dateOfSale != null)
				return false;
		} else if (!dateOfSale.equals(other.dateOfSale))
			return false;
		if (descriptionOfGoods == null) {
			if (other.descriptionOfGoods != null)
				return false;
		} else if (!descriptionOfGoods.equals(other.descriptionOfGoods))
			return false;
		if (descriptionOfImprovements == null) {
			if (other.descriptionOfImprovements != null)
				return false;
		} else if (!descriptionOfImprovements.equals(other.descriptionOfImprovements))
			return false;
		if (doneeNameAddress == null) {
			if (other.doneeNameAddress != null)
				return false;
		} else if (!doneeNameAddress.equals(other.doneeNameAddress))
			return false;
		if (doneeTin == null) {
			if (other.doneeTin != null)
				return false;
		} else if (!doneeTin.equals(other.doneeTin))
			return false;
		if (donorNameAddress == null) {
			if (other.donorNameAddress != null)
				return false;
		} else if (!donorNameAddress.equals(other.donorNameAddress))
			return false;
		if (donorTin == null) {
			if (other.donorTin != null)
				return false;
		} else if (!donorTin.equals(other.donorTin))
			return false;
		if (goodsInExchange == null) {
			if (other.goodsInExchange != null)
				return false;
		} else if (!goodsInExchange.equals(other.goodsInExchange))
			return false;
		if (grossProceeds == null) {
			if (other.grossProceeds != null)
				return false;
		} else if (!grossProceeds.equals(other.grossProceeds))
			return false;
		if (intangibleReligious == null) {
			if (other.intangibleReligious != null)
				return false;
		} else if (!intangibleReligious.equals(other.intangibleReligious))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (maxDeductionApplies == null) {
			if (other.maxDeductionApplies != null)
				return false;
		} else if (!maxDeductionApplies.equals(other.maxDeductionApplies))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (needyIndividual == null) {
			if (other.needyIndividual != null)
				return false;
		} else if (!needyIndividual.equals(other.needyIndividual))
			return false;
		if (notTransferredBefore == null) {
			if (other.notTransferredBefore != null)
				return false;
		} else if (!notTransferredBefore.equals(other.notTransferredBefore))
			return false;
		if (odometerMileage == null) {
			if (other.odometerMileage != null)
				return false;
		} else if (!odometerMileage.equals(other.odometerMileage))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (valueOfExchange == null) {
			if (other.valueOfExchange != null)
				return false;
		} else if (!valueOfExchange.equals(other.valueOfExchange))
			return false;
		if (vin == null) {
			if (other.vin != null)
				return false;
		} else if (!vin.equals(other.vin))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tax1098C [tax=" + tax + ", doneeNameAddress=" + doneeNameAddress + ", doneeTin=" + doneeTin
				+ ", donorTin=" + donorTin + ", donorNameAddress=" + donorNameAddress + ", dateOfContribution="
				+ dateOfContribution + ", odometerMileage=" + odometerMileage + ", carYear=" + carYear + ", make="
				+ make + ", model=" + model + ", vin=" + vin + ", armsLengthTransaction=" + armsLengthTransaction
				+ ", dateOfSale=" + dateOfSale + ", grossProceeds=" + grossProceeds + ", notTransferredBefore="
				+ notTransferredBefore + ", needyIndividual=" + needyIndividual + ", descriptionOfImprovements="
				+ descriptionOfImprovements + ", goodsInExchange=" + goodsInExchange + ", valueOfExchange="
				+ valueOfExchange + ", intangibleReligious=" + intangibleReligious + ", descriptionOfGoods="
				+ descriptionOfGoods + ", maxDeductionApplies=" + maxDeductionApplies + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(Tax1098C.class);

	public Tax1098C getTax1098C(int internalId) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			Tax1098C tax1098C;
			try {
				tax1098C = template.queryForObject(
						"select * from "+ DeveloperContext.getDeveloperSchema() +".tax1098C where internalId in (:internalId)", parameters,
						new Tax1098CRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("Tax1098C not found", 0);
			}
//		Doneenameaddress Start
			NameAddressPhone doneeNameAddress = new NameAddressPhone();
			if (tax1098C.getDoneeNameAddress() != null) {
				doneeNameAddress = doneeNameAddress
						.getNameAddressPhoneDetails(tax1098C.getDoneeNameAddress().getNameAddressId());
				tax1098C.setDoneeNameAddress(doneeNameAddress);
			}
//		Doneenameaddress End

//		DonerNameAddress Start
			NameAddress donorNameAddress = new NameAddress();
			if (tax1098C.getDonorNameAddress() != null) {
				donorNameAddress = donorNameAddress
						.getNameAddressDetails(tax1098C.getDonorNameAddress().getNameAddressId());
				tax1098C.setDonorNameAddress(donorNameAddress);
			}
//		DonerNameAddress End

			return tax1098C;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("Tax1098C : ", e);
			throw new FDXException(e,500);
		}
	}
}
