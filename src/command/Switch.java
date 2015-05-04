package command;

public class Switch {

	private Command turnOn;
	private Command turnOff;
	
	public Switch(Command turnOn, Command turnOff) {
		this.turnOn = turnOn;
		this.turnOff = turnOff;
	}

	public void turnOn() {
		this.turnOn.execute();
	}

	public void turnOff() {
		this.turnOff.execute();
	}
}
