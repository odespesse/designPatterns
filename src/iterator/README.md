# Iterator pattern #
The iterator pattern gives a way to access an aggregate like object without showing its internal details

## UML ##
                                                      +---------------------+
                                                      |       Iterator      |
                                                      +---------------------+
                                                      +---------------------+
                 +------+                             | +hasNext(): boolean |
                 |Client|---------------------------->| +next(): Object     |
                 +---+--+                             +----------^----------+
                     |                                          /_\
                     |                                           +
                     |                                           |
                     |                                           |
                     |                                           |
                     v                                           |
        +------------+-------------+                +------------+------------+
        |           Words          |                |       WordIterator      |
        +--------------------------+                +-------------------------+
        | -words: String[]         |                | -index: int             |
        | -iterator: Iterator      |                | -elements: String[]     |
        +--------------------------+                +-------------------------+
        | +Words(String[])         |                | +WordIterator(String[]) |
        | +getIterator(): Iterator |                | +hasNext(): boolean     |
        +--------------------------+                | +next(): Object         |
                                                    +-------------------------+
