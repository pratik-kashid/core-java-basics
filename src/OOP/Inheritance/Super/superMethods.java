package OOP.Inheritance.Super;

//Parent class
class Person {
    void Message() {
        System.out.println("This is Parent class...");
    }
}

//Child class
class Student extends Person {
    void Message() {
        System.out.println("This is Child class...");
    }

    //Display method only in Student class
    void Display() {

        //call current class message
        Message();

        //call parent class message()
        super.Message();
    }
}

public class superMethods {
    static void main() {
        Student obj = new Student();
        obj.Display();
    }
}
