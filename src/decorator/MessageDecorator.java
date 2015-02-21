package decorator;

public abstract class MessageDecorator implements MessagePrinter {

	protected MessagePrinter decorator;
	
	public MessageDecorator(MessagePrinter deco) {
		this.decorator = deco;
	}

	public abstract void printMessage(String message);
}
