package abstractFactory;

public class Pizzeria implements Restaurant {
    @Override
    public MainDish cookMainDish() {
        return new Pizza();
    }

    @Override
    public SideDish cookSideDish() {
        return new Lettuce();
    }
}
