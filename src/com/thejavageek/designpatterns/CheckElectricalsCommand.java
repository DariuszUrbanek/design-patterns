package com.thejavageek.designpatterns;

public class CheckElectricalsCommand implements Command {

	private Mechanic mechanic;

	public CheckElectricalsCommand(Mechanic mechanic) {
		this.mechanic = mechanic;
	}

	@Override
	public void execute() {
		mechanic.checkElectricals();
	}

}
