package decorator;

public class StarDecoration extends MessageDecorator {

	public StarDecoration(MessagePrinter decorator) {
		super(decorator);
	}

	public void printMessage(String message) {
		System.out.println("**");
		decorator.printMessage(message);
		System.out.println("**");
	}
}
