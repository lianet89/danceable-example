package controller;

import model.Animal;
import model.Dancer;
import model.Person;
import model.Robot;

public class DancerController {
    public DancerController() {
    }
    public void danceDemostration(Dancer dancer) {
        if (dancer.getType().equalsIgnoreCase("Animal")) {
            System.out.println("His race is: " + ((Animal) dancer).getRace() + ".");
            ((Animal) dancer).dance();
            ((Animal) dancer).greet();
        } else if (dancer.getType().equalsIgnoreCase("Person")) {
            System.out.println("Her gender es: " + ((Person) dancer).getGender() + ".");
            ((Person) dancer).dance();
            ((Person) dancer).greet();
        } else if (dancer.getType().equalsIgnoreCase("Robot")) {
            System.out.println("His model is: " + ((Robot) dancer).getModel() + ".");
            ((Robot) dancer).dance();
            ((Robot) dancer).greet();
        }
        dancer.finishDance();
        System.out.println("\n");
    }
}
