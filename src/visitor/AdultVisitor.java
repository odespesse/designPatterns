package visitor;

public class AdultVisitor implements Visitor {
    @Override
    public void visit(CandyStore store) {
        System.out.println("In a candy store an adult don't buy anything");
    }

    @Override
    public void visit(FishStore store) {
        System.out.println("In this fish store an adult can buy " + store.getFishName());
    }
}
