package mediator;

public class Main {

    public static void main(String[] argv) {
        Mediator unitedNations = new UnitedNations();
        NationA nationA = new NationA(unitedNations);
        NationB nationB = new NationB(unitedNations);
        NationC nationC = new NationC(unitedNations);

        nationA.sendMessageToB("Hello");
        nationB.sendMessageToA("Hi");
        nationB.sendMessageToC("Nice to meet you");
        nationC.sendMessageToA("How are your ?");
    }
}
