# Prototype pattern #
The prototype pattern creates a new object based on an existing instance used as a prototype

## UML ##
        +---------"I"---------+
        |      Prototype      |
        +---------------------+
        +---------------------+
        | +clone(): Prototype |
        +----------^----------+
                  /_\
                   :
                   :
                   :
                   :
        +----------+----------+
        |         Ewe         |
        +---------------------+
        | -color: String      |
        | -age: int           |
        +---------------------+
        | +Ewe(String, age)   |
        | +getColor(): String |
        | +getAge(): int      |
        +---------------------+
