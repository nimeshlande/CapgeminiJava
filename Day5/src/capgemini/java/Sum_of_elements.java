package capgemini.java;
import java.util.Scanner;

public class Sum_of_elements {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array:");
		int num =sc.nextInt();
		int arr[] =new int[num];
		
		System.out.println("Enter "+num+" elements to be added");
		
		for(int i = 0;i<num;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		int sum =0;
		for(int i = 0;i<num;i++) {
			sum+=arr[i];
			
		}
		System.out.println("Addition of aaray element is "+sum);
		sc.close();
		
		
	}

}
