package com.thejavageek.designpatterns;

public class DeadState implements State {

	@Override
	public void obeyCommand(Soldier soldier) {
		System.out.println("Shout victory to motherland and die");
	}
}
