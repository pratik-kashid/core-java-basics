package DecisionMaking;

public class NestedIf {
    static void main() {

        int n = 10;

        if(n < 15) {

            System.out.println(n+" is smaller than 10");

            if(n == 10) {
                System.out.println(n+" is exactly 10");
            }
        }
    }
}
