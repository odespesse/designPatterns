# State pattern #
The state pattern implement a kind of finite state machine (FSM) where the object behavior change according to its internal state.

## Implementation ##
In this example, we have a door with two states : open or close.
The idea is that a method call will not have the same effect whereas your are in one state or an other.
For instance, if the door is open and you call close(), it close the door but if instead you call open() it will do nothing since it is already in this state.
Same for close but the other way.

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
