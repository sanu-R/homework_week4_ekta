package homework;
/**
 * First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 */

import java.util.Scanner;

public class FirstAndLastDigitSumP_7 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println("sum of "+sumFirstAndLastDigit(num));

    }
    public static int sumFirstAndLastDigit(int number){
        int lastDigit = number % 10;
        int sum = 0;

        if (number >= 10) {

            while ((number / 10) >= 10){

                number = number / 10;
            }

            number = number / 10;
            sum = lastDigit + number;
            return sum;

        } else if (number < 0) {

            return -1;
        }

        sum = number *= 2;
        return sum;

    }

}
