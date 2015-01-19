package templateMethod;

public class GreeterUS extends Greeter {

	@Override
	protected String greet() {
		return "Hello world !";
	}
}
