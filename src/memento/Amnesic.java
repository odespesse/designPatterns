package memento;

public class Amnesic {

    private String memory;

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Tattoo createTattoo() {
        return new Tattoo(this.memory);
    }

    public void remember(Tattoo restore) {
        this.memory = restore.getMemorySaved();
    }
}
