package composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {

    private List<Component> list = new ArrayList<Component>();

    @Override
    public void display() {
        System.out.println("This is a box, it contains : ");
        for (Component c : this.list) {
            c.display();
        }
    }

    public void add(Component component) {
        this.list.add(component);
    }
}
