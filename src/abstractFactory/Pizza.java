package abstractFactory;

public class Pizza implements MainDish {
    @Override
    public void eat() {
        System.out.println("I eat a pizza");
    }
}
