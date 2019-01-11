package com.cctransaction.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.cctransaction.bean.CCTransaction;

@Repository
public class CCTransactionDAOImpl implements CCTransactionDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int saveCCTransactionDetails(final CCTransaction transaction) {
		final String sqlQuery = "insert into CCTransaction(firstname,lastname,CreditCardNo,amount,CVV,CreditCardExpMonth,CreditCardExpYear) values(?,?,?,?,?,?,?)";
		KeyHolder holder = new GeneratedKeyHolder();

		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(sqlQuery,
						Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, transaction.getFirstname());
				ps.setString(2, transaction.getLastname());
				ps.setLong(3, transaction.getCarditCardNumber());
				ps.setDouble(4, transaction.getAmount());
				ps.setInt(5, transaction.getCvv());
				ps.setInt(6, transaction.getExpMonth());
				;
				ps.setInt(7, transaction.getExpYear());
				return ps;
			}
		}, holder);
		return holder.getKey().intValue();
	}

	public void saveSupplierResponseCCTransactionData(CCTransaction transaction) {

		String sql = "update CCTransaction set SuppilerTransactionId=?,status=? where marchantTxnId=? ";
		jdbcTemplate.update(sql, transaction.getSupplierTxnId(), transaction.getStatus(),
				transaction.getMerchant_txnId());
	}

	public void saveSupplierFinalResponse(CCTransaction transaction) {
		// TODO Auto-generated method stub
		String sql = "update CCTransaction set status=? where marchantTxnId=? ";
		jdbcTemplate.update(sql, transaction.getStatus(), transaction.getMerchant_txnId());
	}

	public CCTransaction getTransactionDetailsByMarchantTxnId(int marchantTxnId) {
		String sql = "select * from cctransaction where marchantTxnId=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { marchantTxnId }, new CCTransactionMapper());
		

	}

}
