package strategy;

public class Main {

	public enum Weather {
		SUN, RAIN
	}

	public static void main(String[] args) {
		General napoleon = new General();
		
		napoleon.followThePlan(Weather.SUN);
		napoleon.followThePlan(Weather.RAIN);
	}
}
