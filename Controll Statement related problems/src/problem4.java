
import java.util.Scanner;


public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int count=0;
        for (int i = 2; i < num; i++)
        {
          if(num%i==0){
              count++;
              break;
              
          }
        }
        
        if(count == 0)
        {
        System.out.printf("%d is prime number\n",num);
        }
        else System.out.printf("%d is not prime number\n",num);
    }
}
