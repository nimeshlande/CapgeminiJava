package com.capgemini.day10;
import java.util.Scanner;

interface EvenOdd{
	public String value(int a);
}

interface Sum{
	public int value(int a,int b);
}

@FunctionalInterface
interface PoN{
	public String value(int d);
}


@FunctionalInterface
interface AddtwoStrings{
	public String value(String e , String f);
}

interface Greateroftwo{
	public String value(int a, int b);
}


public class Mylambda {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int a =sc.nextInt();
		
		System.out.println("Enter number 2 : ");
		int b = sc.nextInt();
		
		System.out.println("Enter num to Check positive or Negative. : ");
		int d =sc.nextInt();
		
		System.out.println("Enter the String 1 ");
		String e= sc.next();
		System.out.println("Enter the String 2 ");
		String f= sc.next();
		
		
		
		EvenOdd  EvenorOdd= number->
	    {
	    	 if(number%2==0)
	    	 {	
	    	  return "Even "+number;   
	    	 }
	    	 else
	    	 {
	    		return "Odd "+number; 
	    	 }
	    	};
	    	
	    	
	    Sum Summation= (a1,b1)->{
	    	
	        return a+b;
	    	};
	    	
	    PoN PosiorNega=d1->{
	    	if(d>0) {
	    	    return ("Positive : "+d);
	    	}
	    	else {
	    		return ("Negative : "+d);
	    	}
	    	
	    	
			
	    };
	    
	    AddtwoStrings Adding=(e1,f1)->{
	    	return (e+" "+f);
	    };
	    
	    Greateroftwo comp=(a1,b1)->{
	    	if(a>b) {
	    		return "Greater number is : " +a ;
	    	}
	    	else {
	    		return "Greater number is : " + b ;
	    	}
	    };
	    

	    	String output=EvenorOdd.value(a);
	    	System.out.println(output);
	    	
	    	int output1 =Summation.value(a, b);
	    	System.out.println("Summation is : "+output1);
	    	
	    	String op2 = PosiorNega.value(d);
	    	System.out.println(op2);
	    	
	    	String op3 = Adding.value(e, f);
	    	System.out.println(op3);
	    	
	    	String op4 = comp.value(a, b);
	    	System.out.println(op4);
	    	
	    	
	}

}
