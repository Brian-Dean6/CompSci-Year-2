import java.util.Scanner;
public class InputLoop 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter an integer");
        while (!scan.hasNextInt()) 
        {
            scan.next(); 
            System.out.println ("Bad input. Enter an integer");
        }
        int input = scan.nextInt();
        System.out.println ("You entered " + input + "!");
        scan.close();
    }
    
}
