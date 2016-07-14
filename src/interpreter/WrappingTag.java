package interpreter;

import java.util.ArrayList;
import java.util.List;

public class WrappingTag extends Tag {

	private List<Tag> children = new ArrayList<Tag>();

	public WrappingTag(String name) {
		super(name);
	}

	public void add(Tag tag) {
		children.add(tag);
	}

	@Override
	public void render() {
		System.out.println("<" + name + ">");
		for (Tag t : children) {
			t.render();
		}
		System.out.println("</" + name + ">");
	}
}
