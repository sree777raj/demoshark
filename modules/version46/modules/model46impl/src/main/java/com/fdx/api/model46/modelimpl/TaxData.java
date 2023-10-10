package com.fdx.api.model46.modelimpl;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fdx.common.exception.FDXException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fdx.api.model46.config.ConnectionConfigApi46;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tax data container for API requests and responses
 */
@ApiModel(description = "Tax data container for API requests and responses")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-31T16:14:56.890768600+05:30[Asia/Calcutta]")
public class TaxData {

	NamedParameterJdbcTemplate template;

	@JsonProperty("businessIncomeStatement")
	private BusinessIncomeStatement businessIncomeStatement;

	@JsonProperty("farmIncomeStatement")
	private FarmIncomeStatement farmIncomeStatement;

	@JsonProperty("farmRentalIncomeStatement")
	private FarmRentalIncomeStatement farmRentalIncomeStatement;

	@JsonProperty("rentalIncomeStatement")
	private RentalIncomeStatement rentalIncomeStatement;

	@JsonProperty("royaltyIncomeStatement")
	private RoyaltyIncomeStatement royaltyIncomeStatement;

	@JsonProperty("tax1041K1")
	private Tax1041K1 tax1041K1;

	@JsonProperty("tax1042S")
	private Tax1042S tax1042S;

	@JsonProperty("tax1065K1")
	private Tax1065K1 tax1065K1;

	@JsonProperty("tax1095A")
	private Tax1095A tax1095A;

	@JsonProperty("tax1095B")
	private Tax1095B tax1095B;

	@JsonProperty("tax1095C")
	private Tax1095C tax1095C;

	@JsonProperty("tax1097Btc")
	private Tax1097Btc tax1097Btc;

	@JsonProperty("tax1098")
	private Tax1098 tax1098;

	@JsonProperty("tax1098C")
	private Tax1098C tax1098C;

	@JsonProperty("tax1098E")
	private Tax1098E tax1098E;

	@JsonProperty("tax1098Ma")
	private Tax1098Ma tax1098Ma;

	@JsonProperty("tax1098Q")
	private Tax1098Q tax1098Q;

	@JsonProperty("tax1098T")
	private Tax1098T tax1098T;

	@JsonProperty("tax1099A")
	private Tax1099A tax1099A;

	@JsonProperty("tax1099B")
	private Tax1099B tax1099B;

	@JsonProperty("tax1099C")
	private Tax1099C tax1099C;

	@JsonProperty("tax1099Cap")
	private Tax1099Cap tax1099Cap;

	@JsonProperty("tax1099Div")
	private Tax1099Div tax1099Div;

	@JsonProperty("tax1099G")
	private Tax1099G tax1099G;

	@JsonProperty("tax1099H")
	private Tax1099H tax1099H;

	@JsonProperty("tax1099Int")
	private Tax1099Int tax1099Int;

	@JsonProperty("tax1099K")
	private Tax1099K tax1099K;

	@JsonProperty("tax1099Ls")
	private Tax1099Ls tax1099Ls;

	@JsonProperty("tax1099Ltc")
	private Tax1099Ltc tax1099Ltc;

	@JsonProperty("tax1099Misc")
	private Tax1099Misc tax1099Misc;

	@JsonProperty("tax1099Nec")
	private Tax1099Nec tax1099Nec;

	@JsonProperty("tax1099Oid")
	private Tax1099Oid tax1099Oid;

	@JsonProperty("tax1099Patr")
	private Tax1099Patr tax1099Patr;

	@JsonProperty("tax1099Q")
	private Tax1099Q tax1099Q;

	@JsonProperty("tax1099Qa")
	private Tax1099Qa tax1099Qa;

	@JsonProperty("tax1099R")
	private Tax1099R tax1099R;

	@JsonProperty("tax1099S")
	private Tax1099S tax1099S;

	@JsonProperty("tax1099Sa")
	private Tax1099Sa tax1099Sa;

	@JsonProperty("tax1099Sb")
	private Tax1099Sb tax1099Sb;

	@JsonProperty("tax1120SK1")
	private Tax1120SK1 tax1120SK1;

	@JsonProperty("tax2439")
	private Tax2439 tax2439;

	@JsonProperty("tax3921")
	private Tax3921 tax3921;

	@JsonProperty("tax3922")
	private Tax3922 tax3922;

	@JsonProperty("tax5227K1")
	private Tax5227K1 tax5227K1;

	@JsonProperty("tax5498")
	private Tax5498 tax5498;

	@JsonProperty("tax5498Esa")
	private Tax5498Esa tax5498Esa;

	@JsonProperty("tax5498Qa")
	private Tax5498Qa tax5498Qa;

	@JsonProperty("tax5498Sa")
	private Tax5498Sa tax5498Sa;

	@JsonProperty("taxW2")
	private TaxW2 taxW2;

	@JsonProperty("taxW2C")
	private TaxW2C taxW2C;

	@JsonProperty("taxW2G")
	private TaxW2G taxW2G;

	@JsonProperty("taxRefundDirectDeposit")
	private TaxRefundDirectDeposit taxRefundDirectDeposit;

	public TaxData businessIncomeStatement(BusinessIncomeStatement businessIncomeStatement) {
		this.businessIncomeStatement = businessIncomeStatement;
		return this;
	}

	/**
	 * Get businessIncomeStatement
	 * 
	 * @return businessIncomeStatement
	 */
	@ApiModelProperty(value = "")

	@Valid

	public BusinessIncomeStatement getBusinessIncomeStatement() {
		return businessIncomeStatement;
	}

	public void setBusinessIncomeStatement(BusinessIncomeStatement businessIncomeStatement) {
		this.businessIncomeStatement = businessIncomeStatement;
	}

	public TaxData farmIncomeStatement(FarmIncomeStatement farmIncomeStatement) {
		this.farmIncomeStatement = farmIncomeStatement;
		return this;
	}

	/**
	 * Get farmIncomeStatement
	 * 
	 * @return farmIncomeStatement
	 */
	@ApiModelProperty(value = "")

	@Valid

	public FarmIncomeStatement getFarmIncomeStatement() {
		return farmIncomeStatement;
	}

	public void setFarmIncomeStatement(FarmIncomeStatement farmIncomeStatement) {
		this.farmIncomeStatement = farmIncomeStatement;
	}

	public TaxData farmRentalIncomeStatement(FarmRentalIncomeStatement farmRentalIncomeStatement) {
		this.farmRentalIncomeStatement = farmRentalIncomeStatement;
		return this;
	}

	/**
	 * Get farmRentalIncomeStatement
	 * 
	 * @return farmRentalIncomeStatement
	 */
	@ApiModelProperty(value = "")

	@Valid

	public FarmRentalIncomeStatement getFarmRentalIncomeStatement() {
		return farmRentalIncomeStatement;
	}

	public void setFarmRentalIncomeStatement(FarmRentalIncomeStatement farmRentalIncomeStatement) {
		this.farmRentalIncomeStatement = farmRentalIncomeStatement;
	}

	public TaxData rentalIncomeStatement(RentalIncomeStatement rentalIncomeStatement) {
		this.rentalIncomeStatement = rentalIncomeStatement;
		return this;
	}

	/**
	 * Get rentalIncomeStatement
	 * 
	 * @return rentalIncomeStatement
	 */
	@ApiModelProperty(value = "")

	@Valid

	public RentalIncomeStatement getRentalIncomeStatement() {
		return rentalIncomeStatement;
	}

	public void setRentalIncomeStatement(RentalIncomeStatement rentalIncomeStatement) {
		this.rentalIncomeStatement = rentalIncomeStatement;
	}

	public TaxData royaltyIncomeStatement(RoyaltyIncomeStatement royaltyIncomeStatement) {
		this.royaltyIncomeStatement = royaltyIncomeStatement;
		return this;
	}

	/**
	 * Get royaltyIncomeStatement
	 * 
	 * @return royaltyIncomeStatement
	 */
	@ApiModelProperty(value = "")

	@Valid

	public RoyaltyIncomeStatement getRoyaltyIncomeStatement() {
		return royaltyIncomeStatement;
	}

	public void setRoyaltyIncomeStatement(RoyaltyIncomeStatement royaltyIncomeStatement) {
		this.royaltyIncomeStatement = royaltyIncomeStatement;
	}

	public TaxData tax1041K1(Tax1041K1 tax1041K1) {
		this.tax1041K1 = tax1041K1;
		return this;
	}

