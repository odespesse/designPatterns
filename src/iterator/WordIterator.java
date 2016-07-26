package iterator;

public class WordIterator implements Iterator {
    private int index = 0;
    private String[] elements;

    public WordIterator(String[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.elements.length;
    }

    @Override
    public Object next() {
        String word = this.elements[this.index];
        this.index++;
        return word;
    }
}
