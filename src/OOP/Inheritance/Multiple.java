package OOP.Inheritance;

//Interface 1  (Parent class)
interface LandVehicle {
    default void landInfo() {
        System.out.println("this is a land vehicle..");
    }
}

//Interface 2 (Parent class)
interface WaterVehicle {
    default void waterInfo() {
        System.out.println("This is a water vehicle..");
    }
}

//Subclass (Child class) implementing both interfaces
class AmphibiousVehicle implements LandVehicle, WaterVehicle {
    AmphibiousVehicle() {
        System.out.println("This is an Amphibious..");
    }
}

public class Multiple {
    static void main() {
        AmphibiousVehicle obj = new AmphibiousVehicle();
        obj.landInfo();
        obj.waterInfo();
    }
}
