package chainOfResponsibility;

public class Main {

	public enum Ball {
		SOCCER,
		GOLF,
		BASKET
	}

	public static void main(String[] args) {
		Player golfer = new Golf();
		Player basketPlayer = new Basketball(golfer);

		System.out.println("** Current chain : basketPlayer -> golfer **");
		System.out.println("* First try with a golf ball");
		basketPlayer.play(Ball.GOLF);
		System.out.println("* Second try with a basket ball");
		basketPlayer.play(Ball.BASKET);
		System.out.println("* Third try with a soccer ball");
		basketPlayer.play(Ball.SOCCER);

		Player footballPlayer = new Soccer();
		basketPlayer.setNextPlayer(footballPlayer);
		System.out.println("\n** New chain : basketPlayer -> golfer -> footballPlayer **");
		System.out.println("* Retry with a soccer ball");
		basketPlayer.play(Ball.SOCCER);
	}
}
