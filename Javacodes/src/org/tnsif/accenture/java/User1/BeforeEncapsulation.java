package org.tnsif.accenture.java.User1;

public class BeforeEncapsulation {
	public static void main(String[] args) {
		Human obj=new Human();
		obj.age=23;
		obj.name="akash";
		obj.age=24;
		obj.name="Anjali";
		System.out.println("Age "+obj.age);
		System.out.println("Name "+obj.name);

	}

}