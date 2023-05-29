package homework;
/**
 *Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 */

import java.util.Scanner;

public class PalindromeNumberP_5 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println(
                + num +" is a palindrome ? " + isPalindrome(num));


    }

    private static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return originalNumber == reverse;
    }


}
