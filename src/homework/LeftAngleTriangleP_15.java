package homework;

/**
 *Display left angle triangle of * using nested for loops.
 */

public class LeftAngleTriangleP_15 {


    public static void main(String[] args) {
        myTriangle();

    }
    public static void myTriangle(){
        int rows = 5;

        for (int x = 1; x <= rows; x++)
        {
            for (int i = 1; i <= x; i++)
            {
                System.out.print("* ");
            }

            System.out.println("");
        }

    }
}
