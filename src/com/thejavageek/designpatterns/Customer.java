package com.thejavageek.designpatterns;

public class Customer {

	public static void main(String[] args) {
		Bike bike1 = new Bike("bike1");
		Bike bike2 = new Bike("bike2");
		Bike bike3 = new Bike("bike3");


		BikeMechanic real1 = new RealBikeMechanic(bike1);
		BikeMechanic real2 = new RealBikeMechanic(bike2);
		BikeMechanic real3 = new RealBikeMechanic(bike3);
		
		real1.service();
		real2.service();
		real3.service();

		BikeMechanic proxy1 = new BikeMechanicProxy(bike1);
		BikeMechanic proxy2 = new BikeMechanicProxy(bike2);
		BikeMechanic proxy3 = new BikeMechanicProxy(bike3);

		proxy1.service();

		
	}

}
