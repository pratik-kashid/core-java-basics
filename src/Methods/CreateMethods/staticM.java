package Methods.CreateMethods;

public class staticM {

    // Static variable
    static int a = 30;

    // Instance variable
    int b = 20;

    void simpleDisplay() {
        System.out.println(a);
        System.out.println(b);
    }

    // Declaration of static Display
    static void staticDisplay() {
        System.out.println(a);
    }

    // Main method
    static void main(String[] args) {
        staticM sm = new staticM();
        sm.simpleDisplay();

        // Calling static method
        staticDisplay();
    }
}
