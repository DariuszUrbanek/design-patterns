package com.thejavageek.designpatterns;

public class Soldier {

	State healthyState;
	State hurtState;
	State deadState;

	State currentState;

	public Soldier() {
		this.healthyState = new HealthyState();
		this.hurtState = new HurtState();
		this.deadState = new DeadState();
		this.currentState = healthyState;
	}

	public void setCurrentState(State state) {
		this.currentState = state;
	}

	public State getCurrentState() {
		return currentState;
	}

	public State getHealthyState() {
		return healthyState;
	}

	public void setHealthyState(State healthyState) {
		this.healthyState = healthyState;
	}

	public State getHurtState() {
		return hurtState;
	}

	public void setHurtState(State hurtState) {
		this.hurtState = hurtState;
	}

	public State getDeadState() {
		return deadState;
	}

	public void setDeadState(State deadState) {
		this.deadState = deadState;
	}

	public void obeyCommand() {
		currentState.obeyCommand(this);
	}
}
