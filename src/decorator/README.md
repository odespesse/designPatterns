# Decorator pattern #
The decorator pattern allow to customize an object behavior at runtime by "decorating" it with optional objects.
The idea is to create a chain of objects where each one can execute operations at the call stage and/or at the return stage. Every objects in the chain will be call until it reach the last one.
The differences with a chain of responsability is that with a decorator every objects in the chain does some operations (instead of do all or nothing) and the whole chain is executed (instead of stopping to the first objects that can do the thing).

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

