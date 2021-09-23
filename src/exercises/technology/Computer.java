package exercises.technology;

public class Computer extends AbstractEntity {
    private String name;
    private int ram;
    private int storage;
    private boolean hasKeyboard;
    private boolean hasCamera;

    public Computer(String name, int ram, int storage, boolean hasKeyboard, boolean hasCamera) {
    this.name = name;
    this.ram = ram;
    this.storage = storage;
    this.hasKeyboard = hasKeyboard;
    this.hasCamera = hasCamera;
    }

    public void increaseRam(int n) {
    this.ram += n;
    }

    public void increaseStorage(int x) {
        this.storage += x;
    }
}