	/**
	 * Get tax1041K1
	 * 
	 * @return tax1041K1
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1041K1 getTax1041K1() {
		return tax1041K1;
	}

	public void setTax1041K1(Tax1041K1 tax1041K1) {
		this.tax1041K1 = tax1041K1;
	}

	public TaxData tax1042S(Tax1042S tax1042S) {
		this.tax1042S = tax1042S;
		return this;
	}

	/**
	 * Get tax1042S
	 * 
	 * @return tax1042S
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1042S getTax1042S() {
		return tax1042S;
	}

	public void setTax1042S(Tax1042S tax1042S) {
		this.tax1042S = tax1042S;
	}

	public TaxData tax1065K1(Tax1065K1 tax1065K1) {
		this.tax1065K1 = tax1065K1;
		return this;
	}

	/**
	 * Get tax1065K1
	 * 
	 * @return tax1065K1
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1065K1 getTax1065K1() {
		return tax1065K1;
	}

	public void setTax1065K1(Tax1065K1 tax1065K1) {
		this.tax1065K1 = tax1065K1;
	}

	public TaxData tax1095A(Tax1095A tax1095A) {
		this.tax1095A = tax1095A;
		return this;
	}

	/**
	 * Get tax1095A
	 * 
	 * @return tax1095A
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1095A getTax1095A() {
		return tax1095A;
	}

	public void setTax1095A(Tax1095A tax1095A) {
		this.tax1095A = tax1095A;
	}

	public TaxData tax1095B(Tax1095B tax1095B) {
		this.tax1095B = tax1095B;
		return this;
	}

	/**
	 * Get tax1095B
	 * 
	 * @return tax1095B
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1095B getTax1095B() {
		return tax1095B;
	}

	public void setTax1095B(Tax1095B tax1095B) {
		this.tax1095B = tax1095B;
	}

	public TaxData tax1095C(Tax1095C tax1095C) {
		this.tax1095C = tax1095C;
		return this;
	}

	/**
	 * Get tax1095C
	 * 
	 * @return tax1095C
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1095C getTax1095C() {
		return tax1095C;
	}

	public void setTax1095C(Tax1095C tax1095C) {
		this.tax1095C = tax1095C;
	}

	public TaxData tax1097Btc(Tax1097Btc tax1097Btc) {
		this.tax1097Btc = tax1097Btc;
		return this;
	}

	/**
	 * Get tax1097Btc
	 * 
	 * @return tax1097Btc
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1097Btc getTax1097Btc() {
		return tax1097Btc;
	}

	public void setTax1097Btc(Tax1097Btc tax1097Btc) {
		this.tax1097Btc = tax1097Btc;
	}

	public TaxData tax1098(Tax1098 tax1098) {
		this.tax1098 = tax1098;
		return this;
	}

	/**
	 * Get tax1098
	 * 
	 * @return tax1098
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1098 getTax1098() {
		return tax1098;
	}

	public void setTax1098(Tax1098 tax1098) {
		this.tax1098 = tax1098;
	}

	public TaxData tax1098C(Tax1098C tax1098C) {
		this.tax1098C = tax1098C;
		return this;
	}

	/**
	 * Get tax1098C
	 * 
	 * @return tax1098C
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1098C getTax1098C() {
		return tax1098C;
	}

	public void setTax1098C(Tax1098C tax1098C) {
		this.tax1098C = tax1098C;
	}

	public TaxData tax1098E(Tax1098E tax1098E) {
		this.tax1098E = tax1098E;
		return this;
	}

	/**
	 * Get tax1098E
	 * 
	 * @return tax1098E
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1098E getTax1098E() {
		return tax1098E;
	}

	public void setTax1098E(Tax1098E tax1098E) {
		this.tax1098E = tax1098E;
	}

	public TaxData tax1098Ma(Tax1098Ma tax1098Ma) {
		this.tax1098Ma = tax1098Ma;
		return this;
	}

	/**
	 * Get tax1098Ma
	 * 
	 * @return tax1098Ma
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1098Ma getTax1098Ma() {
		return tax1098Ma;
	}

	public void setTax1098Ma(Tax1098Ma tax1098Ma) {
		this.tax1098Ma = tax1098Ma;
	}

	public TaxData tax1098Q(Tax1098Q tax1098Q) {
		this.tax1098Q = tax1098Q;
		return this;
	}

	/**
	 * Get tax1098Q
	 * 
	 * @return tax1098Q
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1098Q getTax1098Q() {
		return tax1098Q;
	}

	public void setTax1098Q(Tax1098Q tax1098Q) {
		this.tax1098Q = tax1098Q;
	}

	public TaxData tax1098T(Tax1098T tax1098T) {
		this.tax1098T = tax1098T;
		return this;
	}

	/**
	 * Get tax1098T
	 * 
	 * @return tax1098T
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1098T getTax1098T() {
		return tax1098T;
	}

	public void setTax1098T(Tax1098T tax1098T) {
		this.tax1098T = tax1098T;
	}

	public TaxData tax1099A(Tax1099A tax1099A) {
		this.tax1099A = tax1099A;
		return this;
	}

	/**
	 * Get tax1099A
	 * 
	 * @return tax1099A
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099A getTax1099A() {
		return tax1099A;
	}

	public void setTax1099A(Tax1099A tax1099A) {
		this.tax1099A = tax1099A;
	}

	public TaxData tax1099B(Tax1099B tax1099B) {
		this.tax1099B = tax1099B;
		return this;
	}

	/**
	 * Get tax1099B
	 * 
	 * @return tax1099B
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099B getTax1099B() {
		return tax1099B;
	}

	public void setTax1099B(Tax1099B tax1099B) {
		this.tax1099B = tax1099B;
	}

	public TaxData tax1099C(Tax1099C tax1099C) {
		this.tax1099C = tax1099C;
		return this;
	}

	/**
	 * Get tax1099C
	 * 
	 * @return tax1099C
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099C getTax1099C() {
		return tax1099C;
	}

	public void setTax1099C(Tax1099C tax1099C) {
		this.tax1099C = tax1099C;
	}

	public TaxData tax1099Cap(Tax1099Cap tax1099Cap) {
		this.tax1099Cap = tax1099Cap;
		return this;
	}

	/**
	 * Get tax1099Cap
	 * 
	 * @return tax1099Cap
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Cap getTax1099Cap() {
		return tax1099Cap;
	}

	public void setTax1099Cap(Tax1099Cap tax1099Cap) {
		this.tax1099Cap = tax1099Cap;
	}

	public TaxData tax1099Div(Tax1099Div tax1099Div) {
		this.tax1099Div = tax1099Div;
		return this;
	}

	/**
	 * Get tax1099Div
	 * 
	 * @return tax1099Div
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Div getTax1099Div() {
		return tax1099Div;
	}

	public void setTax1099Div(Tax1099Div tax1099Div) {
		this.tax1099Div = tax1099Div;
	}

	public TaxData tax1099G(Tax1099G tax1099G) {
		this.tax1099G = tax1099G;
		return this;
	}

	/**
	 * Get tax1099G
	 * 
	 * @return tax1099G
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099G getTax1099G() {
		return tax1099G;
	}

	public void setTax1099G(Tax1099G tax1099G) {
		this.tax1099G = tax1099G;
	}

	public TaxData tax1099H(Tax1099H tax1099H) {
		this.tax1099H = tax1099H;
		return this;
	}

	/**
	 * Get tax1099H
	 * 
	 * @return tax1099H
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099H getTax1099H() {
		return tax1099H;
	}

	public void setTax1099H(Tax1099H tax1099H) {
		this.tax1099H = tax1099H;
	}

	public TaxData tax1099Int(Tax1099Int tax1099Int) {
		this.tax1099Int = tax1099Int;
		return this;
	}

	/**
	 * Get tax1099Int
	 * 
	 * @return tax1099Int
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Int getTax1099Int() {
		return tax1099Int;
	}

	public void setTax1099Int(Tax1099Int tax1099Int) {
		this.tax1099Int = tax1099Int;
	}

	public TaxData tax1099K(Tax1099K tax1099K) {
		this.tax1099K = tax1099K;
		return this;
	}

	/**
	 * Get tax1099K
	 * 
	 * @return tax1099K
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099K getTax1099K() {
		return tax1099K;
	}

	public void setTax1099K(Tax1099K tax1099K) {
		this.tax1099K = tax1099K;
	}

	public TaxData tax1099Ls(Tax1099Ls tax1099Ls) {
		this.tax1099Ls = tax1099Ls;
		return this;
	}

	/**
	 * Get tax1099Ls
	 * 
	 * @return tax1099Ls
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Ls getTax1099Ls() {
		return tax1099Ls;
	}

	public void setTax1099Ls(Tax1099Ls tax1099Ls) {
		this.tax1099Ls = tax1099Ls;
	}

	public TaxData tax1099Ltc(Tax1099Ltc tax1099Ltc) {
		this.tax1099Ltc = tax1099Ltc;
		return this;
	}

	/**
	 * Get tax1099Ltc
	 * 
	 * @return tax1099Ltc
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Ltc getTax1099Ltc() {
		return tax1099Ltc;
	}

	public void setTax1099Ltc(Tax1099Ltc tax1099Ltc) {
		this.tax1099Ltc = tax1099Ltc;
	}

	public TaxData tax1099Misc(Tax1099Misc tax1099Misc) {
		this.tax1099Misc = tax1099Misc;
		return this;
	}

	/**
	 * Get tax1099Misc
	 * 
	 * @return tax1099Misc
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Misc getTax1099Misc() {
		return tax1099Misc;
	}

	public void setTax1099Misc(Tax1099Misc tax1099Misc) {
		this.tax1099Misc = tax1099Misc;
	}

	public TaxData tax1099Nec(Tax1099Nec tax1099Nec) {
		this.tax1099Nec = tax1099Nec;
		return this;
	}

	/**
	 * Get tax1099Nec
	 * 
	 * @return tax1099Nec
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Nec getTax1099Nec() {
		return tax1099Nec;
	}

	public void setTax1099Nec(Tax1099Nec tax1099Nec) {
		this.tax1099Nec = tax1099Nec;
	}

	public TaxData tax1099Oid(Tax1099Oid tax1099Oid) {
		this.tax1099Oid = tax1099Oid;
		return this;
	}

	/**
	 * Get tax1099Oid
	 * 
	 * @return tax1099Oid
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Oid getTax1099Oid() {
		return tax1099Oid;
	}

	public void setTax1099Oid(Tax1099Oid tax1099Oid) {
		this.tax1099Oid = tax1099Oid;
	}

	public TaxData tax1099Patr(Tax1099Patr tax1099Patr) {
		this.tax1099Patr = tax1099Patr;
		return this;
	}

	/**
	 * Get tax1099Patr
	 * 
	 * @return tax1099Patr
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Patr getTax1099Patr() {
		return tax1099Patr;
	}

	public void setTax1099Patr(Tax1099Patr tax1099Patr) {
		this.tax1099Patr = tax1099Patr;
	}

	public TaxData tax1099Q(Tax1099Q tax1099Q) {
		this.tax1099Q = tax1099Q;
		return this;
	}

	/**
	 * Get tax1099Q
	 * 
	 * @return tax1099Q
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Q getTax1099Q() {
		return tax1099Q;
	}

	public void setTax1099Q(Tax1099Q tax1099Q) {
		this.tax1099Q = tax1099Q;
	}

	public TaxData tax1099Qa(Tax1099Qa tax1099Qa) {
		this.tax1099Qa = tax1099Qa;
		return this;
	}

	/**
	 * Get tax1099Qa
	 * 
	 * @return tax1099Qa
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Qa getTax1099Qa() {
		return tax1099Qa;
	}

	public void setTax1099Qa(Tax1099Qa tax1099Qa) {
		this.tax1099Qa = tax1099Qa;
	}

	public TaxData tax1099R(Tax1099R tax1099R) {
		this.tax1099R = tax1099R;
		return this;
	}

	/**
	 * Get tax1099R
	 * 
	 * @return tax1099R
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099R getTax1099R() {
		return tax1099R;
	}

	public void setTax1099R(Tax1099R tax1099R) {
		this.tax1099R = tax1099R;
	}

	public TaxData tax1099S(Tax1099S tax1099S) {
		this.tax1099S = tax1099S;
		return this;
	}

	/**
	 * Get tax1099S
	 * 
	 * @return tax1099S
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099S getTax1099S() {
		return tax1099S;
	}

	public void setTax1099S(Tax1099S tax1099S) {
		this.tax1099S = tax1099S;
	}

	public TaxData tax1099Sa(Tax1099Sa tax1099Sa) {
		this.tax1099Sa = tax1099Sa;
		return this;
	}

	/**
	 * Get tax1099Sa
	 * 
	 * @return tax1099Sa
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Sa getTax1099Sa() {
		return tax1099Sa;
	}

	public void setTax1099Sa(Tax1099Sa tax1099Sa) {
		this.tax1099Sa = tax1099Sa;
	}

	public TaxData tax1099Sb(Tax1099Sb tax1099Sb) {
		this.tax1099Sb = tax1099Sb;
		return this;
	}

	/**
	 * Get tax1099Sb
	 * 
	 * @return tax1099Sb
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1099Sb getTax1099Sb() {
		return tax1099Sb;
	}

	public void setTax1099Sb(Tax1099Sb tax1099Sb) {
		this.tax1099Sb = tax1099Sb;
	}

	public TaxData tax1120SK1(Tax1120SK1 tax1120SK1) {
		this.tax1120SK1 = tax1120SK1;
		return this;
	}

	/**
	 * Get tax1120SK1
	 * 
	 * @return tax1120SK1
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax1120SK1 getTax1120SK1() {
		return tax1120SK1;
	}

	public void setTax1120SK1(Tax1120SK1 tax1120SK1) {
		this.tax1120SK1 = tax1120SK1;
	}

	public TaxData tax2439(Tax2439 tax2439) {
		this.tax2439 = tax2439;
		return this;
	}

	/**
	 * Get tax2439
	 * 
	 * @return tax2439
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax2439 getTax2439() {
		return tax2439;
	}

	public void setTax2439(Tax2439 tax2439) {
		this.tax2439 = tax2439;
	}

	public TaxData tax3921(Tax3921 tax3921) {
		this.tax3921 = tax3921;
		return this;
	}

	/**
	 * Get tax3921
	 * 
	 * @return tax3921
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax3921 getTax3921() {
		return tax3921;
	}

	public void setTax3921(Tax3921 tax3921) {
		this.tax3921 = tax3921;
	}

	public TaxData tax3922(Tax3922 tax3922) {
		this.tax3922 = tax3922;
		return this;
	}

	/**
	 * Get tax3922
	 * 
	 * @return tax3922
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax3922 getTax3922() {
		return tax3922;
	}

	public void setTax3922(Tax3922 tax3922) {
		this.tax3922 = tax3922;
	}

	public TaxData tax5227K1(Tax5227K1 tax5227K1) {
		this.tax5227K1 = tax5227K1;
		return this;
	}

	/**
	 * Get tax5227K1
	 * 
	 * @return tax5227K1
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax5227K1 getTax5227K1() {
		return tax5227K1;
	}

	public void setTax5227K1(Tax5227K1 tax5227K1) {
		this.tax5227K1 = tax5227K1;
	}

	public TaxData tax5498(Tax5498 tax5498) {
		this.tax5498 = tax5498;
		return this;
	}

	/**
	 * Get tax5498
	 * 
	 * @return tax5498
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax5498 getTax5498() {
		return tax5498;
	}

	public void setTax5498(Tax5498 tax5498) {
		this.tax5498 = tax5498;
	}

	public TaxData tax5498Esa(Tax5498Esa tax5498Esa) {
		this.tax5498Esa = tax5498Esa;
		return this;
	}

	/**
	 * Get tax5498Esa
	 * 
	 * @return tax5498Esa
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax5498Esa getTax5498Esa() {
		return tax5498Esa;
	}

	public void setTax5498Esa(Tax5498Esa tax5498Esa) {
		this.tax5498Esa = tax5498Esa;
	}

	public TaxData tax5498Qa(Tax5498Qa tax5498Qa) {
		this.tax5498Qa = tax5498Qa;
		return this;
	}

	/**
	 * Get tax5498Qa
	 * 
	 * @return tax5498Qa
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax5498Qa getTax5498Qa() {
		return tax5498Qa;
	}

	public void setTax5498Qa(Tax5498Qa tax5498Qa) {
		this.tax5498Qa = tax5498Qa;
	}

	public TaxData tax5498Sa(Tax5498Sa tax5498Sa) {
		this.tax5498Sa = tax5498Sa;
		return this;
	}

	/**
	 * Get tax5498Sa
	 * 
	 * @return tax5498Sa
	 */
	@ApiModelProperty(value = "")

