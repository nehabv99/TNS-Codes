package org.tnsif.accenture.java.User1;

public class HierarchialDemo {
	public static void main(String[] args) {
		Developer dev=new Developer();
		Tester test=new Tester();
		
		dev.company();
		dev.role();
		
		test.company();
		test.role();

	}

}
