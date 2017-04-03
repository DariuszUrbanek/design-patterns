package com.thejavageek.designpatterns;

public class CarBuilder extends VehicleBuilder {

	Vehicle car = new Vehicle();
	
	@Override
	public void installTyres() {
		System.out.println("Installing four tyres");
		car.setTyres(4);
	}

	@Override
	public void installEngine() {
		System.out.println("Installing Car engine");
		car.setEngine("High performance Engine");
	}

	@Override
	public Vehicle getVehicle() {
		return car;
	}

}


