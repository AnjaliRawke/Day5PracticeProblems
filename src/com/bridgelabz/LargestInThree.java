package com.bridgelabz;

import java.util.Scanner;

public class LargestInThree {
	   public static void main(String[] args) {
	         int largest;
	         Scanner input1 = new Scanner(System.in);
	         System.out.println("Enter First Number:");
	         int a = input1.nextInt();
	         Scanner input2 = new Scanner(System.in);
	         System.out.println("Enter Second Number:");
	         int b = input2.nextInt();
	         Scanner input3 = new Scanner(System.in);
	         System.out.println("Enter Third Number:");
	         int c = input3.nextInt();
	        //find the largest
	        if(a>b && a>c)
	        {
	            largest = a;
	        } 
	        else if (b>c && b>a)
	        {
	            largest = b;
	        } 
	        else
	        {
	            largest = c;
	        }
	        System.out.print(largest + " is the largest.");
	    }
	}

