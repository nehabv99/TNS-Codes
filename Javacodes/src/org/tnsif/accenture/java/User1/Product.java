package org.tnsif.accenture.java.User1;

class Product{
	
	double price;
	
	Product(double price)
	{
		this.price=price;
	}
	double calculateDiscount()
	{
		return this.price*0.10; //apply 10% discount
	}
	double calcualteFinalPrice()
	{
		return this.price-this.calculateDiscount();
	}
}


