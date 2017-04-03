package com.thejavageek.designpatterns;

public class SuperbikePartsFactory implements PartsFactory {

	@Override
	public Engine createEngine() {
		return new SuperbikeEngine();
	}

	@Override
	public TyreSet createTyreSet() {
		return new SuperbikeTyreSet();
	}

}
