package com.thejavageek.designpatterns;

public abstract class Vehicle {
	
	//template method
	public void drive(){
		this.start();
		this.engageClutch();
		this.shiftGear();
		this.stop();
	}
	public void start(){
		System.out.println("Insert key and start ignition for vehicle");
	}
	public abstract void engageClutch();
	public abstract void shiftGear();
	
	public void stop(){
		System.out.println(" Stop ignition and remove key from vehicle");
	}
}
