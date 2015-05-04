package command;

public class CommandStereoOff implements Command {

	private Stereo stereo;

	public CommandStereoOff(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}
}
