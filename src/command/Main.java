package command;

public class Main {

	public static void main(String[] args) {
		Ligth deskLigth = new Ligth();
		CommandLigthOn turnLigthOn = new CommandLigthOn(deskLigth);
		CommandLigthOff turnLigthOff = new CommandLigthOff(deskLigth);

		Switch button1 = new Switch(turnLigthOn, turnLigthOff);
		button1.turnOn();
		button1.turnOff();


		Stereo mp3Player = new Stereo();
		CommandStereoOn turnStereoOn = new CommandStereoOn(mp3Player);
		CommandStereoOff turnStereoOff = new CommandStereoOff(mp3Player);

		Switch button2 = new Switch(turnStereoOn, turnStereoOff);
		button2.turnOn();
		button2.turnOff();
	}
}
