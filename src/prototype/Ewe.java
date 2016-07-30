package prototype;

public class Ewe implements Prototype {

	private String color;
	private int age;

	public Ewe(String color, int age) {
		this.color = color;
		this.age = age;
	}

	public Ewe clone() {
		return new Ewe(this.color, this.age);
	}
	
	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}
}
