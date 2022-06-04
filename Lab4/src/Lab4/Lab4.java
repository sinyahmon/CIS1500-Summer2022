package Lab4;
import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        /*
        For this week's lab, please write a java program that allows the user to play Rock Paper Scissors Lizard Spock against the computer.
        https://en.wikipedia.org/wiki/Rock_paper_scissors#Additional_weapons
        Ask the player to enter a choice, and use a validation loop to ensure they picked a valid choice
        Use Math.random to generate a random number 1-5 and assign it to one of the choices
        display the results, win, lose, or draw, and ask the player if they want to play again.  loop the entire program if they want to play again.
        Please post your java code by Saturday 11:59pm June 4th
        Reply to a classmate comparing and contrasting your solution and theirs, what did you like about their solution, what did you think your program did better?  Did they use good variable names and is their code readable?
        Please have your reply in by Tuesday 11:59pm June 7th
        */
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors Lizard Spock!");

        String continueloop = "";
        while ( !continueloop.equalsIgnoreCase("n")) {
            System.out.println("Your Options are: 1-Rock, 2-Paper, 3-Scissors, 4-Lizard, 5-Spock");
            System.out.println("Please enter numbers 1-5 as your choice: ");
            String userChoice = keyboard.nextLine();

            int randomValue = (int)(Math.random() * 5 + 1);
            System.out.println("Computer throws " + randomValue);

            if (userChoice.equalsIgnoreCase("1") && randomValue == 2) {
                System.out.println("Computer wins!");
            } else if (userChoice.equalsIgnoreCase("1") && randomValue == 3) {
                System.out.println("You win!");
            } else if (userChoice.equalsIgnoreCase("1") && randomValue == 1) {
                System.out.println("It's a draw!");
            } else if (userChoice.equalsIgnoreCase("1") && randomValue == 4) {
                System.out.println("You win!");
            } else if (userChoice.equalsIgnoreCase("1") && randomValue == 5) {
                System.out.println("Computer wins!");
            } else if (userChoice.equalsIgnoreCase("2") && randomValue == 1) {
                System.out.println("You win!");
            } else if (userChoice.equalsIgnoreCase("2") && randomValue == 2) {
                System.out.println("It's a draw!");
            } else if (userChoice.equalsIgnoreCase("2") && randomValue == 3) {
                System.out.println("Computer wins!");
            } else if (userChoice.equalsIgnoreCase("2") && randomValue == 4) {
                System.out.println("Computer wins!");
            } else if (userChoice.equalsIgnoreCase("2") && randomValue == 5) {
                System.out.println("You win!");
            } else if (userChoice.equalsIgnoreCase("3") && randomValue == 1) {
                System.out.println("Computer wins!");
            } else if (userChoice.equalsIgnoreCase("3") && randomValue == 2) {
                System.out.println("You win!");
            } else if (userChoice.equalsIgnoreCase("3") && randomValue == 3) {
                System.out.println("It's a draw!");
            } else if (userChoice.equalsIgnoreCase("3") && randomValue == 4) {
                System.out.println("You win!");
            } else if (userChoice.equalsIgnoreCase("3") && randomValue == 5) {
                System.out.println("Computer wins!");
            }

            System.out.println("would you like to continue? (Y/N): ");
            continueloop = keyboard.nextLine();
        }
    }
}
