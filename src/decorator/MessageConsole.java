package decorator;

public class MessageConsole implements MessagePrinter{

	public void printMessage(String message) {
		System.out.println(message);
	}
}
