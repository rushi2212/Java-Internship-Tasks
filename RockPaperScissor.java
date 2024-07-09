import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("Enter your choise= ");
        Scanner sc = new Scanner(System.in);
        String you = sc.nextLine();

        Random rand = new Random();
        int randNo = rand.nextInt(3);
        String comp = "";
        
        if (randNo == 0) {
            comp = "Rock";
        } else if (randNo == 1) {
            comp = "Paper";
        } else if (randNo == 2) {
            comp = "Scissor";
        }

        if (you.equalsIgnoreCase(comp)) {
            System.out.println("No one Wins!");
        } 
        else if (you.equalsIgnoreCase("Rock") && comp.equals("Scissor")) {
            System.out.println("You Win!");
        } 
        else if (you.equalsIgnoreCase("Scissor") && comp.equals("Paper")) {
            System.out.println("You Win!");
        } 
        else if (you.equalsIgnoreCase("Paper") && comp.equals("Rock")) {
            System.out.println("You Win!");
        } 
        else {
            System.out.println("You Lose!");
        }

        System.out.println("Your Choice= " + you);
        System.out.println("Computer Choise= " + comp);
    }
}
