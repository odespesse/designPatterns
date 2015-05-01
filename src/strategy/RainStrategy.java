package strategy;

public class RainStrategy implements Strategy {

	@Override
	public void executePlan() {
		System.out.println("It's rainning, defend !");
	}
}
