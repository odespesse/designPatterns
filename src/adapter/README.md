# Adapter pattern #
The adapter pattern is useful with an existing system that your are unable to change but which must fit in your new code.
Be careful with possible complexity and resources overhead (CPU/memory).

## UML ##
        +------"I"-----+                          +-----"I"-----+
        |  SquarePlug  |                          |  RoundPlug  |
        +--------------+                          +-------------+
        | +saySquare() |                          | +sayRound() |
        +-------+------+                          +------^------+
                ^                                       /_\
                |                                        |
                |                                        |
                |                                        |
                |                    +-------------------+-------------+
                |                    |                                 |
                |                    |                                 |
                |   +----------------+---------------+         +-------+-------+
                |   |        SquareToRoundPlug       |         | RoundPlugImpl |
                |   +--------------------------------+         +---------------+
                +---| -legacySquarePlug: SquarePlug  |         +---------------+
                    +--------------------------------+         | +sayRound()   |
                    | +SquareToRoundPlug(SquarePlug) |         +---------------+
                    | +sayRound()                    |
                    +--------------------------------+
