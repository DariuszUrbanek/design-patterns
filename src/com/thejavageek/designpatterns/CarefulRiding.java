package com.thejavageek.designpatterns;

public class CarefulRiding implements RidingStyle {

	@Override
	public void ride() {
		System.out.println("someone is waiting at home, so riding very carefully");
	}

}
