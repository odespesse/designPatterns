package iterator;

public class Main {
    public static void main(String[] argv) {
        Words words = new Words(new String[]{"Hello", "World", "!", ":-)"});
        Iterator itw = words.getIterator();
        while(itw.hasNext()) {
            String word = (String)itw.next();
            System.out.println(word);
        }
    }
}
