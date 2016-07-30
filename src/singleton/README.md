# Singleton pattern #
The singleton pattern ensures to have only one instance of an object at any time

## UML ##
                       +----------------------+
                       |                      |
                       v                      |
        +--------------+--------------+       |
        |          Singleton          |       |
        +-----------------------------+       |
        | -currentInstance: Singleton +-------+
        | -counter: int               |
        +-----------------------------+
        | -Singleton()                |
        | +getSingleton(): Singleton  |
        | +increaseCounter()          |
        | +displayCounter()           |
        +-----------------------------+
