package StaticKey;

class Student {

    int rollno;
    String name;

    //static variable
    static String training_center = "GFG";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(name+" "+rollno+" "+training_center);
    }
}

public class StaticVariable {
    static void main() {
        Student s1 = new Student(101,"Pratik");
        Student s2 = new Student(102,"Robert");

        s1.display();
        s2.display();
    }
}
