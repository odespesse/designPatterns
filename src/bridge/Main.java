package bridge;

import bridge.concepts.Electric;
import bridge.concepts.Fuel;
import bridge.impl.OldCar;
import bridge.impl.HightTechCar;

public class Main {

	public static void main(String[] args) {
		OldCar c1 = new OldCar();
		HightTechCar clio = new HightTechCar();
		
		Fuel c1Essence = new Fuel(c1);
		Fuel clioEssence = new Fuel(clio); 
		Electric c1Diesel = new Electric(c1);
		Electric clioDiesel = new Electric(clio);
		
		c1Essence.fuelUp();
		c1Essence.drive();
		
		clioEssence.fuelUp();
		clioEssence.drive();
		
		c1Diesel.reload();
		c1Diesel.drive();
		
		clioDiesel.reload();
		clioDiesel.drive();
	}
}
