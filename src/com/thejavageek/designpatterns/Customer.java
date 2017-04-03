package com.thejavageek.designpatterns;

public class Customer {

	public static void main(String args[]) {

		Manager manager = new Manager();
		Mechanic mechanic = new Mechanic();

		Command oilChange = new ChangeOilCommand(mechanic);
		Command electricalsCheck = new CheckElectricalsCommand(mechanic);

		manager.addRequest(CommandType.OIL, oilChange);
		manager.addRequest(CommandType.ELECTRICALS, electricalsCheck);

		manager.processRequest(CommandType.OIL);
		manager.processRequest(CommandType.ELECTRICALS);
		
	}

}
