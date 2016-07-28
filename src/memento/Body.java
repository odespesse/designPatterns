package memento;

import java.util.Stack;

public class Body {

    private Stack<Tattoo> tattoosList = new Stack<Tattoo>();

    public void save(Tattoo newTattoo) {
        tattoosList.push(newTattoo);
    }

    public Tattoo restore() {
        return this.tattoosList.pop();
    }
}
