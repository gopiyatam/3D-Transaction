package com.cctransaction.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CCTransactionMapper implements RowMapper<CCTransaction> {

	public CCTransaction mapRow(ResultSet rs, int rowNum) throws SQLException {
		CCTransaction trans = new CCTransaction();
		trans.setMerchant_txnId(rs.getInt("marchantTxnId"));
		trans.setFirstname(rs.getString("firstname"));
		trans.setLastname(rs.getString("lastname"));
		trans.setCarditCardNumber(rs.getLong("CreditCardNo"));
		trans.setAmount(rs.getDouble("amount"));
		trans.setCvv(rs.getInt("CVV"));
		trans.setExpMonth(rs.getInt("CreditCardExpMonth"));
		trans.setExpYear(rs.getInt("CreditCardExpYear"));
		trans.setSupplierTxnId(rs.getLong("suppilerTransactionId"));
		trans.setStatus(rs.getString("Status"));
		
		return trans;
		
	}

}
