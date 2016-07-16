package builder;

public class HouseBuilder {

    private int nbFloors = 0;
    private int gardenSize = 0;
    private boolean isSwimmingPool = false;

    public void fetchNbFloors(int nbFloors) {
        this.nbFloors = nbFloors;
    }

    public void fetchGardenSize(int gardenSize) {
        this.gardenSize = gardenSize;
    }

    public void addSwimmingPool() {
        this.isSwimmingPool = true;
    }

    public House buildHouse() {
        return new House(this.nbFloors, this.gardenSize, this.isSwimmingPool);
    }
}
