package OOP.AccessModifiers;

// Default Access Modifier
class Car {
    String model;
}

public class Default {
    static void main() {
        Car c = new Car();
        c.model = "Tesla";
        System.out.println(c.model);
    }
}
