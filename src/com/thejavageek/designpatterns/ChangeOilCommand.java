package com.thejavageek.designpatterns;

public class ChangeOilCommand implements Command {

	private Mechanic mechanic;

	public ChangeOilCommand(Mechanic mechanic) {
		this.mechanic = mechanic;
	}

	@Override
	public void execute() {
		mechanic.changeOil();
	}

}
