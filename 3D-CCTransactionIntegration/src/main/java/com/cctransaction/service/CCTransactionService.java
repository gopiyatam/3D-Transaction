package com.cctransaction.service;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.cctransaction.bean.CCTransaction;

public interface CCTransactionService {
	public String creditCardTransaction(CCTransaction transaction) throws ClientProtocolException, IOException;

	public List<CCTransaction> getTransactionDetailsByMarchantTxnId(int marchantTxnId);
}