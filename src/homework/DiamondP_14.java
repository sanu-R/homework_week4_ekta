package homework;


import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 */

public class DiamondP_14 {
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        myDiamond();

    }

    public static void myDiamond() {
        int number = 7;

        int m = 1;


        int n;


        while (m <= number) {
            n = 1;

            while (n++ <= number - m) {

                System.out.print(" ");
            }

            n = 1;

            while (n++ <= m * 2 - 1) {

                System.out.print("*");
            }
            System.out.println();


            m++;
        }

        m = number - 1;


        while (m > 0) {
            n = 1;

            while (n++ <= number - m) {


                System.out.print(" ");
            }

            n = 1;


            while (n++ <= m * 2 - 1) {

                System.out.print("*");
            }


            System.out.println();


            m--;
        }


    }
}




