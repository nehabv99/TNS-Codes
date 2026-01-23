package org.tnsif.accenture.java.User1;

class User  //parent class
{
	User() //constructor
	{
		System.out.println("user account created");
	}
}

class AdminUser extends User
{
	AdminUser()
	{
		super();
		System.out.println("Admin privileges granted ");
	}
}

