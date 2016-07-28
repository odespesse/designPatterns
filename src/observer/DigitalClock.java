package observer;

public class DigitalClock implements Observer {

	private Clock clock;

	public DigitalClock(Clock clock)
	{
		this.clock = clock;
		this.clock.register(this);
	}
	
	@Override
	public void update() {
		System.out.println("Digital clock read from Clock : Hour = " + this.clock.getHour());
	}
}
