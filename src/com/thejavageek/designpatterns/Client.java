package com.thejavageek.designpatterns;

public class Client {

	public static void main(String args[]) {

		VehicleBuilder bikeBuilder = new BikeBuilder();
		VehicleBuilder carBuilder = new CarBuilder();

		VehicleManufacturer vm = new VehicleManufacturer();
		Vehicle bike = vm.createVehilcle(bikeBuilder);
		Vehicle car = vm.createVehilcle(carBuilder);

		System.out.println(bike);
		System.out.println(car);

	}

}
