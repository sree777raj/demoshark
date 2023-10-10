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
import com.fdx.api.model51.mapper.RentalIncomeStatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Rental Income Statement for IRS Form 1040 Schedule E
 */
@ApiModel(description = "Rental Income Statement for IRS Form 1040 Schedule E")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class RentalIncomeStatement {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("propertyAddress")
	private Address propertyAddress;

	@JsonProperty("rents")
	private Double rents;

	@JsonProperty("advertising")
	private Double advertising;

	@JsonProperty("auto")
	private Double auto;

	@JsonProperty("cleaning")
	private Double cleaning;

	@JsonProperty("commissions")
	private Double commissions;

	@JsonProperty("insurance")
	private Double insurance;

	@JsonProperty("legal")
	private Double legal;

	@JsonProperty("managementFees")
	private Double managementFees;

	@JsonProperty("mortgageInterest")
	private Double mortgageInterest;

	@JsonProperty("otherInterest")
	private Double otherInterest;

	@JsonProperty("repairs")
	private Double repairs;

	@JsonProperty("supplies")
	private Double supplies;

	@JsonProperty("taxes")
	private Double taxes;

	@JsonProperty("utilities")
	private Double utilities;

	@JsonProperty("depreciationExpense")
	private Double depreciationExpense;

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

	public Address getPropertyAddress() {
		return propertyAddress;
	}

	public void setPropertyAddress(Address propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public Double getRents() {
		return rents;
	}

	public void setRents(Double rents) {
		this.rents = rents;
	}

	public Double getAdvertising() {
		return advertising;
	}

	public void setAdvertising(Double advertising) {
		this.advertising = advertising;
	}

	public Double getAuto() {
		return auto;
	}

	public void setAuto(Double auto) {
		this.auto = auto;
	}

	public Double getCleaning() {
		return cleaning;
	}

	public void setCleaning(Double cleaning) {
		this.cleaning = cleaning;
	}

	public Double getCommissions() {
		return commissions;
	}

	public void setCommissions(Double commissions) {
		this.commissions = commissions;
	}

	public Double getInsurance() {
		return insurance;
	}

	public void setInsurance(Double insurance) {
		this.insurance = insurance;
	}

	public Double getLegal() {
		return legal;
	}

	public void setLegal(Double legal) {
		this.legal = legal;
	}

	public Double getManagementFees() {
		return managementFees;
	}

	public void setManagementFees(Double managementFees) {
		this.managementFees = managementFees;
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

	public Double getUtilities() {
		return utilities;
	}

	public void setUtilities(Double utilities) {
		this.utilities = utilities;
	}

	public Double getDepreciationExpense() {
		return depreciationExpense;
	}

	public void setDepreciationExpense(Double depreciationExpense) {
		this.depreciationExpense = depreciationExpense;
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
		result = prime * result + ((advertising == null) ? 0 : advertising.hashCode());
		result = prime * result + ((auto == null) ? 0 : auto.hashCode());
		result = prime * result + ((capitalExpenditures == null) ? 0 : capitalExpenditures.hashCode());
		result = prime * result + ((cleaning == null) ? 0 : cleaning.hashCode());
		result = prime * result + ((commissions == null) ? 0 : commissions.hashCode());
		result = prime * result + ((depreciationExpense == null) ? 0 : depreciationExpense.hashCode());
		result = prime * result + ((insurance == null) ? 0 : insurance.hashCode());
		result = prime * result + ((legal == null) ? 0 : legal.hashCode());
		result = prime * result + ((managementFees == null) ? 0 : managementFees.hashCode());
		result = prime * result + ((mortgageInterest == null) ? 0 : mortgageInterest.hashCode());
		result = prime * result + ((otherExpenses == null) ? 0 : otherExpenses.hashCode());
		result = prime * result + ((otherInterest == null) ? 0 : otherInterest.hashCode());
		result = prime * result + ((propertyAddress == null) ? 0 : propertyAddress.hashCode());
		result = prime * result + ((rents == null) ? 0 : rents.hashCode());
		result = prime * result + ((repairs == null) ? 0 : repairs.hashCode());
		result = prime * result + ((supplies == null) ? 0 : supplies.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((taxes == null) ? 0 : taxes.hashCode());
		result = prime * result + ((utilities == null) ? 0 : utilities.hashCode());
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
		RentalIncomeStatement other = (RentalIncomeStatement) obj;
		if (advertising == null) {
			if (other.advertising != null)
				return false;
		} else if (!advertising.equals(other.advertising))
			return false;
		if (auto == null) {
			if (other.auto != null)
				return false;
		} else if (!auto.equals(other.auto))
			return false;
		if (capitalExpenditures == null) {
			if (other.capitalExpenditures != null)
				return false;
		} else if (!capitalExpenditures.equals(other.capitalExpenditures))
			return false;
		if (cleaning == null) {
			if (other.cleaning != null)
				return false;
		} else if (!cleaning.equals(other.cleaning))
			return false;
		if (commissions == null) {
			if (other.commissions != null)
				return false;
		} else if (!commissions.equals(other.commissions))
			return false;
		if (depreciationExpense == null) {
			if (other.depreciationExpense != null)
				return false;
		} else if (!depreciationExpense.equals(other.depreciationExpense))
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
		if (managementFees == null) {
			if (other.managementFees != null)
				return false;
		} else if (!managementFees.equals(other.managementFees))
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
		if (otherInterest == null) {
			if (other.otherInterest != null)
				return false;
		} else if (!otherInterest.equals(other.otherInterest))
			return false;
		if (propertyAddress == null) {
			if (other.propertyAddress != null)
				return false;
		} else if (!propertyAddress.equals(other.propertyAddress))
			return false;
		if (rents == null) {
			if (other.rents != null)
				return false;
		} else if (!rents.equals(other.rents))
			return false;
		if (repairs == null) {
			if (other.repairs != null)
				return false;
		} else if (!repairs.equals(other.repairs))
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
		return true;
	}

	@Override
	public String toString() {
		return "RentalIncomeStatement [tax=" + tax + ", propertyAddress=" + propertyAddress + ", rents=" + rents
				+ ", advertising=" + advertising + ", auto=" + auto + ", cleaning=" + cleaning + ", commissions="
				+ commissions + ", insurance=" + insurance + ", legal=" + legal + ", managementFees=" + managementFees
				+ ", mortgageInterest=" + mortgageInterest + ", otherInterest=" + otherInterest + ", repairs=" + repairs
				+ ", supplies=" + supplies + ", taxes=" + taxes + ", utilities=" + utilities + ", depreciationExpense="
				+ depreciationExpense + ", otherExpenses=" + otherExpenses + ", capitalExpenditures="
				+ capitalExpenditures + "]";
	}

	private static final Logger log = LoggerFactory.getLogger(RentalIncomeStatement.class);

	public RentalIncomeStatement getRentalIncomeStatement(int internalId) throws FDXException {
		try {
			
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);

			RentalIncomeStatement rentalIncomeStatement = template.queryForObject(
					"select * from "+ DeveloperContext.getDeveloperSchema() +".rentalIncomeStatement where internalId in (:internalId)", parameters,
					new RentalIncomeStatementRowMapper());
//			OtherExpenses
			List<DescriptionAmount> otherExpensesList = rentalIncomeStatement.getOtherExpenses();
			List<DescriptionAmount> otherExpensesListNew = new ArrayList<>();
			if (rentalIncomeStatement.getOtherExpenses() != null) {
				for (DescriptionAmount descriptionAmountIterator : otherExpensesList) {
					DescriptionAmount descriptionAmount = descriptionAmountIterator
							.getDescriptionAmount(descriptionAmountIterator.getDescAmountId());
					otherExpensesListNew.add(descriptionAmount);
				}
				rentalIncomeStatement.setOtherExpenses(otherExpensesListNew);
			}

//			DateAmount- Capital Expenditures
			List<DateAmount> dateAmountList = rentalIncomeStatement.getCapitalExpenditures();
			List<DateAmount> dateAmountListNew = new ArrayList<>();
			if (rentalIncomeStatement.getCapitalExpenditures() != null) {
				for (DateAmount dateAmountIterator : dateAmountList) {
					DateAmount DateAmount = dateAmountIterator
							.getDateAmountDetails(dateAmountIterator.getDateamountid());
					dateAmountListNew.add(DateAmount);
				}
				rentalIncomeStatement.setCapitalExpenditures(dateAmountListNew);
			}

//			Property Address
			Address address = new Address();
			if (rentalIncomeStatement.getPropertyAddress() != null) {
				address = address.getAddress(rentalIncomeStatement.getPropertyAddress().getAddressId());
				rentalIncomeStatement.setPropertyAddress(address);
			}

			return rentalIncomeStatement;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("RentalIncomeStatement : ", e);
			throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
		}
	}

}
