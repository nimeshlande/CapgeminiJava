package com.capgemini.arrayprogram;
import java.util.Scanner;


public class sort_element {
	public static void main(String[] args) {
		// ----------------------------------------------------------------------
		//Array Declaration
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		//------------------------------------------------------------------------
		// Inserting 
		System.out.println("Enter " + n + " array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		// Sorting
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[i]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println("Elements inthe sorted array are: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
