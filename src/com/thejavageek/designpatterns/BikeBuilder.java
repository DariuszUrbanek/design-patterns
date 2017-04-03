package com.thejavageek.designpatterns;

public class BikeBuilder extends VehicleBuilder {

	Vehicle bike = new Vehicle();

	@Override
	public void installTyres() {
		System.out.println("Installing two tyres");
		bike.setTyres(2);
	}

	@Override
	public void installEngine() {
		System.out.println("Installing bike engine");
		bike.setEngine("Small Engine");
	}

	@Override
	public Vehicle getVehicle() {
		return bike;
	}

}