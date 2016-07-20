package composite;

public class Tool implements Component {
    private String name;

    public Tool(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(String.format("This tool is %s", this.name));
    }
}
