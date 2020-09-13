
import java.util.Scanner;


public class TemperatureConverter {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
      
        double c,f,cel,farn;
        System.out.print("Enter celcious value: ");
        
        c = input.nextDouble();
        
        farn = 1.8*c+32;
        
        System.out.println("Farenheight:"+farn);
        
        System.out.print("Enter farenheight value: ");
        f = input.nextDouble();
        
        cel = 0.5556*(f - 32);
        
        System.out.print("Celcious: "+cel);
    }
}
