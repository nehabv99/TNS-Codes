package org.tnsif.accenture.java.User1;

public class Device {
	void deviceType()
	{
		System.out.println("I am an electronic device");
	}
}

class Phone extends Device
{
	void brand()
	{
		System.out.println("Brand : samsumng");
	}
}
class SmartPhone extends Phone
{
	void feature() {
		System.out.println("Feature : Touchscreen , camera , internet");
	}

}