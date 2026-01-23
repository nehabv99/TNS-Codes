package org.tnsif.accenture.java.User1;

public class User1 {
		String name;
		int age;
		
		User1() //default const
		{
			
		}
		User1(String name, int age) //parameterized const
		{
			this.name=name;
			this.age=age;
			System.out.println("User created :"+name+ "  Age :"+age);
		}
	
}
