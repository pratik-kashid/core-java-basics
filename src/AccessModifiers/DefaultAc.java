package AccessModifiers;

class Car {
    //default access modifier
    String model;
}

public class DefaultAc {
    static void main() {
        Car c = new Car();
        c.model = "Tesla";

        System.out.println(c.model);
    }
}
