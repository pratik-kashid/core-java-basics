package Methods.CreateMethods;

public class instance {
    // Instance Method
    void printmsg() {
        System.out.print("Hello bro.");
    }

    static void main(String[] args) {
        instance i = new instance();
        i.printmsg();
    }
}
