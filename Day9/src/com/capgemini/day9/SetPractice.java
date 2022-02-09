package com.capgemini.day9;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Student
{
	private String name;
	private int id;
	private int age;
	private float height;
	private float weight;
	
	Student(String name, int id, int age, float height, float weight)
	{
		super();
		this.name=name;
		this.id=id;
		this.age=age;
		this.height=height;
		this.weight=weight;
		
	}
	public void setString(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setint(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setInt(int age) {
		this.age=age;
	}
	public int  getage() {
		return age;
	}
	public void setfloat(float height) {
		this.height=height;
	}
	public float getheight() {
		return height;
	}
	public void setFloat(float weight) {
		this.weight=weight;
	}
	public float getweight() {
		return weight;
	}
	
	public void print()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Roll no:"+this.id);
		System.out.println("Age:"+this.age);
		System.out.println("Height:"+this.height);
		System.out.println("Weight:"+this.weight);
	}
}
public class SetPractice
{
	public static void main(String args[])
	{
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student("Saurabh", 1001, 21, 5.11f, 90.8f));
		studentList.add(new Student("Advait", 1002, 18, 4.0f, 50.0f));
		studentList.add(new Student("Rohit", 1003, 23, 5.8f, 69.8f));
		
		studentList.forEach(System.out::println);
		
		System.out.println("       ");
		for(Student S1:studentList)
			S1.print();
		
	}

}
