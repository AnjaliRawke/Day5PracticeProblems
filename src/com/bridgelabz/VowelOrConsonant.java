package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {
	   public void VowelConsonant() {
     	   boolean isVowel=false;
	           Scanner InputValue=new Scanner(System.in);
	           System.out.println("Enter a character:");
	           char ch=InputValue.next().charAt(0);
	            switch(ch)
	           {
	           case 'a' :
	           case 'e' :
	           case 'i' :
	           case 'o' :
	           case 'u' : 
	           case 'A' :
	           case 'E' :
	           case 'I' :
	           case 'O' :
	           case 'U' : isVowel=true;
	           }
	           if(isVowel == true) {
	        	   System.out.println(ch+" is a vowel");
	           }
	           else {
	        	   if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z') {
	        		   System.out.println(ch+" is a consonant");
	        	   }
	           }
	           
        }
        public static void main(String[] args) {
        	VowelOrConsonant Obj=new VowelOrConsonant();
        	Obj.VowelConsonant();
        }
	}


	





