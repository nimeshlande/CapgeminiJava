package capgemini.java;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array:");
		int num =sc.nextInt();
		int arr[] =new int[num];
		
		System.out.println("Enter "+num+" elements to be calculate percentage");
		
		for(int i = 0;i<num;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		int sum = 0;
		for(int i=0;i<num;i++) {
			sum = sum + arr[i];
		}
		float average = sum/num;
		System.out.println("Average of given array is"+average);
		
		sc.close();
	}

}
