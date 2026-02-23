package Constructors;

class PrivateC {

    // Private Constructor
    private PrivateC() {

        System.out.println("This is private Constructor !!");
    }

    // Print Hello..
    public static void display() {

        System.out.println("Hello..");
    }
}
class Main {
    public static void main(String[] args) {

        // PrivateConstructor p = new PrivateConstructor();
        // p.display();

        PrivateC.display();
    }
}