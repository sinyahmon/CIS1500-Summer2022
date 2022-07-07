package Midterm;

public class MidtermQ2 {
    /*
    Write a method sumOfNumbersUpToNExceptMultiplesOfX(int n, int x)
    that returns the sum of all numbers 1-n including n, except if the value is a
    multiple of x ( evenly divisible by x )
    */
    public static void main(String[] args) {
        System.out.println(sumOfNumbersUpToNExceptMultiplesOfX(4,23));
    }
    public static int sumOfNumbersUpToNExceptMultiplesOfX(int n, int x) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int m = i * n;
            if (m % n == 0) {
                sum = sum + m;
                System.out.println("sum right now is: " + sum);
            }
        }
        return sum;
    }
}