	@Valid

	public Tax5498Sa getTax5498Sa() {
		return tax5498Sa;
	}

	public void setTax5498Sa(Tax5498Sa tax5498Sa) {
		this.tax5498Sa = tax5498Sa;
	}

	public TaxData taxW2(TaxW2 taxW2) {
		this.taxW2 = taxW2;
		return this;
	}

	/**
	 * Get taxW2
	 * 
	 * @return taxW2
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TaxW2 getTaxW2() {
		return taxW2;
	}

	public void setTaxW2(TaxW2 taxW2) {
		this.taxW2 = taxW2;
	}

	public TaxData taxW2C(TaxW2C taxW2C) {
		this.taxW2C = taxW2C;
		return this;
	}

	/**
	 * Get taxW2C
	 * 
	 * @return taxW2C
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TaxW2C getTaxW2C() {
		return taxW2C;
	}

	public void setTaxW2C(TaxW2C taxW2C) {
		this.taxW2C = taxW2C;
	}

	public TaxData taxW2G(TaxW2G taxW2G) {
		this.taxW2G = taxW2G;
		return this;
	}

	/**
	 * Get taxW2G
	 * 
	 * @return taxW2G
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TaxW2G getTaxW2G() {
		return taxW2G;
	}

	public void setTaxW2G(TaxW2G taxW2G) {
		this.taxW2G = taxW2G;
	}

	public TaxData taxRefundDirectDeposit(TaxRefundDirectDeposit taxRefundDirectDeposit) {
		this.taxRefundDirectDeposit = taxRefundDirectDeposit;
		return this;
	}

	/**
	 * Get taxRefundDirectDeposit
	 * 
	 * @return taxRefundDirectDeposit
	 */
	@ApiModelProperty(value = "")

	@Valid

	public TaxRefundDirectDeposit getTaxRefundDirectDeposit() {
		return taxRefundDirectDeposit;
	}

