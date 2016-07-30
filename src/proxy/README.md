# Proxy pattern #
The proxy pattern gives a wrapper to interact with the client on behalf of an other object in order to provide additional logic

## UML ##
        +--------+           +----"I"---+
        | Client |---------->| Database |
        +--------+           +----------+
                             +----------+
                             | +query() |
                             +-----^----+
                                  /_\
                                   +
                                   :
                    +..............+..............+
                    :                             :
                    :                             :
          +---------+---------+            +------+-------+
          |   ProxyDatabase   |            | DatabaseImpl |
          +-------------------+            +--------------+
          | -db: DatabaseImpl |----------->|--------------+
          +-------------------+            | +query()     |
          | +query()          |            +--------------+
          +-------------------+
