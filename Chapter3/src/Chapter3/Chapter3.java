package Chapter3;

import java.text.NumberFormat;

public class Chapter3 {
    public static void main(String[] args) {
        byte smallNumberMin = -128;
        byte smallNumberMax = 127;

        short twoByteNumberMin = -32_768;
        short twoByteNumberMax = 32_767;

        // 4 bytes
        int normalNumberMin = -2_147_483_648;
        int normalNumberMax = 2_147_483_647;

        // 8 bytes
        long bigWholeNumberMin = -9_223_372_036_854_775_808L;
        long bigWholeNumberMax = 9_223_372_036_854_775_807L;

        float fourByteNumberWithDecimalMin = Float.MIN_VALUE;
        float fourByteNumberWithDecimalMax = Float.MAX_VALUE;

        System.out.println(fourByteNumberWithDecimalMin);
        System.out.println(fourByteNumberWithDecimalMax);

        // to tell java a number with a decimal is a float, use 'f'
        float someNumberWithDecimal = .123f;

        // 8 bytes to store each double value
        double bigNumberWithDecimals = .123;

        // apostrophe or single quote
        char singleCharacterA = 'A';
        char singleCharacterAWithNumber = 65;

        System.out.println(singleCharacterAWithNumber);
        System.out.println(singleCharacterA);

        char capitalE = 69;
        char capitalR = 82;
        char capitalI = 73;
        char capitalC = 67;

        System.out.println(capitalE + "" + capitalR + "" +capitalI + "" +capitalC);

        boolean trueOrFalseValue = true;
        boolean thisIsFalse = false;

        // declare a value
        double myNumber;

        // assigning a value - AKA initializing
        myNumber = 42.0;

        // legal, but makes Eric sad
        int myFirstNumber, mySecondNumber, myThirdNumber;

        // again, still legal, still sad
        double firstDouble = 1.2, secondDouble = 2.4, thirdDouble = 3.6;

        // it doesn't work like you might think
        //int anotherNumber, moreNumbers, lastNumber = 10;

        //System.out.println(anotherNumber);
        //System.out.println(moreNumbers);
        //System.out.println(lastNumber);

        // final means you can set the value once and only once
        final double SALES_TAX_RATE = .06;

        // prevents you from changing it
        // SALES_TAX_RATE = .7;

        // don't change the sales tax rate
        //salesTaxRate = .7;

        double result = 9 / 3 * 3 + 2;

        // integer division - int divided an int, results in an int
        double quotient = 5 / 2; // you'd expect 2.5 - but you get 2
        int remainder = 5 % 2; // modulus - remainder
        System.out.println("5/2 == " + quotient + " remainder: " + remainder);

        // to get a double result, at least one of the operands needs to be a double
        double betterQuotient = 5.0 / 2;
        System.out.println("5.0/2 == " + betterQuotient);

        int myFavoriteNumber = 42;
        myFavoriteNumber = myFavoriteNumber + 10;
        myFavoriteNumber += 10; // combined assignment operator

        myFavoriteNumber += 1;
        myFavoriteNumber++; // increment operator

        myFavoriteNumber -= 1;
        myFavoriteNumber--; // decrement operator

        // implicit casting
        double myDoubleNumber = 7;

        // a smaller type will implicitly cast into the larger type
        // byte->short->int->long->float->double

        // explicit casting is telling java please convert
        int myIntegerValue = (int)4.2;

        double decimalResult = (double)myIntegerValue / myFavoriteNumber;

        System.out.println(decimalResult);

        int value = Integer.parseInt("42");

        int roundedValue = (int)Math.round(4.2);

        System.out.println(roundedValue);

        double powerOfTwoToTheSeventh = Math.pow(2, 7);

        System.out.println(powerOfTwoToTheSeventh);

        double squareRootOf7 = Math.sqrt(7);

        System.out.println(squareRootOf7);

        int minValue = Math.min(10, 20);

        // random gives 0-1 not including 1, so multiply by the max, add 1
        // range of 1-max
        int randomValue = (int)(Math.random() * 10 + 1);

        // random() * total numbers in range + min
        int randomNumber10To20 = (int)(Math.random() * 11 + 10);

        System.out.println(randomNumber10To20);

        double pi = Math.PI;

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(7);

        String piToSevenDigits = numberFormat.format(pi);

        System.out.println(piToSevenDigits);
    }
}
