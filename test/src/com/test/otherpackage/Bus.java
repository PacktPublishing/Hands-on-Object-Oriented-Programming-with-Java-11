package com.test.otherpackage;

public class Bus {

	public String name;
	String color;
	String type;

	public Bus(String name, String color, String type) {
		this.name = name;
		this.color = color;
		this.type = type;
	}

	protected void changeBusType(String BusType) {
		this.type = BusType;
	}

}
