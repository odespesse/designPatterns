package strategy;

public class SunStrategy implements Strategy {

	@Override
	public void executePlan() {
		System.out.println("It's sunny, attack !");
	}
}
