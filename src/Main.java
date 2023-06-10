import controller.DancerController;
import model.Animal;
import model.Dancer;
import model.Person;
import model.Robot;
import controller.DancerController;

import java.util.ArrayList;

public class Main {
    //ArrayList of objects of type Dancer
    public static ArrayList <Dancer> dancers = new ArrayList<Dancer>();
    public static DancerController controller=new DancerController();;

    public static void main(String[] args) {
        Dancer animal= new Animal(1, "Animal","Dog");
        Dancer person= new Person(2,"Person",'F');
        Dancer robot= new Robot(3,"Robot","MF_241");

        dancers.add(animal);
        dancers.add(person);
        dancers.add(robot);

        //Execute danceDemostration()
        for (Dancer dancer:dancers) {
            System.out.println("The dancer number " + dancer.getNumber()+" is: "+dancer.getType()+".");
            controller.danceDemostration(dancer);
        }
    }
}

