package capgemini.java;
import java.util.Scanner;


public class Largest_and_smallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Elements to compare ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		System.out.println("Enter "+num+" array elements");
		
		//taking input
		for(int i = 0;i<num;i++) {
			arr[i]=sc.nextInt();
			
		}
		int largest =arr[0];
		int smallest = arr[0];
		
		for(int i=0;i<num;i++) {
			if(arr[i]>arr[0]) {
				largest = arr[i];
				
			}
			if(arr[i]<arr[0]) {
				smallest = arr[i];
				}
			}
		System.out.println("Largest Number ="+largest+" and Smallest number is "+smallest);
		
		sc.close();
		}
		
	}

