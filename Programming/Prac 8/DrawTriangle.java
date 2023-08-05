import java.lang.Math; 
import java.util.Scanner;
public class DrawTriangle 
{
    //c is whether yes or no
    //i is the rows of triangle
    //d is the blank spaces
    //j is to draw the X
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to see a triangle? (y for yes, n for no): ");
        String c = sc.next();

        int b = 0, a = 0;
        int height = (int) (Math.random() * (b - a + 1) + a);
        
        if (c == "y")
        {
            for (int i = 1; i<=height; i++) 
            {
                for (int d = 1; d<=height-i; d++ )
                {
                    System.out.print(" ");
                }

                for(int j = 1; j<=i*2-1; j++)
                {
                    System.out.print("X");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid input!!");
        }
        sc.close();
    }
}
