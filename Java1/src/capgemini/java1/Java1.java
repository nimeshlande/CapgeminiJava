package capgemini.java1;


import java.util.Scanner;

public class Java1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1:");
		int a = sc.nextInt();
		
		
		
		sc.close();
		
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=i;j++) {
				int power = a*a;
				System.out.println(power);
				power = a;
			}
		}
		
	}
	
}