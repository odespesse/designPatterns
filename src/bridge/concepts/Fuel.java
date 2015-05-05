package bridge.concepts;

import bridge.impl.CarImpl;

public class Fuel extends Car {
	private static final String FUEL = "FUEL";
	
	public Fuel(CarImpl car) {
		super(car);
	}

	public void drive() {
		car.drive(FUEL);
	}
	
	public void fuelUp() {
		car.fill(FUEL);
	}
}
