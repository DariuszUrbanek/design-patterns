package com.thejavageek.designpatterns;

public class BikeMechanicProxy implements BikeMechanic {

	private BikeMechanic mechanic = null;
	private Bike bike;

	public BikeMechanicProxy(Bike bike) {
		long start = System.currentTimeMillis();
		this.bike = bike;
		long end = System.currentTimeMillis();
		System.out.println("Time required = " + (end - start));
	}

	@Override
	public void service() {
		mechanic = new RealBikeMechanic(this.bike);
		mechanic.service();
	}

}
