package com.thejavageek.designpatterns;

public class BikeFacade {
	Bike cbr = new Bike();
	
	public void startBike(){
		cbr.sitOnBike();
		cbr.removeStand();
		cbr.checkFuelTank();
		cbr.startIgnition();
		cbr.startEngine();
		cbr.clutchAndGearUp();
		cbr.twistThrottle();
	}
	
	public void stopBike(){
		cbr.applyBrakes();
		cbr.closeThrottle();
		cbr.clutchAndGearDown();
		cbr.killIgnition();
		cbr.killIgnition();
		cbr.putBikeOnStand();
		cbr.getOffBike();
	}

}
