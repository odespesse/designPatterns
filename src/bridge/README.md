# Command pattern #
The bridge pattern allow to have both variation in implementations and in abstractions by putting them in two distincts hierarchies.

## Implementation ##
In this example, we have differents cars technologies with several cars brands. If we do a classical single inheritance hierarchy we would end up with a tree structure which would be a pain to update each time we add a new class abstraction or implementation). The bridge pattern split the absraction tree in two parts : abstractions (the car technology here) and implementations (the car brand).

## UML ##
                                +------"A"------+                                +------"I"-------+           
                                |      Car      |------------------------------->|    CarImpl     |           
                                +---------------+                                +----------------+           
                                | #car: CarImpl |                                | +drive(String) |           
                                +---------------+                                | +fill(String)  |           
                                | +Car(CarImpl) |                                +-------^--------+           
                                +-------^-------+                                       /_\                   
                                       /_\                                               :                    
                                        :                                                :                    
                                        :                                                :                    
                          +...........................+                     +.......................+         
                          :                           :                     :                       :         
                +---------+----------+       +--------+-------+     +-------+--------+      +-------+--------+
                |      Electric      |       |      Fuel      |     |  HightTechCar  |      |     OldCar     |
                +--------------------+       +----------------+     +----------------+      +----------------+
                | +ELECTRIC          |       | +FUEL          |     +----------------+      +----------------+
                +--------------------+       +----------------+     | +drive(String) |      | +drive(String) |
                | +Electric(CarImpl) |       | +Fuel(CarImpl) |     | +fill(String)  |      | +fill(String)  |
                | +drive()           |       | +drive()       |     +----------------+      +----------------+
                | +reload()          |       | +fuelUp()      |
                +--------------------+       +----------------+
