package OOP.ThisKey;

public class Geeks {

    String name;
    int age;

    // To Refer Current Class Instance Variables
    Geeks(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: "+name+"\nAge: "+age);
    }

    static void main() {
        Geeks g = new Geeks("Ram",22);
        g.display();
    }
}
