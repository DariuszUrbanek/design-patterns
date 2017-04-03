package com.thejavageek.designpatterns;

public class ScooterPartsFactory implements PartsFactory {

	@Override
	public Engine createEngine() {
		return new ScooterEngine();
	}

	@Override
	public TyreSet createTyreSet() {
		return new ScooterTyreSet();
	}

}
