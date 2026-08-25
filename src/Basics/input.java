package Basics;

import java.util.Scanner; // Import Scanner class

public class input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Standard input

        System.out.print("Enter a Number: ");
        int a = sc.nextInt(); // Reading Integer value

        System.out.print("Enter a Number: ");
        int b = sc.nextInt(); // Reading Integer value

        System.out.print("Addition of " + a + " and " + b + " is " + (a + b));
    }
}
