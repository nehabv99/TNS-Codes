package org.tnsif.accenture.java.User1;

public class Employee {
	void company()
	{
		System.out.println("Company : TNSIF");
	}
}

class Developer extends Employee
{
	void role()
	{
		System.out.println("Role : Software Developer");
	}
}
class Tester extends Employee
{
	void role()
	{
		System.out.println("Role : QA Tester");
	}
}