
import java.util.Scanner;
import java.lang.Math;

public static void main(String[] args) throws Exception 
{

    Scanner scanner = new Scanner(System.in);
    System.out.print("Sugár: ");
    String radiusstr = scanner.nextLine();
    Double radius = Double.parseDouble(radiusstr);
    
    System.out.print("Magasság: ");
    String heightstr = scanner.nextLine();
    Double height = Double.parseDouble(heightstr);
    scanner.close();
       
}
public class  Eredmeny implements Shape      
{ 
    Double radius;
    Double height;
    @Override
    public double calculateArea() {
       return (1.0 / 3.0) * radius * height;
       System.out.println("A terület: " + calculateArea());
    }
    @Override
    public double calculatePerimeter() {
        return (1.0 / 3.0) * Math.pow(radius, 2) * Math.PI * height;
        System.out.println("A kerület: " + calculatePerimeter());
    }
    

}