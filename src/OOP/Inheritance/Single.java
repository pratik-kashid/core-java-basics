package OOP.Inheritance;

//Super class
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle..");
    }
}

//Subclass
class Car extends Vehicle {
    Car() {
        System.out.println("This Vehicle is a Car..");
    }
}

public class Single {
    static void main() {
        Car obj = new Car();
    }
}
