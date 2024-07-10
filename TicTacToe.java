import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] array = new String[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                array[i][j] = "-";
            }
        }

        
        for(int p=0;p<4;p++){
            Scanner sc = new Scanner(System.in);
            Boolean Win = false;
            System.out.println("Player 1 Turn! Your sign is O.");
            System.out.println("Enter the row no=");
            int row1 = sc.nextInt();
            System.out.println("Enter the col no=");
            int col1 = sc.nextInt();
            array[row1][col1] = "O";

            System.out.println("*********************");
            for (int k = 0; k <= 2; k++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print(array[k][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("*********************");


            System.out.println("Player 2 Turn! Your sign is *.");
            System.out.println("Enter the row no=");
            int row2 = sc.nextInt();
            System.out.println("Enter the col no=");
            int col2 = sc.nextInt();
            array[row2][col2] = "*";

            System.out.println("*********************");
            for (int k = 0; k <= 2; k++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print(array[k][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("*********************");

            // Check rows
            for (int i = 0; i < 3; i++) {
                if (array[i][0].equals("O") && array[i][1].equals("O") && array[i][2].equals("O")) {
                    System.out.println("Player 1 wins!");
                    Win = true;
                }
            }

            // Check columns
            for (int i = 0; i < 3; i++) {
                if (array[0][i].equals("O") && array[1][i].equals("O") && array[2][i].equals("O")) {
                    System.out.println("Player 1 wins!");
                    Win = true;
                }
            }

            // Check diagonals
            if (array[0][0].equals("O") && array[1][1].equals("O") && array[2][2].equals("O")) {
                System.out.println("Player 1 wins!");
                Win = true;
            }
            if (array[0][2].equals("O") && array[1][1].equals("O") && array[2][0].equals("O")) {
                System.out.println("Player 1 wins!");
                Win = true;
            }
            // Check rows
            for (int i = 0; i < 3; i++) {
                if (array[i][0].equals("*") && array[i][1].equals("*") && array[i][2].equals("*")) {
                    System.out.println("Player 2 wins!");
                    Win = true;
                }
            }

            // Check columns
            for (int i = 0; i < 3; i++) {
                if (array[0][i].equals("*") && array[1][i].equals("*") && array[2][i].equals("*")) {
                    System.out.println("Player 2 wins!");
                    Win = true;
                }
            }

            // Check diagonals
            if (array[0][0].equals("*") && array[1][1].equals("*") && array[2][2].equals("*")) {
                System.out.println("Player 2 wins!");
                Win = true;
            }
            if (array[0][2].equals("*") && array[1][1].equals("*") && array[2][0].equals("*")) {
                System.out.println("Player 2 wins!");
                Win = true;
            }

            if (Win==true) {
                System.out.println("Congratulations!");
            } else {
                System.out.println("No one Wins!");
            }

            if(Win==true){
                break;
            }
        } 
    }
}
