# Command pattern #
The bridge pattern allows to have both variations in implementations and in abstractions by putting them in two distinct hierarchies.

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
