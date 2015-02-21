package decorator;

public class Main {

	public static void main(String[] args) {
		MessagePrinter console = new MessageConsole();
		MessagePrinter messageWithStars = new StarDecoration(console);
		messageWithStars.printMessage("Hello wolrd !");
		
		MessagePrinter messageWithStarsAndTilds = new TildDecoration(messageWithStars);
		messageWithStarsAndTilds.printMessage("Foo Bar");
	}
}
