package interpreter;

public abstract class Tag {

	protected final String name;

	public Tag(String name) {
		this.name = name;
	}

	public abstract void render();
}
