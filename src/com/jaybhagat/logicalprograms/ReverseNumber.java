package com.jaybhagat.logicalprograms;

/*
 * class to find the reverse of a number
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        scanner.close();
        
        // assign retuen value from function to a variable and print it
        int reverseNumber = getReverseNumber(inputNumber);
        System.out.println("Reverse number is: " + reverseNumber);
	}
	
	/*
	 * pass input as parameter to the function
	 * two variables assigned to zero to work with the logic
	 * find the remainder using modulo division
	 * then multiple reverse number by 10 and add remainder to it
	 * devide  input number by 10
	 * repeat above two steps till number become zero
	 */
	 private static int getReverseNumber(int inputNumber) {
		 int remainder = 0;
	     int reverseNumber = 0;

	     while (inputNumber > 0) {
	    	 remainder = inputNumber % 10;
	    	 reverseNumber = reverseNumber * 10 + remainder;
	    	 inputNumber = inputNumber /10;
	     }
	     return reverseNumber;
	 }
}