package com.jaybhagat.logicalprograms;

/*
 * class to generate coupon numbers
 * @author com.jaybhagat
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CouponNumber {
	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
        System.out.print("How many Coupons You Want to Generate : ");
        int numOfCoupon = scanner.nextInt();
        scanner.close();

        getRandomCoupon(numOfCoupon);    // function call
	}
	
	/*
	 * using random methd to generate coupon numbers 
	 * using ArrayList to store the random numbers generated
	 * apply a condition if the number already exist don't save that again 
	 * finally print the coupon numbers with for each loop
	 */
	 private static void getRandomCoupon(int numOfCoupon) {
		 int count = 0;
	        ArrayList<Integer> couponList = new ArrayList<>();
	        for (int i = 0; i < numOfCoupon; i++) {
	            int randomNumber = (int) Math.floor(Math.random()*1000);
	            count++;
	            if (!couponList.contains(randomNumber)) {
	                couponList.add(randomNumber);
	            }
	        }
	        for (int coupon : couponList) {
	            System.out.println(coupon);
	        }
	        System.out.println("Number of Turns Required to Generate Coupons: " +count);
	 }
}