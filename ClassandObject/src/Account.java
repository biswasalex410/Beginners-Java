
public class Account {
    private String name,email,pass;
    public void setname(String a)
    {
        this.name =a; 
    }
   public void setemail(String a)
    {
        email=a;
    }
   public void setpass(String a)
    {
        pass=a;
    }
   public void display_Info()
      {
            System.out.println(name);
            System.out.println(email);
            System.out.println(pass);      
    }
    public static void main(String[] args) {
        Account a1= new Account();  
    Account a2= new Account();
    a1.setname("Moeen");  
    a1.setemail("leaulhamd@gmail.com");
    a1.setpass("123456");
    a1.display_Info();
        System.out.println("");
    a1.setname("Ahad");  
    a1.setemail("ahadislammoeen1@gmail.com");
    a1.setpass("11223");
    a1.display_Info();
    }
}
