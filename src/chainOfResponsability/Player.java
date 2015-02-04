package chainOfResponsability;

import chainOfResponsability.Main.Ball;

public abstract class Player {

	private Player nextPlayer = null;

	public Player(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
	}

	public Player() {}

	public void setNextPlayer(Player nextPlayer) {
		if (this.nextPlayer != null) {
			this.nextPlayer.setNextPlayer(nextPlayer);
		} else {
			this.nextPlayer = nextPlayer;
		}
	}

	public abstract void play(Ball ball);

	protected void next(Ball ball) {
		System.out.println("\tI cannot play with this object.");
		if (this.nextPlayer != null) {
			System.out.println("\tI give it to the next player in the chain.");
			this.nextPlayer.play(ball);
		} else {
			System.out.println("\tThere is no more player in the chain... ");
			System.out.println("End of the chain");
		}
	}
}
