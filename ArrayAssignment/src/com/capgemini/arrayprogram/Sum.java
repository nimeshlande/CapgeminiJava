package com.capgemini.arrayprogram;
import java.util.Scanner;


public class Sum {
	public static void main(String[] args) {
		
		//-------------------------------------------------------------------
		//Array Declaration
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter number of Array Elements: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter your "+num+"  Elements.");
		
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		//---------------------------------------------------------------------
		
		//Sum
		int sum=0;
		for(int i=0;i<num;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of Array Elements : "+sum);
	}

}
