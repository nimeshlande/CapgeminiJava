package com.capgemini.stringprogram;

import java.util.Scanner;

//Prohibited package name: java.capgemini

//do not give package name as java keyword 

//also give start with com
//then company name    here is capgemini

//topic name    ///string
public class Swap {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter first String:");
		String String1 = sc.next();
		System.out.println("Enter Second String:");
		String String2 =sc.next();
		
		System.out.println("Before"+String1 + "  " +String2);
		
		
		String1 =String1 +String2; 
		
		//Substring creates smaller strings from the bigger one
        String2 = String1.substring(0, String1.length() - String2.length());  
        String1 = String1.substring(String2.length());  
        System.out.println("After : " + String1 + " " + String2);  
		
        
        sc.close();
		
	}

}
