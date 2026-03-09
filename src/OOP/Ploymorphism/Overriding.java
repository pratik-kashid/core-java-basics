package OOP.Ploymorphism;

//Super class
class Human {
    void print() {
        System.out.println("I am a Human..");
    }
}

//Subclass 1
class father extends Human {
    //Method Overriding
    @Override
    void print() {
        System.out.println("I am a Father..");
    }
}

//subclass 2
class Child extends Human {
    //Method Overriding
    @Override
    void print() {
        System.out.println("I am a Son..");
    }
}


public class Overriding {
    static void main() {
        Human h;

        h = new father();
        h.print();

        h = new Child();
        h.print();
    }
}
