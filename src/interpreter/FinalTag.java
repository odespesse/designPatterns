package interpreter;

public class FinalTag extends Tag {

	public FinalTag(String name) {
		super(name);
	}

	@Override
	public void render() {
		System.out.println(name);
	}
}

