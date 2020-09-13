
import java.util.Scanner;


public class problem3 {
     public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   char p;
   System.out.println("Enyer Any Charecter: ");
   p = input.next().charAt(0);
   if((p >= 'A'&& p<= 'Z') || (p>= 'a' && p<= 'z'))
   {
     if(((p == 'a')||(p == 'e') || (p == 'i')||(p == 'o')||(p == 'u')) && ((p == 'A')||(p == 'E')||(p == 'I')||(p == 'o')||(p == 'U')))
     {
      System.out.printf("%c is an Alphabet : It is an Vowel",p);
     }
     else System.out.printf("%c is not Alphabet : It is a Consonant",p);
   }
   else if (p>= '0' && p<= '9')
   {
     System.out.printf("%c is Digit",p);
   }
   else System.out.printf("%c is a special charecter\n",p);
   
}
}
