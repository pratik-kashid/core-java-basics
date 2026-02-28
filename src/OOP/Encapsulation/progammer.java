package OOP.Encapsulation;

//Encapsulation

class Person {
    //Private data
    private String name;
    private int age;

    //getter method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class progammer {
    static void main() {
        Person person = new Person();
        person.setName("Pratik");
        person.setAge(20);

        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.getAge());
    }
}
