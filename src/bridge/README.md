# Command pattern #
The bridge pattern allow to have both variation in implementations and in abstractions by putting them in two distincts hierarchies.

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
