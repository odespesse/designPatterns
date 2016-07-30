# Template method pattern #
The template method pattern delegates the specialization (aka: the implementation of several methods) of a class to its sub-classes.

## UML ##

                        +----"Abstract"----+                
                        |     Greeter      |                
                        +------------------+                
                        +------------------+                               
                        | #greet(): String |                                
                        +--------^---------+                
                                /_\                         
                                 |                          
                  +--------------+--------------+           
                  |                             |           
         +--------+---------+          +--------+---------+ 
         |    GreeterUS     |          |    GreeterFR     | 
         +------------------+          +------------------+ 
         +------------------+          +------------------+ 
         | #greet(): String |          | #greet(): String | 
         +------------------+          +------------------+ 

