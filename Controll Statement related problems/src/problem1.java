
import java.util.Scanner;


public class problem1 {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
   int A,B,C,D,a,b,c,d;
   A = input.nextInt();
   B = input.nextInt();
   C = input.nextInt();
   D = input.nextInt();
   a= (A*B-C*D);
   b= 2*A-B+3*D;
   c= A*A+B*B-C*C+D*D;
   d= A*A*A+B-C*C;
   System.out.print("Solution of Equation -1: "+a);
   System.out.print("\nSolution of Equation -2: "+b);
   System.out.print("\nSolution of Equation -3: "+c);
   System.out.println("\nSolution of Equation -4: "+d);
    
    
}
}
