package com.cctransaction.dao;

import java.util.List;

import com.cctransaction.bean.CCTransaction;

public interface CCTransactionDAO {
	public int saveCCTransactionDetails(CCTransaction transaction);
	public void saveSupplierResponseCCTransactionData(CCTransaction transaction );
	public void saveSupplierFinalResponse(CCTransaction transaction);
	public CCTransaction getTransactionDetailsByMarchantTxnId(int marchantTxnId);

}
