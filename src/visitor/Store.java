package visitor;

public interface Store {
    void accept(Visitor child);
}
