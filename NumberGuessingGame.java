import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        int k = 3;
        int i;

        System.out.println("Guess the number between 1 to 100.");
        System.out.println("You have " + k + " trials");

        for (i = 0; i < k; i++) {
            System.out.print("Guess the number: ");
            int guessNum = sc.nextInt();

            if (randNum == guessNum) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            } else if (randNum > guessNum && i != k - 1) {
                System.out.println("The number is greater than " + guessNum + " Guess the greater number..");
            } else if (randNum < guessNum && i != k - 1) {
                System.out.println("The number is less than " + guessNum + " Guess the smaller number.");
            }
        }

        if (i == k) {
            System.out.println("\nYou have exhausted " + k + " trials.");
            System.out.println("The number was " + randNum );
        }
    }
}
