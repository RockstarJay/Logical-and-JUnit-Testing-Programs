package com.jaybhagat.junittestingprograms;

/*
 * class to find the day of the year using formulas of Gregorian calendar
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class DayOfWeek {
	private static int day;
    public static void main(String[] args) {
    	// inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Date");
        System.out.print("Enter Date (dd): ");
        int date = scanner.nextInt();
        System.out.print("Enter Month (mm): ");
        int month = scanner.nextInt();
        System.out.print("Enter Year (yyyy): ");
        int year = scanner.nextInt();
        scanner.close();
        int temp = year;

        /*
         * while loop to calculate the length of year
         * year should be in 4 digits
         * it store the length of year
         */
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        if (date > 31) {
            System.out.println("Dates are Limited Till 31");
        } else if (month > 12) {
            System.out.println("Month are Limited Till 12");
        } else if ( count != 4 ) {
            System.out.println("Year Should be Four Digit");
        } else {
            day = dayOfWeek(date, month, year);
        }

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

    }
    
    /*
     *  d for date, m for month, y for year
     *  m0 stores the month: "January" as 11, "February" as 12 and "March" as 1, "April" as 2, ... , "December" as 10.
     *  d0 stores the day: "Sunday" as 0, "Monday" as 1, ... and so on
     */
    private static int dayOfWeek(int d, int m, int y) {
        int y0 = 0, x = 0, m0 = 0, d0 = 0;
        y0 = y - (14-m)/12;
        x  = y0 + y0/4 - y0/100 + y0/400;
        m0 = m + 12*((14-m)/12) - 2;
        d0 = (d+x+31*m0/12) % 7;

        return d0;
    }
}