# Interpreter pattern #
The interpreter pattern is a way to define a language grammar and to interpret it.

## Implementation ##
In this example we want to define a simplified XML language with just wrapping and finals tags. We can combine wrapping tags together but only put finals tags at the end of the hierarchy. When our tags tree is complete, we can take the root and ask for a render which will travel every nodes according to the language's grammar.

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

