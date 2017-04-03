package com.thejavageek.designpatterns;

public class RealBikeMechanic implements BikeMechanic {

	public RealBikeMechanic(Bike bike) {
		long start = System.currentTimeMillis();
		this.dismantleBike(bike);
		long end = System.currentTimeMillis();
		System.out.println("Time required = " + (end - start));
	}

	@Override
	public void service() {
		System.out.println("Servicing bike now");
	}

	public void dismantleBike(Bike bike) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
