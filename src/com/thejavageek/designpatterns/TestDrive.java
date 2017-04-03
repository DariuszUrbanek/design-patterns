package com.thejavageek.designpatterns;

public class TestDrive {

	public static void main(String[] args) {
		
		Vehicle bike = new Bike();
		bike.drive();
		
		Vehicle car = new Car();
		car.drive();
		
	}

}
