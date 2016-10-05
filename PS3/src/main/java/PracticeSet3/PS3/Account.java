package PracticeSet3.PS3;

import java.util.Date;

public class Account {
	
	private int ID = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	
	private java.util.Date dateCreated = new java.util.Date();
	
	public Account() {
		
	}
	
	public Account(int ID, double balance) {
		this.ID = ID;
		this.balance = balance;
	}
	
	public int getID() {
		return ID;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()  {
		double monthlyInterestRate = annualInterestRate/12;
		return monthlyInterestRate;
	}
	
	public void withdraw(double withdrawlAmount) throws InsufficientFundsException {
		if (balance > withdrawlAmount) {
			balance = balance - withdrawlAmount;
		}
		else {
			double necessaryFunds = withdrawlAmount - balance;
			throw new InsufficientFundsException(necessaryFunds);
		}
	}
	
	public void deposit(double depositAmount) throws WrongDepositException {
		if (depositAmount > 0) {
			balance = balance + depositAmount;
		}
		else {
			throw new WrongDepositException();
		}
	}

}