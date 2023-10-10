package com.fdx.api.model46.modelimpl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model46.config.ConnectionConfigApi46;
import com.fdx.api.model46.mapper.FarmIncomeStatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Farm Income Statement for IRS Form 1040 Schedule F
 */
@ApiModel(description = "Farm Income Statement for IRS Form 1040 Schedule F")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class FarmIncomeStatement {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("cropOrActivity")
	private String cropOrActivity;

	@JsonProperty("sales")
	private Double sales;

	@JsonProperty("costOfItemsSold")
	private Double costOfItemsSold;

	@JsonProperty("salesOfRaised")
	private Double salesOfRaised;

	@JsonProperty("coopDistributions")
	private Double coopDistributions;

	@JsonProperty("agProgramPayments")
	private Double agProgramPayments;

	@JsonProperty("cccLoans")
	private Double cccLoans;

	@JsonProperty("cropInsuranceProceeds")
	private Double cropInsuranceProceeds;

	@JsonProperty("customHireIncome")
	private Double customHireIncome;

	@JsonProperty("otherIncome")
	@Valid
	private List<DescriptionAmount> otherIncome = null;

	@JsonProperty("carAndTruck")
	private Double carAndTruck;

	@JsonProperty("chemicals")
	private Double chemicals;

	@JsonProperty("conservation")
	private Double conservation;

	@JsonProperty("customHireExpenses")
	private Double customHireExpenses;

	@JsonProperty("depreciation")
	private Double depreciation;

	@JsonProperty("employeeBenefitPrograms")
	private Double employeeBenefitPrograms;

	@JsonProperty("feed")
	private Double feed;

	@JsonProperty("fertilizers")
	private Double fertilizers;

	@JsonProperty("freight")
	private Double freight;

	@JsonProperty("fuel")
	private Double fuel;

	@JsonProperty("insurance")
	private Double insurance;

	@JsonProperty("mortgageInterest")
	private Double mortgageInterest;

	@JsonProperty("otherInterest")
	private Double otherInterest;

	@JsonProperty("laborHired")
	private Double laborHired;

	@JsonProperty("pension")
	private Double pension;

	@JsonProperty("equipmentRent")
	private Double equipmentRent;

	@JsonProperty("otherRent")
	private Double otherRent;

	@JsonProperty("repairs")
	private Double repairs;

	@JsonProperty("seeds")
	private Double seeds;

	@JsonProperty("storage")
	private Double storage;

	@JsonProperty("supplies")
	private Double supplies;

	@JsonProperty("taxes")
	private Double taxes;

	@JsonProperty("utilities")
	private Double utilities;

	@JsonProperty("veterinary")
	private Double veterinary;

	@JsonProperty("otherExpenses")
	@Valid
	private List<DescriptionAmount> otherExpenses = null;

	@JsonProperty("capitalExpenditures")
	@Valid
	private List<DateAmount> capitalExpenditures = null;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public String getCropOrActivity() {
		return cropOrActivity;
	}

	public void setCropOrActivity(String cropOrActivity) {
		this.cropOrActivity = cropOrActivity;
	}

	public Double getSales() {
		return sales;
	}

	public void setSales(Double sales) {
		this.sales = sales;
	}

	public Double getCostOfItemsSold() {
		return costOfItemsSold;
	}

	public void setCostOfItemsSold(Double costOfItemsSold) {
		this.costOfItemsSold = costOfItemsSold;
	}

	public Double getSalesOfRaised() {
		return salesOfRaised;
	}

	public void setSalesOfRaised(Double salesOfRaised) {
		this.salesOfRaised = salesOfRaised;
	}

	public Double getCoopDistributions() {
		return coopDistributions;
	}

	public void setCoopDistributions(Double coopDistributions) {
		this.coopDistributions = coopDistributions;
	}

	public Double getAgProgramPayments() {
		return agProgramPayments;
	}

	public void setAgProgramPayments(Double agProgramPayments) {
		this.agProgramPayments = agProgramPayments;
	}

	public Double getCccLoans() {
		return cccLoans;
	}

	public void setCccLoans(Double cccLoans) {
		this.cccLoans = cccLoans;
	}

	public Double getCropInsuranceProceeds() {
		return cropInsuranceProceeds;
	}

	public void setCropInsuranceProceeds(Double cropInsuranceProceeds) {
		this.cropInsuranceProceeds = cropInsuranceProceeds;
	}

	public Double getCustomHireIncome() {
		return customHireIncome;
	}

	public void setCustomHireIncome(Double customHireIncome) {
		this.customHireIncome = customHireIncome;
	}

	public List<DescriptionAmount> getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(List<DescriptionAmount> otherIncome) {
		this.otherIncome = otherIncome;
	}

	public Double getCarAndTruck() {
		return carAndTruck;
	}

	public void setCarAndTruck(Double carAndTruck) {
		this.carAndTruck = carAndTruck;
	}

	public Double getChemicals() {
		return chemicals;
	}

	public void setChemicals(Double chemicals) {
		this.chemicals = chemicals;
	}

	public Double getConservation() {
		return conservation;
	}

	public void setConservation(Double conservation) {
		this.conservation = conservation;
	}

	public Double getCustomHireExpenses() {
		return customHireExpenses;
	}

	public void setCustomHireExpenses(Double customHireExpenses) {
		this.customHireExpenses = customHireExpenses;
	}

	public Double getDepreciation() {
		return depreciation;
	}

	public void setDepreciation(Double depreciation) {
		this.depreciation = depreciation;
	}

	public Double getEmployeeBenefitPrograms() {
		return employeeBenefitPrograms;
	}

	public void setEmployeeBenefitPrograms(Double employeeBenefitPrograms) {
		this.employeeBenefitPrograms = employeeBenefitPrograms;
	}

	public Double getFeed() {
		return feed;
	}

	public void setFeed(Double feed) {
		this.feed = feed;
	}

	public Double getFertilizers() {
		return fertilizers;
	}

	public void setFertilizers(Double fertilizers) {
		this.fertilizers = fertilizers;
	}

	public Double getFreight() {
		return freight;
	}

	public void setFreight(Double freight) {
		this.freight = freight;
	}

	public Double getFuel() {
		return fuel;
	}

	public void setFuel(Double fuel) {
		this.fuel = fuel;
	}

	public Double getInsurance() {
		return insurance;
	}

	public void setInsurance(Double insurance) {
		this.insurance = insurance;
	}

	public Double getMortgageInterest() {
		return mortgageInterest;
	}

	public void setMortgageInterest(Double mortgageInterest) {
		this.mortgageInterest = mortgageInterest;
	}

	public Double getOtherInterest() {
		return otherInterest;
	}

	public void setOtherInterest(Double otherInterest) {
		this.otherInterest = otherInterest;
	}

	public Double getLaborHired() {
		return laborHired;
	}

	public void setLaborHired(Double laborHired) {
		this.laborHired = laborHired;
	}

	public Double getPension() {
		return pension;
	}

	public void setPension(Double pension) {
		this.pension = pension;
	}

	public Double getEquipmentRent() {
		return equipmentRent;
	}

	public void setEquipmentRent(Double equipmentRent) {
		this.equipmentRent = equipmentRent;
	}

	public Double getOtherRent() {
		return otherRent;
	}

	public void setOtherRent(Double otherRent) {
		this.otherRent = otherRent;
	}

	public Double getRepairs() {
		return repairs;
	}

	public void setRepairs(Double repairs) {
		this.repairs = repairs;
	}

	public Double getSeeds() {
		return seeds;
	}

	public void setSeeds(Double seeds) {
		this.seeds = seeds;
	}

	public Double getStorage() {
		return storage;
	}

	public void setStorage(Double storage) {
		this.storage = storage;
	}

	public Double getSupplies() {
		return supplies;
	}

	public void setSupplies(Double supplies) {
		this.supplies = supplies;
	}

	public Double getTaxes() {
		return taxes;
	}

	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}

	public Double getUtilities() {
		return utilities;
	}

	public void setUtilities(Double utilities) {
		this.utilities = utilities;
	}

	public Double getVeterinary() {
		return veterinary;
	}

	public void setVeterinary(Double veterinary) {
		this.veterinary = veterinary;
	}

	public List<DescriptionAmount> getOtherExpenses() {
		return otherExpenses;
	}

	public void setOtherExpenses(List<DescriptionAmount> otherExpenses) {
		this.otherExpenses = otherExpenses;
	}

	public List<DateAmount> getCapitalExpenditures() {
		return capitalExpenditures;
	}

	public void setCapitalExpenditures(List<DateAmount> capitalExpenditures) {
		this.capitalExpenditures = capitalExpenditures;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agProgramPayments == null) ? 0 : agProgramPayments.hashCode());
		result = prime * result + ((capitalExpenditures == null) ? 0 : capitalExpenditures.hashCode());
		result = prime * result + ((carAndTruck == null) ? 0 : carAndTruck.hashCode());
		result = prime * result + ((cccLoans == null) ? 0 : cccLoans.hashCode());
		result = prime * result + ((chemicals == null) ? 0 : chemicals.hashCode());
		result = prime * result + ((conservation == null) ? 0 : conservation.hashCode());
		result = prime * result + ((coopDistributions == null) ? 0 : coopDistributions.hashCode());
		result = prime * result + ((costOfItemsSold == null) ? 0 : costOfItemsSold.hashCode());
		result = prime * result + ((cropInsuranceProceeds == null) ? 0 : cropInsuranceProceeds.hashCode());
		result = prime * result + ((cropOrActivity == null) ? 0 : cropOrActivity.hashCode());
		result = prime * result + ((customHireExpenses == null) ? 0 : customHireExpenses.hashCode());
		result = prime * result + ((customHireIncome == null) ? 0 : customHireIncome.hashCode());
		result = prime * result + ((depreciation == null) ? 0 : depreciation.hashCode());
		result = prime * result + ((employeeBenefitPrograms == null) ? 0 : employeeBenefitPrograms.hashCode());
		result = prime * result + ((equipmentRent == null) ? 0 : equipmentRent.hashCode());
		result = prime * result + ((feed == null) ? 0 : feed.hashCode());
		result = prime * result + ((fertilizers == null) ? 0 : fertilizers.hashCode());
		result = prime * result + ((freight == null) ? 0 : freight.hashCode());
		result = prime * result + ((fuel == null) ? 0 : fuel.hashCode());
		result = prime * result + ((insurance == null) ? 0 : insurance.hashCode());
		result = prime * result + ((laborHired == null) ? 0 : laborHired.hashCode());
		result = prime * result + ((mortgageInterest == null) ? 0 : mortgageInterest.hashCode());
		result = prime * result + ((otherExpenses == null) ? 0 : otherExpenses.hashCode());
		result = prime * result + ((otherIncome == null) ? 0 : otherIncome.hashCode());
		result = prime * result + ((otherInterest == null) ? 0 : otherInterest.hashCode());
		result = prime * result + ((otherRent == null) ? 0 : otherRent.hashCode());
		result = prime * result + ((pension == null) ? 0 : pension.hashCode());
		result = prime * result + ((repairs == null) ? 0 : repairs.hashCode());
		result = prime * result + ((sales == null) ? 0 : sales.hashCode());
		result = prime * result + ((salesOfRaised == null) ? 0 : salesOfRaised.hashCode());
		result = prime * result + ((seeds == null) ? 0 : seeds.hashCode());
		result = prime * result + ((storage == null) ? 0 : storage.hashCode());
		result = prime * result + ((supplies == null) ? 0 : supplies.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((taxes == null) ? 0 : taxes.hashCode());
		result = prime * result + ((utilities == null) ? 0 : utilities.hashCode());
		result = prime * result + ((veterinary == null) ? 0 : veterinary.hashCode());
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
		FarmIncomeStatement other = (FarmIncomeStatement) obj;
		if (agProgramPayments == null) {
			if (other.agProgramPayments != null)
				return false;
		} else if (!agProgramPayments.equals(other.agProgramPayments))
			return false;
		if (capitalExpenditures == null) {
			if (other.capitalExpenditures != null)
				return false;
		} else if (!capitalExpenditures.equals(other.capitalExpenditures))
			return false;
		if (carAndTruck == null) {
			if (other.carAndTruck != null)
				return false;
		} else if (!carAndTruck.equals(other.carAndTruck))
			return false;
		if (cccLoans == null) {
			if (other.cccLoans != null)
				return false;
		} else if (!cccLoans.equals(other.cccLoans))
			return false;
		if (chemicals == null) {
			if (other.chemicals != null)
				return false;
		} else if (!chemicals.equals(other.chemicals))
			return false;
		if (conservation == null) {
			if (other.conservation != null)
				return false;
		} else if (!conservation.equals(other.conservation))
			return false;
		if (coopDistributions == null) {
			if (other.coopDistributions != null)
				return false;
		} else if (!coopDistributions.equals(other.coopDistributions))
			return false;
		if (costOfItemsSold == null) {
			if (other.costOfItemsSold != null)
				return false;
		} else if (!costOfItemsSold.equals(other.costOfItemsSold))
			return false;
		if (cropInsuranceProceeds == null) {
			if (other.cropInsuranceProceeds != null)
				return false;
		} else if (!cropInsuranceProceeds.equals(other.cropInsuranceProceeds))
			return false;
		if (cropOrActivity == null) {
			if (other.cropOrActivity != null)
				return false;
		} else if (!cropOrActivity.equals(other.cropOrActivity))
			return false;
		if (customHireExpenses == null) {
			if (other.customHireExpenses != null)
				return false;
		} else if (!customHireExpenses.equals(other.customHireExpenses))
			return false;
		if (customHireIncome == null) {
			if (other.customHireIncome != null)
				return false;
		} else if (!customHireIncome.equals(other.customHireIncome))
			return false;
		if (depreciation == null) {
			if (other.depreciation != null)
				return false;
		} else if (!depreciation.equals(other.depreciation))
			return false;
		if (employeeBenefitPrograms == null) {
			if (other.employeeBenefitPrograms != null)
				return false;
		} else if (!employeeBenefitPrograms.equals(other.employeeBenefitPrograms))
			return false;
		if (equipmentRent == null) {
			if (other.equipmentRent != null)
				return false;
		} else if (!equipmentRent.equals(other.equipmentRent))
			return false;
		if (feed == null) {
			if (other.feed != null)
				return false;
		} else if (!feed.equals(other.feed))
			return false;
		if (fertilizers == null) {
			if (other.fertilizers != null)
				return false;
		} else if (!fertilizers.equals(other.fertilizers))
			return false;
		if (freight == null) {
			if (other.freight != null)
				return false;
		} else if (!freight.equals(other.freight))
			return false;
		if (fuel == null) {
			if (other.fuel != null)
				return false;
		} else if (!fuel.equals(other.fuel))
			return false;
		if (insurance == null) {
			if (other.insurance != null)
				return false;
		} else if (!insurance.equals(other.insurance))
			return false;
		if (laborHired == null) {
			if (other.laborHired != null)
				return false;
		} else if (!laborHired.equals(other.laborHired))
			return false;
		if (mortgageInterest == null) {
			if (other.mortgageInterest != null)
				return false;
		} else if (!mortgageInterest.equals(other.mortgageInterest))
			return false;
		if (otherExpenses == null) {
			if (other.otherExpenses != null)
				return false;
		} else if (!otherExpenses.equals(other.otherExpenses))
			return false;
		if (otherIncome == null) {
			if (other.otherIncome != null)
				return false;
		} else if (!otherIncome.equals(other.otherIncome))
			return false;
		if (otherInterest == null) {
			if (other.otherInterest != null)
				return false;
		} else if (!otherInterest.equals(other.otherInterest))
			return false;
		if (otherRent == null) {
			if (other.otherRent != null)
				return false;
		} else if (!otherRent.equals(other.otherRent))
			return false;
		if (pension == null) {
			if (other.pension != null)
				return false;
		} else if (!pension.equals(other.pension))
			return false;
		if (repairs == null) {
			if (other.repairs != null)
				return false;
		} else if (!repairs.equals(other.repairs))
			return false;
		if (sales == null) {
			if (other.sales != null)
				return false;
		} else if (!sales.equals(other.sales))
			return false;
		if (salesOfRaised == null) {
			if (other.salesOfRaised != null)
				return false;
		} else if (!salesOfRaised.equals(other.salesOfRaised))
			return false;
		if (seeds == null) {
			if (other.seeds != null)
				return false;
		} else if (!seeds.equals(other.seeds))
			return false;
		if (storage == null) {
			if (other.storage != null)
				return false;
		} else if (!storage.equals(other.storage))
			return false;
		if (supplies == null) {
			if (other.supplies != null)
				return false;
		} else if (!supplies.equals(other.supplies))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (taxes == null) {
			if (other.taxes != null)
				return false;
		} else if (!taxes.equals(other.taxes))
			return false;
		if (utilities == null) {
			if (other.utilities != null)
				return false;
		} else if (!utilities.equals(other.utilities))
			return false;
		if (veterinary == null) {
			if (other.veterinary != null)
				return false;
		} else if (!veterinary.equals(other.veterinary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FarmIncomeStatement [tax=" + tax + ", cropOrActivity=" + cropOrActivity + ", sales=" + sales
				+ ", costOfItemsSold=" + costOfItemsSold + ", salesOfRaised=" + salesOfRaised + ", coopDistributions="
				+ coopDistributions + ", agProgramPayments=" + agProgramPayments + ", cccLoans=" + cccLoans
				+ ", cropInsuranceProceeds=" + cropInsuranceProceeds + ", customHireIncome=" + customHireIncome
				+ ", otherIncome=" + otherIncome + ", carAndTruck=" + carAndTruck + ", chemicals=" + chemicals
				+ ", conservation=" + conservation + ", customHireExpenses=" + customHireExpenses + ", depreciation="
				+ depreciation + ", employeeBenefitPrograms=" + employeeBenefitPrograms + ", feed=" + feed
				+ ", fertilizers=" + fertilizers + ", freight=" + freight + ", fuel=" + fuel + ", insurance="
				+ insurance + ", mortgageInterest=" + mortgageInterest + ", otherInterest=" + otherInterest
				+ ", laborHired=" + laborHired + ", pension=" + pension + ", equipmentRent=" + equipmentRent
				+ ", otherRent=" + otherRent + ", repairs=" + repairs + ", seeds=" + seeds + ", storage=" + storage
				+ ", supplies=" + supplies + ", taxes=" + taxes + ", utilities=" + utilities + ", veterinary="
				+ veterinary + ", otherExpenses=" + otherExpenses + ", capitalExpenditures=" + capitalExpenditures
				+ "]";
	}

	private static final Logger log = LoggerFactory.getLogger(FarmIncomeStatement.class);

	public FarmIncomeStatement getFarmIncomeStatement(@Size(max = 256) int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi46.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			FarmIncomeStatement farmIncomeStatement = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".farmIncomeStatement where internalId in (:internalId)", parameters,
					new FarmIncomeStatementRowMapper());
//			OtherIncome
			List<DescriptionAmount> otherIncomeList = farmIncomeStatement.getOtherIncome();
			List<DescriptionAmount> otherIncomeListNew = new ArrayList<>();
			if (farmIncomeStatement.getOtherIncome() != null) {
				for (DescriptionAmount descriptionAmountIterator : otherIncomeList) {
					DescriptionAmount descriptionAmount = descriptionAmountIterator
							.getDescriptionAmount(descriptionAmountIterator.getDescAmountId());
					otherIncomeListNew.add(descriptionAmount);
				}
				farmIncomeStatement.setOtherIncome(otherIncomeListNew);
			}

//			OtherExpenses
			List<DescriptionAmount> otherExpensesList = farmIncomeStatement.getOtherExpenses();
			List<DescriptionAmount> otherExpensesListNew = new ArrayList<>();
			if (farmIncomeStatement.getOtherExpenses() != null) {
				for (DescriptionAmount descriptionAmountIterator : otherExpensesList) {
					DescriptionAmount descriptionAmount = descriptionAmountIterator
							.getDescriptionAmount(descriptionAmountIterator.getDescAmountId());
					otherExpensesListNew.add(descriptionAmount);
				}
				farmIncomeStatement.setOtherExpenses(otherExpensesListNew);
			}

//			DateAmount- Capital Expenditures
			List<DateAmount> dateAmountList = farmIncomeStatement.getCapitalExpenditures();
			List<DateAmount> dateAmountListNew = new ArrayList<>();
			if (farmIncomeStatement.getCapitalExpenditures() != null) {
				for (DateAmount dateAmountIterator : dateAmountList) {
					DateAmount DateAmount = dateAmountIterator
							.getDateAmountDetails(dateAmountIterator.getDateamountid());
					dateAmountListNew.add(DateAmount);
				}
				farmIncomeStatement.setCapitalExpenditures(dateAmountListNew);
			}

			return farmIncomeStatement;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("FarmIncomeStatement : ", e);
			throw new FDXException(e,500);
		}
	}

}
