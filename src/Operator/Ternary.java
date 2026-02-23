package Operator;

public class Ternary {
    static void main() {

        int a = 10, b = 20, c = 23, result;

        result = ((a > b) ? (a > c) ? a : c: (b > c) ? b : c);

        System.out.println("Greater no.: "+result);
    }
}
