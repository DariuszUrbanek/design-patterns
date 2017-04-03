package com.thejavageek.designpatterns;

import java.util.Random;

public class Game {

	public static void main(String[] args) {

		Soldier soldier = new Soldier();
		Game game = new Game();
		game.hitBullets(soldier, 4);
		game.hitBullets(soldier, 7);
		game.hitBullets(soldier, 30);
		
	}

	public void hitBullets(Soldier soldier, int bullets) {

		System.out.println("Number of bullets taken hit =" + bullets);
		if (bullets > 5 && bullets < 10) {
			soldier.setCurrentState(soldier.getHurtState());
		} else if (bullets > 10) {
			soldier.setCurrentState(soldier.getDeadState());
		}

		soldier.getCurrentState().obeyCommand(soldier);

	}

}
