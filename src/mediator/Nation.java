package mediator;

public abstract class Nation {

    protected Mediator unitedNations;
    protected String name;

    public void receiveMessage(String message) {
        System.out.println(String.format("%s received %s", this.name, message));
    }
}
