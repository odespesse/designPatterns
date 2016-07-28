# Memento pattern #
The memento pattern provides the ability to restore a previous state

## UML ##
                            +---------------------------+
                            |           Tattoo          |
                            +---------------------------+
                      +---->+ -memorySaved: String      +----------+
                      |     +---------------------------+          |
                      |     | +Tattoo(String)           |          |
                      |     | +getMemorySaved(): String |          |
                      |     +---------------------------+          |
                      |                                            ^
                      |                                            v
        +-------------+-----------+               +----------------+------------+
        |         Amnesic         |               |             Body            |
        +-------------------------+               +-----------------------------+
        | -memory: String         |               | -tattoosList: Stack<Tattoo> |
        +-------------------------+               +-----------------------------+
        | +getMemory(): String    |               | +save(Tattoo)               |
        | +setMemory(String)      |               | +restore(): Tattoo          |
        | +createTattoo(): Tattoo |               +----------------+------------+
        | +remember(Tattoo)       |                                ^
        +-------------+-----------+                                |
                      ^                                            |
                      |                                            |
                      |                                            |
                      |                +--------+                  |
                      +----------------+ Client +------------------+
                                       +--------+
