import java.util.Scanner; 
/** 
 * Program to find the larger of two integers 
 * @Brian 
 * @Today
 */ 
public class LargerInteger 
{
    public static void main(String[] args) 
    { 
       Scanner scan = new Scanner(System.in); 
       System.out.println 
          ("Enter two integers separated by one or more spaces"); 
       int a = scan.nextInt(); 
       int b = scan.nextInt(); 
       System.out.println 
          ("The larger integer is " + Math.max(a, b)); 
    } 
}
