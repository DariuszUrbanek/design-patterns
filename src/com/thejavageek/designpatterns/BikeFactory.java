package com.thejavageek.designpatterns;

public class BikeFactory {

	private static Bike bike;

	public static Bike getBike() {
		if (bike == null) {
			bike = new SportsBike();
		}
		return bike;
	}

}
