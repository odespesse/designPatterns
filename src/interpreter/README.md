# Interpreter pattern #
The interpreter pattern is a way to define a language grammar and to interpret it.

## UML ##

                             +-- "Abstract"---+
                             |      Tag       |
                             +----------------+
                             | #name: String  |
                             +----------------+
                             | +Tag(String)   |
                             | +render()      |
                             +-------^--------+
                                    /_\
                                     |
                   +-----------------+---------------+
                   |                                 |
        +----------+-----------+           +---------+---------+
        |    EnclosingTag      |           |      FinalTag     |
        +----------------------+           +-------------------+
        | -children: List<Tag> |           +-------------------+
        +----------------------+           | +FinalTag(String) |
        | +NonFinalTag(String) |           | +render()         |
        | +add(Tag)            |           +-------------------+
        | +render()            |
        +----------------------+

