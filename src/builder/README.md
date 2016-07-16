# Builder pattern #
The builder pattern move the construction logic to a dedicated object because it is too complex to just fit in the constructor.
Could be useful if you don't have every piece of information like to instantiate the object for instance when you have request several remote services.

## UML ##
            +---------------------------+             +-----------------------------------+
            |      HouseBlueprint       |             |           House                   |
            +---------------------------+             +-----------------------------------+
            +---------------------------+             | +nbFloors: integer                |
            | +getNbFloors(): integer   |             | +sizeGarden: integer              |
            | +getGardenSize(): integer |             | +isSwimmingPool: boolean          |
            +---------------------------+             +-----------------------------------+
                        ^                             | +House(integer, integer, integer) |
                        |                             | +describe()                       |
                        |                             +-----------------------------------+
                        |                                              ^
                        |                                              |
                        |                                              |
                    +--------+                                         |
                    | Client |-----------------+          +---------------------------+
                    +--------+                 |          |       HouseBuilder        |
                                               |          +---------------------------+
                                               |          | +nbFloors: integer        |
                                               +--------->| +sizeGarden: integer      |
                                                          | +isSwimmingPool: boolean  |
                                                          +---------------------------+
                                                          | +fetchNbFloors(integer)   |
                                                          | +fetchGardenSize(integer) |
                                                          | +addSwimmingPool()        |
                                                          | +buildHouse(): House      |
                                                          +---------------------------+
