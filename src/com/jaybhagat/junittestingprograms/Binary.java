package com.jaybhagat.junittestingprograms;

/*
 * class to find decimal number after swapping nibbles of binary number
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int decNumber = scanner.nextInt();
        scanner.close();
        getBinary(decNumber);
    }
	
	/*
	 * first we need to convert input number into binary
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
        
        // reverse the binaryNum array
        for (int l = 0; l<=3; l++) {
            int temp = binaryNum[l];
            binaryNum[l] = binaryNum[7-l];
            binaryNum[7-l] = temp;
        }
        System.out.print("Number in Binary : ");

        // printing the binaryNum array
        for (int l= 0; l<=7; l++){
            System.out.print(binaryNum[l]);
        }
        nibbleSwap(binaryNum);
    }

    // swapping the nibbles of binary number
    private static void nibbleSwap(int[] binaryNum) {
        int[] nibbleBinary = new int[20];
        int m = 0;
        
        // 2nd nibble to the 1st nibble position
        for (int j=4; j<=7; j++) {
            nibbleBinary[m++] = binaryNum[j];
        }
        
        // 1st nibble to the 2nd nibble position
        for (int j=0; j<=3; j++) {
            nibbleBinary[m++] = binaryNum[j];
        }
        System.out.print("\nBinary Number After Swapping Nibble : ");
        for (int l= 0; l<=7; l++){
            System.out.print(nibbleBinary[l]);
        }
        binaryToDecimal(nibbleBinary);
    }
    
    /*
     * now to convert binary into decimal
     */
    private static void binaryToDecimal(int[] ar) {
        long binary = 0;
        for(int i = 0; i < 8; i++)
            binary = binary*10+ar[i];
        long rem = 0;
        long decimal = 0;
        int i = 0;
        while (binary>0) {
            rem = binary%10;
            decimal = (long) (decimal + (rem * Math.pow(2,i)));
            binary = binary/10;
            i++;
        }
        System.out.println("\nDecimal Number After Swapping Nibbles is : " + decimal);
    }
}