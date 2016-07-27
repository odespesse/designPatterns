package mediator;

public class NationB extends Nation {

    public NationB(Mediator unitedNations) {
        this.name = "NationB";
        this.unitedNations = unitedNations;
        this.unitedNations.registerNationB(this);
    }

    public void sendMessageToA(String message) {
        System.out.println("NationB send a message");
        this.unitedNations.sendMessageToNationA(message);
    }

    public void sendMessageToC(String message) {
        System.out.println("NationB send a message");
        this.unitedNations.sendMessageToNationC(message);
    }
}
