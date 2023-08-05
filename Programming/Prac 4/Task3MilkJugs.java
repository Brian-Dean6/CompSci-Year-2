import java.util.Scanner;
public class Task3MilkJugs 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of litres: ");
        double litres = sc.nextDouble();

        System.out.println("Enter capacity of the jugs: ");
        double jug = sc.nextDouble();
        
        double milkjug = (litres * jug);

        int a = (int) Math.round(milkjug);
        System.out.println("The amount of jugs it will take is " +a);
    }
}
