/* Week 4 Partner Pair Assignment #3
 * Bank Account Part 3  
 * @date October 15, 2020
 * PART 3
 */

package com.meritamerica.assignment3;

public class CDOffering {

	int term;
	double interestRate;
	

// CONSTRUCTOR

	CDOffering (int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
	}
		
	
	public int getTerm() {
		return term;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
		
//------------------------------- ASSIGNMENT 3 AMENDMENTS ------------------------------
	
	static CDOffering readFromString(String cdOfferingDataString) {
		
		String storage1[] = cdOfferingDataString.split(",");
		int testAccount = Integer.parseInt(storage1[0]);
		double testAccount = Double.parseDouble(storage1[1]);
		
		CDOffering offeringA = new CDOffering(testTerm, testInterest);
		return offeringA;
	}
	
	
}