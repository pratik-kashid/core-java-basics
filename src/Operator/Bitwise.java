package Operator;

public class Bitwise {
    static void main() {

        int a = 001010, b = 010101;

        System.out.println("a & b: "+(a & b));
        System.out.println("a | b: "+(a | b));
        System.out.println("a ^ b: "+(a ^ b));
        System.out.println("~b: "+(~b));
        System.out.println("a << 2: "+(a << b));
        System.out.println("a >> 2: "+(a >> b));
        System.out.println("a >>> 2: "+(a >>> b));
    }
}
