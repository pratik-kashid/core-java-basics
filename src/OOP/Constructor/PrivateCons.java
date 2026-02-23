package OOP.Constructor;

public class PrivateCons {

    // private Constructor
    private PrivateCons() {
        System.out.println("This is Private Constructor !!");
    }

    // For display message
    public static void display() {

        System.out.println("Hello Coder !!");
    }
}

class Main {

    static void main() {
        /*
        PrivateCons p = new PrivateCons();
        p.display();
         */

        PrivateCons.display();
    }
}