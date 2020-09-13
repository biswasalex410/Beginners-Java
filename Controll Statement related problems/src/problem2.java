
import java.util.Scanner;


public class problem2 {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Enter your marks: ");
        x = input.nextInt();
        if(x>= 80)
        {
            System.out.println("Grade   Gradepoint Equivalent   Remarks");
            System.out.println("A+\t\t4.00\t\tOutstanding");
        }
        else if (x>=75 && x<80)
        {
            System.out.println("Grade   Gradepoint Equivalent   Remarks");
            System.out.println("A\t\t3.75\t\tExcellent");
        }
        else if (x>=70 && x<75)
        {
            System.out.println("Grade   Gradepoint Equivalent   Remarks");
            System.out.println("A-\t\t3.50\t\tVery Good");
        }
        else if(x>=65 && x<70)
        {
            System.out.println("Grade   Gradepoint Equivalent   Remarks");
            System.out.println("B+\t\t3.25\t\tGood");
        }
        else if (x>=60 && x<65)
        {
            System.out.println("Grade   Gradepoint Equivalent   Remarks");
            System.out.println("B\t\t3.00\t\tSatisfactory");
        }
        else if(x>=55 && x<60)
        {
            System.out.println("Grade   Gradepoint Equivalent   Remarks");
            System.out.println("B-\t\t2.75\t\tAbove Average");
        }
        else if (x>=50 && x<55)
        {
            System.out.println("Grade   Gradepoint Equivalent   Remarks");
            System.out.println("C+\t\t2.50\t\tAverage");
        }
        else if(x>=45 && x<50)
        {
            System.out.println("Grade   Gradepoint Equivalent   Remarks");
            System.out.println("C\t\t2.25\t\tBelow Average");
        }
        else if(x>=40 && x<45)
        {
            System.out.println("Grade   Gradepoint Equivalent   Remarks");
            System.out.println("D\t\t2.00\t\tPass");
        }
        else if(x<40)
        {
            System.out.println("Grade   Gradepoint Equivalent   Remarks");
            System.out.println("F\t\t0.00\t\tFail");
        }
        else System.out.println("Input is not valid");
    }
}
