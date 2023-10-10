package com.fdx.api.model46.modelimpl;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.OptBoolean;
import io.swagger.annotations.ApiModelProperty;

/**
 * TaxW2GAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxW2GAllOf   {
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
  private LocalDate dateWon;

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

  @JsonProperty("window")
  private String window;

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

  public TaxW2GAllOf payerNameAddress(NameAddressPhone payerNameAddress) {
    this.payerNameAddress = payerNameAddress;
    return this;
  }

  /**
   * Get payerNameAddress
   * @return payerNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddressPhone getPayerNameAddress() {
    return payerNameAddress;
  }

  public void setPayerNameAddress(NameAddressPhone payerNameAddress) {
    this.payerNameAddress = payerNameAddress;
  }

  public TaxW2GAllOf payerTin(String payerTin) {
    this.payerTin = payerTin;
    return this;
  }

  /**
   * PAYER'S federal identification number
   * @return payerTin
  */
  @ApiModelProperty(value = "PAYER'S federal identification number")


  public String getPayerTin() {
    return payerTin;
  }

  public void setPayerTin(String payerTin) {
    this.payerTin = payerTin;
  }

  public TaxW2GAllOf winnerNameAddress(NameAddress winnerNameAddress) {
    this.winnerNameAddress = winnerNameAddress;
    return this;
  }

  /**
   * Get winnerNameAddress
   * @return winnerNameAddress
  */
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getWinnerNameAddress() {
    return winnerNameAddress;
  }

  public void setWinnerNameAddress(NameAddress winnerNameAddress) {
    this.winnerNameAddress = winnerNameAddress;
  }

  public TaxW2GAllOf winnings(Double winnings) {
    this.winnings = winnings;
    return this;
  }

  /**
   * Box 1, Reportable winnings
   * @return winnings
  */
  @ApiModelProperty(value = "Box 1, Reportable winnings")


  public Double getWinnings() {
    return winnings;
  }

  public void setWinnings(Double winnings) {
    this.winnings = winnings;
  }

  public TaxW2GAllOf dateWon(LocalDate dateWon) {
    this.dateWon = dateWon;
    return this;
  }

  /**
   * ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return dateWon
  */
  @ApiModelProperty(value = "ISO 8601 full-date in format 'YYYY-MM-DD' with no time or timezone included according to [IETF RFC3339] (https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  @Valid
@Size(max=10) 
  public LocalDate getDateWon() {
    return dateWon;
  }

  public void setDateWon(LocalDate dateWon) {
    this.dateWon = dateWon;
  }

  public TaxW2GAllOf typeOfWager(String typeOfWager) {
    this.typeOfWager = typeOfWager;
    return this;
  }

  /**
   * Box 3, Type of wager
   * @return typeOfWager
  */
  @ApiModelProperty(value = "Box 3, Type of wager")


  public String getTypeOfWager() {
    return typeOfWager;
  }

  public void setTypeOfWager(String typeOfWager) {
    this.typeOfWager = typeOfWager;
  }

  public TaxW2GAllOf federalTaxWithheld(Double federalTaxWithheld) {
    this.federalTaxWithheld = federalTaxWithheld;
    return this;
  }

  /**
   * Box 4, Federal income tax withheld
   * @return federalTaxWithheld
  */
  @ApiModelProperty(value = "Box 4, Federal income tax withheld")


  public Double getFederalTaxWithheld() {
    return federalTaxWithheld;
  }

  public void setFederalTaxWithheld(Double federalTaxWithheld) {
    this.federalTaxWithheld = federalTaxWithheld;
  }

  public TaxW2GAllOf transaction(String transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Box 5, Transaction
   * @return transaction
  */
  @ApiModelProperty(value = "Box 5, Transaction")


  public String getTransaction() {
    return transaction;
  }

  public void setTransaction(String transaction) {
    this.transaction = transaction;
  }

  public TaxW2GAllOf race(String race) {
    this.race = race;
    return this;
  }

  /**
   * Box 6, Race
   * @return race
  */
  @ApiModelProperty(value = "Box 6, Race")


  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public TaxW2GAllOf identicalWinnings(Double identicalWinnings) {
    this.identicalWinnings = identicalWinnings;
    return this;
  }

  /**
   * Box 7, Winnings from identical wagers
   * @return identicalWinnings
  */
  @ApiModelProperty(value = "Box 7, Winnings from identical wagers")


  public Double getIdenticalWinnings() {
    return identicalWinnings;
  }

  public void setIdenticalWinnings(Double identicalWinnings) {
    this.identicalWinnings = identicalWinnings;
  }

  public TaxW2GAllOf cashier(String cashier) {
    this.cashier = cashier;
    return this;
  }

  /**
   * Box 8, Cashier
   * @return cashier
  */
  @ApiModelProperty(value = "Box 8, Cashier")


  public String getCashier() {
    return cashier;
  }

  public void setCashier(String cashier) {
    this.cashier = cashier;
  }

  public TaxW2GAllOf winnerTin(String winnerTin) {
    this.winnerTin = winnerTin;
    return this;
  }

  /**
   * Box 9, Winner's taxpayer identification no.
   * @return winnerTin
  */
  @ApiModelProperty(value = "Box 9, Winner's taxpayer identification no.")


  public String getWinnerTin() {
    return winnerTin;
  }

  public void setWinnerTin(String winnerTin) {
    this.winnerTin = winnerTin;
  }

  public TaxW2GAllOf window(String window) {
    this.window = window;
    return this;
  }

  /**
   * Box 10, Window
   * @return window
  */
  @ApiModelProperty(value = "Box 10, Window")


  public String getWindow() {
    return window;
  }

  public void setWindow(String window) {
    this.window = window;
  }

  public TaxW2GAllOf firstId(String firstId) {
    this.firstId = firstId;
    return this;
  }

  /**
   * Box 11, First I.D.
   * @return firstId
  */
  @ApiModelProperty(value = "Box 11, First I.D.")


  public String getFirstId() {
    return firstId;
  }

  public void setFirstId(String firstId) {
    this.firstId = firstId;
  }

  public TaxW2GAllOf secondId(String secondId) {
    this.secondId = secondId;
    return this;
  }

  /**
   * Box 12, Second I.D.
   * @return secondId
  */
  @ApiModelProperty(value = "Box 12, Second I.D.")


  public String getSecondId() {
    return secondId;
  }

  public void setSecondId(String secondId) {
    this.secondId = secondId;
  }

  public TaxW2GAllOf payerState(String payerState) {
    this.payerState = payerState;
    return this;
  }

  /**
   * Box 13, State
   * @return payerState
  */
  @ApiModelProperty(value = "Box 13, State")


  public String getPayerState() {
    return payerState;
  }

  public void setPayerState(String payerState) {
    this.payerState = payerState;
  }

  public TaxW2GAllOf stateWinnings(Double stateWinnings) {
    this.stateWinnings = stateWinnings;
    return this;
  }

  /**
   * Box 14, State winnings
   * @return stateWinnings
  */
  @ApiModelProperty(value = "Box 14, State winnings")


  public Double getStateWinnings() {
    return stateWinnings;
  }

  public void setStateWinnings(Double stateWinnings) {
    this.stateWinnings = stateWinnings;
  }

  public TaxW2GAllOf stateTaxWithheld(Double stateTaxWithheld) {
    this.stateTaxWithheld = stateTaxWithheld;
    return this;
  }

  /**
   * Box 15, State income tax withheld
   * @return stateTaxWithheld
  */
  @ApiModelProperty(value = "Box 15, State income tax withheld")


  public Double getStateTaxWithheld() {
    return stateTaxWithheld;
  }

  public void setStateTaxWithheld(Double stateTaxWithheld) {
    this.stateTaxWithheld = stateTaxWithheld;
  }

  public TaxW2GAllOf localWinnings(Double localWinnings) {
    this.localWinnings = localWinnings;
    return this;
  }

  /**
   * Box 16, Local winnings
   * @return localWinnings
  */
  @ApiModelProperty(value = "Box 16, Local winnings")


  public Double getLocalWinnings() {
    return localWinnings;
  }

  public void setLocalWinnings(Double localWinnings) {
    this.localWinnings = localWinnings;
  }

  public TaxW2GAllOf localTaxWithheld(Double localTaxWithheld) {
    this.localTaxWithheld = localTaxWithheld;
    return this;
  }

  /**
   * Box 17, Local income tax withheld
   * @return localTaxWithheld
  */
  @ApiModelProperty(value = "Box 17, Local income tax withheld")


  public Double getLocalTaxWithheld() {
    return localTaxWithheld;
  }

  public void setLocalTaxWithheld(Double localTaxWithheld) {
    this.localTaxWithheld = localTaxWithheld;
  }

  public TaxW2GAllOf localityName(String localityName) {
    this.localityName = localityName;
    return this;
  }

  /**
   * Box 18, Name of locality
   * @return localityName
  */
  @ApiModelProperty(value = "Box 18, Name of locality")


  public String getLocalityName() {
    return localityName;
  }

  public void setLocalityName(String localityName) {
    this.localityName = localityName;
  }

  public TaxW2GAllOf payerStateId(String payerStateId) {
    this.payerStateId = payerStateId;
    return this;
  }

  /**
   * Box 13, Payer's state identification no.
   * @return payerStateId
  */
  @ApiModelProperty(value = "Box 13, Payer's state identification no.")


  public String getPayerStateId() {
    return payerStateId;
  }

  public void setPayerStateId(String payerStateId) {
    this.payerStateId = payerStateId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxW2GAllOf taxW2GAllOf = (TaxW2GAllOf) o;
    return Objects.equals(this.payerNameAddress, taxW2GAllOf.payerNameAddress) &&
        Objects.equals(this.payerTin, taxW2GAllOf.payerTin) &&
        Objects.equals(this.winnerNameAddress, taxW2GAllOf.winnerNameAddress) &&
        Objects.equals(this.winnings, taxW2GAllOf.winnings) &&
        Objects.equals(this.dateWon, taxW2GAllOf.dateWon) &&
        Objects.equals(this.typeOfWager, taxW2GAllOf.typeOfWager) &&
        Objects.equals(this.federalTaxWithheld, taxW2GAllOf.federalTaxWithheld) &&
        Objects.equals(this.transaction, taxW2GAllOf.transaction) &&
        Objects.equals(this.race, taxW2GAllOf.race) &&
        Objects.equals(this.identicalWinnings, taxW2GAllOf.identicalWinnings) &&
        Objects.equals(this.cashier, taxW2GAllOf.cashier) &&
        Objects.equals(this.winnerTin, taxW2GAllOf.winnerTin) &&
        Objects.equals(this.window, taxW2GAllOf.window) &&
        Objects.equals(this.firstId, taxW2GAllOf.firstId) &&
        Objects.equals(this.secondId, taxW2GAllOf.secondId) &&
        Objects.equals(this.payerState, taxW2GAllOf.payerState) &&
        Objects.equals(this.stateWinnings, taxW2GAllOf.stateWinnings) &&
        Objects.equals(this.stateTaxWithheld, taxW2GAllOf.stateTaxWithheld) &&
        Objects.equals(this.localWinnings, taxW2GAllOf.localWinnings) &&
        Objects.equals(this.localTaxWithheld, taxW2GAllOf.localTaxWithheld) &&
        Objects.equals(this.localityName, taxW2GAllOf.localityName) &&
        Objects.equals(this.payerStateId, taxW2GAllOf.payerStateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerNameAddress, payerTin, winnerNameAddress, winnings, dateWon, typeOfWager, federalTaxWithheld, transaction, race, identicalWinnings, cashier, winnerTin, window, firstId, secondId, payerState, stateWinnings, stateTaxWithheld, localWinnings, localTaxWithheld, localityName, payerStateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxW2GAllOf {\n");
    
    sb.append("    payerNameAddress: ").append(toIndentedString(payerNameAddress)).append("\n");
    sb.append("    payerTin: ").append(toIndentedString(payerTin)).append("\n");
    sb.append("    winnerNameAddress: ").append(toIndentedString(winnerNameAddress)).append("\n");
    sb.append("    winnings: ").append(toIndentedString(winnings)).append("\n");
    sb.append("    dateWon: ").append(toIndentedString(dateWon)).append("\n");
    sb.append("    typeOfWager: ").append(toIndentedString(typeOfWager)).append("\n");
    sb.append("    federalTaxWithheld: ").append(toIndentedString(federalTaxWithheld)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    identicalWinnings: ").append(toIndentedString(identicalWinnings)).append("\n");
    sb.append("    cashier: ").append(toIndentedString(cashier)).append("\n");
    sb.append("    winnerTin: ").append(toIndentedString(winnerTin)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
    sb.append("    firstId: ").append(toIndentedString(firstId)).append("\n");
    sb.append("    secondId: ").append(toIndentedString(secondId)).append("\n");
    sb.append("    payerState: ").append(toIndentedString(payerState)).append("\n");
    sb.append("    stateWinnings: ").append(toIndentedString(stateWinnings)).append("\n");
    sb.append("    stateTaxWithheld: ").append(toIndentedString(stateTaxWithheld)).append("\n");
    sb.append("    localWinnings: ").append(toIndentedString(localWinnings)).append("\n");
    sb.append("    localTaxWithheld: ").append(toIndentedString(localTaxWithheld)).append("\n");
    sb.append("    localityName: ").append(toIndentedString(localityName)).append("\n");
    sb.append("    payerStateId: ").append(toIndentedString(payerStateId)).append("\n");
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
}

