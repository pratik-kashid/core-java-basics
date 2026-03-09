package OOP.Abstraction;

import java.io.*;

//Interface
interface Vehicle {
    //Abstract Methods
    void changeGear(int a);
    void speedUp(int a);
    void applyBreaks(int a);
}

//Class implementing Vehicle interface
class Bicycle implements Vehicle {

    int speed;
    int Gear;

    //Change gear
    @Override
    public void changeGear(int newGear) {
        Gear = newGear;
    }

    //Increase Speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    //Decrease Speed
    @Override
    public void applyBreaks(int decrement) {
        speed = speed - decrement;
    }

    //method for print
    public void printStates() {
        System.out.println("Speed: "+speed+" Gear: "+Gear);
    }

}

//class implementing Vehicle interface
class Bike implements Vehicle {
    int speed;
    int Gear;

    //change Gear
    @Override
    public void changeGear(int newGear) {
        Gear = newGear;
    }

    //increase Speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    //decrement Speed
    @Override
    public void applyBreaks(int decrement) {
        speed = speed - decrement;
    }

    //method for print
    public void printStates() {
        System.out.println("Speed: "+speed+" Gear: "+Gear);
    }
}

public class interfaceExample {
    static void main() {
        Bicycle b = new Bicycle();
        b.changeGear(1);
        b.speedUp(3);
        b.applyBreaks(1);

        System.out.println("Bicycle present state: ");
        b.printStates();

        //instance of Bike
        Bike b1 = new Bike();
        b1.changeGear(1);
        b1.speedUp(4);
        b1.applyBreaks(1);

        System.out.println("Bike present states: ");
        b1.printStates();
    }
}
