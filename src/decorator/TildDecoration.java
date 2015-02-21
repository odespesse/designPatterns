package decorator;

public class TildDecoration extends MessageDecorator{

	public TildDecoration(MessagePrinter decorator) {
		super(decorator);
	}

	@Override
	public void printMessage(String message) {
		System.out.println("~~");
		decorator.printMessage(message);
		System.out.println("~~");
	}
}
