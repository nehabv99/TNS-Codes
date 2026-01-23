package org.tnsif.accenture.java.User1;

class Course //parent class //base class //super class
{
	String courseName="Java ";
	
	void showCourse()
	{
		System.out.println("Course :"+courseName);
	}
}
class Student extends Course //child //derived class //sub class
{
	String studentName="Amit";
	
	void showStudent()
	{
		System.out.println("Student  :"+studentName);
	}
}
