package flyweight;

public class Main {
    public static void main(String[] argv) {
        Garden garden = new Garden();
        garden.plantNewFlower("Rose", 12);
        garden.plantNewFlower("Daisy", 3);
        garden.plantNewFlower("Violet", 2);
        garden.plantNewFlower("Rose", 11);
        garden.plantNewFlower("Tulip", 9);
        garden.plantNewFlower("Tulip", 8);
        garden.describe();
    }
}
