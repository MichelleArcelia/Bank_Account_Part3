/* Week 4 - Partner Pair Assignment #3
 * Bank Account Part 3
 * @date October 15, 2020
 * PART 3
 */

package com.meritamerica.assignment3;

//import java.io.*;
//import java.text.*;
//import java.util.*;

import java.io.IOException;
import java.text.ParseException;


public class MeritAmericaBankApp {
	
	public static void main(String[] args) throws Exception {
		
		try {
		MeritBank.readFromFile("src/test/testMeritBank_good.txt");
		
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}