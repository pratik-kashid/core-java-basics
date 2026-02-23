package Constructors;

public class ThisKey {

    // Class Fields
    String name;
    int age;

    // Parameterized Constructor
    ThisKey(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String get_name() {

        return name;
    }

    // This Keyword
    public void change_name(String name) {

        this.name = name;
    }

    public void printDetails() {
        System.out.println("name: "+name);
        System.out.println("Age: "+age);
        System.out.println();
    }

    static void main() {
        ThisKey t1 = new ThisKey("Pratik", 21);
        ThisKey t2 = new ThisKey("ABc", 19);

        t1.printDetails();
        t2.printDetails();

        t1.change_name("ABC");
        t2.change_name("Pratik");
        System.out.println("Name as been changed to "+t1.get_name());

        t1.printDetails();
        t2.printDetails();
    }
}
