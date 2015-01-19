package templateMethod;

public class Main {

	public static void main(String[] args) {
		Greeter greeterUS = new GreeterUS();
		Greeter greeterFR = new GreeterFR();

		System.out.println("I've got 2 greeters, each specialized in one kind of task :");
		System.out.println("\t Greeter US : " + greeterUS.greet());
		System.out.println("\t Greeter FR : " + greeterFR.greet());
	}
}
