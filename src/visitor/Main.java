package visitor;

public class Main {

    public static void main(String[] args) {
        Store[] stores = new Store[] {
                new CandyStore("gum"),
                new FishStore("octopus"),
                new CandyStore("licorice"),
                new FishStore("salmon"),
        };

        Visitor child = new ChildVisitor();
        for (Store store : stores) {
            store.accept(child);
        }
        Visitor adult = new AdultVisitor();
        for (Store store : stores) {
            store.accept(adult);
        }
    }
}
