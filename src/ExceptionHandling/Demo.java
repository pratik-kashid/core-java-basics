package ExceptionHandling;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String m) {
        super(m);
    }
}

public class Demo {
    public static void Validate(int age) throws InvalidAgeException{
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("valid Age: "+age);
    }

    static void main() {
        try {
            Validate(15);
        }catch (InvalidAgeException e) {
            System.out.println("Caught Exception: "+e.getMessage());
        }
    }
}
