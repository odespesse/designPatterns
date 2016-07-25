package flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Garden {

    private List<Flower> flowers = new ArrayList<Flower>();
    private HashMap<String, FlowerType> flowerTypes = new HashMap<String, FlowerType>();

    public void plantNewFlower(String name, int size) {
        FlowerType flowerType;
        if (flowerTypes.containsKey(name)) {
            flowerType = flowerTypes.get(name);
        } else {
            flowerType = new FlowerType(name);
            flowerTypes.put(name, flowerType);
        }
        Flower flower = new Flower(flowerType, size);
        flowers.add(flower);
    }

    public void describe() {
        System.out.println(String.format("Number of flowers : %s", flowers.size()));
        for(Flower f : flowers) {
            System.out.println(String.format("Flower : %s %s", f.getName(), f.getSize()));
        }
        System.out.println(String.format("Number of different types : %s", flowerTypes.size()));
        for(FlowerType ft : flowerTypes.values()) {
            System.out.println(String.format("Type : %s", ft.name));
        }
    }
}