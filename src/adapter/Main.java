package adapter;

public class Main {

    public static void main(String[] args) {
        SquarePlug legacySquarePlug = new SquarePlug();
        legacySquarePlug.saySquare();
        RoundPlug newRoundPlug = new RoundPlugImpl();
        newRoundPlug.sayRound();

        RoundPlug adapter = new SquareToRoundPlug(legacySquarePlug);
        adapter.sayRound(); // Should say Round but say Square
    }
}
