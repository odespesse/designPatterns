# Chain of responsibility pattern #
The chain of responsibility pattern can be leverage when a request (aka some data) is received and among several objects you don't know which one will be able to process it. Those potentials receivers are organized as a linked chain and the request travel through it. The first object able to process the request do it, thus the request won't go any further in the chain.
Be careful of the special case at the end of the chain where no object is left because none has been able to process the request.

## UML ##

        +-"Enumeration"-+                 +----- "Abstract"------+                        
        | SOCCER        |<----------------|        Player        |                        
        | GOLF          |                 +----------------------+                        
        | BASKET        |                 | +nextPlayer: Player  |                        
        +---------------+                 +----------------------+                        
                                          | +Player(Player)      |                        
                                          | +Player()            |                        
                                          | +setPlayer(Player)   |                        
                                          | #next(Ball)          |                        
                                          | +play(Ball)          |                        
                                          +----------^-----------+                        
                                                    /_\                                   
                                                     |                                    
                             +-----------------------------------------------+            
                             |                       |                       |            
                             |                       |                       |            
                 +-----------+---------+     +-------+---------+     +-------+-------+    
                 |      Basketball     |     |     Soccer      |     |     Golf      |    
                 +---------------------+     +-----------------+     +---------------+    
                 +---------------------+     +-----------------+     +---------------+    
                 | +Basketball(Player) |     | +Soccer(Player) |     | +Golf(Player) |    
                 | +Basketball()       |     | +Soccer()       |     | +Golf()       |    
                 | +play(Ball)         |     | +play(Ball)     |     | +play(Ball)   |    
                 +---------------------+     +-----------------+     +---------------+    
