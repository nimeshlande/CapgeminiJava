package com.capgemini.arrayprogram;
import java.util.Scanner;

public class Printing {
	
public static void main(String[] args) {
		
	    //------------------------------------------------------------------------------------
	    //Array Declaration
  		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter "+n+" array elements :  ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		//---------------------------------------------------------------

		// Printing elements of array
		System.out.print("Elements in array are: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] +"\n");
		}
	}

}
