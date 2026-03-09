package OOP.Abstraction;

//Abstract class
abstract class TV {
    abstract void turnOn();
    abstract void turnOff();
}

//Subclass
class TvRemote extends TV {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON...");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF...");
    }
}

public class AbstractClass {
    static void main() {
        TV remote = new TvRemote();
        remote.turnOn();
        remote.turnOff();
    }
}
