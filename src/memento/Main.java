package memento;

public class Main {

    public static void main(String[] argv) {
        final String MEMENTO_1 = "Find the killed";
        final String MEMENTO_2 = "Take an hotel room";
        final String MEMENTO_3 = "Go downtown";
        final String MEMENTO_4 = "The killer is blond";

        Amnesic leonard = new Amnesic();
        Body leonardsBody = new Body();

        leonard.setMemory(MEMENTO_1);
        leonardsBody.save(leonard.createTattoo());
        leonard.setMemory(MEMENTO_2);
        leonardsBody.save(leonard.createTattoo());
        leonard.setMemory(MEMENTO_3);
        leonard.setMemory(MEMENTO_4);
        leonardsBody.save(leonard.createTattoo());

        leonard.remember(leonardsBody.restore());
        System.out.println(MEMENTO_4 + " : " + MEMENTO_4.equals(leonard.getMemory()));
        leonard.remember(leonardsBody.restore());
        System.out.println(MEMENTO_2 + " : " + MEMENTO_2.equals(leonard.getMemory()));
        leonard.remember(leonardsBody.restore());
        System.out.println(MEMENTO_1 + " : " + MEMENTO_1.equals(leonard.getMemory()));
    }
}
