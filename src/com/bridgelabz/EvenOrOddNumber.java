package com.bridgelabz;

import java.util.Scanner;

public class EvenOrOddNumber {
	public void CheckEvenOrOdd()
	  {
	    int num;
	    System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
	    num = input.nextInt();
        if ( num % 2 == 0 )
	      System.out.println(num+" is an even number.");
	    else
	      System.out.println(num+" is an odd number.");
	  }
	public static void main(String[] args) {
		EvenOrOddNumber Obj=new EvenOrOddNumber();
		Obj.CheckEvenOrOdd();
	}
	}

