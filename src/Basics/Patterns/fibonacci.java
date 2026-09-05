package Basics.Patterns;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;

        if(n == 0) {
            System.out.print(a);
        }
        else if (n == 1){
            System.out.print(b);
        }
        else {
            for(int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println(c);
        }
    }
}

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55