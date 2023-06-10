package model;

public abstract class Dancer implements DancerInterface{
    protected int number;
    protected String type;

    public Dancer(){
    }

    public Dancer(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void dance(){
        System.out.println("I am a Dancer! (Super class).");
    }

    public void greet(){
        System.out.println("I am a dancer waving! (Super class).");
    }

    public void finishDance(){
        System.out.println("The dancer is saying goodbye! (Superclass Method).");
    }

}
