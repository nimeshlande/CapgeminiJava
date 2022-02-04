package com.capgemini.stringprogram;

import java.util.Scanner;


public class palindrome {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Input : ");
		String str = sc.next();
		
		char[] ch = str.toCharArray();
		
		int len = str.length();
		int j = len - 1;
		for (int i = 0; i < len; i++) {
			if (ch[i] == ch[j]) {
				j--;

			} else {
				System.out.println("Not a Pallindrome String");
				return;
			}

		}
		System.out.println("Pallindrome String");
		
		
		
	}

}
