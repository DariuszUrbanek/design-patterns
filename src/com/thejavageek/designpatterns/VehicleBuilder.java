package com.thejavageek.designpatterns;


public abstract class VehicleBuilder {
	public abstract void installTyres();
	public abstract void installEngine();
	public abstract Vehicle getVehicle();
}
