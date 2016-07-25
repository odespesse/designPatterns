package flyweight;

public class Flower {
    private FlowerType flowerType;
    private int size;

    public Flower(FlowerType flowerType, int size) {
        this.flowerType = flowerType;
        this.size = size;
    }

    public String getName() {
        return this.flowerType.name;
    }

    public int getSize() {
        return this.size;
    }
}
