package org.tnsif.accenture.java.interfacedemo;

interface SmartDevice
{
	void turnOn();
	void turnOff();
	void getStatus();
}
class SmartLight implements SmartDevice
{

	@Override
	public void turnOn() {
		System.out.println("Smart Light is ON");
		
	}

	@Override
	public void turnOff() {
	System.out.println("Smart Light is Off");
	}

	@Override
	public void getStatus() {
		System.out.println("Smart Light is in standby mode");
	}
	
}

