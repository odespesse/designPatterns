package singleton;

public class Main {

    public static void main(String[] argv) {
        Singleton singleton1 = Singleton.getSingleton();
        singleton1.displayCounter();
        singleton1.increaseCounter();
        singleton1.displayCounter();

        Singleton singleton2 = Singleton.getSingleton();
        singleton2.displayCounter();

    }
}
