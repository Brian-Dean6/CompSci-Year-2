import java.util.Scanner;
public class Rectangle
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        double l = sc.nextDouble();
        System.out.println("Enter width of the rectangle: ");
        double w = sc.nextDouble();

        double perimeter = (2 * (l + w));
        System.out.println(("Perimeter of the rectangle is " + perimeter));
        double area = (w * l);
        System.out.println(("Area of the rectangle is " + area));

        double d = Math.sqrt(Math.pow(w,2)+Math.pow(l,2));
        System.out.println(("Diagnol of the rectangle is " + d));
    }
}
