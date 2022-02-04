package com.capgemini.arrayprogram;
import java.util.Scanner;


public class Small_large {
	public static void main(String[] args) {
		
		//-----------------------------------------------------------------------------
		//Array Declaration
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Aarray Elements : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		System.out.println("Enter "+num+" array elements");
		
		
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		//-----------------------------------------------------------------------------
		
		
		int largest = arr[0] ; 
		int smallest = arr[0];

		for(int i=1;i<num;i++) {
			if(arr[i]>arr[0]) {
				largest=arr[i];
			}
			if(arr[i]<arr[0]) {
				smallest=arr[i];
			}
		}
		
		//Printing Largest and Smallest Element in an Array
		System.out.println("Largest Element :"+largest);
		System.out.println("Smallest Element :"+smallest);
		
	}

}
