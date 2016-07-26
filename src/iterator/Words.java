package iterator;

public class Words {
    private String[] words;
    private Iterator iterator = null;

    public Words(String[] words) {
        this.words = words;
        this.iterator = new WordIterator(words);
    }

    public Iterator getIterator() {
        return iterator;
    }
}
