package com.capgemini.day9;

import java.util.Scanner;


interface Conversion {
	public void value();
}

public class MyChartoAscii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter character you want to convert : ");
		char input = sc.next().charAt(0);

		Conversion ChartoAscii = () -> {
			int ascii = (int) input;
			System.out.println(ascii);
		};

		ChartoAscii.value();

	}

}
