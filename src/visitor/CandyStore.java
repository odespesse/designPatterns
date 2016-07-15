package visitor;

public class CandyStore implements Store {
    private String candyName;

    public CandyStore(String candyName) {
        this.candyName = candyName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getCandyName() {
        return candyName;
    }
}
