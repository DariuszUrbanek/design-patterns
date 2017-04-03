package com.thejavageek.designpatterns;

public class Car extends Vehicle{

	@Override
	public void engageClutch() {
		System.out.println("Push clutch pedal of car with foot");		
	}

	@Override
	public void shiftGear() {
		System.out.println("Operate gear lever of car with hand for shifting gear");
	}

}
