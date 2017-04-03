package com.thejavageek.designpatterns;


public class Vehicle {

	private int tyres;
	private String engine;

	public int getTyres() {
		return tyres;
	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Vehicle [tyres=" + tyres + ", engine=" + engine + "]";
	}

}
