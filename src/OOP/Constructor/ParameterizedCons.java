package OOP.Constructor;

public class ParameterizedCons {

    // Data members of a class
    String name;
    int age;

    // Parameterized Constructor
    ParameterizedCons(String name, int age) {
        this.name= name;
        this.age = age;
    }

    // Display output
    void display() {
        System.out.println("Name: "+name+"\nAge: "+age);
    }

    static void main() {
        ParameterizedCons pc = new ParameterizedCons("Pratik", 20);
        pc.display();
    }
}
