package com.thejavageek.designpatterns;

public class Scooter extends Bike {

	private PartsFactory scooterPartsFactory;

	public Scooter(PartsFactory partsFactory) {
		this.scooterPartsFactory = partsFactory;
	}

	@Override
	protected void prepare() {
		this.setEngine(scooterPartsFactory.createEngine());
		this.setTyreSet(scooterPartsFactory.createTyreSet());
	}

}
