# Strategy pattern #
The strategy pattern allow to switch implementation detail at runtime. It is similar to the template pattern where the detail of a method is in another class. The main difference beeing that the strategy pattern use composition whereas template use inheritance. Usually composition is better (loose coupling versus high cohesion).

## UML ##

	+------------------------------------+                           +---------"I"---------+
	|               General              +-------------------------->|      Strategy       |
	+------------------------------------+                           +---------------------+
	| -strategy: Strategy                |                           +---------------------+
	+------------------------------------+                           | +executePlan()      |
	| +followThePlan(Weather)            |                           +----------^----------+
	| -chooseStrategy(Weather): Strategy |                                     /_\
	+-----------------+------------------+                                      :
		          |                                              +..........+..........+
		          |                                              :                     :
		          v                                              :                     :
		     +---"E"----+                                +-------+--------+    +-------+--------+
		     | Weather  |                                |  RainStrategy  |    |  SunStrategy   |
		     +----------+                                +----------------+    +----------------+
		     | +SUN     |                                +----------------+    +----------------+
		     | +RAIN    |                                | +executePlan() |    | +executePlan() |
		     +----------+                                +----------------+    +----------------+

