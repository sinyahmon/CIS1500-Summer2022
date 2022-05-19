package Lab2;
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your hourly wage: ");
        double userHourlyWage = Double.parseDouble(keyboard.nextLine());
        System.out.println("Please enter your hours worked this week: ");
        int userHoursWorked = Integer.parseInt(keyboard.nextLine());

        double userGrossPay = userHourlyWage * userHoursWorked;
        System.out.println("Your gross pay is: " + userGrossPay);
        double userTaxes = userGrossPay * 0.10;
        System.out.println("Your taxes owed is: " + userTaxes);
        double userNetPay = userGrossPay - userTaxes;
        System.out.println("Your net pay is: " + userNetPay);
    }
}