	public void setTaxRefundDirectDeposit(TaxRefundDirectDeposit taxRefundDirectDeposit) {
		this.taxRefundDirectDeposit = taxRefundDirectDeposit;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TaxData taxData = (TaxData) o;
		return Objects.equals(this.businessIncomeStatement, taxData.businessIncomeStatement)
				&& Objects.equals(this.farmIncomeStatement, taxData.farmIncomeStatement)
				&& Objects.equals(this.farmRentalIncomeStatement, taxData.farmRentalIncomeStatement)
				&& Objects.equals(this.rentalIncomeStatement, taxData.rentalIncomeStatement)
				&& Objects.equals(this.royaltyIncomeStatement, taxData.royaltyIncomeStatement)
				&& Objects.equals(this.tax1041K1, taxData.tax1041K1) && Objects.equals(this.tax1042S, taxData.tax1042S)
				&& Objects.equals(this.tax1065K1, taxData.tax1065K1) && Objects.equals(this.tax1095A, taxData.tax1095A)
				&& Objects.equals(this.tax1095B, taxData.tax1095B) && Objects.equals(this.tax1095C, taxData.tax1095C)
				&& Objects.equals(this.tax1097Btc, taxData.tax1097Btc) && Objects.equals(this.tax1098, taxData.tax1098)
				&& Objects.equals(this.tax1098C, taxData.tax1098C) && Objects.equals(this.tax1098E, taxData.tax1098E)
				&& Objects.equals(this.tax1098Ma, taxData.tax1098Ma) && Objects.equals(this.tax1098Q, taxData.tax1098Q)
				&& Objects.equals(this.tax1098T, taxData.tax1098T) && Objects.equals(this.tax1099A, taxData.tax1099A)
				&& Objects.equals(this.tax1099B, taxData.tax1099B) && Objects.equals(this.tax1099C, taxData.tax1099C)
				&& Objects.equals(this.tax1099Cap, taxData.tax1099Cap)
				&& Objects.equals(this.tax1099Div, taxData.tax1099Div)
				&& Objects.equals(this.tax1099G, taxData.tax1099G) && Objects.equals(this.tax1099H, taxData.tax1099H)
				&& Objects.equals(this.tax1099Int, taxData.tax1099Int)
				&& Objects.equals(this.tax1099K, taxData.tax1099K) && Objects.equals(this.tax1099Ls, taxData.tax1099Ls)
				&& Objects.equals(this.tax1099Ltc, taxData.tax1099Ltc)
				&& Objects.equals(this.tax1099Misc, taxData.tax1099Misc)
				&& Objects.equals(this.tax1099Nec, taxData.tax1099Nec)
				&& Objects.equals(this.tax1099Oid, taxData.tax1099Oid)
				&& Objects.equals(this.tax1099Patr, taxData.tax1099Patr)
				&& Objects.equals(this.tax1099Q, taxData.tax1099Q) && Objects.equals(this.tax1099Qa, taxData.tax1099Qa)
				&& Objects.equals(this.tax1099R, taxData.tax1099R) && Objects.equals(this.tax1099S, taxData.tax1099S)
				&& Objects.equals(this.tax1099Sa, taxData.tax1099Sa)
				&& Objects.equals(this.tax1099Sb, taxData.tax1099Sb)
				&& Objects.equals(this.tax1120SK1, taxData.tax1120SK1) && Objects.equals(this.tax2439, taxData.tax2439)
				&& Objects.equals(this.tax3921, taxData.tax3921) && Objects.equals(this.tax3922, taxData.tax3922)
				&& Objects.equals(this.tax5227K1, taxData.tax5227K1) && Objects.equals(this.tax5498, taxData.tax5498)
				&& Objects.equals(this.tax5498Esa, taxData.tax5498Esa)
				&& Objects.equals(this.tax5498Qa, taxData.tax5498Qa)
				&& Objects.equals(this.tax5498Sa, taxData.tax5498Sa) && Objects.equals(this.taxW2, taxData.taxW2)
				&& Objects.equals(this.taxW2C, taxData.taxW2C) && Objects.equals(this.taxW2G, taxData.taxW2G)
				&& Objects.equals(this.taxRefundDirectDeposit, taxData.taxRefundDirectDeposit);
	}

