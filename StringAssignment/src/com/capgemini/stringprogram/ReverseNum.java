package com.capgemini.stringprogram;

class Driver {  
public static String reverseWord(String str){  
	
    String words[]=str.split("\\s");  
    String reverseWord="";  
    
    
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  
}  

public class ReverseNum {  
public static void main(String[] args) {  
    System.out.println(Driver.reverseWord("Nimesh Lande"));      
    }  
}  