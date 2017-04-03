package com.thejavageek.designpatterns;

public class Client {
	public static void main(String args[]) {

		Bike bike = BikeFactory.getBike();
		bike.rideBike(100);
	}
}
