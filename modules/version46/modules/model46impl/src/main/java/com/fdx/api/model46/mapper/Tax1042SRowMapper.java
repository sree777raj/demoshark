package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.Form1042Agent;
import com.fdx.api.model46.modelimpl.Form1042Recipient;
import com.fdx.api.model46.modelimpl.StateTaxWithholding;
import com.fdx.api.model46.modelimpl.Tax1042S;

public class Tax1042SRowMapper implements RowMapper<Tax1042S> {

	@Override
	public Tax1042S mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tax1042S tax1042S = new Tax1042S();
		tax1042S.setAccountNumber(rs.getString("accountNumber"));
		if (!(rs.getString("amended") == null))
			tax1042S.setAmended(rs.getBoolean("amended"));
		tax1042S.setAmendmentNumber(rs.getInt("amendmentNumber"));
		tax1042S.setCh3ExemptionCode(rs.getString("ch3ExemptionCode"));
		tax1042S.setCh3TaxRate(rs.getDouble("ch3TaxRate"));
		tax1042S.setCh4ExemptionCode(rs.getString("ch4ExemptionCode"));
		tax1042S.setCh4TaxRate(rs.getDouble("ch4TaxRate"));
		tax1042S.setChapterIndicator(rs.getString("chapterIndicator"));
		if (!(rs.getString("escrowProceduresApplied") == null))
			tax1042S.setEscrowProceduresApplied(rs.getBoolean("escrowProceduresApplied"));
		tax1042S.setFederalTaxWithheld(rs.getDouble("federalTaxWithheld"));
		tax1042S.setFormId(rs.getString("formId"));
		tax1042S.setGrossIncome(rs.getDouble("grossIncome"));
		tax1042S.setIncomeTypeCode(rs.getString("incomeTypeCode"));
		tax1042S.setNetIncome(rs.getDouble("netIncome"));
		tax1042S.setOtherAgentsTaxWithheld(rs.getDouble("otherAgentsTaxWithheld"));
		if (!(rs.getString("prorataBasisReporting") == null))
			tax1042S.setProrataBasisReporting(rs.getBoolean("prorataBasisReporting"));
		tax1042S.setRecipientRepaidAmount(rs.getDouble("recipientRepaidAmount"));
		if (!(rs.getString("subsequentYear") == null))
			tax1042S.setSubsequentYear(rs.getBoolean("subsequentYear"));
		tax1042S.setTotalTaxWithholdingCredit(rs.getDouble("totalTaxWithholdingCredit"));
		tax1042S.setWithholdingAllowance(rs.getDouble("withholdingAllowance"));
		tax1042S.setWithholdingAgentTaxPaid(rs.getDouble("withholdingAgentTaxPaid"));

//		StateTaxWithholding Start
		StateTaxWithholding stateTaxWithholding = new StateTaxWithholding();
		if (rs.getInt("statetaxwithholding") != 0) {
			stateTaxWithholding.setStwithheldid(rs.getInt("statetaxwithholding"));
			tax1042S.setStateTaxWithholding(stateTaxWithholding);
		}
//		StateTaxWithholding End

//		WithholdingAgent Start
		Form1042Agent withholdingagent = new Form1042Agent();
		if (rs.getInt("withholdingagent") != 0) {
			withholdingagent.setAgentId(rs.getInt("withholdingagent"));
			tax1042S.setWithholdingAgent(withholdingagent);
		}
//		WithholdingAgent End

//		Recipient Start
		Form1042Recipient recipient = new Form1042Recipient();
		if (rs.getInt("recipient") != 0) {
			recipient.setRecipientid(rs.getInt("recipient"));
			tax1042S.setRecipient(recipient);
		}
//		Recipient End

//		Primary Start
		Form1042Agent primaryagent = new Form1042Agent();
		if (rs.getInt("primaryagent") != 0) {
			primaryagent.setAgentId(rs.getInt("primaryagent"));
			tax1042S.setPrimary(primaryagent);
		}
//		Primary End	

//		Payer Start
		Form1042Agent payer = new Form1042Agent();
		if (rs.getInt("payer") != 0) {
			payer.setAgentId(rs.getInt("payer"));
			tax1042S.setPayer(payer);
		}
//		Payer End

//		intermediary Start
		Form1042Agent intermediary = new Form1042Agent();
		if (rs.getInt("intermediary") != 0) {
			intermediary.setAgentId(rs.getInt("intermediary"));
			tax1042S.setIntermediary(intermediary);
		}
//		intermediary End

		return tax1042S;
	}

}
