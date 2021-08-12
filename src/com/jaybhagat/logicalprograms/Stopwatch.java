package com.jaybhagat.logicalprograms;

/*
 * class to simulate a stopwatch
 * @author com.jaybhagt
 */

import java.util.Scanner;

public class Stopwatch {
	public static void main(String[] args) {
		
		/*
		 * user will start the stopwatch by inputing "start" as input
		 * currentTimeMillis will store the time 
		 * again we will ask user to if he wants to stop the stopwatch
		 * if he inputs "stop" watch will stop 
		 * then we will substract stop from start and find the elapsed time 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type 'start' to Start The Stopwatch: ");
	    String startStr = scanner.next().toLowerCase();
	   
	    long start = System.currentTimeMillis();
	    if (startStr.equals("start")) {
	    	System.out.print("Type 'stop' To Stop The Stopwatch: ");
	        String stopStr = scanner.next().toLowerCase();
	        while (!stopStr.equals("stop")) {
	        	System.out.print("Type 'stop' To Stop The Stopwatch: ");
	            stopStr = scanner.next().toLowerCase();
	            }
	        long stop = System.currentTimeMillis();
	        long timeElapsed =  stop - start;
	        System.out.println("Elapsed Time : " + timeElapsed + " ms");

	    } 
	    else {
	            System.out.println("Wrong input.");
	    }
	    scanner.close();
	}
}