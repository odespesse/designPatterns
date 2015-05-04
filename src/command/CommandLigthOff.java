package command;

public class CommandLigthOff implements Command {

	private Ligth lamp;

	public CommandLigthOff(Ligth ligth) {
		this.lamp = ligth;
	}

	@Override
	public void execute() {
		this.lamp.turnOff();
	}
}
