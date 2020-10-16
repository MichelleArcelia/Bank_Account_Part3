/* Week 4 Partner Pair Assignment #3
 * Bank Account Part 3  
 * @date October 15, 2020
 * PART 3
 */

package com.meritamerica.assignment3;

import java.util.Date;

public class CDAccount extends BankAccount {

	CDOffering offering;
	private double balance;
	private Date date;

	public CDAccount(CDOffering offering, double balance) {
		super(MeritBank.getNextAccountNUmber(), balance, offering.getInterestRate());
		this.offering = offering;
		this.date = new Date();
	}

	public double getBalance() {
		return super.getBalance();
	}

	public double getinterestRate() {
		return offering.getInterestRate();
	}

	public int getTerm() {
		return offering.getTerm();
	}

	public Date getStartDate() {
		return this.date;
	}

	public long getAccountNumber() {
		return super.getAccountNumber();
	}

	public double futureValue() {
		return (balance * Math.pow(1.0 + offering.getInterestRate(), offering.getTerm()));
	}
	
//------------------------------------------------- ASSIGNMENT 3 AMENDMENTS -----------------------------------------------
	
//Override the deposit and withdraw methods to return false. CD Accounts cannot deposit new funds or withdraw funds until the term is reached.
	
	public boolean withdraw(double amount) {
		return false;
	}
	
	public boolean deposit(double amount) {
		return false;
	}
	
	public CDAccount readFromString(String accountData) {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("mm/dd/yyyy");
		
		try {
			String storage1[] = accountData.split(",");
			int testAccount = In
					// FIX MEEEEEEEEEEEEEEEEEEEEEEE
		}
		
	}
	
	public String writeToString() {
		return this.getAccountNumber() + " , " + this.getBalance() + " , " + this.getinterestRate() + " , " + this.getTerm();
	}
	
	
	
}