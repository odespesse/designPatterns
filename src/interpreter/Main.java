package interpreter;

public class Main {

	public static void main(String[] args) {
		WrappingTag root = new WrappingTag("root");
		WrappingTag tagA = new WrappingTag("tagA");
		WrappingTag tagB = new WrappingTag("tagB");
		WrappingTag tagC = new WrappingTag("tagC");
		
		FinalTag foo = new FinalTag("foo");
		FinalTag bar = new FinalTag("bar");
		
		root.add(tagA);
		root.add(tagB);
		tagB.add(tagC);
		
		tagA.add(foo);
		tagC.add(bar);
		
		root.render();
	}
}
