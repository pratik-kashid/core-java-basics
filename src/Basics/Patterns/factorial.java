package Basics.Patterns;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int ans = 1;

        for(int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        System.out.println("Factorial of " + n + " is " + ans);
    }
}
