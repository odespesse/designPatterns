package adapter;

public class SquareToRoundPlug implements RoundPlug {
    private SquarePlug legacySquarePlug;

    public SquareToRoundPlug(SquarePlug legacySquarePlug) {
        this.legacySquarePlug = legacySquarePlug;
    }

    @Override
    public void sayRound() {
        this.legacySquarePlug.saySquare();
    }
}
