package command;

public class CommandStereoOn implements Command {

	private Stereo stereo;

	public CommandStereoOn(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.volumeUp();
	}
}
