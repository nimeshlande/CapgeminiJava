package com.capgemini.day9;

import java.util.Scanner;

interface FibonacciSeq {
	public void value();
}

public class SeriesLambda {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number till you want Fibonacci sequence : ");
		int limit = sc.nextInt();

		FibonacciSeq Seq = () -> {
			long a = 0, b = 1, sum;
			for (int i = 0; i <= limit; i++) {
				sum = a + b;
				System.out.println(a);
				a = b;
				b = sum;

			}
		};
		sc.close();
		
		Seq.value();

	}

}
