import java.util.Scanner;
public class PartOne 
{
    public static void main(String[] args)
    {
        //boiling poing of water goes down 1 degree 
        //for each 300m rise
        //freezing point is unaffected
        //altitude cannot be negative

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the temperature in (Celsisus): ");
        double temp = sc.nextDouble();
        System.out.println("What is the altitude in meters: ");
        double alt = sc.nextDouble();
        temp_deg = (alt/300);

        if (temp_deg < 100) 
        {
            System.out.println("Water is liquid at this condition");

        }
        else if (temp_deg >= 100)
        {
            System.out.println("Water is solid at this condition");

        }
        else 
        {
            System.out.println("Water is gaseous");
        }

    }
}
