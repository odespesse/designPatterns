package command;

public class CommandLigthOn implements Command {

	private Ligth lamp;

	public CommandLigthOn(Ligth ligth) {
		this.lamp = ligth;
	}

	@Override
	public void execute() {
		lamp.turnOn();
	}
}
