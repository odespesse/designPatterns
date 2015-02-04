package chainOfResponsability;

import chainOfResponsability.Main.Ball;

public class Golf extends Player {

	public Golf() {
		super();
	}

	public Golf(Player nextPlayer) {
		super(nextPlayer);
	}

	@Override
	public void play(Ball ball) {
		System.out.println("I am a golfer");
		if (ball == Ball.GOLF) {
			System.out.println("\tThis object is for golf, I can play with it");
		} else {
			super.next(ball);
		}
	}
}
