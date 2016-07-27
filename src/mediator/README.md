# Mediator pattern #
The mediator pattern encapsulate communications between a set of objects reducing dependencies between each others

## UML ##
        +--------------"I"--------------+                                          +-----------"A"-----------+
        |            Mediator           |                                          |          Nation         |
        +-------------------------------+                                          +-------------------------+
        +-------------------------------+<-----------------------------------------+ #unitedNation: Mediator |
        | +registerNationA(NationA)     |                                          | #name: String           |
        | +registerNationB(NationB)     |                                          +-------------------------+
        | +registerNationC(NationC)     |                                          | +receiveMessage(String) |
        | +sendMessageToNationA(String) |                                          +------------^------------+
        | +sendMessageToNationB(String) |                                                      /_\
        | +sendMessageToNationC(String) |                                                       +
        +---------------^---------------+                                                       |
                       /_\                                    +---------------------------------+-------------------------------------+
                        +                                     |                                 |                                     |
                        |                        +------------+------------+        +-----------+-------------+         +-------------+-----------+
                        |                        |         NationA         |        |         NationB         |         |         NationC         |
                        |                        +-------------------------+        +-------------------------+         +-------------------------+
        +---------------+---------------+        +-------------------------+        +-------------------------+         +-------------------------+
        |        UnitedNations          |        | +NationA(Mediator)      |        | +NationB(Mediator)      |         | +NationC(Mediator)      |
        +-------------------------------+        | +sendMessageToB(String) |        | +sendMessageToA(String) |         | +sendMessageToA(String) |
        | -nationA: NationA             |        | +sendMessageToC(String) |        | +sendMessageToC(String) |         | +sendMessageToB(String) |
        | -nationB: NationB             |        +------------+------------+        +-------------------------+         +-------------+-----------+
        | -nationC: NationC             |                     ^                                 ^                                     ^
        +-------------------------------+                     |                                 |                                     |
        | +registerNationA(NationA)     |                     |                                 |                                     |
        | +registerNationB(NationB)     +---------------------+---------------------------------+-------------------------------------+
        | +registerNationC(NationC)     |
        | +sendMessageToNationA(String) |
        | +sendMessageToNationB(String) |
        | +sendMessageToNationC(String) |
        +-------------------------------+
