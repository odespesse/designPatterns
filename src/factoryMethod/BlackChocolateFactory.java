package factoryMethod;

public class BlackChocolateFactory implements ChocolateFactory {
    @Override
    public Chocolate createChocolate() {
        return new BlackChocolate();
    }
}
