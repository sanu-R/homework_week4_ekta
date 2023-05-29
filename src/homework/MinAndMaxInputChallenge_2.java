package homework;
/**
 *Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge_2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        numberChallenge();


    }

    public static void numberChallenge() {
        int mex = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter number:  ");
            boolean isAnInt = sc.hasNextInt();
            if (isAnInt) {
                int number = sc.nextInt();
                if(number>mex){
                    mex = number;

                }if(number < min){
                    min = number;
                }
            } else   {
                System.out.println("Invalid Number");
                break;
            }
            sc.nextLine();
        }
        System.out.println("Max = " + mex + "and =" + min);
        sc.close();
    }
}
