package mediator;

public class UnitedNations implements Mediator {
    private NationA nationA;
    private NationB nationB;
    private NationC nationC;

    @Override
    public void registerNationA(NationA nationA) {
        this.nationA = nationA;
    }

    @Override
    public void registerNationB(NationB nationB) {
        this.nationB = nationB;
    }

    @Override
    public void registerNationC(NationC nationC) {
        this.nationC = nationC;
    }

    @Override
    public void sendMessageToNationA(String message) {
        this.nationA.receiveMessage(message);
    }

    @Override
    public void sendMessageToNationB(String message) {
        this.nationB.receiveMessage(message);
    }

    @Override
    public void sendMessageToNationC(String message) {
        this.nationC.receiveMessage(message);
    }
}
