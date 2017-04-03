package com.thejavageek.designpatterns;

public class Bike extends Vehicle{

	@Override
	public void engageClutch() {
		System.out.println("pull clutch of the bike with hand");
	}

	@Override
	public void shiftGear() {
		System.out.println("Operate gear pedal of bike with foot for shifting gear");
	}

}
