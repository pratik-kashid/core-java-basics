package OOP.ThisKey;

public class Person {
    String name;
    int age;

    // This keyword used to refer current object (instance - local Variable)
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getname () {
        return name;
    }

    // Setter
    public void change_name(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: "+name+"\nAge: "+age);
        System.out.println();
    }

    static void main() {
        Person p = new Person("Rahul",19);
        p.display();

        p.change_name("Robert");
        p.display();
    }
}
