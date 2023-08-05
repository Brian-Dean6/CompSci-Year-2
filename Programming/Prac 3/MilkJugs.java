public class MilkJugs 
{
    public static void main(String[] args) 
    {
        //5.5 litres of milk 
        // Milk jugs holding  0.75 litres each
        // 5.5 * 0.75
        // how many filled jugs I will have

        double litres = 5.5; 
        //1 jug = 0.75l 
        double jug = 0.75;
        // multiply litres into jug
        double milkjug = (litres * jug);

        int a = (int) Math.round(milkjug);
        System.out.println("The amount of jugs it will take is " +a);



        
    }
}
