package com.fdx.api.model51.modelimpl;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import com.fdx.common.util.FdxConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.BusinessIncomeStatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Business Income Statement for IRS Form 1040 Schedule C
 */
@ApiModel(description = "Business Income Statement for IRS Form 1040 Schedule C")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class BusinessIncomeStatement {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("businessName")
	private String businessName;

	@JsonProperty("sales")
	private Double sales;

	@JsonProperty("returns")
	private Double returns;

	@JsonProperty("otherIncome")
	@Valid
	private List<DescriptionAmount> otherIncome = null;

	@JsonProperty("advertising")
	private Double advertising;

	@JsonProperty("carAndTruck")
	private Double carAndTruck;

	@JsonProperty("commissions")
	private Double commissions;

	@JsonProperty("contractLabor")
	private Double contractLabor;

	@JsonProperty("depletion")
	private Double depletion;

	@JsonProperty("depreciation")
	private Double depreciation;

	@JsonProperty("employeeBenefits")
	private Double employeeBenefits;

	@JsonProperty("insurance")
	private Double insurance;

	@JsonProperty("mortgageInterest")
	private Double mortgageInterest;

	@JsonProperty("otherInterest")
	private Double otherInterest;

	@JsonProperty("legal")
	private Double legal;

	@JsonProperty("office")
	private Double office;

	@JsonProperty("pension")
	private Double pension;

	@JsonProperty("equipmentRent")
	private Double equipmentRent;

	@JsonProperty("otherRent")
	private Double otherRent;

	@JsonProperty("repairs")
	private Double repairs;

	@JsonProperty("supplies")
	private Double supplies;

	@JsonProperty("taxes")
	private Double taxes;

	@JsonProperty("travel")
	private Double travel;

	@JsonProperty("meals")
	private Double meals;

	@JsonProperty("utilities")
	private Double utilities;

	@JsonProperty("wages")
	private Double wages;

	@JsonProperty("otherExpenses")
	@Valid
	private List<DescriptionAmount> otherExpenses = null;

	@JsonProperty("beginningInventory")
	private Double beginningInventory;

	@JsonProperty("purchases")
	private Double purchases;

	@JsonProperty("costOfLabor")
	private Double costOfLabor;

	@JsonProperty("materials")
	private Double materials;

	@JsonProperty("otherCosts")
	@Valid
	private List<DescriptionAmount> otherCosts = null;

	@JsonProperty("endingInventory")
	private Double endingInventory;

	@JsonProperty("capitalExpenditures")
	@Valid
	private List<DateAmount> capitalExpenditures = null;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Double getSales() {
		return sales;
	}

	public void setSales(Double sales) {
		this.sales = sales;
	}

	public Double getReturns() {
		return returns;
	}

	public void setReturns(Double returns) {
		this.returns = returns;
	}

	public List<DescriptionAmount> getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(List<DescriptionAmount> otherIncome) {
		this.otherIncome = otherIncome;
	}

	public Double getAdvertising() {
		return advertising;
	}

	public void setAdvertising(Double advertising) {
		this.advertising = advertising;
	}

	public Double getCarAndTruck() {
		return carAndTruck;
	}

	public void setCarAndTruck(Double carAndTruck) {
		this.carAndTruck = carAndTruck;
	}

	public Double getCommissions() {
		return commissions;
	}

	public void setCommissions(Double commissions) {
		this.commissions = commissions;
	}

	public Double getContractLabor() {
		return contractLabor;
	}

	public void setContractLabor(Double contractLabor) {
		this.contractLabor = contractLabor;
	}

	public Double getDepletion() {
		return depletion;
	}

	public void setDepletion(Double depletion) {
		this.depletion = depletion;
	}

	public Double getDepreciation() {
		return depreciation;
	}

	public void setDepreciation(Double depreciation) {
		this.depreciation = depreciation;
	}

	public Double getEmployeeBenefits() {
		return employeeBenefits;
	}

	public void setEmployeeBenefits(Double employeeBenefits) {
		this.employeeBenefits = employeeBenefits;
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

	public Double getLegal() {
		return legal;
	}

	public void setLegal(Double legal) {
		this.legal = legal;
	}

	public Double getOffice() {
		return office;
	}

	public void setOffice(Double office) {
		this.office = office;
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

	public Double getTravel() {
		return travel;
	}

	public void setTravel(Double travel) {
		this.travel = travel;
	}

	public Double getMeals() {
		return meals;
	}

	public void setMeals(Double meals) {
		this.meals = meals;
	}

	public Double getUtilities() {
		return utilities;
	}

	public void setUtilities(Double utilities) {
		this.utilities = utilities;
	}

	public Double getWages() {
		return wages;
	}

	public void setWages(Double wages) {
		this.wages = wages;
	}

	public List<DescriptionAmount> getOtherExpenses() {
		return otherExpenses;
	}

	public void setOtherExpenses(List<DescriptionAmount> otherExpenses) {
		this.otherExpenses = otherExpenses;
	}

	public Double getBeginningInventory() {
		return beginningInventory;
	}

	public void setBeginningInventory(Double beginningInventory) {
		this.beginningInventory = beginningInventory;
	}

	public Double getPurchases() {
		return purchases;
	}

	public void setPurchases(Double purchases) {
		this.purchases = purchases;
	}

	public Double getCostOfLabor() {
		return costOfLabor;
	}

	public void setCostOfLabor(Double costOfLabor) {
		this.costOfLabor = costOfLabor;
	}

	public Double getMaterials() {
		return materials;
	}

	public void setMaterials(Double materials) {
		this.materials = materials;
	}

	public List<DescriptionAmount> getOtherCosts() {
		return otherCosts;
	}

	public void setOtherCosts(List<DescriptionAmount> otherCosts) {
		this.otherCosts = otherCosts;
	}

	public Double getEndingInventory() {
		return endingInventory;
	}

	public void setEndingInventory(Double endingInventory) {
		this.endingInventory = endingInventory;
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
		result = prime * result + ((advertising == null) ? 0 : advertising.hashCode());
		result = prime * result + ((beginningInventory == null) ? 0 : beginningInventory.hashCode());
		result = prime * result + ((businessName == null) ? 0 : businessName.hashCode());
		result = prime * result + ((capitalExpenditures == null) ? 0 : capitalExpenditures.hashCode());
		result = prime * result + ((carAndTruck == null) ? 0 : carAndTruck.hashCode());
		result = prime * result + ((commissions == null) ? 0 : commissions.hashCode());
		result = prime * result + ((contractLabor == null) ? 0 : contractLabor.hashCode());
		result = prime * result + ((costOfLabor == null) ? 0 : costOfLabor.hashCode());
		result = prime * result + ((depletion == null) ? 0 : depletion.hashCode());
		result = prime * result + ((depreciation == null) ? 0 : depreciation.hashCode());
		result = prime * result + ((employeeBenefits == null) ? 0 : employeeBenefits.hashCode());
		result = prime * result + ((endingInventory == null) ? 0 : endingInventory.hashCode());
		result = prime * result + ((equipmentRent == null) ? 0 : equipmentRent.hashCode());
		result = prime * result + ((insurance == null) ? 0 : insurance.hashCode());
		result = prime * result + ((legal == null) ? 0 : legal.hashCode());
		result = prime * result + ((materials == null) ? 0 : materials.hashCode());
		result = prime * result + ((meals == null) ? 0 : meals.hashCode());
		result = prime * result + ((mortgageInterest == null) ? 0 : mortgageInterest.hashCode());
		result = prime * result + ((office == null) ? 0 : office.hashCode());
		result = prime * result + ((otherCosts == null) ? 0 : otherCosts.hashCode());
		result = prime * result + ((otherExpenses == null) ? 0 : otherExpenses.hashCode());
		result = prime * result + ((otherIncome == null) ? 0 : otherIncome.hashCode());
		result = prime * result + ((otherInterest == null) ? 0 : otherInterest.hashCode());
		result = prime * result + ((otherRent == null) ? 0 : otherRent.hashCode());
		result = prime * result + ((pension == null) ? 0 : pension.hashCode());
		result = prime * result + ((purchases == null) ? 0 : purchases.hashCode());
		result = prime * result + ((repairs == null) ? 0 : repairs.hashCode());
		result = prime * result + ((returns == null) ? 0 : returns.hashCode());
		result = prime * result + ((sales == null) ? 0 : sales.hashCode());
		result = prime * result + ((supplies == null) ? 0 : supplies.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((taxes == null) ? 0 : taxes.hashCode());
		result = prime * result + ((travel == null) ? 0 : travel.hashCode());
		result = prime * result + ((utilities == null) ? 0 : utilities.hashCode());
		result = prime * result + ((wages == null) ? 0 : wages.hashCode());
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
		BusinessIncomeStatement other = (BusinessIncomeStatement) obj;
		if (advertising == null) {
			if (other.advertising != null)
				return false;
		} else if (!advertising.equals(other.advertising))
			return false;
		if (beginningInventory == null) {
			if (other.beginningInventory != null)
				return false;
		} else if (!beginningInventory.equals(other.beginningInventory))
			return false;
		if (businessName == null) {
			if (other.businessName != null)
				return false;
		} else if (!businessName.equals(other.businessName))
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
		if (commissions == null) {
			if (other.commissions != null)
				return false;
		} else if (!commissions.equals(other.commissions))
			return false;
		if (contractLabor == null) {
			if (other.contractLabor != null)
				return false;
		} else if (!contractLabor.equals(other.contractLabor))
			return false;
		if (costOfLabor == null) {
			if (other.costOfLabor != null)
				return false;
		} else if (!costOfLabor.equals(other.costOfLabor))
			return false;
		if (depletion == null) {
			if (other.depletion != null)
				return false;
		} else if (!depletion.equals(other.depletion))
			return false;
		if (depreciation == null) {
			if (other.depreciation != null)
				return false;
		} else if (!depreciation.equals(other.depreciation))
			return false;
		if (employeeBenefits == null) {
			if (other.employeeBenefits != null)
				return false;
		} else if (!employeeBenefits.equals(other.employeeBenefits))
			return false;
		if (endingInventory == null) {
			if (other.endingInventory != null)
				return false;
		} else if (!endingInventory.equals(other.endingInventory))
			return false;
		if (equipmentRent == null) {
			if (other.equipmentRent != null)
				return false;
		} else if (!equipmentRent.equals(other.equipmentRent))
			return false;
		if (insurance == null) {
			if (other.insurance != null)
				return false;
		} else if (!insurance.equals(other.insurance))
			return false;
		if (legal == null) {
			if (other.legal != null)
				return false;
		} else if (!legal.equals(other.legal))
			return false;
		if (materials == null) {
			if (other.materials != null)
				return false;
		} else if (!materials.equals(other.materials))
			return false;
		if (meals == null) {
			if (other.meals != null)
				return false;
		} else if (!meals.equals(other.meals))
			return false;
		if (mortgageInterest == null) {
			if (other.mortgageInterest != null)
				return false;
		} else if (!mortgageInterest.equals(other.mortgageInterest))
			return false;
		if (office == null) {
			if (other.office != null)
				return false;
		} else if (!office.equals(other.office))
			return false;
		if (otherCosts == null) {
			if (other.otherCosts != null)
				return false;
		} else if (!otherCosts.equals(other.otherCosts))
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
		if (purchases == null) {
			if (other.purchases != null)
				return false;
		} else if (!purchases.equals(other.purchases))
			return false;
		if (repairs == null) {
			if (other.repairs != null)
				return false;
		} else if (!repairs.equals(other.repairs))
			return false;
		if (returns == null) {
			if (other.returns != null)
				return false;
		} else if (!returns.equals(other.returns))
			return false;
		if (sales == null) {
			if (other.sales != null)
				return false;
		} else if (!sales.equals(other.sales))
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
		if (travel == null) {
			if (other.travel != null)
				return false;
		} else if (!travel.equals(other.travel))
			return false;
		if (utilities == null) {
			if (other.utilities != null)
				return false;
		} else if (!utilities.equals(other.utilities))
			return false;
		if (wages == null) {
			if (other.wages != null)
				return false;
		} else if (!wages.equals(other.wages))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BusinessIncomeStatement [tax=" + tax + ", businessName=" + businessName + ", sales=" + sales
				+ ", returns=" + returns + ", otherIncome=" + otherIncome + ", advertising=" + advertising
				+ ", carAndTruck=" + carAndTruck + ", commissions=" + commissions + ", contractLabor=" + contractLabor
				+ ", depletion=" + depletion + ", depreciation=" + depreciation + ", employeeBenefits="
				+ employeeBenefits + ", insurance=" + insurance + ", mortgageInterest=" + mortgageInterest
				+ ", otherInterest=" + otherInterest + ", legal=" + legal + ", office=" + office + ", pension="
				+ pension + ", equipmentRent=" + equipmentRent + ", otherRent=" + otherRent + ", repairs=" + repairs
				+ ", supplies=" + supplies + ", taxes=" + taxes + ", travel=" + travel + ", meals=" + meals
				+ ", utilities=" + utilities + ", wages=" + wages + ", otherExpenses=" + otherExpenses
				+ ", beginningInventory=" + beginningInventory + ", purchases=" + purchases + ", costOfLabor="
				+ costOfLabor + ", materials=" + materials + ", otherCosts=" + otherCosts + ", endingInventory="
				+ endingInventory + ", capitalExpenditures=" + capitalExpenditures + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(BusinessIncomeStatement.class);

	public BusinessIncomeStatement getBusinessIncomeStatement(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			BusinessIncomeStatement businessIncomeStatementResponse = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".businessincomestatement where internalId in (:internalId)", parameters,
					new BusinessIncomeStatementRowMapper());
//			OtherIncome
			List<DescriptionAmount> otherIncomeList = businessIncomeStatementResponse.getOtherIncome();
			List<DescriptionAmount> otherIncomeListNew = new ArrayList<>();
			if (businessIncomeStatementResponse.getOtherIncome() != null) {
				for (DescriptionAmount descriptionAmountIterator : otherIncomeList) {
					DescriptionAmount descriptionAmount = descriptionAmountIterator
							.getDescriptionAmount(descriptionAmountIterator.getDescAmountId());
					otherIncomeListNew.add(descriptionAmount);
				}
				businessIncomeStatementResponse.setOtherIncome(otherIncomeListNew);
			}

//			OtherExpenses
			List<DescriptionAmount> otherExpensesList = businessIncomeStatementResponse.getOtherExpenses();
			List<DescriptionAmount> otherExpensesListNew = new ArrayList<>();
			if (businessIncomeStatementResponse.getOtherExpenses() != null) {
				for (DescriptionAmount descriptionAmountIterator : otherExpensesList) {
					DescriptionAmount descriptionAmount = descriptionAmountIterator
							.getDescriptionAmount(descriptionAmountIterator.getDescAmountId());
					otherExpensesListNew.add(descriptionAmount);
				}
				businessIncomeStatementResponse.setOtherExpenses(otherExpensesListNew);
			}
//			OtherCost
			List<DescriptionAmount> otherCostList = businessIncomeStatementResponse.getOtherCosts();
			List<DescriptionAmount> otherCostListNew = new ArrayList<>();
			if (businessIncomeStatementResponse.getOtherCosts() != null) {
				for (DescriptionAmount descriptionAmountIterator : otherCostList) {
					DescriptionAmount descriptionAmount = descriptionAmountIterator
							.getDescriptionAmount(descriptionAmountIterator.getDescAmountId());
					otherCostListNew.add(descriptionAmount);
				}
				businessIncomeStatementResponse.setOtherCosts(otherCostListNew);
			}

//			DateAmount- Capital Expenditures
			List<DateAmount> dateAmountList = businessIncomeStatementResponse.getCapitalExpenditures();
			List<DateAmount> dateAmountListNew = new ArrayList<>();
			if (businessIncomeStatementResponse.getCapitalExpenditures() != null) {
				for (DateAmount dateAmountIterator : dateAmountList) {
					DateAmount DateAmount = dateAmountIterator
							.getDateAmountDetails(dateAmountIterator.getDateamountid());
					dateAmountListNew.add(DateAmount);
				}
				businessIncomeStatementResponse.setCapitalExpenditures(dateAmountListNew);
			}

			return businessIncomeStatementResponse;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("BusinessIncomeStatement : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

}
