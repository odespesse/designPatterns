# Template method pattern #
The template method pattern delegate the specialisation (aka: the implementation of several methods) of a class to its subclasses.

## Implementation ##
In the example a Greeter object is specialized according the langage we need (English or French) with the appropriate subclass.
The main difference with a classical inheritance is the type of the object. We instanciate with the subclass but we cast with the superclass hence the specialisation is completely transparent.

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

