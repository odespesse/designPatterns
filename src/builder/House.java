package builder;

public class House {
    private int nbFloors;
    private int gardenSize;
    private boolean isSwimmingPool;

    public House(int nbFloors, int gardenSize, boolean isSwimmingPool) {
        this.nbFloors = nbFloors;
        this.gardenSize = gardenSize;
        this.isSwimmingPool = isSwimmingPool;
    }

    public void describe() {
        String swimmingPoolDescription = isSwimmingPool ? "with" : "without";
        String description = String.format("Nb floors = %s, garden size = %s %s swimming-pool", this.nbFloors, this.gardenSize, swimmingPoolDescription);
        System.out.println(description);
    }
}
