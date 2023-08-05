import java.lang.reflect.Array;
import java.util.Scanner;
public class ArrayBasics
{
    public static void main(String[] args)
    {
        int[] myArray = {8,4,5,21,7,9,18,2,100};        
        System.out.println("Length of myArray: " + myArray.length);        
        System.out.println("Value at index 3: " + myArray[3]);        
        System.out.println("Value at index 4: " + myArray[4]);         
        myArray[3] = myArray[4];         
        System.out.println("Value at index 3: " + myArray[3]);         
        System.out.println ("Value at index 4: " + myArray[4]);

        System.out.println();

        // the first item of the list
        System.out.println("First item is" + myArray[0]);
        //last item of the array
        System.out.println("Last item is" + myArray[8]);
        //value of the expression
        System.out.println("Value of expression is" + myArray[myArray.length - 1]);
        
        System.out.println();

        printArray(myArray); 
        System.out.println();
        printBackwards(myArray);
        System.out.println();
        System.out.println("Sum is: " + sum(myArray));
        System.out.println();
        System.out.println(randomArray(9, 3, 89));
        System.out.println();
        System.out.println("Minimum is: " + minimum(myArray));
        find(myArray);


        
        

    }
    
    /**
     * list the indices and values held in the given array      
     * @param array: an array of integers      
     * */ 

    public static void printArray (int[] array)     
    {         
        for(int i = 0; i < array.length; i++)   
        {      
            System.out.println("myArray(" + i + ") is " + array[i]);
        
        }   
    
    }

    /** list the indices and values in an array in reverse order      
    * @param array: an array of integers          
    */
    public static void printBackwards(int[] array)     
    {         
        System.out.println("The reverse order is: ");
        for(int i = array.length-1; i >= 0; i--)
        {
            System.out.print(array[i]+" ");
        }   
    } 

    /** 
     * Find the sum of all the values held in an integer array     
     * * @param array: an array of integers     
     * */     
    public static int sum (int[] array)     
    {   
        int total = 0;         
        for (int element : array)         
        {             
            total += element;         
        }         
        return total;    
     } 

     /** return an array of a given length filled 
     * with random integers between given bounds 
     * @param length: the length of the result  * @param min: minimum bound for the array elements 
    * @param max: maximum bound for the array elements 
    */    
    public static int[] randomArray (int length, int min, int max) 
   { 
        int[] array = new int[length];         
        for (int i = 0; i < length; i++) 
        { 
            array[i] = (int)(Math.random()*(max - min + 1) + min);       
        } 
        
        return array; 
   }

    /** 
     * Find the minimum value in an array of integers  
     * @param array: an array of integers  
     **/ 
    public static int minimum (int[] array) 
    {         
        int min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
            }
        }
        return min; 
    } 

    /** Search for a given value in an array of integers 
    ** @param array: an array of integers  
    *@param target: the value to search for  
    */ 
    public static int find (int[] array, int target) 
    {     
        int i = 0;
        while((i < array.length) && (!(array[i] == target)))
        {
            i++; 
        }
        return -1; 
    } 
}

