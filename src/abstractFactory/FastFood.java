package abstractFactory;

public class FastFood implements Restaurant {
    @Override
    public MainDish cookMainDish() {
        return new Burger();
    }

    @Override
    public SideDish cookSideDish() {
        return new FrenchFry();
    }
}
