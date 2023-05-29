package homework;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class ArmstrongNumberP_10 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        armstrongNum();

    }

    public static void armstrongNum() {
        int temp, total = 0;
        System.out.println("Enter  Digit Number : ");
        int num = sc.nextInt();
        int number = num;

        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total + temp * temp * temp;
        }

        if (total == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");

        }
    }

}