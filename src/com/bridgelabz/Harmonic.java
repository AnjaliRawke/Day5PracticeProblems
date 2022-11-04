package com.bridgelabz;

import java.util.Scanner;

public class Harmonic {
	public static void main(String[] args) {

		// INITIALIZATION
		double result = 0, num = 0, i;
		int n;
	    Scanner scan = new Scanner(System.in);
    	System.out.print("enter the harmonic you want to find: ");
		n = scan.nextInt();

		// COMPUTATION
		for (i = 1; i <= n; i++) {
			num = num + (1 / i);
			result = num;
		}
		System.out.println("the value of harmonic no. " + n + " is: " + result);

	}

}

