# Visitor pattern #
A visitor pattern separates the data structure and the algorithm which operates on it.

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
