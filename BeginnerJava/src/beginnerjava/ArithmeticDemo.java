
package beginnerjava;
import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Integer value :");
        int num1,num2,result;
        
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        result = num1+num2;
        System.out.println("Sum = "+result);
        
        result = num1-num2;
        System.out.println("Sub = "+result);
        
        result = num1*num2;
        System.out.println("Multiplication = "+result);
        
        result = num1/num2;
        System.out.println("Divided = "+result);
        
        result = num1%num2;
        System.out.println("Remainder = "+result);
        
        
    }
    
}
