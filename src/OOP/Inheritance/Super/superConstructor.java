package OOP.Inheritance.Super;

//Parent class
class Human {
    Human() {
        System.out.println("Person class constructor...");
    }
}

//Child class
class Boy extends Human {
    Boy() {

        //Call parent class constructor
        super();

        System.out.println("Boy class constructor...");
    }
}
public class superConstructor {
    static void main() {
        Boy obj = new Boy();
    }
}
