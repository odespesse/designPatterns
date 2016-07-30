# Decorator pattern #
The decorator pattern allows to customize an object behavior at runtime by "decorating" it with optional objects.
The idea is to create a chain of objects where each one can execute operations at the call stage and/or at the return stage. Every object in the chain will be called until it reaches the last one.

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

