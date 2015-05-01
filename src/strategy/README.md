# Strategy pattern #
The strategy pattern allow to switch implementation detail at runtime. It is similar to the template pattern where the detail of a method is in another class. The main difference beeing that the strategy pattern use composition whereas template use inheritance. Usually composition is better (loose coupling versus high cohesion).

## Implementation ##
In this example, a general will adapt his strategy according to the weather. If its is sunny he will attack, if it is rainy he will defend.
In this implementation the only public method is to execute the plan with the weather parameter. To choose the best strategy and to execute it is done in one step but it could have been separated.

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

