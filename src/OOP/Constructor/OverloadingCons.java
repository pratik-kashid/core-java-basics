package OOP.Constructor;

public class OverloadingCons {

    // Constructor with one argument
    OverloadingCons(String name) {
        System.out.println("Name: "+name);
    }

    // Constructor with two arguments
    OverloadingCons(String name, int age) {
        System.out.println("Name: "+name+"\nAge: "+age);
    }

    // Constructor with different type
    OverloadingCons(long id) {
        System.out.println("ID: "+id);
    }

    static void main() {
        OverloadingCons oc = new OverloadingCons("Pratik");

        OverloadingCons oc1 = new OverloadingCons("Pratik", 20);

        OverloadingCons oc2 = new OverloadingCons(12345);
    }
}
