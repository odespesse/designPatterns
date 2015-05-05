package bridge.impl;


public class OldCar implements CarImpl {

	@Override
	public void drive(String typeOfFuel) {
		System.out.println("I drive an old car with " + typeOfFuel + " engine");
	}

	@Override
	public void fill(String typeOfFuel) {
		System.out.println("I fill my old car with " + typeOfFuel);
	}
}
