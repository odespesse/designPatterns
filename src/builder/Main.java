package builder;

public class Main {

    public static void main(String[] args) {
        HouseBlueprint blueprint = new HouseBlueprint();
        HouseBuilder builder = new HouseBuilder();

        builder.fetchNbFloors(blueprint.getNbFloors());
        builder.fetchGardenSize(blueprint.getGardenSize());
        builder.addSwimmingPool();

        House house = builder.buildHouse();
        house.describe();
    }
}
