package OOP.Abstraction;

//Interface
interface testInterface {
    final int a = 10;

    //Public and abstract
    void display();
}

class testClass implements testInterface {
    @Override
    public void display() {
        System.out.println("Hello Pratik..");
    }
}

public class Interface {
    static void main() {
        testClass t = new testClass();
        t.display();
        System.out.println(t.a);
    }
}
