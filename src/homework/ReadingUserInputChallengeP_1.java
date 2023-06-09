package homework;
/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 */


import java.util.Scanner;

public class ReadingUserInputChallengeP_1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        challenge();

    }
    public static void challenge() {
        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("Enter number#x :" + count);
            boolean validateNumber = sc.hasNextInt();
            if (validateNumber) {
                int number = sc.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            sc.nextLine();

            }
        System.out.println("Sum of all number = " + sum);
        sc.close();

        }
    }
