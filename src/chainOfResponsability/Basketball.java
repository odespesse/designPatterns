package chainOfResponsability;

import chainOfResponsability.Main.Ball;

public class Basketball extends Player {

	public Basketball() {
		super();
	}

	public Basketball(Player nextPlayer) {
		super(nextPlayer);
	}

	@Override
	public void play(Ball ball) {
		System.out.println("I am a basketball player");
		if (ball == Ball.BASKET) {
			System.out.println("\tThis object is for basketball, I can play with it");
		} else {
			super.next(ball);
		}
	}
}
