/* Week 4 Partner Pair Assignment #3
 * Bank Account Part 3  
 * @date October 15, 2020
 * PART 3
 */

package com.meritamerica.assignment3;

import com.meritamerica.assignment3.CDOffering;
import com.meritamerica.assignment3.MeritBank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Formatter;

public class CDAccount extends BankAccount {

	private CDOffering offering;
	private double balance;
	private Date date;
	public static int term;
	


	public CDAccount(long accountNumber, double balance, double interestRate, Date date, int term) {
		super(accountNumber, balance, interestRate);
	}
	
	public CDAccount(CDOffering offering, double balance) {
		
		super(MeritBank.getNextAccountNumber(), balance, offering.getInterestRate());
		this.offering = offering;
		this.date = new Date();
		this.balance = balance;
	}
	
	public CDAccount(CDOffering offering, long accountNumber, double balance, Date date) {
		
		super(accountNumber, balance, date);
		
		this.offering = offering;
		
		//this.term = term;
		//this.date = date;
		
		//this.offering.setTerm(term);
		//this.offering.setInterestRate(interest);
		
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
		return balance * (Math.pow(1.0 + offering.getInterestRate(), offering.getTerm()));
	}
	
//------------------------------------------------- ASSIGNMENT 3 AMENDMENTS -----------------------------------------------
	
//Override the deposit and withdraw methods to return false. CD Accounts cannot deposit new funds or withdraw funds until the term is reached.
	
	public boolean withdraw(double amount) {
		return false;
	}
	
	public boolean deposit(double amount) {
		return false;
	}
	
	
	
	
	public static CDAccount readFromString(String string) {
		
		CDAccount cd;
		
		try {
			String[] newArray = string.split(",");
			
			long accountNumber = Long.parseLong(newArray[0]);
			
			double balance = Double.parseDouble(newArray[1]);
			
			double interestRate = Double.parseDouble(newArray[2]);
			
			SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
			
			Date date = dateFormatter.parse(newArray[3]);
			
			int term = Integer.parseInt(newArray[4]);
			
			cd = new CDAccount(accountNumber, balance, interestRate, date, term);
			
			for(String s: newArray) {
				System.out.println(s);
			}
			
					//CDAccount(long accountNumber, double balance, double interestRate, Date date, int term)
		}
	
		catch (Exception e) {
			System.out.println("readFromString in CDAccount" + "THIS THREW a NumberFormatException");
			
			throw new NumberFormatException();
		}
		System.out.println("CD GET BALANCE " + cd.getBalance());
		return cd;
	}
	
	
	

	public String writeToString() {
		//return String 
		return this.getAccountNumber() + " , " + this.getBalance() + " , " + this.getinterestRate() + " , " + this.getTerm();
	}
}

	
	
	
	
	
	
	
	

// WORKING CODE PLZ USE MEEEEEEEEEEEEEEEEEEEE	
	
	/*
	
	public CDAccount(CDOffering offering, double balance) {
		
		super(MeritBank.getNextAccountNumber(), balance, offering.getInterestRate());
		this.offering = offering;
		this.date = new Date();
	}
	
	public CDAccount(long accountNumber, double balance, double interestRate, Date date, int term) {
		
		super(accountNumber, balance, interestRate);
		this.term = term;
		this.date = date;
		
		//this.offering.setTerm(term);
		//this.offering.setInterestRate(interest);
		
	}
	
	
	
	
	public static CDAccount readFromString(String accountData) throws ParseException {
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat ("dd/MM/yyyy");
		
		String[]chd = accountData.split(",");
		
		long accountNumber = Long.parseLong(chd[0]);
		double balance = Double.parseDouble(chd[1]);
		double interestRate = Double.parseDouble(chd[2]);
		
		Date date = dateFormatter.parse(chd[3]);
		
		CDAccount CDAccountInfo = new CDAccount(accountNumber, balance,
				interestRate, date, term);
		
		return CDAccountInfo;
		


	}
*/	
	
	
	
	
	
	
	










//



/*	














	public static CDAccount readFromString(String account) throws ParseException {
		
		CDAccount newCdAccount;
		 
		try {
			ArrayList<String> TEST = new ArrayList<>(Arrays.asList(account.split(",")));
			
			for(String s: TEST) {
				
			}
			
			long accountNumber = Long.parseLong((TEST.get(0)));
			
			//int accountNumber = Integer.parseInt(TEST.get(0));
			
			double balance = Double.parseDouble(TEST.get(1));
			
			double interestRate = Double.parseDouble(TEST.get(2));
			
			
			//Date accountOpenedOn = formatter.parse(TEST.get(3));
			
			Date accountOpenedOn = new Date();
			
			int term = Integer.parseInt(TEST.get(4));
			
			newCdAccount = new CDAccount(accountNumber, balance, interestRate, accountOpenedOn, term);
			
			
			return newCdAccount;
		}
		catch (Exception e) {
			//throw new java.lang.NumberFormatException();
			
			System.out.println("CD ACCOUNT TESTING - plz work");

			return null;
		}
		
		
	}





*/