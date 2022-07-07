package Midterm;
import java.util.Scanner;
public class Midterm {
    public static void main(String[] args) {
        /*
        Write a java program that asks the user to enter the total amount of money they have to spend,
        then in a loop, ask them to enter the price of an item they are buying.  If they have enough money to
        spend, tell them they bought the item and display the new balance of money they have left to spend.
        If they do not have enough money to spend, tell them they can't buy that item,
        and display the remaining total amount of money they have to spend.
        Allow them to continue purchasing items until they want to be done.
        */
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is the total amount of money you have to spend? :");
    Double totalAmt = Double.parseDouble(keyboard.nextLine());

    String continueLoop = "y";

    while (continueLoop.equalsIgnoreCase("y")) {
        System.out.println("What is the price of the item you are buying? :");
        double priceOfItem = Double.parseDouble(keyboard.nextLine());

        if (priceOfItem < totalAmt) {
            totalAmt = totalAmt - priceOfItem;
            System.out.println("Your new balance is: " + totalAmt);
        } else if (priceOfItem > totalAmt) {
            System.out.println("You don't have enough money to buy that item.");
            System.out.println("Your balance is: " + totalAmt);
        } else {
            System.out.println("Your balance is: " + totalAmt);
            System.out.println("You have no money.");
        }

        System.out.println("Would you like to continue? (Y/N): ");
        continueLoop = keyboard.nextLine();
        if (continueLoop.equalsIgnoreCase("n")) {
            System.out.println("Thank you for your business!");
        }
    }
}
}
