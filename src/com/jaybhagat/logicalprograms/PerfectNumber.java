package com.jaybhagat.logicalprograms;

/*
 * class to check whether a number is a Perfect Number
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
		
		// input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number To Check If It's a Perfect Number: ");
		int inputNumber = scanner.nextInt();
		scanner.close();
		int	perfectNumber = 0;
		
		/*
		 * get a number as input from user
		 * using loop find the devisors of that number excluding the number itself
		 * find the sum of these devisors
		 * check if the sum and input is the same or not
		 */
		for (int i = 1; i <= inputNumber/2; i++){
			if(inputNumber % i == 0)
				perfectNumber = perfectNumber + i;
		}
		if (perfectNumber == inputNumber)
			System.out.println(inputNumber+ " is a Perfect Number");
		else
			System.out.println(inputNumber+ " is Not a Perfect Number");
	}
}