package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
	 public static void main(String[] args) {
	    	
	    	int Loopcount=1;
	    	double heads=0;
	    	double tails=0;
	    	double result;
	    	Scanner FlipNum=new Scanner(System.in);
	    	System.out.println("enter the number: ");
	    	int flips=FlipNum.nextInt();
		 while(Loopcount<=flips) {
			 result=Math.random();
			 System.out.println(Loopcount+" "+result);
			 if(result<=0.5) {
				 heads++;
				 System.out.println("heads");
			 }
			 else {
				 tails++;
				 System.out.println("tails");
			 }
			 Loopcount++;
		 }
		 double percentHeads=heads/flips*100;
		System.out.println("% of heads:"+percentHeads);
		 double percentTails=tails/flips*100;
		System.out.println("% of tails:"+percentTails);
	    }
	}


