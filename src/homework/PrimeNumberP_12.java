package homework;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 */

public class PrimeNumberP_12 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number:");
        int num = sc.nextInt();
        if(prime(num)) {
            System.out.println(num + " is prime number");
        }
        else{
            System.out.println(num + " is a non-prime number");
        }


    }
    public static boolean prime(int num){
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;

    }
}
