package mediator;

public interface Mediator {
    void registerNationA(NationA nationA);
    void registerNationB(NationB nationB);
    void registerNationC(NationC nationC);

    void sendMessageToNationA(String message);
    void sendMessageToNationB(String message);
    void sendMessageToNationC(String message);
}
