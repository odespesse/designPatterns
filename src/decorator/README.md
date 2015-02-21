# Decorator pattern #
The decorator pattern allow to customize an object behavior at runtime by "decorating" it with optional objects.
The idea is to create a chain of objects where each one can execute operations at the call stage and/or at the return stage. Every objects in the chain will be call until it reach the last one.
The differences with a chain of responsability is that with a decorator every objects in the chain does some operations (instead of do all or nothing) and the whole chain is executed (instead of stopping to the first objects that can do the thing).

## Implementation ##
In this example, we want to write messages to the console and to be able to add some "decoration" around the message.
At the top of the hierarchy we have an interface MessagePrinter that tied up together implementation and decorator with an unified contract. From the outside, we do not know if we are using directly the implementation or if it is encapsulate in decorators.
The implementation print to the console a message which could be decorated.
The decorators needs an intermediate level of abstraction to encapsulate the chain logic. Then we have sevral decorators each specialized in one kind of decoration.
Notice that it would be very easy to create a MessagePrinter that write message in a file instead of the console. All decorators would be reusable.

## UML ##

                        +------"Interface"------+                                             
                        |     MessagePrinter    |                                             
                        +-----------------------+                                             
                        +-----------------------+                                             
                        | +printMessage(String) |                                             
                        +-+--------^------------+                                             
                                  /_\                                                            
                                   :                                                          
                    +..............+....................+                                     
                    :                                   :                                     
        +-----------+-----------+     +------------"Abstract"-------------+
        |     MessageConsole    |     |         MessageDecorator          |
        +-----------------------+     +-----------------------------------+
        +-----------------------+     | #decorator: MessagePrinter        |
        | +printMessage(String) |     +-+---------------------------------+
        +-----------------------+     | +MessageDecorator(MessagePrinter) |
                                      | +printMessage(String)             |                   
                                      +-+---------------^-----------------+                   
                                                       /_\                                     
                                                        |                                     
                                   +--------------------+-------------------+                 
                                   |                                        |                 
                   +---------------+----------------+       +---------------+----------------+
                   |         TildDecorator          |       |         StarDecorator          |
                   +--------------------------------+       +--------------------------------+
                   +--------------------------------+       +--------------------------------+
                   | +TildDecorator(MessagePrinter) |       | +StarDecorator(MessagePrinter) |
                   | +printMessage(String)          |       | +printMessage(String)          |
                   +--------------------------------+       +--------------------------------+

