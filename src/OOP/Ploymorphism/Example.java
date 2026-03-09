package OOP.Ploymorphism;

//Parent class
class Person {
    void role() {
        System.out.println("I am a person..");
    }
}

//Child class
class Father extends Person {
    //Method Overriding
    @Override
    void role() {
        System.out.println("I am a Father..");
    }
}
public class Example {
    static void main() {

        // Creating a reference of type Person
        // but initializing it with Father class object

        Person p = new Father();

        p.role();
    }
}
