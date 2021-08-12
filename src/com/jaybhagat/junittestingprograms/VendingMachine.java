package com.jaybhagat.junittestingprograms;

/*
 * class to Find the Fewest Notes to be returned for Vending Machine
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		// input 
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amount to Withdraw : ");
        int withdrawAmount = scanner.nextInt();
        minimumNotes(withdrawAmount);
        scanner.close();
	}
	
	/*
	 * passing withdrawAmount as input to function as parameter
	 * finding the largest note to return 
	 * making sure lowest number of notes should be return using recursion
	 * finaly return the notes
	 */
	private static int thousandCount = 0, fiveHundredCount = 0, hundredCount = 0, fiftyCount = 0, tenCount = 0, fiveCount = 0, twoCount = 0, oneCount = 0;
	private static int minimumNotes(int withdrawAmount) {
		if (withdrawAmount > 0) {
			if (withdrawAmount >= 1000) {
				withdrawAmount = withdrawAmount - 1000;
                thousandCount++;
	            } 
			else if (withdrawAmount >= 500) {
	            	withdrawAmount = withdrawAmount - 500;
	                fiveHundredCount++;
	            } 
			else if (withdrawAmount >= 100) {
	            	withdrawAmount = withdrawAmount - 100;
	                hundredCount++;
	            } 
			else if (withdrawAmount >= 50) {
	            	withdrawAmount = withdrawAmount - 50;
	                fiftyCount++;
	            } 
			else if (withdrawAmount >= 10) {
	            	withdrawAmount = withdrawAmount - 10;
	                tenCount++;
	            } 
			else if (withdrawAmount >= 5) {
	            	withdrawAmount = withdrawAmount - 5;
	                fiveCount++;
	            } 
			else if (withdrawAmount >= 2) {
	            	withdrawAmount = withdrawAmount - 2;
	                twoCount++;
	            } 
			else {
	            	withdrawAmount = withdrawAmount - 1;
	                oneCount++;
	            }
	            return minimumNotes(withdrawAmount);
	        } 
		else {
	            int minNumberOfNotes = thousandCount + fiveHundredCount + hundredCount + fiftyCount + tenCount + fiveCount + twoCount + oneCount;
	            System.out.println("Minimum number of notes: " + minNumberOfNotes);
	            System.out.println("1000 Notes " + ": " + thousandCount);
	            System.out.println("500 Notes " + ": " + fiveHundredCount);
	            System.out.println("100 Notes " + ": " + hundredCount);
	            System.out.println("50 Notes " + ": " + fiftyCount);
	            System.out.println("10 Notes " + ": " + tenCount);
	            System.out.println("5 Notes " + ": " + fiveCount);
	            System.out.println("2 Notes " + ": " + twoCount);
	            System.out.println("1 Notes " + ": " + oneCount);
	           
	            return 0;
        }
	}
}