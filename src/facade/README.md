# Facade pattern #
The facade pattern create an higher level interface by combining several objects

## UML ##

                               +-------------------+
                               |      Facade       |
        +--------+             +-------------------+
        | Client |------------>| -objectA: ObjectA |
        +--------+             | -objectB: ObjectB |
                               +-------------------+
                               | +doSomething1()   |
                               | +doSomething2()   |
                               +--------+----------+
                                        |
                                        |
                                        |
                          +-------------+--------------+
                          |                            |
                          v                            v
                   +-------------+              +-------------+
                   |   ObjectA   |              |   ObjectB   |
                   +-------------+              +-------------+
                   +-------------+              +-------------+
                   | +methodA1() |              | +methodB1() |
                   | +methodA2() |              | +methodB2() |
                   +-------------+              +-------------+
