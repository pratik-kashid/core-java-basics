package Constructors;

public class CopyC {

    String name;
    String id;
    String Mo;

    // Parameterized Constructor
    CopyC(String name, String id, String Mo) {

        this.name = name;
        this.id = id;
        this.Mo = Mo;
    }

    // Copy Constructor
    CopyC(CopyC obj) {

        this.name = obj.name;
        this.id = obj.id;
        this.Mo = obj.Mo;
    }

    // For print something
    void display() {

        System.out.println("Helo, "+name+" Welcome !!");
        System.out.println("Your ID: "+id);
        System.out.println("Registered Mobile No: +91 "+Mo);
        System.out.println();
    }

    static void main() {

        // Create Object
        CopyC c = new CopyC("Pratik", "Pk8887", "7599475652");
        c.display();

        //another object for copied Constructor
        CopyC c2 = new CopyC(c);
        c2.display();
    }
}
