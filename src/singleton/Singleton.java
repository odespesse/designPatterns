package singleton;

public class Singleton {

    private static Singleton currentInstance;
    private int counter = 0;

    private Singleton() {}

    public static Singleton getSingleton() {
        if (Singleton.currentInstance == null) {
            Singleton.currentInstance = new Singleton();
        }
        return Singleton.currentInstance;
    }

    public void increaseCounter() {
        this.counter++;
    }

    public void displayCounter() {
        System.out.println(this.counter);
    }
}
