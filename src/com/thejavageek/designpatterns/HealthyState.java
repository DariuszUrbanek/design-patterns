package com.thejavageek.designpatterns;

public class HealthyState implements State {

	@Override
	public void obeyCommand(Soldier soldier) {
		System.out.println("Opened fire at enemy");
	}

}
