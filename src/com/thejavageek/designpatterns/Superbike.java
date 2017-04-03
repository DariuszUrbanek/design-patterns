package com.thejavageek.designpatterns;

public class Superbike extends Bike {

	private PartsFactory superbikePartsFactory;

	public Superbike(PartsFactory partsFactory) {
		this.superbikePartsFactory = partsFactory;
	}

	@Override
	protected void prepare() {
		this.setEngine(superbikePartsFactory.createEngine());
		this.setTyreSet(superbikePartsFactory.createTyreSet());
	}

}
