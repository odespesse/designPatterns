package factoryMethod;

public class Main {

    public static void main(String[] argv) {
        ChocolateFactory blackChocolateFactory = new BlackChocolateFactory();
        Chocolate black = blackChocolateFactory.createChocolate();
        ChocolateFactory milkChocolateFactory = new MilkChocolateFactory();
        Chocolate milk = milkChocolateFactory.createChocolate();
        black.describe();
        milk.describe();
    }
}
