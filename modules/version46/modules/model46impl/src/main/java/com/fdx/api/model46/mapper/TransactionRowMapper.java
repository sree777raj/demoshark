package com.fdx.api.model46.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.fdx.api.model46.modelimpl.DebitCreditMemo;
import com.fdx.api.model46.modelimpl.FiAttribute;
import com.fdx.api.model46.modelimpl.HateoasLink;
import com.fdx.api.model46.modelimpl.Iso4217Code;
import com.fdx.api.model46.modelimpl.LineItem;
import com.fdx.api.model46.modelimpl.Transaction;
import com.fdx.api.model46.modelimpl.TransactionLinks;
import com.fdx.api.model46.modelimpl.TransactionReward;
import com.fdx.api.model46.modelimpl.TransactionStatus;

public class TransactionRowMapper implements RowMapper<Transaction> {

	@Override
	public Transaction mapRow(ResultSet rs, int arg1) throws SQLException {
		Transaction transaction = new Transaction();
		if (rs != null) {

			transaction.setAccountId(rs.getString("accountid"));
			transaction.setTransactionId(rs.getString("transactionId"));
			transaction.setReferenceTransactionId(rs.getString("referenceTransactionId"));
			transaction.setPostedTimestamp(rs.getTimestamp("postedtimestamp"));
			transaction.setTransactionTimestamp(rs.getTimestamp("transactiontimestamp"));
			transaction.setDescription(rs.getString("description"));
			transaction.setMemo(rs.getString("memo"));
			if (rs.getString("debitcreditmemo") != null)
				transaction.setDebitCreditMemo(DebitCreditMemo.fromValue(rs.getString("debitcreditmemo").toString()));
			transaction.setCategory(rs.getString("category"));
			transaction.setSubCategory(rs.getString("subcategory"));
			transaction.setReference(rs.getString("reference"));
			if (rs.getString("status") != null)
				transaction.setStatus(TransactionStatus.fromValue(rs.getString("status")));
			transaction.setAmount(rs.getBigDecimal("amount"));
			transaction.setForeignAmount(rs.getBigDecimal("foreignAmount"));
			if (rs.getString("foreignCurrency") != null)
				transaction.setForeignCurrency(Iso4217Code.fromValue(rs.getString("foreignCurrency").toString()));

			List<String> imageIdsResponse = new ArrayList<>();
			if (rs.getArray("imageids") != null) {
				List<String> imageIdList = Arrays.asList((String[]) rs.getArray("imageids").getArray());
				for (String listele : imageIdList) {
					imageIdsResponse.add(listele);
				}
				transaction.setImageIds(imageIdsResponse);
			}
			List<LineItem> lineItemResponse = new ArrayList<>();
			if (rs.getArray("lineitemsid") != null) {
				List<Integer> lineItemList = Arrays.asList((Integer[]) rs.getArray("lineitemsid").getArray());
				for (Integer listele : lineItemList) {
					LineItem lineItem = new LineItem();
					lineItem.setLineItemId(listele);
					lineItemResponse.add(lineItem);
				}
				transaction.setLineItem(lineItemResponse);
			}

			if (rs.getArray("fiattributes") != null) {
				List<FiAttribute> fiAttributeList = new ArrayList<>();
				List<Integer> fiattrlist = Arrays.asList((Integer[]) rs.getArray("fiattributes").getArray());
				for (Integer listele : fiattrlist) {
					FiAttribute fiAttribute = new FiAttribute();
					fiAttribute.setName(listele.toString());
					fiAttributeList.add(fiAttribute);
				}
				transaction.setFiAttributes(fiAttributeList);
			}

			if (rs.getArray("links") != null) {
				TransactionLinks transactionLinks = new TransactionLinks();
				List<HateoasLink> hateoasLinkList = new ArrayList<>();
				List<Integer> linkIdList = Arrays.asList((Integer[]) rs.getArray("links").getArray());
				for (Integer linkIdIterator : linkIdList) {
					HateoasLink hateoasLink = new HateoasLink();
					hateoasLink.setHateoasLinkId(linkIdIterator);
					hateoasLinkList.add(hateoasLink);
				}

				transactionLinks.setImage(hateoasLinkList);
				transaction.setLinks(transactionLinks);
			}

			if (rs.getInt("rewardid") != 0) {
				TransactionReward reward = new TransactionReward();
				reward.setRewardId(rs.getInt("rewardid"));
				transaction.setReward(reward);
			}

		}
		return transaction;
	}
}
