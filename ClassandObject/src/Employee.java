
public class Employee {
    private String name,id,designation;
    private int age;
    private double salary;
    
    public void emNameId(String n, String i ){
        name=n;
        id=i;
    }
    public void emAgeDesignation(int a, String d ){
        age=a;
        designation=d;
    }
    public void emSalary(double s ){
        salary=s;
        
    }
    public void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Designation : "+designation);
        System.out.println("Salary : "+salary);
    }
    public static void main(String[] args) {
        Employee e1,e2,e3;
        e1=new Employee();
        e1.emNameId("MD Moeen","191-15-12324");
        e1.emAgeDesignation(21, "Graphic Designer");
        e1.emSalary(270000);
        e1.displayInfo();
        System.out.println("");
        
        e2=new Employee();
        e2.emNameId("Mr Alex","191-15-12464");
        e2.emAgeDesignation(20, "Web Developer");
        e2.emSalary(170000);
        e2.displayInfo();
        System.out.println("");
        
        e3=new Employee();
        e3.emNameId("Mr Sabuj","191-15-12525");
        e3.emAgeDesignation(20, "Programmer");
        e3.emSalary(200000);
        e3.displayInfo();
    }
}
    
