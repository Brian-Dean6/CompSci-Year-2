public class Rectangle
{
    public static void main(String[] args) 
    {
        double width = 5;
        double height = 8;

        double perimeter = 2*(height + width);
        double area = (width * height);
        double d = Math.sqrt(Math.pow(height,2)+Math.pow(width,2));

        System.out.println("Perimeter is " +perimeter);
        System.out.println("Area is " +area);
        System.out.println("Diagnol is " +d);
    }
}
