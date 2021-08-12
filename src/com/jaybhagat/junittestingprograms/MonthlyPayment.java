package com.jaybhagat.junittestingprograms;

/*
 * class to find the monthly payment for the loan
 * @author com.jaybhagat 
 */

import java.util.Scanner;

public class MonthlyPayment {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle Loan Amount : ");
        float principleAmount = scanner.nextFloat();
        System.out.print("Enter Years To Return The Loan : ");
        int year = scanner.nextInt();
        System.out.print("Enter a Rate Of Interest : ");
        float rateOfInterest = scanner.nextFloat();
        scanner.close();

        getMonthlyPayment(principleAmount, year, rateOfInterest);
    }
	
	/*
	 * n holds number of months for 'y' years
	 * r for the rate of interest
	 * finally prints the monthly payment
	 */
    private static void getMonthlyPayment(float P, int Y, float R) {
        int n = Y * 12;
        float r = R / (12*100);
        float monthlyPayment = (P*r) / (float)(1-(Math.pow(1+r, -n)));
        System.out.printf("Monthly Payment: %.2f", monthlyPayment);
    }
}