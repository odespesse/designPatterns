# Command pattern #
The command pattern is a way to decouple an action from the executor by wrapping it in a generic object.

## Implementation ##
In this example, we want to be able to control some furnitures with the same kind of button. Because the two furnitures (a ligth and a stereo) have differents way to be called, the user need a way to unify the API so the caller doesn't have to remember every detail of every furniture.
Here we have a Command interface which is the abstract concept to encapsulate the actions. Then for each furniture we create the associated commands CommandLigthOn, CommandLigthOff, CommandStereoOn and CommandStereoOff which know how to interact with the furniture. The we plug each pair of commands to the button.

## UML ##
                        +---------------------------+             +----"I"-----+
                        |          Switch           |------------>|  Command   |
                        +---------------------------+             +------------+
                        | +turnOn: Command          |             | +execute() |
                        | +turnOff: Command         |             +-----^------+
                        +---------------------------+                  /_\
                        | +Switch(Command, Command) |                   :
                        | +switchOn()               |                   :
                        | +switchOff()              |                   :
                        +---------------------------+                   :
                                                                        :
                         +...................................................................................................+
                         :                              :                                 :                                  :
             +------------------------+    +-------------------------+      +---------------------------+    +---------------------------+
             |     CommandLigthOn     |    |    CommandLigthOff      |      |     CommandStereoOn       |    |    CommandStereoOff       |
             +------------------------+    +-------------------------+      +---------------------------+    +---------------------------+
             | +ligth: Lamp           |    | +ligth: Lamp            |      | +stereo: Stereo           |    | +stereo: Stereo           |
             +------------------------+    +-------------------------+      +---------------------------+    +---------------------------+
             | +CommandLigthOn(Ligth) |    | +CommandLigthOff(Ligth) |      | +CommandStereoOn(Strereo) |    | +CommandStereoOff(Stereo) |
             | +execute()             |    | +execute()              |      | +execute()                |    | +execute()                |
             +------------------------+    +-------------------------+      +---------------------------+    +---------------------------+
                         |                              |                                  |                                |
                         +------------------------------+                                  +--------------------------------+
                                        |                                                                 |
                                        v                                                                 v
                                +---------------+                                                  +---------------+
                                |    Ligth      |                                                  |    Stereo     |
                                +---------------+                                                  +---------------+
                                +---------------+                                                  +---------------+
                                | +turnOn()     |                                                  | +on()         |
                                | +turnOff()    |                                                  | +off()        |
                                +---------------+                                                  | +volumeUp()   |
                                                                                                   +---------------+

