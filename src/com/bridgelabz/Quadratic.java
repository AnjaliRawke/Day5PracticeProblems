package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
	 public static void main(String[] args) {
		  Scanner InputValue=new Scanner(System.in);
		  System.out.println("Enter a:");
		  int a=InputValue.nextInt();
		  System.out.println("Enter b:");
		  int b=InputValue.nextInt();
		  System.out.println("Enter c:");
		  int c=InputValue.nextInt();
		  double delta=(b*b-4.0*a*c);
		  
		  if(delta>0)
		  {
			  double r1=b+Math.sqrt(delta)/(2*a);
			  double r2=-b-Math.sqrt(delta)/(2*a);
		      System.out.println("The roots are: " + r1 + "and" + r2);
		  }
		  else
		  {
			  System.out.println("Roots are imaginary");
			  
		  }
	   }
	}


