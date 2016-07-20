package facade;

public class Facade {

    private ObjectA objectA;
    private ObjectB objectB;

    public Facade() {
        this.objectA = new ObjectA();
        this.objectB = new ObjectB();
    }

    public void doSomething1() {
        this.objectA.methodA1();
        this.objectB.methodB2();
    }

    public void doSomething2() {
        this.objectA.methodA2();
        this.objectB.methodB1();
    }
}
