package homework;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

public class triangleWithNumberP_6 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        myTriangle();
    }

    public static void myTriangle() {
        int i, j, n;
        System.out.println("Input number of rows :");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println("");
        }


    }
}
