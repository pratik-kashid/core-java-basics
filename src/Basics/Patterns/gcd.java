package Basics.Patterns;

public class gcd {
    public static void main(String[] args) {
        int a = 20, b = 28;
        int ans = 1;
        int x = Math.min(a, b);

        for(int i = 1; i <= x; i++) {
            if(a % i == 0 && b % i == 0) {
                ans = i;
            }
        }

        System.out.println("GCD(Gratest Common Divisor): " + ans);
    }
}
