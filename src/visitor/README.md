# Visitor pattern #
A visitor pattern separate the data structure and the algorithm which operates on those.

## Implementation ##
In this example, we have a simple array structure of stores. Different visitors can go on those stores.
According to their profile each visitor will do something else with the visited store.

## UML ##

                             +-------"I"--------+                                          +--------"I"--------+
                             |      Store       |                +----------+              |      Visitor      |
                             +------------------+<---------------|  Client  |------------->+-------------------+
                             | +accept(Visitor) |                +----------+              | +visit(CandyShop) |
                             +--------^---------+                                          | +visit(FishShop)  |
                                     /_\                                                   +---------^---------+
                                      |                                                             /_\
                                      |                                                              |
                                      |                                                              |
                    +-----------------+-----------------+                           +----------------+------------------+
                    |                                   |                           |                                   |
        +-----------+-------------+        +------------+-----------+     +---------+----------+            +-----------+---------+
        |       CandyStore        |        |        FishStore       |     |       Child        |            |         Adult       |
        +-------------------------+        +------------------------+     +--------------------+            +---------------------+
        | -candyName: String      |        | -fishName: String      |     +--------------------+            +---------------------+
        +-------------------------+        +------------------------+     | +visit(CandyStore) |            | +visit(CandyStore)  |
        | +CandyStore(String)     |        | +FishStore(String)     |     | +visit(FishStore)  |            | +visit(FishStore)   |
        | +accept(Visitor)        |        | +accept(Visitor)       |     +--------------------+            +---------------------+
        | +getCandyName(): String |        | +getFishName(): String |
        +-------------------------+        +------------------------+
