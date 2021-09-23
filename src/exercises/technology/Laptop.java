package exercises.technology;

public class Laptop extends Computer {

    private double weight; //weight in pounds

    public Laptop(String name, int ram, int storage, boolean hasKeyboard, boolean hasCamera) {
        super(name, ram, storage, hasKeyboard, hasCamera);
        this.weight = weight;
    }

    public boolean isClunky() {
        if (weight > 5.0) {
            return true;
        } else {
            return false;
        }
    }

}
