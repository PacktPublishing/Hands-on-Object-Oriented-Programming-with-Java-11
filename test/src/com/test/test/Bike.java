package com.test.test;

public class Bike {
	String name;
	String color;
	String gearType;
	
	public Bike(String name,String color,String gear) {
		this.name = name;
		this.color = color;
		this.gearType = gear;
	}
	
	private void  changeGearType(String GearType){
		this.gearType = GearType;
	}
	
	protected void getGearType(){
		System.out.println(this.gearType);
	}
}
