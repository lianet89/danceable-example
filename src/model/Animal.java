package model;

public class Animal extends Dancer {
    private String race;

    public Animal(int number, String type, String race) {
        super(number, type);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void dance() {
        System.out.println("Perform the dance, standing on two legs (Subclass Animal).");
    }

    @Override
    public void greet() {
        System.out.println("Perform the greet, making a sound (Subclass Animal).");
    }
}
