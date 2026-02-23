package Operator;

public class Inatanceof {

    static void main() {

        String str = "Geeks";

        System.out.println(str instanceof String);

        Object o = new Integer(10);

        System.out.println(o instanceof Integer);
        System.out.println(o instanceof String);
    }
}
