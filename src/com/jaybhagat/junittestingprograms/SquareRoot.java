package com.jaybhagat.junittestingprograms;

/**
 * class to find the square root of non negative number using Newtons method.
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number To Find The Square Root : ");
        int inputNumber = scanner.nextInt();
        scanner.close();
        final double epsilon = 1E-15;
        float t = inputNumber;
        
        /*
         * storing last value of 't'
         * calculate new value of 't'
         * lastT number gives a same square root repeatedly
         * break 'while' loop if a number gives a same square root repeatedly
         */
        while (Math.abs(t-inputNumber/t) > epsilon * t) {
            double lastT = t;
            t = (float) ((inputNumber/t + t)/2.0);
            if ( lastT == t) {
                break;
            }
        }
        System.out.println("Square Root of " + inputNumber + " : " + t);
    }
}