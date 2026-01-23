package org.tnsif.accenture.java.User1;

class Payment1
{
	void process()
	{
		System.out.println("Processing payment using standard gateway");
	}
}
class GPay extends Payment1
{
	void process()
	{
		System.out.println("Processing payment via google pay ");
	}
	
	void completeTransaction()
	{
		process();
		super.process();
	}
}

