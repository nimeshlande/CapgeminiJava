package com.capgemini.arrayprogram;
import java.util.Scanner;


public class Finding_Element {
	public static void main(String[] args) {
		
		        //-------------------------------------------------------------------------------
		        //Array Declartaion
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the size of array: ");
				int n = sc.nextInt();
				int[] arr = new int[n];
				
				System.out.println("Enter "+n +"array elements: ");
				for (int i = 0; i < n; i++) {
					arr[i] = sc.nextInt();
				}
				//-----------------------------------------------------------------------------------
				
				// Find the value in array
				System.out.print("Enter number to find: ");
				int f = 0;
				int num = sc.nextInt();
				sc.close();
				for (int i = 0; i < n; i++) {
					if (arr[i] == num) {
						System.out.println("The number is at index: " + i);
						f = 1;
						break;
					}
				}
				if (f == 0) {
					System.out.println("Number not found in array");
				}
	}

}
