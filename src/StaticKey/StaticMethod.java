package StaticKey;

class Person {
    String name;
    int age;

    //static variable
    static String type = "human";

    public void show() {
        System.out.println(name+" "+age+" "+type);
    }

    //static method
    public static void show1(Person p) {
        System.out.println(p.name+" "+p.age+" "+type);
    }
}

public class StaticMethod {
    static void main() {
        Person p = new Person();
        p.name = "Prtaik";
        p.age = 19;

        Person p1 = new Person();
        p1.name = "Robert";
        p1.age = 20;

        p.show();
        p1.show();

        Person.show1(p);
    }
}
