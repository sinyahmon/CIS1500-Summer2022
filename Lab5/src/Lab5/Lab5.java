package Lab5;
import java.util.Scanner;
public class Lab5 {
    public static void main(String[] args) {
        String userSelection = userChoiceForRockPaperScissors();
        int computerSelection = computerChoiceForRockPaperScissors();
        outputForRockPaperScissors(userSelection, computerSelection);
    }
    public static String userChoiceForRockPaperScissors() {
        System.out.println("Let's Play Rock Paper Scissors!");
        System.out.println("Number 1 is Rock. Number 2 is Paper. Number 3 is Scissors.");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter number's 1-3 as your choice:");
        String userChoice = keyboard.nextLine();
        return userChoice;
    }
    public static int computerChoiceForRockPaperScissors() {
        int randomValue = (int)(Math.random() * 3 + 1);
        return randomValue;
    }
    public static void outputForRockPaperScissors(String userChoice, int randomValue) {
        String computerWins = "Computer Wins!";
        String youWin = "You Win!";
        String draw = "It's a Draw!";

        System.out.println("Computer Selected: " + randomValue);

        if (userChoice.equals("1") && randomValue == 1) {
            System.out.println(draw);
        } else if (userChoice.equals("1") && randomValue == 2) {
            System.out.println(computerWins);
        } else if (userChoice.equals("1") && randomValue == 3) {
            System.out.println(youWin);
        } else if (userChoice.equals("2") && randomValue == 1) {
            System.out.println(youWin);
        } else if (userChoice.equals("2") && randomValue == 2) {
            System.out.println(draw);
        } else if (userChoice.equals("2") && randomValue == 3) {
            System.out.println(computerWins);
        } else if (userChoice.equals("3") && randomValue == 1) {
            System.out.println(computerWins);
        } else if (userChoice.equals("3") && randomValue == 2) {
            System.out.println(youWin);
        } else if (userChoice.equals("3") && randomValue == 3) {
            System.out.println(draw);
        } else {
            System.out.println("Error. Not accounted for.");
        }
    }
}
