package com.thejavageek.designpatterns;

public abstract class Bike {

	private Engine engine;
	private TyreSet tyreSet;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public TyreSet getTyreSet() {
		return tyreSet;
	}

	public void setTyreSet(TyreSet tyreSet) {
		this.tyreSet = tyreSet;
	}

	protected abstract void prepare();

	public void paint() {
		System.out.println("Painting bike now");
	}

	@Override
	public String toString() {
		return "Bike [engine=" + engine + ", tyreSet=" + tyreSet + "]";
	}

}
