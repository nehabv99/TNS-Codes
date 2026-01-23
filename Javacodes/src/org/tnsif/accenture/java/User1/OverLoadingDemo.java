package org.tnsif.accenture.java.User1;
public class OverLoadingDemo {
	public static void main(String[] args) {
		 Calculator obj=new  Calculator();
		 System.out.println("add(int,int) ->"+ obj.add(2, 20));
		 System.out.println("add(int,int,int) ->"+obj.add(3, 4,6));
		 System.out.println("add(double ,double) ->"+obj.add(1.2,3.5));

	}

}