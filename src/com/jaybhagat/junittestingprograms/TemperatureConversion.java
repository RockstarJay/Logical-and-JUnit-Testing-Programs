package com.jaybhagat.junittestingprograms;

/*
 * class for temperature conversion
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class TemperatureConversion {
	static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter 1 for Celsius to Fahrenheit Conversion: ");
        System.out.println("Enter 2 for Fahrenheit to Celsius Conversion: ");
        System.out.print("Enter Your Choice: ");
        int conversion = scanner.nextInt();

        switch (conversion) {
            case 1:
                fahrenheit();
                break;
            case 2:
                celsius();
                break;
            default:
                System.out.println("Please Enter From Given Choices");
                break;
        }
    }
    
    /*
     * asks for temperature in celsius
     * converts it into fahrenheit and print it
     */
    private static void fahrenheit() {
        System.out.print("Enter a Temperature in Celsius : ");
        float temp = scanner.nextFloat();
        float fahrenheit = 0;
        fahrenheit = (temp*9/5) + 32;
        System.out.printf("Fahrenheit : %.1f", fahrenheit);

    }
    
    /*
     * asks for temperature in fahrenheit
     * converts it into celsius and print it
     */
    private static void celsius() {
        System.out.print("Enter a Temperature in Fahrenheit : ");
        float temp = scanner.nextFloat();
        float celsius = 0;
        celsius = (temp-32)* 5 / 9;
        System.out.printf("Celsius : %.1f", celsius);
    }
}