package prototype;

public class Main {

    public static void main(String[] argv) {
        Ewe dolly = new Ewe("White", 5);
        Ewe clone = dolly.clone();

        System.out.println("Original ewe: color = " + dolly.getColor() + ", age = " + dolly.getAge());
        System.out.println("Cloned ewe : color = " + clone.getColor() + ", age = " + clone.getAge());
        System.out.println("Not the same animal : " + (clone != dolly));
    }
}
