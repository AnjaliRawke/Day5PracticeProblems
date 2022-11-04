package com.bridgelabz;

import java.util.Scanner;

public class TwoDArray {
	 public static void main(String args[]) {
		    // initialize here.
		    int row, col, i, j;
		    int arr[][] = new int[3][3];
		    Scanner scan = new Scanner(System.in);

		    // enter row and column for array.
		    System.out.print("Enter row for the array  : ");
		    row = scan.nextInt();
		    System.out.print("Enter column for the array: ");
		    col = scan.nextInt();

		    // enter array elements.
		    System.out.println("Enter " + (row * col) + " Array Elements : ");
		    for (i = 0; i < row; i++) {
		      for (j = 0; j < col; j++) {
		        arr[i][j] = scan.nextInt();
		      }
		    }

		    // the 2D array is here.
		    System.out.println("The 2D Array is :");
		    for (i = 0; i < row; i++) {
		      for (j = 0; j < col; j++) {
		        System.out.print(arr[i][j] + " ");
		      }
		      System.out.println();
		    }
		  }
		}

