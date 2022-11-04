package com.bridgelabz;

import java.util.Scanner;

public class QuotientAndRemainder {
	 public static void main(String[] args) {
	      
	      Scanner InputValue=new Scanner(System.in);
	      System.out.println("Enter Dividend: ");
	      int dividend=InputValue.nextInt();
	      Scanner inputValue=new Scanner(System.in);
	      System.out.println("Enter Divisor: ");
	      int divisor=InputValue.nextInt();
		   int quotient=dividend/divisor;
		   int remainder=dividend%divisor;
		   System.out.println("Quotient= "+quotient);
		   System.out.println("Remainder= "+remainder);
	        }
		
	}


