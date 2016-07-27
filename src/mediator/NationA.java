package mediator;

public class NationA extends Nation {

    public NationA(Mediator unitedNations) {
        this.name = "NationA";
        this.unitedNations = unitedNations;
        this.unitedNations.registerNationA(this);
    }

    public void sendMessageToB(String message) {
        System.out.println("NationA send a message");
        this.unitedNations.sendMessageToNationB(message);
    }

    public void sendMessageToC(String message) {
        System.out.println("NationA send a message");
        this.unitedNations.sendMessageToNationC(message);
    }
}
