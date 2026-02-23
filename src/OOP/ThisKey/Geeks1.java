package OOP.ThisKey;

public class Geeks1 {

    int a;
    int b;

    // To Invoke Current Class Constructor
    Geeks1() {
        this(10, 20);
        System.out.println("Inside Default Constructor");
    }

    Geeks1(int a, int b) {
        this.a = a;
        this.b = b;

        System.out.println("Inside parameterized Constructor");
    }

    static void main() {
        Geeks1 g1 = new Geeks1();
    }
}
