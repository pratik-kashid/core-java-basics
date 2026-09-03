package Project;

import java.util.Scanner;

public class numberGuessingGame {
    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100 * Math.random());

        int K = 5;

        System.out.println("A Number chosen between 1 to 100.");
        System.out.println("You have " + K + " attempts to guess the correct Number.");

        for(int i = 0; i < K; i++) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            if(guess == number) {
                System.out.println("Congratulations! You guessed correct number.");
                sc.close();
            }
            else if(guess < number) {
                System.out.println("The number is greater than " + guess);
            }
            else {
                System.out.println("The number is less then " + guess);
            }
        }
        System.out.println("You've exhausted all attempts. the correct number was: " + number);
        sc.close();
    }

    static void main(String[] args) {
        guessingNumberGame();
    }
}
