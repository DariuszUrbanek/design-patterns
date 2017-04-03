package com.thejavageek.designpatterns;

public class ScooterEngine implements Engine {

	public ScooterEngine(){
		System.out.println("Creating scooter engine");
	}

	@Override
	public String toString() {
		return "ScooterEngine";
	}
	
	
	
}
