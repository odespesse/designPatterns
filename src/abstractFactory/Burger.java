package abstractFactory;

public class Burger implements MainDish {
    @Override
    public void eat() {
        System.out.println("I eat a burger");
    }
}
