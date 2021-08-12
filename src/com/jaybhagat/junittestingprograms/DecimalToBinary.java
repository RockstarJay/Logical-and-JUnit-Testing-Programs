package com.jaybhagat.junittestingprograms;

/*
 * class to convert the decimal number into binary
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class DecimalToBinary {
	 public static void main(String[] args) {
		// input 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Decimal Number : ");
        int decimalNum = scanner.nextInt();
        scanner.close();
        getBinary(decimalNum);
    }
	 
	 /*
	  * To compute the binary representation of n
	  * the powers of 2 less than or equal to n in decreasing order
	  * determine which belong in the binary decomposition
	  */
    private static void getBinary(int n) {
        int[] binaryNum = new int[20];
        int i = 0;
        while (n > 0)
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        System.out.print("Number in Binary : ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
}