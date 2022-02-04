package com.capgemini.stringprogram;

import java.util.Scanner;


public class Removing {
	
	 public static String main(String[] args) {  
         
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter String : ");
		 String str = sc.next();
		 
		 
		 System.out.println(Remove1(str,2));
		 
		 String Remove1(String str1, int p) {  
             return str.substring(0, p) + str.substring(p + 1);  
          }  
	 }      
}
