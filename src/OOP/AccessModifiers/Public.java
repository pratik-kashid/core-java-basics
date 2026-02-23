package OOP.AccessModifiers;

class mathAdd {

    public static int add(int a, int b) {
        return a + b;
    }
}
public class Public {
    static void main() {
        System.out.println(mathAdd.add(10,5));
    }
}
