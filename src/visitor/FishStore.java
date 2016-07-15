package visitor;

public class FishStore implements Store {
    private String fishName;

    public FishStore(String fishName) {
        this.fishName = fishName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getFishName() {
        return fishName;
    }
}
