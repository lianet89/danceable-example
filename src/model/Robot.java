package model;

public class Robot extends Dancer{
    private  String model;

    public Robot(int number, String type, String model) {
        super(number, type);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void dance() {
        System.out.println("Perform the dance, moving the arms and legs (Subclass Robot).");
    }

    @Override
    public void greet() {
        System.out.println("Perform the greet, moving a hand (Subclass Robot).");
    }
}
