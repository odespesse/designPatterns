package composite;

public class Main {
    public static void main(String[] argv) {

        Tool t1 = new Tool("Hammer");
        Tool t2 = new Tool("Screwdriver");
        Tool t3 = new Tool("Drill");

        Box b1 = new Box();
        Box b2 = new Box();

        b2.add(t2);
        b2.add(t3);
        b1.add(b2);
        b1.add(t1);

        t2.display();
        b2.display();
        b1.display();
    }
}
