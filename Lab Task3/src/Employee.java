import java.util.*;
public class Employee {
    private String name,designation,id;
    private double  salary;
    private int age;
    public void empNameId(String a,String b) 
    {
        name=a;
        id=b;
    }
     public void empAgeDesignation(int a, String b)
    {
       age=a;
       designation =b;
    }
public void empSalary(double a)
    {
            this.salary=a;
        
    }
public void display_Info()
      {
            System.out.println(name);
            System.out.println(id);
            System.out.println(age);
            System.out.println(designation);
               System.out.println(salary);       
    }
    public static void main(String[] args) {
        Employee s1=new Employee();
        Employee s2=new Employee();        
        Employee s3=new Employee(); 
        Scanner in=new Scanner(System.in);
        s1.age=18;
s1.designation="Manager";
s1.id="191-15-12697";
s1.salary=250000;
s1.name="RIADH Hasan";
s1.display_Info();
s2.empNameId("EMRUL HASAN","191-15-12218");
s2.empAgeDesignation(25,"ASSISTENT");
s2.empSalary(50000);
s2.display_Info();
s3.empAgeDesignation(in.nextInt(), in.next());
s3.empNameId(in.next(), in.next());
s3.empSalary(in.nextDouble());
s3.display_Info();


    }
}

