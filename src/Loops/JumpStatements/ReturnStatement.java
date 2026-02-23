package Loops.JumpStatements;

public class ReturnStatement {

    public static int add(int num1, int num2) {

        int sum = num1 + num2;

        System.out.println("Addition is: "+sum);
        return sum;
    }

    static void main() {
        int a = add(5, 5);
    }
}
