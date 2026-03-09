package OOP.Inheritance.Super;

//Parent class
class Vehicle {
    int maxSpeed = 120;
}

//Child class
class Car extends Vehicle {
    int maxSpeed = 100;

    void display() {
        //using super keyword print maxSpeed of Vehicle
        System.out.println(super.maxSpeed);
    }
}

public class SuperVar {
    static void main() {
        Car obj = new Car();
        obj.display();
    }
}
