# State pattern #
The state pattern implements a kind of finite state machine (FSM) where the object behavior change according to its internal state.

## UML ##

    +------------------+                        +----------+
    |      Door        |----------------------->|  State   |
    +------------------+                        +----------+
    | +state: State    |                        | +open()  |
    +------------------+                        | +close() |
    | +setState(State) |                        +-----^----+
    | +open()          |                             /_\
    | +close()         |                              :
    +------------------+                              :
              ^                             +....................+
              |                             :                    :
              |                       +----------+         +----------+
              |                       |  Open    |         |  Close   |
              |                       +----------+         +----------+
              |                       | +open()  |         | +open()  |
              |                       | +close() |         | +close() |
              |                       +----------+         +----------+
              |                             |                    |     
              +-----------------------------+--------------------+     
