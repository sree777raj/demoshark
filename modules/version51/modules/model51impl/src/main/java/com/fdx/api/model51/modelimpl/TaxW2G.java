package com.fdx.api.model51.modelimpl;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.OptBoolean;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.DeveloperContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fdx.api.model51.config.ConnectionConfigApi51;
import com.fdx.api.model51.mapper.TaxW2GStatementRowMapper;

import io.swagger.annotations.ApiModel;

/**
 * Certain Gambling Winnings
 */
@ApiModel(description = "Certain Gambling Winnings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxW2G {

	NamedParameterJdbcTemplate template;

	@JsonUnwrapped
	private Tax tax;

	@JsonProperty("payerNameAddress")
	private NameAddressPhone payerNameAddress;

	@JsonProperty("payerTin")
	private String payerTin;

	@JsonProperty("winnerNameAddress")
	private NameAddress winnerNameAddress;

	@JsonProperty("winnings")
	private Double winnings;

	@JsonProperty("dateWon")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", lenient = OptBoolean.FALSE)
	private Date dateWon;

	@JsonProperty("typeOfWager")
	private String typeOfWager;

	@JsonProperty("federalTaxWithheld")
	private Double federalTaxWithheld;

	@JsonProperty("transaction")
	private String transaction;

	@JsonProperty("race")
	private String race;

	@JsonProperty("identicalWinnings")
	private Double identicalWinnings;

	@JsonProperty("cashier")
	private String cashier;

	@JsonProperty("winnerTin")
	private String winnerTin;

	@JsonProperty("bettingwindow")
	private String bettingwindow;

	@JsonProperty("firstId")
	private String firstId;

	@JsonProperty("secondId")
	private String secondId;

	@JsonProperty("payerState")
	private String payerState;

	@JsonProperty("stateWinnings")
	private Double stateWinnings;

	@JsonProperty("stateTaxWithheld")
	private Double stateTaxWithheld;

	@JsonProperty("localWinnings")
	private Double localWinnings;

	@JsonProperty("localTaxWithheld")
	private Double localTaxWithheld;

	@JsonProperty("localityName")
	private String localityName;

	@JsonProperty("payerStateId")
	private String payerStateId;

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public NameAddressPhone getPayerNameAddress() {
		return payerNameAddress;
	}

	public void setPayerNameAddress(NameAddressPhone payerNameAddress) {
		this.payerNameAddress = payerNameAddress;
	}

	public String getPayerTin() {
		return payerTin;
	}

	public void setPayerTin(String payerTin) {
		this.payerTin = payerTin;
	}

	public NameAddress getWinnerNameAddress() {
		return winnerNameAddress;
	}

	public void setWinnerNameAddress(NameAddress winnerNameAddress) {
		this.winnerNameAddress = winnerNameAddress;
	}

	public Double getWinnings() {
		return winnings;
	}

	public void setWinnings(Double winnings) {
		this.winnings = winnings;
	}

	public Date getDateWon() {
		return dateWon;
	}

	public void setDateWon(Date dateWon) {
		this.dateWon = dateWon;
	}

	public String getTypeOfWager() {
		return typeOfWager;
	}

	public void setTypeOfWager(String typeOfWager) {
		this.typeOfWager = typeOfWager;
	}

	public Double getFederalTaxWithheld() {
		return federalTaxWithheld;
	}

	public void setFederalTaxWithheld(Double federalTaxWithheld) {
		this.federalTaxWithheld = federalTaxWithheld;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Double getIdenticalWinnings() {
		return identicalWinnings;
	}

	public void setIdenticalWinnings(Double identicalWinnings) {
		this.identicalWinnings = identicalWinnings;
	}

	public String getCashier() {
		return cashier;
	}

	public void setCashier(String cashier) {
		this.cashier = cashier;
	}

	public String getWinnerTin() {
		return winnerTin;
	}

	public void setWinnerTin(String winnerTin) {
		this.winnerTin = winnerTin;
	}

	public String getBettingWindow() {
		return bettingwindow;
	}

	public void setBettingWindow(String bettingwindow) {
		this.bettingwindow = bettingwindow;
	}

	public String getFirstId() {
		return firstId;
	}

	public void setFirstId(String firstId) {
		this.firstId = firstId;
	}

	public String getSecondId() {
		return secondId;
	}

	public void setSecondId(String secondId) {
		this.secondId = secondId;
	}

	public String getPayerState() {
		return payerState;
	}

	public void setPayerState(String payerState) {
		this.payerState = payerState;
	}

	public Double getStateWinnings() {
		return stateWinnings;
	}

	public void setStateWinnings(Double stateWinnings) {
		this.stateWinnings = stateWinnings;
	}

	public Double getStateTaxWithheld() {
		return stateTaxWithheld;
	}

	public void setStateTaxWithheld(Double stateTaxWithheld) {
		this.stateTaxWithheld = stateTaxWithheld;
	}

	public Double getLocalWinnings() {
		return localWinnings;
	}

	public void setLocalWinnings(Double localWinnings) {
		this.localWinnings = localWinnings;
	}

	public Double getLocalTaxWithheld() {
		return localTaxWithheld;
	}

	public void setLocalTaxWithheld(Double localTaxWithheld) {
		this.localTaxWithheld = localTaxWithheld;
	}

	public String getLocalityName() {
		return localityName;
	}

	public void setLocalityName(String localityName) {
		this.localityName = localityName;
	}

	public String getPayerStateId() {
		return payerStateId;
	}

	public void setPayerStateId(String payerStateId) {
		this.payerStateId = payerStateId;
	}

	@Override
	public String toString() {
		return "TaxW2G [tax=" + tax + ", payerNameAddress=" + payerNameAddress + ", payerTin=" + payerTin
				+ ", winnerNameAddress=" + winnerNameAddress + ", winnings=" + winnings + ", dateWon=" + dateWon
				+ ", typeOfWager=" + typeOfWager + ", federalTaxWithheld=" + federalTaxWithheld + ", transaction="
				+ transaction + ", race=" + race + ", identicalWinnings=" + identicalWinnings + ", cashier=" + cashier
				+ ", winnerTin=" + winnerTin + ", bettingwindow=" + bettingwindow + ", firstId=" + firstId
				+ ", secondId=" + secondId + ", payerState=" + payerState + ", stateWinnings=" + stateWinnings
				+ ", stateTaxWithheld=" + stateTaxWithheld + ", localWinnings=" + localWinnings + ", localTaxWithheld="
				+ localTaxWithheld + ", localityName=" + localityName + ", payerStateId=" + payerStateId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cashier == null) ? 0 : cashier.hashCode());
		result = prime * result + ((dateWon == null) ? 0 : dateWon.hashCode());
		result = prime * result + ((federalTaxWithheld == null) ? 0 : federalTaxWithheld.hashCode());
		result = prime * result + ((firstId == null) ? 0 : firstId.hashCode());
		result = prime * result + ((identicalWinnings == null) ? 0 : identicalWinnings.hashCode());
		result = prime * result + ((localTaxWithheld == null) ? 0 : localTaxWithheld.hashCode());
		result = prime * result + ((localWinnings == null) ? 0 : localWinnings.hashCode());
		result = prime * result + ((localityName == null) ? 0 : localityName.hashCode());
		result = prime * result + ((payerNameAddress == null) ? 0 : payerNameAddress.hashCode());
		result = prime * result + ((payerState == null) ? 0 : payerState.hashCode());
		result = prime * result + ((payerStateId == null) ? 0 : payerStateId.hashCode());
		result = prime * result + ((payerTin == null) ? 0 : payerTin.hashCode());
		result = prime * result + ((race == null) ? 0 : race.hashCode());
		result = prime * result + ((secondId == null) ? 0 : secondId.hashCode());
		result = prime * result + ((stateTaxWithheld == null) ? 0 : stateTaxWithheld.hashCode());
		result = prime * result + ((stateWinnings == null) ? 0 : stateWinnings.hashCode());
		result = prime * result + ((tax == null) ? 0 : tax.hashCode());
		result = prime * result + ((transaction == null) ? 0 : transaction.hashCode());
		result = prime * result + ((typeOfWager == null) ? 0 : typeOfWager.hashCode());
		result = prime * result + ((bettingwindow == null) ? 0 : bettingwindow.hashCode());
		result = prime * result + ((winnerNameAddress == null) ? 0 : winnerNameAddress.hashCode());
		result = prime * result + ((winnerTin == null) ? 0 : winnerTin.hashCode());
		result = prime * result + ((winnings == null) ? 0 : winnings.hashCode());
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
		TaxW2G other = (TaxW2G) obj;
		if (cashier == null) {
			if (other.cashier != null)
				return false;
		} else if (!cashier.equals(other.cashier))
			return false;
		if (dateWon == null) {
			if (other.dateWon != null)
				return false;
		} else if (!dateWon.equals(other.dateWon))
			return false;
		if (federalTaxWithheld == null) {
			if (other.federalTaxWithheld != null)
				return false;
		} else if (!federalTaxWithheld.equals(other.federalTaxWithheld))
			return false;
		if (firstId == null) {
			if (other.firstId != null)
				return false;
		} else if (!firstId.equals(other.firstId))
			return false;
		if (identicalWinnings == null) {
			if (other.identicalWinnings != null)
				return false;
		} else if (!identicalWinnings.equals(other.identicalWinnings))
			return false;
		if (localTaxWithheld == null) {
			if (other.localTaxWithheld != null)
				return false;
		} else if (!localTaxWithheld.equals(other.localTaxWithheld))
			return false;
		if (localWinnings == null) {
			if (other.localWinnings != null)
				return false;
		} else if (!localWinnings.equals(other.localWinnings))
			return false;
		if (localityName == null) {
			if (other.localityName != null)
				return false;
		} else if (!localityName.equals(other.localityName))
			return false;
		if (payerNameAddress == null) {
			if (other.payerNameAddress != null)
				return false;
		} else if (!payerNameAddress.equals(other.payerNameAddress))
			return false;
		if (payerState == null) {
			if (other.payerState != null)
				return false;
		} else if (!payerState.equals(other.payerState))
			return false;
		if (payerStateId == null) {
			if (other.payerStateId != null)
				return false;
		} else if (!payerStateId.equals(other.payerStateId))
			return false;
		if (payerTin == null) {
			if (other.payerTin != null)
				return false;
		} else if (!payerTin.equals(other.payerTin))
			return false;
		if (race == null) {
			if (other.race != null)
				return false;
		} else if (!race.equals(other.race))
			return false;
		if (secondId == null) {
			if (other.secondId != null)
				return false;
		} else if (!secondId.equals(other.secondId))
			return false;
		if (stateTaxWithheld == null) {
			if (other.stateTaxWithheld != null)
				return false;
		} else if (!stateTaxWithheld.equals(other.stateTaxWithheld))
			return false;
		if (stateWinnings == null) {
			if (other.stateWinnings != null)
				return false;
		} else if (!stateWinnings.equals(other.stateWinnings))
			return false;
		if (tax == null) {
			if (other.tax != null)
				return false;
		} else if (!tax.equals(other.tax))
			return false;
		if (transaction == null) {
			if (other.transaction != null)
				return false;
		} else if (!transaction.equals(other.transaction))
			return false;
		if (typeOfWager == null) {
			if (other.typeOfWager != null)
				return false;
		} else if (!typeOfWager.equals(other.typeOfWager))
			return false;
		if (bettingwindow == null) {
			if (other.bettingwindow != null)
				return false;
		} else if (!bettingwindow.equals(other.bettingwindow))
			return false;
		if (winnerNameAddress == null) {
			if (other.winnerNameAddress != null)
				return false;
		} else if (!winnerNameAddress.equals(other.winnerNameAddress))
			return false;
		if (winnerTin == null) {
			if (other.winnerTin != null)
				return false;
		} else if (!winnerTin.equals(other.winnerTin))
			return false;
		if (winnings == null) {
			if (other.winnings != null)
				return false;
		} else if (!winnings.equals(other.winnings))
			return false;
		return true;
	}

	private static final Logger log = LoggerFactory.getLogger(TaxW2G.class);

	public TaxW2G getTaxW2G(int internalId) throws FDXException {
		TaxW2G taxW2G = new TaxW2G();
		try {
			template = ConnectionConfigApi51.getTemplate();;
			SqlParameterSource parameters = new MapSqlParameterSource("internalId", internalId);
			try {
				taxW2G = template.queryForObject("select * from "+ DeveloperContext.getDeveloperSchema() +".taxW2G where internalId in (:internalId)",
						parameters, new TaxW2GStatementRowMapper());
			} catch (EmptyResultDataAccessException e) {
				throw new FDXException("TaxW2G not found", 0);
			}
//			PayerNameAddress Start
			NameAddressPhone nameAddressPhone = new NameAddressPhone();
			if (taxW2G.getPayerNameAddress() != null) {
				nameAddressPhone = nameAddressPhone
						.getNameAddressPhoneDetails(taxW2G.getPayerNameAddress().getNameAddressId());
				taxW2G.setPayerNameAddress(nameAddressPhone);
			}
//			PayerNameAddress End

//			WinnerNameAddress Start
			NameAddress winnerNameAddress = new NameAddress();
			if (taxW2G.getWinnerNameAddress() != null) {
				winnerNameAddress = winnerNameAddress
						.getNameAddressDetails(taxW2G.getWinnerNameAddress().getNameAddressId());
				taxW2G.setWinnerNameAddress(winnerNameAddress);
			}
//			WinnerNameAddress End
			return taxW2G;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("TaxW2G : ", e);
			throw new FDXException(e,500);
		}
	}

}
