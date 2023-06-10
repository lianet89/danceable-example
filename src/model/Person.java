package model;

public class Person extends Dancer {
    private char gender;

    public Person(int number, String type, char gender) {
        super(number, type);
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public void dance() {
        System.out.println("Perform the dance, moving the waist and shoulders (Subclass Person).");
    }

    @Override
    public void greet() {
        System.out.println("Perform the greet, making a bowing (Subclass Person).");
    }
}
