package com.thejavageek.designpatterns;

public class Rider {

	BikeFacade facade = new BikeFacade();

	public BikeFacade getFacade() {
		return facade;
	}

	public void setFacade(BikeFacade facade) {
		this.facade = facade;
	}

	public static void main(String[] args) {

		Rider rider = new Rider();
		rider.facade.startBike();
		rider.facade.stopBike();
	}

}
