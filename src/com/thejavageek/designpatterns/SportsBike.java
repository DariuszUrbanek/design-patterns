package com.thejavageek.designpatterns;

public class SportsBike implements Bike {

	/*
	 * Intrinsic state i.e. name is internal to Bike implementation and it is
	 * not provided by client. This can be shared acorss Bike object.
	 */
	private String type = "SportsBike";

	/*
	 * extrinsic state i.e. speed comes from client as method parameter and its
	 * not shared across the Bike object
	 */
	@Override
	public void rideBike(int speed) {
		System.out.println("Riding " + type + " at " + speed + " kmph ");
	}

}
