package OOP.Ploymorphism;

class Calculator {

    // Method 1 for multiplying two integers
    static int Multiply(int a, int b) {
        return a * b;
    }

    // Method 2 for multiplying two double values
    static double Multiply(double a, double b) {
        return a * b;
    }
}

public class Overloading {
    static void main() {

        System.out.println("Multiplication: " +Calculator.Multiply(5, 3));
        System.out.println("Multiplication: " +Calculator.Multiply(5.3, 2.5));

    }
}
