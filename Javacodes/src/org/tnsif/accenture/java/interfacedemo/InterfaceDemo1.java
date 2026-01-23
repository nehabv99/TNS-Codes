package org.tnsif.accenture.java.interfacedemo;
public class InterfaceDemo1 {

	public static void main(String[] args) {
		SmartDevice device= new SmartLight();
		device.turnOn();
		device. turnOff();
		device.getStatus();

	}

}
