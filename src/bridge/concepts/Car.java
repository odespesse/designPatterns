package bridge.concepts;

import bridge.impl.CarImpl;

public abstract class Car {

	protected CarImpl car;
	
	public Car(CarImpl car) {
		this.car = car;
	}
}
