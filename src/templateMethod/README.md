# Template method pattern #
The template method pattern delegate the specialisation (aka: the implementation of several methods) of a class to its subclasses.

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

