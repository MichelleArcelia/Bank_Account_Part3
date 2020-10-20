/* Week 4 Partner Pair Assignment #3
 * Bank Account Part 3  
 * @date October 15, 2020
 * PART 3
 */

package com.meritamerica.assignment3;

public class CDOffering {

	private int term;
	private double interestRate;
	

// CONSTRUCTOR
	
	public CDOffering() {
		
	}

	public CDOffering (int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
	}
		
	
	public int getTerm() {
		return term;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public String toString() {
		return "Your CD Offering Terms: " + this.getTerm() + " Your CD Offering Interest Rate: " + this.getInterestRate();
	}
		
//------------------------------- ASSIGNMENT 3 AMENDMENTS ------------------------------
	
	
	public static CDOffering readFromString(String string) {
		String[] newArray = string.split(",");
		
		int term = Integer.valueOf(newArray[0]);
		
		double interestRate = Double.valueOf(newArray[1]);
		
		return new CDOffering(term, interestRate);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	

/*	static CDOffering readFromString(String cdOfferingDataString) {
		
		String storage1[] = cdOfferingDataString.split(",");
		int testTerm = Integer.parseInt(storage1[0]);
		double testInterest = Double.parseDouble(storage1[1]);
		
		CDOffering offeringA = new CDOffering(testTerm, testInterest);
		return offeringA;
	}
	
	
	public String writeToString() {
		return this.term + "," + this.interestRate;
	}
	
}
	
	*/