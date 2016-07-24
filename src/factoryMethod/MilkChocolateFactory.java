package factoryMethod;

public class MilkChocolateFactory implements ChocolateFactory {
    @Override
    public Chocolate createChocolate() {
        return new MilkChocolate();
    }
}
