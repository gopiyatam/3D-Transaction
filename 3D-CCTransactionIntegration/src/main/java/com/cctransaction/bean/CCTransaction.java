package com.cctransaction.bean;

public class CCTransaction {
	
	private int merchant_txnId;
	private String firstname;
	private String lastname;
	private double amount;
	private Long carditCardNumber;
	private int cvv;
	private int expMonth;
	private int expYear;
	private Long supplierTxnId;
	private String status;
	
	public int getMerchant_txnId() {
		return merchant_txnId;
	}
	public void setMerchant_txnId(int merchant_txnId) {
		this.merchant_txnId = merchant_txnId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Long getCarditCardNumber() {
		return carditCardNumber;
	}
	public void setCarditCardNumber(Long carditCardNumber) {
		this.carditCardNumber = carditCardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getExpMonth() {
		return expMonth;
	}
	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}
	public int getExpYear() {
		return expYear;
	}
	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}
	public Long getSupplierTxnId() {
		return supplierTxnId;
	}
	public void setSupplierTxnId(Long supplierTxnId) {
		this.supplierTxnId = supplierTxnId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CCTransaction [merchant_txnId=" + merchant_txnId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", amount=" + amount + ", carditCardNumber=" + carditCardNumber + ", cvv=" + cvv + ", expMonth="
				+ expMonth + ", expYear=" + expYear + ", supplierTxnId=" + supplierTxnId + ", status=" + status + "]";
	}
	
	
	
	
	
	

}
