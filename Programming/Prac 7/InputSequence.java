import java.util.Scanner;
public class InputSequence 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0; 
        int count = 0;
        int add = 0; 
        int a; 
        System.out.println ("Enter an integer to continue or a non-integer value to finish. Then press return: ");
    
        
        while (scan.hasNextInt()) 
        {
            a = scan.nextInt(); 
            count++ ;    
            add = add + a; 
                
            System.out.println ("Enter an integer to continue or a non-integer value to finish. Then press return: ");
        }
        System.out.println("You entered" + count + "integers. The sum of your entries is" + add); 
        scan.close();

    }
    
}
