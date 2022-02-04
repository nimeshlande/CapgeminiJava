package com.capgemini.stringprogram;

import java.util.Scanner;


public class CountingNumber {  
    static int wordcount(String count)  
      {  
        int count1=0;  
    
          char ch[]= new char[count.length()];     
          for(int i=0;i<count.length();i++)  
          {  
              ch[i]= count.charAt(i);  
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  count1++;  
          }  
          return count1;  
          
        }
    public static void main(String[] args) {  
    	
    	Scanner sc =new Scanner(System.in);
    	String count = sc.next();
    	
        
        System.out.println(wordcount(count) + " words."); 
        
        sc.close();
   }  
 }  
    