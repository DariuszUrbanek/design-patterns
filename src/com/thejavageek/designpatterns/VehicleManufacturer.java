package com.thejavageek.designpatterns;

public class VehicleManufacturer {

	public Vehicle createVehilcle(VehicleBuilder builder){
		builder.installEngine();
		builder.installTyres();
		return builder.getVehicle();
	}
	
	
}
