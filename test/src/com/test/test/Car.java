package com.test.test;

public class Car {
	
	String name;
	String color;
	String fuelType;
	
	
	//constructor
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
//	method or functions
	void fillFuel(String fuelType){
		this.fuelType = fuelType;
	}
	
//	method or functions
	void empty(){
		this.fuelType ="";
	}

}
