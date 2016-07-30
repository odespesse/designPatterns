package chainOfResponsibility;

import chainOfResponsibility.Main.Ball;

public class Soccer extends Player {

	public Soccer() {
		super();
	}

	public Soccer(Player nextPlayer) {
		super(nextPlayer);
	}

	@Override
	public void play(Ball ball) {
		System.out.println("I am a football player");
		if (ball == Ball.SOCCER) {
			System.out.println("\tThis object is for soccer, I can play with it");
		} else {
			super.next(ball);
		}
	}
}
