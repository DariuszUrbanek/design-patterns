package com.thejavageek.designpatterns;

public class HurtState implements State {

	@Override
	public void obeyCommand(Soldier soldier) {
		System.out.println("Take cover and hide behind something. Rest a while");
		soldier.setCurrentState(soldier.getHealthyState());
		soldier.getHealthyState().obeyCommand(soldier);
	}

}
