package bridge.concepts;

import bridge.impl.CarImpl;

public class Electric extends Car {
	private static final String ELECTRIC = "Electric";
	
	public Electric(CarImpl car) {
		super(car);
	}
	
	public void drive() {
		car.drive(ELECTRIC);
	}

	public void reload() {
		car.fill(ELECTRIC);
	}
}
