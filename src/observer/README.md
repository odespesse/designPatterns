# Observer pattern #
The observer pattern allows a subject to notify dependant objects about its state changes

## UML ##
        +------------"A"------------+                   +-----"I"-----+
        |          Subject          |                   |   Observer  |
        +---------------------------+                   +-------------+
        | -observers: Set<Observer> |<>-----------------|-------------|
        +---------------------------+                   | +update()   |
        | +register(Observer)       |                   +------^------+
        | #notifyObservers()        |                         /_\
        +-------------^-------------+                          :
                     /_\                                       :
                      +                                        :
                      |                                        :
                      |                                        :
              +-------+-------+                     +----------+-----------+
              |     Clock     |                     |     DigitalClock     |
              +---------------+                     +----------------------+
              | -hour: int    |<--------------------| -clock: Clock        |
              +---------------+                     +----------------------+
              | +getHour: int |                     | +DigitalClock(Clock) |
              | +setHour(int) |                     | +update()            |
              +-------+-------+                     +-----------+----------+
                      ^                                         ^
                      |                                         |
                      |                                         |
                      |              +--------+                 |
                      +--------------| Client |-----------------+
                                     +--------+
