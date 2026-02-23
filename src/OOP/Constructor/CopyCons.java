package OOP.Constructor;

public class CopyCons {

    // Data members of the class
    String name;
    int id;

    // Parameterized Constructor
    CopyCons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    CopyCons(CopyCons obj) {
        this.name = obj.name;
        this.id = obj.id;
    }

    // for output
    void display() {

        System.out.println("Name: "+name+"\nId: "+id);
        System.out.println();
    }

    // Main method
    static void main() {

        // This Object for parameterized Constructor
        System.out.println("Parameterized Constructor !!");
        CopyCons c1 = new CopyCons("Pratik", 20);
        c1.display();

        // This for Copy Constructor
        System.out.println("Copy Constructor");
        CopyCons c2 = new CopyCons(c1);
        c2.display();

    }
}
