# Flyweight pattern #
The flyweight pattern is designed to minimize memory consumption by sharing data as much as possible between a collection of objects

## UML ##
        +--------------------------------------------+                    +---------------------+
        |                   Garden                   |                    |     FlowerType      |
        +--------------------------------------------+                    +---------------------+
        | -flowers: List<Flower>                     |<>-----+------------| +name: String       |
        | -flowerTypes: HashMap<String, FlowerType>  |       |            +---------------------+
        +--------------------------------------------+       |            | +FlowerType(String) |
        | +plantNewFlower(String, size)              |       |            +----------+----------+
        | +describe()                                |       |                       ^
        +------------------+-------------------------+       |                       |
                           ^                                 |                       |
                           |                                 |                       |
                           |                                 |                       |
                           |                                 |          +------------+-------------+
                           |                                 |          |          Flower          |
                           |                                 |          +--------------------------+
                           |                                 +----------| -flowerType: FlowerType  |
                       +---+--+                                         | -size: int               |
                       |Client|---------------------------------------->---------------------------+
                       +------+                                         | +Flower(FlowerType, int) |
                                                                        | +getName: String         |
                                                                        | +getSize: int            |
                                                                        +--------------------------+
