package Lab3;

import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
    /*
    Please have your first post complete by Saturday 5/28 11:59pm and your reply to a classmate in by Tuesday 5/31 11:59pm.
    For your first post, please post a java program that asks the user to enter 5 values, determines the smallest, largest, average, and standard deviation and displays them.  Please display the values with 3 decimal places of precision.
    ( Hint - to find the smallest and largest values, assume the first value entered is the smallest and largest, then as new values are entered, if they are larger than the current largest or smaller than the current smallest, update the value )
    To find the population standard deviation, take each value and subtract the average from it, then square that result.  Sum together all the squared results and then divide by the number of values ( 5 in this case ), the square root of that sum is the population standard deviation.
    After posting, please reply to a classmates post checking their code for following proper variable naming conventions and leave constructive feedback on anywhere they improperly named a variable.
    */
        Scanner keyboard = new Scanner(System.in);

        double minVal = 0.0;
        double maxVal = 0.0;

        System.out.println("Please enter a number: ");
        double numberOne = Double.parseDouble(keyboard.nextLine());
        System.out.println("Please enter another number: ");
        double numberTwo = Double.parseDouble(keyboard.nextLine());
        System.out.println("And another number: ");
        double numberThree = Double.parseDouble(keyboard.nextLine());
        System.out.println("And another: ");
        double numberFour = Double.parseDouble(keyboard.nextLine());
        System.out.println("Okay, one more time, another number: ");
        double numberFive = Double.parseDouble(keyboard.nextLine());

       minVal = numberOne;
       maxVal = numberOne;

        if (minVal > numberTwo) {
            minVal = numberTwo;
        }
        if (minVal > numberThree) {
            minVal = numberThree;
        }
        if (minVal > numberFour) {
            minVal = numberFour;
        }
        if (minVal > numberFive) {
            minVal = numberFive;
        }

        if (maxVal < numberTwo) {
            maxVal = numberTwo;
        }
        if (maxVal < numberThree) {
            maxVal = numberThree;
        }
        if (maxVal < numberFour) {
            maxVal = numberFour;
        }
        if (maxVal < numberFive) {
            maxVal = numberFive;
        }

        double avgVal = (double)(numberOne + numberTwo + numberThree + numberFour + numberFive) / 5;

        double oneSD = (numberOne - avgVal) * (numberOne - avgVal);
        double twoSD = (numberTwo - avgVal) * (numberTwo - avgVal);
        double threeSD = (numberThree - avgVal) * (numberThree - avgVal);
        double fourSD = (numberFour - avgVal) * (numberFour - avgVal);
        double fiveSD = (numberFive - avgVal) * (numberFive - avgVal);
        double sumSD = (double)(oneSD + twoSD + threeSD + fourSD + fiveSD) / 5;
        double finalSD = Math.sqrt(sumSD);

        System.out.println("Minimum: " + minVal);
        System.out.println("Maximum: " + maxVal);
        System.out.println("Average: " + avgVal);
        System.out.println("Standard Deviation: " + finalSD);
    }
}
