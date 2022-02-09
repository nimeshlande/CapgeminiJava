package com.capgemini.day9;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;


class StudentData{
	
	private String name;
	private int roll;
	private int dob;
	private String address;
	private float weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getDOB() {
		return dob;
	}
	public void setDOB(int dOB) {
		this.dob = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public int compare(StudentData o1, StudentData o2) {
		if(o1.getRoll()>o2.getRoll())
		{
		return 1;
		
		}
		else if(o1.getRoll() <o2.getRoll())
		{
		 return -1;
		 
		}
		else
		{
		return 0;	
		}
	}
	
	
	
	
	
	
	
	//i have created it with option
	public StudentData(String name, int roll, int dob, String address, float weight) {
		// TODO Auto-generated constructor stub
		//super();
		this.address = address;
		this.dob = dob;
		this.name = name;
		this.roll =  roll;
		this.weight = weight;
	}
	
	
	public void print()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Roll no:"+this.roll);
		System.out.println("Age:"+this.dob);
		System.out.println("Height:"+this.address);
		System.out.println("Weight:"+this.weight);
	}
}
	
	
	
	
	
	
	


public class StudentClassData {
	
	

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		Set<StudentData> StudList=new LinkedHashSet<StudentData>();
		StudList.add(new StudentData("Nimesh",225,2503,"Karanja",80.0f));
		StudList.add(new StudentData("parth",226,1601,"Karanja",80.2f));
		StudList.add(new StudentData("Raghu",227,1602,"Karanja",81.2f));
		StudList.add(new StudentData("Shree",228,1603,"Karanja",82.2f));
		StudList.add(new StudentData("Raghu",227,1602,"Karanja",81.2f));
		
		
		
		
		while(true){
			System.out.println("Enter 1 to Insert : ");
			System.out.println("Enter 2 to delete : ");
			System.out.println("Enter 3 to update : ");
			System.out.println("Enter 4 to Sort ASC : ");
			System.out.println("Enter 5 to sort DSC : ");
			System.out.println("Enter 6 to print size : ");
			System.out.println("Enter 7 to Exit");
			
			int option =sc.nextInt();
			
			if(option==1) {
				System.out.println("Enter name : ");
				String name = sc.next();
				System.out.println("Enter roll number  : ");
				int roll  = sc.nextInt();
				System.out.println("Enter DOB");
				int dob = sc.nextInt();
				System.out.println("Enter Address");
				String address  = sc.next();
				System.out.println("Enter Weight");
				float weight = sc.nextFloat();
				
				
				StudList.add(new StudentData(name ,roll,dob,address,weight));
				
				
				StudList.forEach(System.out::println);
				System.out.println("       ");
				for(StudentData S1:StudList)
					S1.print();
		
				
				
				//System.out.println("       ");
				//for(StudentClassData) {
				//	S1.print();
					
				//}
				
				
				
				
				
				
				
			}
			
			if(option== 2) {
				System.out.println("Which Student do you want to delete? \n  Enter Roll Number :");
				int roll = sc.nextInt();
			

				
				Iterator<StudentData> i=StudList.iterator();
				
				while(i.hasNext())
				{
					boolean found=false;
					StudentData s1=i.next();
					
					
					
					if(s1.getRoll()==roll)					
					{
						i.remove();
						found =true;
						System.out.println("Deleted ! ");
						
											
					}
					else {
						System.out.println("Not Found !");
					}
					
					
					
					
					StudList.forEach(System.out::println);
					System.out.println("       ");
					for(StudentData S1:StudList)
						S1.print();
					
					
				}
				
				
				
			}
			if(option==3) {
				boolean found=false;
				System.out.println("enter roll no to update :");
				int roll1=sc.nextInt();
				Iterator<StudentData> li =StudList.iterator();
				while(li.hasNext())
				{
					StudentData s1=li.next();
					if(s1.getRoll()==roll1)					
					{
						System.out.println("Enter new  first name : ");
						String name=sc.nextLine();
						
						System.out.println("Enter new Roll : ");
						int roll=sc.nextInt();
						
						System.out.println("Enter new DOB : ");
						int dob = sc.nextInt();
						
						
						System.out.println("Enter new Address : ");
						String address=sc.nextLine();
						
						System.out.println("Enter new weight");
						float weight =sc.nextFloat();
						
						
						li.set(new StudList(name,roll,dob,address,weight));
						
						found=true;						
					}
				}
				if(!found)
				{
					System.out.println("Record not found");
				}
				else
				{
					System.out.println("Record is updated successfully");
					Iterator<Student> it = StudentData.iterator();
					 
			        while (it.hasNext())
			        {
			            Student student = (Student) it.next();
			 
			            System.out.println(student);
			        }
				}
				
				
			}
			
			if(option==7) {
				break;
			}
			
			
			
			
		}
		}

	
	

	
	
		
}		


