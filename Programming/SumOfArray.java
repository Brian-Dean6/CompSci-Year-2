import java.util.Scanner;
public class SumOfArray
{
    public static void main(String[] args) 
    {
        int a;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        a=sc.nextInt();  

        System.out.println("Enter the elements of the array: ");  
        int[] array = new int[10];
        for(int i=0; i<a; i++)  
        {  
            array[i]=sc.nextInt();  
        }  

        int total = 0;         
        for (int element : array)         
        {             
            total += element;         
        }   
        System.out.println("Sum of elements is: " +total);
}   
}