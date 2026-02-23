package Constructors;

public class parameterizedC {

    // Class fields
    String name;
    String id;
    String Mo;

    // Parameterized Constructor
    parameterizedC(String name, String id, String Mo) {

        this.name = name;
        this.id = id;
        this.Mo = Mo;
    }

    // For print something
    void display() {

        System.out.println("Helo, "+name+" Welcome !!");
        System.out.println("Your ID: "+id);
        System.out.println("Registered Mobile No: +91 "+Mo);
    }

    static void main() {

        //Create Object
        parameterizedC p = new parameterizedC("Pratik", "PK7765", "7499485754");

        p.display();
    }
}
