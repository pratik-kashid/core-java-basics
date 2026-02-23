package OOP.AccessModifiers;

class Person {
    private String name;

    // Setter
    public void setname(String name) {
        this.name = name;
    }

    // Getter
    public String getname() {
        return name;
    }
}

public class Private {
    public static void main(String[] args) {
        Person p = new Person();

        p.setname("Pratik");

        System.out.println(p.getname());
    }
}
