package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNum {
	 public void SwappingNumbers() {  
	       int x, y, t;// x and y are to swap   
	       Scanner Input = new Scanner(System.in);  
	       System.out.println("Enter the value of X and Y");  
	       x = Input.nextInt();  
	       y = Input.nextInt();  
	       System.out.println("before swapping numbers:"+"x="+x +" "+"y="+ y);  
	       /*swapping */  
	       t = x;  
	       x = y;  
	       y = t;  
	       System.out.println("After swapping:"+"x="+x +"  "+"y=" + y);  
	       System.out.println( );  
	    }
	 public static void main(String[] args) {
		 SwapTwoNum Obj=new SwapTwoNum();
		 Obj.SwappingNumbers();
	 }
	}  

