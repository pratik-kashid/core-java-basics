package OOP.Inheritance;

//Parent class
class SolarSystem {
    //class body here (fields or methods)
}

//Child class
class Earth extends SolarSystem {
    //class body here (fields or methods)
}

//Child class
class Mars extends SolarSystem {
    //class body here (fields or methods)
}

public class Hybrid extends Earth{
    static void main() {
        SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();

        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof Earth);
        System.out.println(m instanceof SolarSystem);
    }
}
