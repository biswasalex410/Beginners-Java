
package beginnerjava;

import java.util.Scanner;


public class AreaofCircle {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double radious,area;
        
        System.out.print("Enter radius: ");
        radious = input.nextDouble();
        
       area = 3.1416*radious*radious;
       System.out.println("Area of the Circle is "+area);
    }
    
}
