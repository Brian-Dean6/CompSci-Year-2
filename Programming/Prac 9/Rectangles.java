public class Rectangles 
{
    //What is the result of running this program?
    //15, 12, 24
    //What is the return type of the area method 
    //int
    
    public static void main(String[] args)
    {
        printRectangleDetails();
    }


     /***
      *Returns the area of a rectangle      
      *@param length the length of the rectangle      
      *@param width the width of the rectangle
      */ 
 
    public static int area (int length, int width)
    {         
        return length * width;     
    } 

    /***
      *Returns the perimeter of a rectangle      
      *@param length the length of the rectangle      
      *@param width the width of the rectangle
      */  
    public static int perimeter(int length, int width)
    {
        
        return (2*(length + width)); 
    }
    /***
      *when given the height and width of a rectangle,prints four lines of output 
      stating the height, width, area, and perimeter of the rectangle.  
      *@param length the length of the rectangle      
      *@param width the width of the rectangle
      */  
    public static void printRectangleDetails()
    {
        System.out.println("Length is 4");
        System.out.println("Width is 6");
        System.out.println (area(4, 6));
        System.out.println (perimeter(4, 6));
    }
    
    
}
