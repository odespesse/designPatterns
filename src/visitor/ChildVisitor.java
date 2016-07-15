package visitor;

public class ChildVisitor implements Visitor {
    @Override
    public void visit(CandyStore store) {
        System.out.println("In this candy store a child can buy " + store.getCandyName());
    }

    @Override
    public void visit(FishStore store) {
        System.out.println("In a fish store a child don't buy anything!");
    }
}
