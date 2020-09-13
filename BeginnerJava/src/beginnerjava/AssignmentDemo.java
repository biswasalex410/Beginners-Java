
package beginnerjava;

import java.util.Scanner;

public class AssignmentDemo {
    public static void main(String[] args) {
       
      Scanner input = new Scanner(System.in);
       
       int i,j,k;
       
       System.out.print("Enter Number i = ");
       i = input.nextInt();
       
       System.out.print("Enter Number j = ");
       j = input.nextInt();
       
       System.out.print("Enter number k = ");
       k = input.nextInt();
       
       i+=k; // i=i+k=(10+6)=16;
       System.out.println(" i = "+i);
       
       j-=k; //j=j-k=(8-6)=2;
       System.out.println(" j = "+j);
       
       k*=j;//k=k*j=6*2=12;
       System.out.println(" k = "+k);
       
       i/=k;//i=i/k=16/12=1;
       System.out.println(" i = "+i);
       
       j%=i;//j=j%i=2%1=0;
       System.out.println(" j = "+j);
    }
}
