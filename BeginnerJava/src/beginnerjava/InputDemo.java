package beginnerjava;
import java.util.Scanner;
public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double num1;
        
        System.out.println("Enter Any Double Value : ");
        num1 =  input.nextDouble();
           
        System.out.println(num1);
    }
}
