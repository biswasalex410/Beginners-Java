
import java.util.Scanner;


public class fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Enter any number: ");
        a = input.nextInt();
        System.out.println(fact(a));
    }
   
public static int fact(int x)
{

   if(x==1) {
       return 1;
   } else
   return x*fact(x-1);
}
}
