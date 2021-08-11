package com.tcs.assessment;
import java.util.Date;
public class CurrentAccount {
	double balance;
	String owername;
	Date createddate;
	String type;
	Boolean status;
	double overdraftbalance;
	
	public CurrentAccount(double balance, String owername, Date createddate, String type, Boolean status,double overdraftbalance) {
		super();
		this.balance = balance;
		this.owername = owername;
		this.createddate = createddate;
		this.type = type;
		this.status = status;
		this.overdraftbalance=overdraftbalance;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwername() {
		return owername;
	}

	public void setOwername(String owername) {
		this.owername = owername;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public double getOverdraftbalance() {
		return overdraftbalance;
	}
	public void setOverdraftbalance(double overdraftbalance) {
		this.overdraftbalance = overdraftbalance;
	}
}
