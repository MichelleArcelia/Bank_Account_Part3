/* Week 4 Partner Pair Assignment #3
* Bank Account Part 3  
* @date October 15, 2020
* PART 3
*/

package com.meritamerica.assignment3;

import java.ParseException;
import java.text.*;
import java.util.*;

import com.meritamerica.assignment3.MeritBank;

public class BankAccount {

// ----------------------------- VARIABLE -------------------------------------
	
		private long accountNumber;
		private double balance;
		private double interestRate;
		double bankAccount;
		private java.util.Date accountOpenedOn;
		
		static SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

// -------------------- CONSTRUCTOR: Bank Account -----------------------------
		  
	public BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNumber = MeritBank.getNextAccountNUmber();
		this.accountOpenedOn = new java.util.Date();
		
	}
		
	public BankAccount(double balance, double interestRate, Date accountOpenedOn){
		
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountOpenedOn = accountOpenedOn;
		this.accountNumber = MeritBank.getNextAccountNUmber();
	}
		
		
	public BankAccount(long accountNumber, double balance, double interestRate, Date accountOpenedOn) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountOpenedOn = accountOpenedOn;
	
	}
		
// ----------------------------- Account Number --------------------------------
	
	 public long getAccountNumber() {
		 return this.accountNumber;
	}
	 
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

// ----------------------------- Balance ---------------------------------------
	 
	public double getBalance() {
		return this.balance;
	}

// ----------------------------- Interest Rate ---------------------------------
	
	public double getInterestRate() {
		return interestRate;
	}
	
// ----------------------------- Opening Date ----------------------------------
	
	public java.util.Date getOpenedOn() {
		return this.accountOpenedOn;
	}

// -------------------------------- Withdraw -----------------------------------
	
	public boolean Withdraw (double amount) {
		
		if (amount < 0) {
			System.out.println("WARNING - Can not withdraw a negative amount! Please Try again");
			return false;
		}
		else {
			if((this.getBalance() - amount) < 0) {
				System.out.println();
			}
		}

	    if (amount < balance && amount > 0) {
	       balance = balance - amount;
	       return true;
	    }
	    else {
	    	System.out.println ("not enough money in your account!");
	    	return false;
	    }
	}

// --------------------------------- Deposit ------------------------------------ 
	
	public boolean Deposit (double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		else {
			System.out.println("Cannot deposit a negative amount");
			return false;
		}
	}
	
// -------------------------------- Future Value --------------------------------
	
	public double futureValue(int years) {
		double FV = balance * Math.pow(1.0 + interestRate,years);
		return FV;

	}
}