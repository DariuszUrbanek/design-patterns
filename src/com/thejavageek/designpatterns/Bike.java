package com.thejavageek.designpatterns;

public interface Bike {
	/*
	 * extrinsic state i.e. speed comes from client as method parameter and its
	 * not shared across the Bike object
	 */
	public abstract void rideBike(int speed);
}
