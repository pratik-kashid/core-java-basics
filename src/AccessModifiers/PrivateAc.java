package AccessModifiers;

class Person {
    //private variable
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class PrivateAc {
    static void main() {
        Person p = new Person();
        p.setName("Pratik");

        System.out.println(p.getName());
    }
}