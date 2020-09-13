import java.util.Scanner;

public class SimpleCalculator {


    public static int sum(int x,int y)
    { 
        return (x+y);
    
    }
    public static int subtract(int x,int y)
    { 
        return (x-y);
    
    }
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int a,b,result;
        char operator;
        System.out.println("Enter First Number: ");
        a=scan.nextInt();
        System.out.println("Enter Second Number: ");
        b=scan.nextInt();
        System.out.println("Enter Operator: ");
        operator=scan.next().charAt(0);
        if(operator=='+'){
            result=sum(a,b);
            System.out.println("Result is: "+result);
        }
        else if(operator=='-'){
            result=subtract(a,b);
            System.out.println("Result is: "+result);
        }
        
        
    }
    
}
