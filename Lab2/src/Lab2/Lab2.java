package Lab2;

public class Lab2 {
    public static void main(String[] args) {
        double userHourlyWage = 20.00;
        int userHoursWorked = 40;

        double userGrossPay = userHourlyWage * userHoursWorked;
        System.out.println(userGrossPay);
        double userTaxes = userGrossPay * 0.10;
        System.out.println(userTaxes);
        double userNetPay = userGrossPay - userTaxes;
        System.out.println(userNetPay);
    }
}
