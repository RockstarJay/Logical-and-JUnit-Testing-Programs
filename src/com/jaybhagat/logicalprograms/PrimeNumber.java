package com.jaybhagat.logicalprograms;

/*
 * class to check whether a number is a Prime Number
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number to Check If It's Prime Number : ");
        int inputNumber = scanner.nextInt();
        scanner.close();
        getPrime(inputNumber);    // function call
	}
	
	/*
	 * pass input number as parameter to the function
	 * if input is 2 print it's even prime minister
	 * also 0 and 1 is not a prime numbers either
	 * using a flag variable to keep track of execution
	 * finding the devisors of the input number if found flag is 1 if not no change
	 * according to flag result will be printed on console  
	 */
	private static void getPrime(int inputNumber) {
        int flag = 0;
        if (inputNumber == 2) {
            System.out.println(inputNumber + " is The Only Even Prime Minister.");
        }
        else if(inputNumber == 1 || inputNumber == 0) {
        	flag = 1;
        }
        else {
            for(int i = 2; i <= inputNumber/2; i++) {
                if (inputNumber%i == 0) {
                    flag = 1;
                }
            }
            if (flag == 0)
                System.out.println(inputNumber + " is Prime Number");
            else
                System.out.println(inputNumber + " is Not a Prime Number");
        }
    }
}