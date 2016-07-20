# Composite pattern #
The composite pattern standardize the way to manipulate a group or a single object.
They are tied up in tree like data structure.

## UML ##
                              +------------+
                              | Componant  |-----------------------------+
                              +------------+                             |
                              | +display() |                             |
                              +-----^------+                             |
                                   /_\                                   |
                                    +                                    |
                                    |                                    |
                                    |                                    |
                        +-----------+------------------+                 |
                        |                              |                 |
                +-------+-------+         +------------+-----------+     |
                |     Tool      |         |           Box          |     |
                +---------------+         +------------------------+     |
                | -name: String |         | -list: List<Componant> |<>---+
                +---------------+         +------------------------+
                | +Tool(String) |         | +display()             |
                | +display()    |         | +add(Composant)        |
                +---------------+         +------------------------+

