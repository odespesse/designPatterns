package bridge.impl;


public class HightTechCar implements CarImpl {

	@Override
	public void drive(String typeOfFuel) {
		System.out.println("I drive a hight tech car " + typeOfFuel);
	}

	@Override
	public void fill(String typeOfFuel) {
		System.out.println("I fill my hight tech car with " + typeOfFuel);
	}
}
