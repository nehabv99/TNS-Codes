package org.tnsif.accenture.java.User1;
public class AfterEncapsulation {
	public static void main(String[] args) {
		
		Human1 obj=new Human1();
		obj.setAge(12);
		obj.setName("Rashmi");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		
		obj.setAge(34);
		obj.setName("Mamatha");
	    System.out.println(obj.getAge());
	    System.out.println(obj.getName());
		
		
	}

}