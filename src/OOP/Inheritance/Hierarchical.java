package OOP.Inheritance;

//Base class
class Vehicle1 {
    Vehicle1() {
        System.out.println("This is a Vehicle..");
    }
}

//Derived Class
class Car1 extends Vehicle1{
    Car1() {
        System.out.println("This vehicle is a car..");
    }
}

//Derived class
class Bus extends Vehicle1{
    Bus() {
        System.out.println("This vehicle is a Bus..");
    }
}

public class Hierarchical {
    static void main() {
        Car1 obj1 = new Car1();
        Bus obj2 = new Bus();
    }
}
