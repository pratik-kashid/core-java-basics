package OOP.Inheritance;

//Base class 1
class Bike {
    Bike() {
        System.out.println("This is a Bike..");
    }
}

//Base class 2 (for below classes)
class Twowheeler extends Bike{
    Twowheeler() {
        System.out.println("this is a 2 wheeler..");
    }
}

//Derived class
class Boxer extends Twowheeler{
    Boxer() {
        System.out.println("Boxer is a Bike..");
    }
}

public class Multilevel {
    static void main() {
        Boxer obj = new Boxer();
    }
}
