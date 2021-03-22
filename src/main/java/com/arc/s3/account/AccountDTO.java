package com.arc.s3.account;

public class AccountDTO {

	
	private long accountId;
	private String accountName;
	private double rate;
	private String accountSale;
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getAccountSale() {
		return accountSale;
	}
	public void setAccountSale(String accountSale) {
		this.accountSale = accountSale;
	}
	
	
}


