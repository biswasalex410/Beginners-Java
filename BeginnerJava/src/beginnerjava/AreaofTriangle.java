
package beginnerjava;

import java.util.Scanner;


public class AreaofTriangle {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double base,height,area;
        
        System.out.print("Enter Base value: ");
        base = input.nextDouble();
        
        System.out.print("Enter Height value: ");
        height = input.nextDouble();
        
        area = 0.5*base*height;
        
        System.out.println("Area of Triangle: "+area);
        
    }
    
}
