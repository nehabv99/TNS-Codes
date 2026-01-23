package org.tnsif.accenture.java.User1;

class Student1
{
	String name;
	int age;
	
	Student1()
	{
		System.out.println("Default constructor");
	}
	Student1(String name)
	{
		this.name=name;
		System.out.println("Name :"+name);
	}
	Student1(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name :"+name + ",Age : "+age);
	}
	
}

public class ConstructorOverloadingDemo {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		
		Student1 s2=new Student1("Hema");
		
		Student1 s3=new Student1("Swetha",23);

	}

}