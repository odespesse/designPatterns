package mediator;

public class NationC extends Nation {

    public NationC(Mediator unitedNations) {
        this.name = "NationC";
        this.unitedNations = unitedNations;
        this.unitedNations.registerNationC(this);
    }

    public void sendMessageToA(String message) {
        System.out.println("NationC send a message");
        this.unitedNations.sendMessageToNationA(message);
    }

    public void sendMessageToB(String message) {
        System.out.println("NationC send a message");
        this.unitedNations.sendMessageToNationB(message);
    }
}
