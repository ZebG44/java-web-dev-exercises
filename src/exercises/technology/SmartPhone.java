package exercises.technology;

public class SmartPhone extends Computer {
    private int phoneNumber = 8675309;
    private int numberOfSelfies;

    public SmartPhone(String name, int ram, int storage, boolean hasKeyboard, boolean hasCamera) {
        super(name, ram, storage, hasKeyboard, hasCamera);
        this.phoneNumber = phoneNumber;
        this.numberOfSelfies = numberOfSelfies;
    }

    public void takeSelfie() {
    this.numberOfSelfies = this.numberOfSelfies + 1;
    }

    public int getNumberOfSelfies() {
        return this.numberOfSelfies;
    }
}