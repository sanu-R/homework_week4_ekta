package homework;
/**
 * Display right angle triangle of @ using nested for loops.
 */

import java.util.Scanner;

public class RightAngleTriangleP_8 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        myTriangle();

    }
    public static void myTriangle(){
        int rows = 5;

        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("@ ");
            }

            System.out.println("");
        }

    }

}
