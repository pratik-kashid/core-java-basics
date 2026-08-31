package Patterns;

public class lcm {
    public static void main(String[] args) {
        int ans = 1;
        int a = 10, b = 15;
        for(int i = a; i <= a * b; i = i + a) {
            if(i % b == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