	@Override
	public int hashCode() {
		return Objects.hash(businessIncomeStatement, farmIncomeStatement, farmRentalIncomeStatement,
				rentalIncomeStatement, royaltyIncomeStatement, tax1041K1, tax1042S, tax1065K1, tax1095A, tax1095B,
				tax1095C, tax1097Btc, tax1098, tax1098C, tax1098E, tax1098Ma, tax1098Q, tax1098T, tax1099A, tax1099B,
				tax1099C, tax1099Cap, tax1099Div, tax1099G, tax1099H, tax1099Int, tax1099K, tax1099Ls, tax1099Ltc,
				tax1099Misc, tax1099Nec, tax1099Oid, tax1099Patr, tax1099Q, tax1099Qa, tax1099R, tax1099S, tax1099Sa,
				tax1099Sb, tax1120SK1, tax2439, tax3921, tax3922, tax5227K1, tax5498, tax5498Esa, tax5498Qa, tax5498Sa,
				taxW2, taxW2C, taxW2G, taxRefundDirectDeposit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TaxData {\n");

		sb.append("    businessIncomeStatement: ").append(toIndentedString(businessIncomeStatement)).append("\n");
		sb.append("    farmIncomeStatement: ").append(toIndentedString(farmIncomeStatement)).append("\n");
		sb.append("    farmRentalIncomeStatement: ").append(toIndentedString(farmRentalIncomeStatement)).append("\n");
		sb.append("    rentalIncomeStatement: ").append(toIndentedString(rentalIncomeStatement)).append("\n");
		sb.append("    royaltyIncomeStatement: ").append(toIndentedString(royaltyIncomeStatement)).append("\n");
		sb.append("    tax1041K1: ").append(toIndentedString(tax1041K1)).append("\n");
		sb.append("    tax1042S: ").append(toIndentedString(tax1042S)).append("\n");
		sb.append("    tax1065K1: ").append(toIndentedString(tax1065K1)).append("\n");
		sb.append("    tax1095A: ").append(toIndentedString(tax1095A)).append("\n");
		sb.append("    tax1095B: ").append(toIndentedString(tax1095B)).append("\n");
		sb.append("    tax1095C: ").append(toIndentedString(tax1095C)).append("\n");
		sb.append("    tax1097Btc: ").append(toIndentedString(tax1097Btc)).append("\n");
		sb.append("    tax1098: ").append(toIndentedString(tax1098)).append("\n");
		sb.append("    tax1098C: ").append(toIndentedString(tax1098C)).append("\n");
		sb.append("    tax1098E: ").append(toIndentedString(tax1098E)).append("\n");
		sb.append("    tax1098Ma: ").append(toIndentedString(tax1098Ma)).append("\n");
		sb.append("    tax1098Q: ").append(toIndentedString(tax1098Q)).append("\n");
		sb.append("    tax1098T: ").append(toIndentedString(tax1098T)).append("\n");
		sb.append("    tax1099A: ").append(toIndentedString(tax1099A)).append("\n");
		sb.append("    tax1099B: ").append(toIndentedString(tax1099B)).append("\n");
		sb.append("    tax1099C: ").append(toIndentedString(tax1099C)).append("\n");
		sb.append("    tax1099Cap: ").append(toIndentedString(tax1099Cap)).append("\n");
		sb.append("    tax1099Div: ").append(toIndentedString(tax1099Div)).append("\n");
		sb.append("    tax1099G: ").append(toIndentedString(tax1099G)).append("\n");
		sb.append("    tax1099H: ").append(toIndentedString(tax1099H)).append("\n");
		sb.append("    tax1099Int: ").append(toIndentedString(tax1099Int)).append("\n");
		sb.append("    tax1099K: ").append(toIndentedString(tax1099K)).append("\n");
		sb.append("    tax1099Ls: ").append(toIndentedString(tax1099Ls)).append("\n");
		sb.append("    tax1099Ltc: ").append(toIndentedString(tax1099Ltc)).append("\n");
		sb.append("    tax1099Misc: ").append(toIndentedString(tax1099Misc)).append("\n");
		sb.append("    tax1099Nec: ").append(toIndentedString(tax1099Nec)).append("\n");
		sb.append("    tax1099Oid: ").append(toIndentedString(tax1099Oid)).append("\n");
		sb.append("    tax1099Patr: ").append(toIndentedString(tax1099Patr)).append("\n");
		sb.append("    tax1099Q: ").append(toIndentedString(tax1099Q)).append("\n");
		sb.append("    tax1099Qa: ").append(toIndentedString(tax1099Qa)).append("\n");
		sb.append("    tax1099R: ").append(toIndentedString(tax1099R)).append("\n");
		sb.append("    tax1099S: ").append(toIndentedString(tax1099S)).append("\n");
		sb.append("    tax1099Sa: ").append(toIndentedString(tax1099Sa)).append("\n");
		sb.append("    tax1099Sb: ").append(toIndentedString(tax1099Sb)).append("\n");
		sb.append("    tax1120SK1: ").append(toIndentedString(tax1120SK1)).append("\n");
		sb.append("    tax2439: ").append(toIndentedString(tax2439)).append("\n");
		sb.append("    tax3921: ").append(toIndentedString(tax3921)).append("\n");
		sb.append("    tax3922: ").append(toIndentedString(tax3922)).append("\n");
		sb.append("    tax5227K1: ").append(toIndentedString(tax5227K1)).append("\n");
		sb.append("    tax5498: ").append(toIndentedString(tax5498)).append("\n");
		sb.append("    tax5498Esa: ").append(toIndentedString(tax5498Esa)).append("\n");
		sb.append("    tax5498Qa: ").append(toIndentedString(tax5498Qa)).append("\n");
		sb.append("    tax5498Sa: ").append(toIndentedString(tax5498Sa)).append("\n");
		sb.append("    taxW2: ").append(toIndentedString(taxW2)).append("\n");
		sb.append("    taxW2C: ").append(toIndentedString(taxW2C)).append("\n");
		sb.append("    taxW2G: ").append(toIndentedString(taxW2G)).append("\n");
		sb.append("    taxRefundDirectDeposit: ").append(toIndentedString(taxRefundDirectDeposit)).append("\n");
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

	private static final Logger log = LoggerFactory.getLogger(TaxData.class);

	public TaxData getTaxData(List<Tax> taxList, String resultType) throws FDXException {

		BusinessIncomeStatement businessIncomeStatement = new BusinessIncomeStatement();
		FarmIncomeStatement farmIncomeStatement = new FarmIncomeStatement();
		FarmRentalIncomeStatement farmRentalIncomeStatement = new FarmRentalIncomeStatement();
		RentalIncomeStatement rentalIncomeStatement = new RentalIncomeStatement();
		RoyaltyIncomeStatement royaltyIncomeStatement = new RoyaltyIncomeStatement();
		Tax1041K1 tax1041K1 = new Tax1041K1();
		Tax1042S tax1042S = new Tax1042S();
		Tax1065K1 tax1065K1 = new Tax1065K1();
		Tax1095A tax1095A = new Tax1095A();
		Tax1095B tax1095B = new Tax1095B();
		Tax1095C tax1095C = new Tax1095C();
		Tax1097Btc tax1097Btc = new Tax1097Btc();
		Tax1098 tax1098 = new Tax1098();
		Tax1098C tax1098C = new Tax1098C();
		Tax1098E tax1098E = new Tax1098E();
		Tax1098Ma tax1098Ma = new Tax1098Ma();
		Tax1098Q tax1098Q = new Tax1098Q();
		Tax1098T tax1098T = new Tax1098T();
		Tax1099A tax1099A = new Tax1099A();
		Tax1099B tax1099B = new Tax1099B();
		Tax1099C tax1099C = new Tax1099C();
		Tax1099Cap tax1099Cap = new Tax1099Cap();
		Tax1099Div tax1099Div = new Tax1099Div();
		Tax1099G tax1099G = new Tax1099G();
		Tax1099H tax1099H = new Tax1099H();
		Tax1099Int tax1099Int = new Tax1099Int();
		Tax1099K tax1099K = new Tax1099K();
		Tax1099Ls tax1099Ls = new Tax1099Ls();
		Tax1099Ltc tax1099Ltc = new Tax1099Ltc();
		Tax1099Misc tax1099Misc = new Tax1099Misc();
		Tax1099Nec tax1099Nec = new Tax1099Nec();
		Tax1099Oid tax1099Oid = new Tax1099Oid();
		Tax1099Patr tax1099Patr = new Tax1099Patr();
		Tax1099Q tax1099Q = new Tax1099Q();
		Tax1099Qa tax1099Qa = new Tax1099Qa();
		Tax1099R tax1099R = new Tax1099R();
		Tax1099S tax1099S = new Tax1099S();
		Tax1099Sa tax1099Sa = new Tax1099Sa();
		Tax1099Sb tax1099Sb = new Tax1099Sb();
		Tax1120SK1 tax1120SK1 = new Tax1120SK1();
		Tax2439 tax2439 = new Tax2439();
		Tax3921 tax3921 = new Tax3921();
		Tax3922 tax3922 = new Tax3922();
		Tax5227K1 tax5227K1 = new Tax5227K1();
		Tax5498 tax5498 = new Tax5498();
		Tax5498Esa tax5498Esa = new Tax5498Esa();
		Tax5498Qa tax5498Qa = new Tax5498Qa();
		Tax5498Sa tax5498Sa = new Tax5498Sa();
		TaxW2 taxW2 = new TaxW2();
		TaxW2C taxW2C = new TaxW2C();
		TaxW2G taxW2G = new TaxW2G();

		TaxData taxData = new TaxData();
		TaxRefundDirectDeposit taxRefundDirectDeposit = new TaxRefundDirectDeposit();
		try {

			for (Tax tax : taxList) {
				int taxYear = tax.getTaxYear();
				String taxFormId = tax.getTaxFormId();
				String taxForm = tax.getTaxFormType().toString();

				if (resultType.equals("lightweight")) {
					tax = tax.getTaxData(tax.getInternalId());
					if (taxForm.equals("BusinessIncomeStatement")) {
						businessIncomeStatement.setTax(tax);
						taxData.setBusinessIncomeStatement(businessIncomeStatement);
					} else if (taxForm.equals("FarmIncomeStatement")) {
						farmIncomeStatement.setTax(tax);
						taxData.setFarmIncomeStatement(farmIncomeStatement);
					} else if (taxForm.equals("FarmRentalIncomeStatement")) {
						farmRentalIncomeStatement.setTax(tax);
						taxData.setFarmRentalIncomeStatement(farmRentalIncomeStatement);
					} else if (taxForm.equals("RentalIncomeStatement")) {
						rentalIncomeStatement.setTax(tax);
						taxData.setRentalIncomeStatement(rentalIncomeStatement);
					} else if (taxForm.equals("RoyaltyIncomeStatement")) {
						royaltyIncomeStatement.setTax(tax);
						taxData.setRoyaltyIncomeStatement(royaltyIncomeStatement);
					} else if (taxForm.equals("Tax1041K1")) {
						tax1041K1.setTax(tax);
						taxData.setTax1042S(tax1042S);
					} else if (taxForm.equals("Tax1042S")) {
						tax1042S.setTax(tax);
						taxData.setTax1042S(tax1042S);
					} else if (taxForm.equals("Tax1065K1")) {
						tax1065K1.setTax(tax);
						taxData.setTax1065K1(tax1065K1);
					} else if (taxForm.equals("Tax1095A")) {
						tax1095A.setTax(tax);
						taxData.setTax1095A(tax1095A);
					} else if (taxForm.equals("Tax1095B")) {
						tax1095B.setTax(tax);
						taxData.setTax1095B(tax1095B);
					} else if (taxForm.equals("Tax1095C")) {
						tax1095C.setTax(tax);
						taxData.setTax1095C(tax1095C);
					} else if (taxForm.equals("Tax1097Btc")) {
						tax1097Btc.setTax(tax);
						taxData.setTax1097Btc(tax1097Btc);
					} else if (taxForm.equals("Tax1098")) {
						tax1098.setTax(tax);
						taxData.setTax1098(tax1098);
					} else if (taxForm.equals("Tax1098C")) {
						tax1098C.setTax(tax);
						taxData.setTax1098C(tax1098C);
					} else if (taxForm.equals("Tax1098E")) {
						tax1098E.setTax(tax);
						taxData.setTax1098E(tax1098E);
					} else if (taxForm.equals("Tax1098Ma")) {
						tax1098Ma.setTax(tax);
						taxData.setTax1098Ma(tax1098Ma);
					} else if (taxForm.equals("Tax1098Q")) {
						tax1098Q.setTax(tax);
						taxData.setTax1098Q(tax1098Q);
					} else if (taxForm.equals("Tax1098T")) {
						tax1098T.setTax(tax);
						taxData.setTax1098T(tax1098T);
					} else if (taxForm.equals("tax1099A")) {
						tax1099A.setTax(tax);
						taxData.setTax1099A(tax1099A);
					} else if (taxForm.equals("Tax1099B")) {
						tax1099B.setTax(tax);
						taxData.setTax1099B(tax1099B);
					} else if (taxForm.equals("Tax1099C")) {
						tax1099C.setTax(tax);
						taxData.setTax1099C(tax1099C);
					} else if (taxForm.equals("Tax1099Cap")) {
						tax1099Cap.setTax(tax);
						taxData.setTax1099Cap(tax1099Cap);
					} else if (taxForm.equals("Tax1099Div")) {
						tax1099Div.setTax(tax);
						taxData.setTax1099Div(tax1099Div);
					} else if (taxForm.equals("Tax1099G")) {
						tax1099G.setTax(tax);
						taxData.setTax1099G(tax1099G);
					} else if (taxForm.equals("Tax1099H")) {
						tax1099H.setTax(tax);
						taxData.setTax1099H(tax1099H);
					} else if (taxForm.equals("Tax1099Int")) {
						tax1099Int.setTax(tax);
						taxData.setTax1099Int(tax1099Int);
					} else if (taxForm.equals("Tax1099K")) {
						tax1099K.setTax(tax);
						taxData.setTax1099K(tax1099K);
					} else if (taxForm.equals("Tax1099Ls")) {
						tax1099Ls.setTax(tax);
						taxData.setTax1099Ls(tax1099Ls);
					} else if (taxForm.equals("Tax1099Ltc")) {
						tax1099Ltc.setTax(tax);
						taxData.setTax1099Ltc(tax1099Ltc);
					} else if (taxForm.equals("Tax1099Misc")) {
						tax1099Misc.setTax(tax);
						taxData.setTax1099Misc(tax1099Misc);
					} else if (taxForm.equals("Tax1099Nec")) {
						tax1099Nec.setTax(tax);
						taxData.setTax1099Nec(tax1099Nec);
					} else if (taxForm.equals("Tax1099Oid")) {
						tax1099Oid.setTax(tax);
						taxData.setTax1099Oid(tax1099Oid);
					} else if (taxForm.equals("Tax1099Patr")) {
						tax1099Patr.setTax(tax);
						taxData.setTax1099Patr(tax1099Patr);
					} else if (taxForm.equals("Tax1099Q")) {
						tax1099Q.setTax(tax);
						taxData.setTax1099Q(tax1099Q);
					} else if (taxForm.equals("Tax1099Qa")) {
						tax1099Qa.setTax(tax);
						taxData.setTax1099Qa(tax1099Qa);
					} else if (taxForm.equals("Tax1099R")) {
						tax1099R.setTax(tax);
						taxData.setTax1099R(tax1099R);
					} else if (taxForm.equals("Tax1099S")) {
						tax1099S.setTax(tax);
						taxData.setTax1099S(tax1099S);
					} else if (taxForm.equals("Tax1099Sa")) {
						tax1099Sa.setTax(tax);
						taxData.setTax1099Sa(tax1099Sa);
					} else if (taxForm.equals("Tax1099Sb")) {
						tax1099Sb.setTax(tax);
						taxData.setTax1099Sb(tax1099Sb);
					} else if (taxForm.equals("Tax1120SK1")) {
						tax1120SK1.setTax(tax);
						taxData.setTax1120SK1(tax1120SK1);
					} else if (taxForm.equals("Tax2439")) {
						tax2439.setTax(tax);
						taxData.setTax2439(tax2439);
					} else if (taxForm.equals("Tax3921")) {
						tax3921.setTax(tax);
						taxData.setTax3921(tax3921);
					} else if (taxForm.equals("Tax3922")) {
						tax3922.setTax(tax);
						taxData.setTax3922(tax3922);
					} else if (taxForm.equals("Tax5227K1")) {
						tax5227K1.setTax(tax);
						taxData.setTax5227K1(tax5227K1);
					} else if (taxForm.equals("Tax5498")) {
						tax5498.setTax(tax);
						taxData.setTax5498(tax5498);
					} else if (taxForm.equals("Tax5498Esa")) {
						tax5498Esa.setTax(tax);
						taxData.setTax5498Esa(tax5498Esa);
					} else if (taxForm.equals("Tax5498Qa")) {
						tax5498Qa.setTax(tax);
						taxData.setTax5498Qa(tax5498Qa);
					} else if (taxForm.equals("Tax5498Sa")) {
						tax5498Sa.setTax(tax);
						taxData.setTax5498Sa(tax5498Sa);
					} else if (taxForm.equals("TaxW2")) {
						taxW2.setTax(tax);
						taxData.setTaxW2(taxW2);
					} else if (taxForm.equals("TaxW2C")) {
						taxW2C.setTax(tax);
						taxData.setTaxW2C(taxW2C);
					} else if (taxForm.equals("TaxW2G")) {
						taxW2G.setTax(tax);
						taxData.setTaxW2G(taxW2G);
					}

				} else {
					if (taxForm.equals("BusinessIncomeStatement")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							businessIncomeStatement = businessIncomeStatement
									.getBusinessIncomeStatement(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						businessIncomeStatement.setTax(tax);
						taxData.setBusinessIncomeStatement(businessIncomeStatement);
					} else if (taxForm.equals("FarmIncomeStatement")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							farmIncomeStatement = farmIncomeStatement.getFarmIncomeStatement(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						farmIncomeStatement.setTax(tax);
						taxData.setFarmIncomeStatement(farmIncomeStatement);
					} else if (taxForm.equals("FarmRentalIncomeStatement")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							farmRentalIncomeStatement = farmRentalIncomeStatement
									.getFarmRentalIncomeStatement(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						farmRentalIncomeStatement.setTax(tax);
						taxData.setFarmRentalIncomeStatement(farmRentalIncomeStatement);
					} else if (taxForm.equals("RentalIncomeStatement")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							rentalIncomeStatement = rentalIncomeStatement.getRentalIncomeStatement(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						rentalIncomeStatement.setTax(tax);
						taxData.setRentalIncomeStatement(rentalIncomeStatement);
					} else if (taxForm.equals("RoyaltyIncomeStatement")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							royaltyIncomeStatement = royaltyIncomeStatement
									.getRoyaltyIncomeStatement(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						royaltyIncomeStatement.setTax(tax);
						taxData.setRoyaltyIncomeStatement(royaltyIncomeStatement);
					} else if (taxForm.equals("Tax1041K1")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1041K1 = tax1041K1.getTax1041K1(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1041K1.setTax(tax);
						taxData.setTax1041K1(tax1041K1);
					} else if (taxForm.equals("Tax1042S")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1042S = tax1042S.getTax1042S(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1042S.setTax(tax);
						taxData.setTax1042S(tax1042S);
					} else if (taxForm.equals("Tax1065K1")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1065K1 = tax1065K1.getTax1065K1(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1065K1.setTax(tax);
						taxData.setTax1065K1(tax1065K1);
					} else if (taxForm.equals("Tax1095A")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1095A = tax1095A.getTax1095A(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1095A.setTax(tax);
						taxData.setTax1095A(tax1095A);
					} else if (taxForm.equals("Tax1095B")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1095B = tax1095B.getTax1095B(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1095B.setTax(tax);
						taxData.setTax1095B(tax1095B);
					} else if (taxForm.equals("Tax1095C")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1095C = tax1095C.getTax1095C(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1095C.setTax(tax);
						taxData.setTax1095C(tax1095C);
					} else if (taxForm.equals("Tax1097Btc")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1097Btc = tax1097Btc.getTax1097Btc(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1097Btc.setTax(tax);
						taxData.setTax1097Btc(tax1097Btc);
					} else if (taxForm.equals("Tax1098")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1098 = tax1098.getTax1098(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1098.setTax(tax);
						taxData.setTax1098(tax1098);
					} else if (taxForm.equals("Tax1098C")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1098C = tax1098C.getTax1098C(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1098C.setTax(tax);
						taxData.setTax1098C(tax1098C);
					} else if (taxForm.equals("Tax1098E")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1098E = tax1098E.getTax1098E(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1098E.setTax(tax);
						taxData.setTax1098E(tax1098E);
					} else if (taxForm.equals("Tax1098Ma")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1098Ma = tax1098Ma.getTax1098Ma(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1098Ma.setTax(tax);
						taxData.setTax1098Ma(tax1098Ma);
					} else if (taxForm.equals("Tax1098Q")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1098Q = tax1098Q.getTax1098Q(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1098Q.setTax(tax);
						taxData.setTax1098Q(tax1098Q);
					} else if (taxForm.equals("Tax1098T")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1098T = tax1098T.getTax1098T(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1098T.setTax(tax);
						taxData.setTax1098T(tax1098T);
					} else if (taxForm.equals("Tax1099A")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099A = tax1099A.getTax1099A(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099A.setTax(tax);
						taxData.setTax1099A(tax1099A);
					} else if (taxForm.equals("Tax1099B")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099B = tax1099B.getTax1099B(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099B.setTax(tax);
						taxData.setTax1099B(tax1099B);
					} else if (taxForm.equals("Tax1099C")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099C = tax1099C.getTax1099C(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099C.setTax(tax);
						taxData.setTax1099C(tax1099C);
					} else if (taxForm.equals("Tax1099Cap")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Cap = tax1099Cap.getTax1099Cap(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Cap.setTax(tax);
						taxData.setTax1099Cap(tax1099Cap);
					} else if (taxForm.equals("Tax1099Div")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Div = tax1099Div.getTax1099Div(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Div.setTax(tax);
						taxData.setTax1099Div(tax1099Div);
					} else if (taxForm.equals("Tax1099G")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099G = tax1099G.getTax1099G(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099G.setTax(tax);
						taxData.setTax1099G(tax1099G);
					} else if (taxForm.equals("Tax1099H")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099H = tax1099H.getTax1099H(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099H.setTax(tax);
						taxData.setTax1099H(tax1099H);
					} else if (taxForm.equals("Tax1099Int")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Int = tax1099Int.getTax1099Int(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Int.setTax(tax);
						taxData.setTax1099Int(tax1099Int);
					} else if (taxForm.equals("Tax1099K")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099K = tax1099K.getTax1099K(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099K.setTax(tax);
						taxData.setTax1099K(tax1099K);
					} else if (taxForm.equals("Tax1099Ls")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Ls = tax1099Ls.getTax1099Ls(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Ls.setTax(tax);
						taxData.setTax1099Ls(tax1099Ls);
					} else if (taxForm.equals("Tax1099Ltc")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Ltc = tax1099Ltc.getTax1099Ltc(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Ltc.setTax(tax);
						taxData.setTax1099Ltc(tax1099Ltc);
					} else if (taxForm.equals("Tax1099Misc")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Misc = tax1099Misc.getTax1099Misc(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Misc.setTax(tax);
						taxData.setTax1099Misc(tax1099Misc);
					} else if (taxForm.equals("Tax1099Nec")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Nec = tax1099Nec.getTax1099Nec(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Nec.setTax(tax);
						taxData.setTax1099Nec(tax1099Nec);
					} else if (taxForm.equals("Tax1099Oid")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Oid = tax1099Oid.getTax1099Oid(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Oid.setTax(tax);
						taxData.setTax1099Oid(tax1099Oid);
					} else if (taxForm.equals("Tax1099Patr")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Patr = tax1099Patr.getTax1099Patr(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Patr.setTax(tax);
						taxData.setTax1099Patr(tax1099Patr);
					} else if (taxForm.equals("Tax1099Q")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Q = tax1099Q.getTax1099Q(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Q.setTax(tax);
						taxData.setTax1099Q(tax1099Q);
					} else if (taxForm.equals("Tax1099Qa")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Qa = tax1099Qa.getTax1099Qa(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Qa.setTax(tax);
						taxData.setTax1099Qa(tax1099Qa);
					} else if (taxForm.equals("Tax1099R")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099R = tax1099R.getTax1099R(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099R.setTax(tax);
						taxData.setTax1099R(tax1099R);
					} else if (taxForm.equals("Tax1099S")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099S = tax1099S.getTax1099S(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099S.setTax(tax);
						taxData.setTax1099S(tax1099S);
					} else if (taxForm.equals("Tax1099Sa")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Sa = tax1099Sa.getTax1099Sa(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Sa.setTax(tax);
						taxData.setTax1099Sa(tax1099Sa);
					} else if (taxForm.equals("Tax1099Sb")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1099Sb = tax1099Sb.getTax1099Sb(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1099Sb.setTax(tax);
						taxData.setTax1099Sb(tax1099Sb);
					} else if (taxForm.equals("Tax1120SK1")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax1120SK1 = tax1120SK1.getTax1120SK1(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax1120SK1.setTax(tax);
						taxData.setTax1120SK1(tax1120SK1);
					} else if (taxForm.equals("Tax2439")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax2439 = tax2439.getTax2439(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax2439.setTax(tax);
						taxData.setTax2439(tax2439);
					} else if (taxForm.equals("Tax3921")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax3921 = tax3921.getTax3921(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax3921.setTax(tax);
						taxData.setTax3921(tax3921);
					} else if (taxForm.equals("Tax3922")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax3922 = tax3922.getTax3922(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax3922.setTax(tax);
						taxData.setTax3922(tax3922);
					} else if (taxForm.equals("Tax5227K1")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax5227K1 = tax5227K1.getTax5227K1(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax5227K1.setTax(tax);
						taxData.setTax5227K1(tax5227K1);
					} else if (taxForm.equals("Tax5498")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax5498 = tax5498.getTax5498(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax5498.setTax(tax);
						taxData.setTax5498(tax5498);
					} else if (taxForm.equals("Tax5498Esa")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax5498Esa = tax5498Esa.getTax5498Esa(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax5498Esa.setTax(tax);
						taxData.setTax5498Esa(tax5498Esa);
					} else if (taxForm.equals("Tax5498Qa")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax5498Qa = tax5498Qa.getTax5498Qa(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax5498Qa.setTax(tax);
						taxData.setTax5498Qa(tax5498Qa);
					} else if (taxForm.equals("Tax5498Sa")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							tax5498Sa = tax5498Sa.getTax5498Sa(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						tax5498Sa.setTax(tax);
						taxData.setTax5498Sa(tax5498Sa);
					} else if (taxForm.equals("TaxW2")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							taxW2 = taxW2.getTaxW2(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						taxW2.setTax(tax);
						taxData.setTaxW2(taxW2);
					} else if (taxForm.equals("TaxW2C")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							taxW2C = taxW2C.getTaxW2C(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						taxW2C.setTax(tax);
						taxData.setTaxW2C(taxW2C);
					} else if (taxForm.equals("TaxW2G")) {
						tax = tax.getTaxData(tax.getInternalId());
						try {
							taxW2G = taxW2G.getTaxW2G(tax.getInternalId());
						} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
							Error error = new Error();
							error.setCode("121");
							error.setMessage("TaxData not found  for TaxFormId : " + tax.getTaxFormId());
							tax.setError(error);
						}
						taxW2G.setTax(tax);
						taxData.setTaxW2G(taxW2G);
					}

					try {
						taxRefundDirectDeposit = taxRefundDirectDeposit.getTaxRefundDetails();
					} catch (EmptyResultDataAccessException e) {
						taxRefundDirectDeposit = null;
					}
					if (taxRefundDirectDeposit != null)
						taxData.setTaxRefundDirectDeposit(taxRefundDirectDeposit);
				}
			}
			return taxData;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("TaxData : ", e);
			throw new FDXException(e,500);
		}
	}

	public TaxData getTaxDataById(List<Tax> taxResponse) throws FDXException {
		try {
			template = ConnectionConfigApi46.getTemplate();;
			TaxData taxData = new TaxData();
			BusinessIncomeStatement businessIncomeStatement = new BusinessIncomeStatement();
			FarmIncomeStatement farmIncomeStatement = new FarmIncomeStatement();
			FarmRentalIncomeStatement farmRentalIncomeStatement = new FarmRentalIncomeStatement();
			RentalIncomeStatement rentalIncomeStatement = new RentalIncomeStatement();
			RoyaltyIncomeStatement royaltyIncomeStatement = new RoyaltyIncomeStatement();
			Tax1041K1 tax1041K1 = new Tax1041K1();
			Tax1042S tax1042S = new Tax1042S();
			Tax1065K1 tax1065K1 = new Tax1065K1();
			Tax1095A tax1095A = new Tax1095A();
			Tax1095B tax1095B = new Tax1095B();
			Tax1095C tax1095C = new Tax1095C();
			Tax1097Btc tax1097Btc = new Tax1097Btc();
			Tax1098 tax1098 = new Tax1098();
			Tax1098C tax1098C = new Tax1098C();
			Tax1098E tax1098E = new Tax1098E();
			Tax1098Ma tax1098Ma = new Tax1098Ma();
			Tax1098Q tax1098Q = new Tax1098Q();
			Tax1098T tax1098T = new Tax1098T();
			Tax1099A tax1099A = new Tax1099A();
			Tax1099B tax1099B = new Tax1099B();
			Tax1099C tax1099C = new Tax1099C();
			Tax1099Cap tax1099Cap = new Tax1099Cap();
			Tax1099Div tax1099Div = new Tax1099Div();
			Tax1099G tax1099G = new Tax1099G();
			Tax1099H tax1099H = new Tax1099H();
			Tax1099Int tax1099Int = new Tax1099Int();
			Tax1099K tax1099K = new Tax1099K();
			Tax1099Ls tax1099Ls = new Tax1099Ls();
			Tax1099Ltc tax1099Ltc = new Tax1099Ltc();
			Tax1099Misc tax1099Misc = new Tax1099Misc();
			Tax1099Nec tax1099Nec = new Tax1099Nec();
			Tax1099Oid tax1099Oid = new Tax1099Oid();
			Tax1099Patr tax1099Patr = new Tax1099Patr();
			Tax1099Q tax1099Q = new Tax1099Q();
			Tax1099Qa tax1099Qa = new Tax1099Qa();
			Tax1099R tax1099R = new Tax1099R();
			Tax1099S tax1099S = new Tax1099S();
			Tax1099Sa tax1099Sa = new Tax1099Sa();
			Tax1099Sb tax1099Sb = new Tax1099Sb();
			Tax1120SK1 tax1120SK1 = new Tax1120SK1();
			Tax2439 tax2439 = new Tax2439();
			Tax3921 tax3921 = new Tax3921();
			Tax3922 tax3922 = new Tax3922();
			Tax5227K1 tax5227K1 = new Tax5227K1();
			Tax5498 tax5498 = new Tax5498();
			Tax5498Esa tax5498Esa = new Tax5498Esa();
			Tax5498Qa tax5498Qa = new Tax5498Qa();
			Tax5498Sa tax5498Sa = new Tax5498Sa();
			TaxW2 taxW2 = new TaxW2();
			TaxW2C taxW2C = new TaxW2C();
			TaxW2G taxW2G = new TaxW2G();
			TaxRefundDirectDeposit taxRefundDirectDeposit = new TaxRefundDirectDeposit();
			for (Tax taxIterator : taxResponse) {
				int taxYear = taxIterator.getTaxYear();
				String taxForm = taxIterator.getTaxFormType().toString();
				int internalId = taxIterator.getInternalId();
				SqlParameterSource parameters = new MapSqlParameterSource("internalId", taxIterator.getInternalId());
				Tax tax = new Tax();
				tax = tax.getTaxData(internalId);
				if (taxForm.equals("BusinessIncomeStatement")) {
					businessIncomeStatement = businessIncomeStatement.getBusinessIncomeStatement(internalId);
					businessIncomeStatement.setTax(tax);
					taxData.setBusinessIncomeStatement(businessIncomeStatement);
				} else if (taxForm.equals("FarmIncomeStatement")) {
					farmIncomeStatement = farmIncomeStatement.getFarmIncomeStatement(internalId);
					farmIncomeStatement.setTax(tax);
					taxData.setFarmIncomeStatement(farmIncomeStatement);
				} else if (taxForm.equals("FarmRentalIncomeStatement")) {
					farmRentalIncomeStatement = farmRentalIncomeStatement.getFarmRentalIncomeStatement(internalId);
					farmRentalIncomeStatement.setTax(tax);
					taxData.setFarmRentalIncomeStatement(farmRentalIncomeStatement);
				} else if (taxForm.equals("RentalIncomeStatement")) {
					rentalIncomeStatement = rentalIncomeStatement.getRentalIncomeStatement(internalId);
					rentalIncomeStatement.setTax(tax);
					taxData.setRentalIncomeStatement(rentalIncomeStatement);
				} else if (taxForm.equals("RoyaltyIncomeStatement")) {
					royaltyIncomeStatement = royaltyIncomeStatement.getRoyaltyIncomeStatement(internalId);
					royaltyIncomeStatement.setTax(tax);
					taxData.setRoyaltyIncomeStatement(royaltyIncomeStatement);
				} else if (taxForm.equals("Tax1041K1")) {
					tax1041K1 = tax1041K1.getTax1041K1(internalId);
					tax1041K1.setTax(tax);
					taxData.setTax1041K1(tax1041K1);
				} else if (taxForm.equals("Tax1042S")) {
					tax1042S = tax1042S.getTax1042S(internalId);
					tax1042S.setTax(tax);
					taxData.setTax1042S(tax1042S);
				} else if (taxForm.equals("Tax1065K1")) {
					tax1065K1 = tax1065K1.getTax1065K1(internalId);
					tax1065K1.setTax(tax);
					taxData.setTax1065K1(tax1065K1);
				} else if (taxForm.equals("Tax1095A")) {
					tax1095A = tax1095A.getTax1095A(internalId);
					tax1095A.setTax(tax);
					taxData.setTax1095A(tax1095A);
				} else if (taxForm.equals("Tax1095B")) {
					tax1095B = tax1095B.getTax1095B(internalId);
					tax1095B.setTax(tax);
					taxData.setTax1095B(tax1095B);
				} else if (taxForm.equals("Tax1095C")) {
					tax1095C = tax1095C.getTax1095C(internalId);
					tax1095C.setTax(tax);
					taxData.setTax1095C(tax1095C);
				} else if (taxForm.equals("Tax1097Btc")) {
					tax1097Btc = tax1097Btc.getTax1097Btc(internalId);
					tax1097Btc.setTax(tax);
					taxData.setTax1097Btc(tax1097Btc);
				} else if (taxForm.equals("Tax1098")) {
					tax1098 = tax1098.getTax1098(internalId);
					tax1098.setTax(tax);
					taxData.setTax1098(tax1098);
				} else if (taxForm.equals("Tax1098C")) {
					tax1098C = tax1098C.getTax1098C(internalId);
					tax1098C.setTax(tax);
					taxData.setTax1098C(tax1098C);
				} else if (taxForm.equals("Tax1098E")) {
					tax1098E = tax1098E.getTax1098E(internalId);
					tax1098E.setTax(tax);
					taxData.setTax1098E(tax1098E);
				} else if (taxForm.equals("Tax1098Ma")) {
					tax1098Ma = tax1098Ma.getTax1098Ma(internalId);
					tax1098Ma.setTax(tax);
					taxData.setTax1098Ma(tax1098Ma);
				} else if (taxForm.equals("Tax1098Q")) {
					tax1098Q = tax1098Q.getTax1098Q(internalId);
					tax1098Q.setTax(tax);
					taxData.setTax1098Q(tax1098Q);
				} else if (taxForm.equals("Tax1098T")) {
					tax1098T = tax1098T.getTax1098T(internalId);
					tax1098T.setTax(tax);
					taxData.setTax1098T(tax1098T);
				} else if (taxForm.equals("Tax1099A")) {
					tax1099A = tax1099A.getTax1099A(internalId);
					tax1099A.setTax(tax);
					taxData.setTax1099A(tax1099A);
				} else if (taxForm.equals("Tax1099B")) {
					tax1099B = tax1099B.getTax1099B(internalId);
					tax1099B.setTax(tax);
					taxData.setTax1099B(tax1099B);
				} else if (taxForm.equals("Tax1099C")) {
					tax1099C = tax1099C.getTax1099C(internalId);
					tax1099C.setTax(tax);
					taxData.setTax1099C(tax1099C);
				} else if (taxForm.equals("Tax1099Cap")) {
					tax1099Cap = tax1099Cap.getTax1099Cap(internalId);
					tax1099Cap.setTax(tax);
					taxData.setTax1099Cap(tax1099Cap);
				} else if (taxForm.equals("Tax1099Div")) {
					tax1099Div = tax1099Div.getTax1099Div(internalId);
					tax1099Div.setTax(tax);
					taxData.setTax1099Div(tax1099Div);
				} else if (taxForm.equals("Tax1099G")) {
					tax1099G = tax1099G.getTax1099G(internalId);
					tax1099G.setTax(tax);
					taxData.setTax1099G(tax1099G);
				} else if (taxForm.equals("Tax1099H")) {
					tax1099H = tax1099H.getTax1099H(internalId);
					tax1099H.setTax(tax);
					taxData.setTax1099H(tax1099H);
				} else if (taxForm.equals("Tax1099Int")) {
					tax1099Int = tax1099Int.getTax1099Int(internalId);
					tax1099Int.setTax(tax);
					taxData.setTax1099Int(tax1099Int);
				} else if (taxForm.equals("Tax1099K")) {
					tax1099K = tax1099K.getTax1099K(internalId);
					tax1099K.setTax(tax);
					taxData.setTax1099K(tax1099K);
				} else if (taxForm.equals("Tax1099Ls")) {
					tax1099Ls = tax1099Ls.getTax1099Ls(internalId);
					tax1099Ls.setTax(tax);
					taxData.setTax1099Ls(tax1099Ls);
				} else if (taxForm.equals("Tax1099Ltc")) {
					tax1099Ltc = tax1099Ltc.getTax1099Ltc(internalId);
					tax1099Ltc.setTax(tax);
					taxData.setTax1099Ltc(tax1099Ltc);
				} else if (taxForm.equals("Tax1099Misc")) {
					tax1099Misc = tax1099Misc.getTax1099Misc(internalId);
					tax1099Misc.setTax(tax);
					taxData.setTax1099Misc(tax1099Misc);
				} else if (taxForm.equals("Tax1099Nec")) {
					tax1099Nec = tax1099Nec.getTax1099Nec(internalId);
					tax1099Nec.setTax(tax);
					taxData.setTax1099Nec(tax1099Nec);
				} else if (taxForm.equals("Tax1099Oid")) {
					tax1099Oid = tax1099Oid.getTax1099Oid(internalId);
					tax1099Oid.setTax(tax);
					taxData.setTax1099Oid(tax1099Oid);
				} else if (taxForm.equals("Tax1099Patr")) {
					tax1099Patr = tax1099Patr.getTax1099Patr(internalId);
					tax1099Patr.setTax(tax);
					taxData.setTax1099Patr(tax1099Patr);
				} else if (taxForm.equals("Tax1099Q")) {
					tax1099Q = tax1099Q.getTax1099Q(internalId);
					tax1099Q.setTax(tax);
					taxData.setTax1099Q(tax1099Q);
				} else if (taxForm.equals("Tax1099Qa")) {
					tax1099Qa = tax1099Qa.getTax1099Qa(internalId);
					tax1099Qa.setTax(tax);
					taxData.setTax1099Qa(tax1099Qa);
				} else if (taxForm.equals("Tax1099R")) {
					tax1099R = tax1099R.getTax1099R(internalId);
					tax1099R.setTax(tax);
					taxData.setTax1099R(tax1099R);
				} else if (taxForm.equals("Tax1099S")) {
					tax1099S = tax1099S.getTax1099S(internalId);
					tax1099S.setTax(tax);
					taxData.setTax1099S(tax1099S);
				} else if (taxForm.equals("Tax1099Sa")) {
					tax1099Sa = tax1099Sa.getTax1099Sa(internalId);
					tax1099Sa.setTax(tax);
					taxData.setTax1099Sa(tax1099Sa);
				} else if (taxForm.equals("Tax1099Sb")) {
					tax1099Sb = tax1099Sb.getTax1099Sb(internalId);
					tax1099Sb.setTax(tax);
					taxData.setTax1099Sb(tax1099Sb);
				} else if (taxForm.equals("Tax1120SK1")) {
					tax1120SK1 = tax1120SK1.getTax1120SK1(internalId);
					tax1120SK1.setTax(tax);
					taxData.setTax1120SK1(tax1120SK1);
				} else if (taxForm.equals("Tax2439")) {
					tax2439 = tax2439.getTax2439(internalId);
					tax2439.setTax(tax);
					taxData.setTax2439(tax2439);
				} else if (taxForm.equals("Tax3921")) {
					tax3921 = tax3921.getTax3921(internalId);
					tax3921.setTax(tax);
					taxData.setTax3921(tax3921);
				} else if (taxForm.equals("Tax3922")) {
					tax3922 = tax3922.getTax3922(internalId);
					tax3922.setTax(tax);
					taxData.setTax3922(tax3922);
				} else if (taxForm.equals("Tax5227K1")) {
					tax5227K1 = tax5227K1.getTax5227K1(internalId);
					tax5227K1.setTax(tax);
					taxData.setTax5227K1(tax5227K1);
				} else if (taxForm.equals("Tax5498")) {
					tax5498 = tax5498.getTax5498(internalId);
					tax5498.setTax(tax);
					taxData.setTax5498(tax5498);
				} else if (taxForm.equals("Tax5498Esa")) {
					tax5498Esa = tax5498Esa.getTax5498Esa(internalId);
					tax5498Esa.setTax(tax);
					taxData.setTax5498Esa(tax5498Esa);
				} else if (taxForm.equals("Tax5498Qa")) {
					tax5498Qa = tax5498Qa.getTax5498Qa(internalId);
					tax5498Qa.setTax(tax);
					taxData.setTax5498Qa(tax5498Qa);
				} else if (taxForm.equals("Tax5498Sa")) {
					tax5498Sa = tax5498Sa.getTax5498Sa(internalId);
					tax5498Sa.setTax(tax);
					taxData.setTax5498Sa(tax5498Sa);
				} else if (taxForm.equals("TaxW2")) {
					taxW2 = taxW2.getTaxW2(internalId);
					taxW2.setTax(tax);
					taxData.setTaxW2(taxW2);
				} else if (taxForm.equals("TaxW2C")) {
					taxW2C = taxW2C.getTaxW2C(internalId);
					taxW2C.setTax(tax);
					taxData.setTaxW2C(taxW2C);
				} else if (taxForm.equals("TaxW2G")) {
					taxW2G = taxW2G.getTaxW2G(internalId);
					taxW2G.setTax(tax);
					taxData.setTaxW2G(taxW2G);
				}
				taxRefundDirectDeposit = taxRefundDirectDeposit.getTaxRefundDetails();
				taxData.setTaxRefundDirectDeposit(taxRefundDirectDeposit);
			}
			return taxData;
		} catch (FDXException fdxException) {
			throw fdxException;
		} catch (Exception e) {
			log.error("TaxData : ", e);
			throw new FDXException(e,500);
		}
	}
}
