package ExceptionHandling;

public class tryCatch {
    static void main() {
        int a = 10, b = 0;

        try {
            int n = a / b;
            System.out.println("Answer: "+n);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero !");
        }
    }
}
