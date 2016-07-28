package observer;

public class Main {
	
	public static void main(String[] args)
	{
		Clock clock = new Clock();
		DigitalClock digitalClock = new DigitalClock(clock);
		clock.setHour(2);
		clock.setHour(5);
	}
}
