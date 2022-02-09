package com.capgemini.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

public class MyStreamm {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		System.out.println("Enter size of List : ");
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter element number"+(i+1));
			int num = sc.nextInt();
			list1.add(num);
			
		}
		//int a = Range(1,size);
		//list1.add(a);
		
		//System.out.println(list1);
		
		Stream s = list1.stream();
		
		
		System.out.println("");
		System.out.println("Elements Are : ");
		list1.stream().forEach(System.out::println);
		
		System.out.println("");
		
		list1.remove(2);
		System.out.println(list1);
		
		System.out.println("");
		
		//for each
		list1.stream().forEach(p->System.out.println(p));
		
		System.out.println("");
		
		//filter
		//we need longer list
		
		System.out.println("Even numbers from list: ");
		list1.stream().filter(num ->num%2==0).forEach(System.out::println);
		
		
		
		
	}

	
	

}
