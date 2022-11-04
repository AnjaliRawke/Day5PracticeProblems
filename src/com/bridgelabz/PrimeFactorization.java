package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactorization {
	 public static void main(String args[]){
	      int number;
	      Scanner InputValue = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      number = InputValue.nextInt();
	     
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	        	 System.out.println("Prime Factors of Given number are:");
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	     
	   }
	}

