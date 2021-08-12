package com.jaybhagat.logicalprograms;

/*
 * class to find the Fibonacci Series
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {	
		// taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Value to Find the Fibonacci Series: ");
		int fiboNumber = scanner.nextInt();
		scanner.close();
		getFibonacci(fiboNumber);  // calling function
	}
	
	/*
	 * passing input to function as parameter
	 * taking 1st and 2nd number for series
	 * with for loop adding first number into second number then assign values respectively
	 * and print the addition as next number of series
	 */
	private static void getFibonacci(int fiboNumber) {
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.print(firstNumber+","+secondNumber);
		for (int i = 1; i <= fiboNumber - 2; i++) {
			int nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			System.out.print(","+nextNumber);
		}
	}
}