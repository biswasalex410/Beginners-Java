class Account
{
    private String n,email,pass;
    public void setname(String a)
    {
        this.n =a; 
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
            System.out.println(n);
            System.out.println(email);
            System.out.println(pass);      
    }
}
public class create {
    public static void main(String[] args) {
      
    Account a1= new Account();  
    Account a2= new Account();
    a1.setname("riadh");  
    a1.setemail("RIADH@gmail.com");
    a1.setpass("1234");
    a1.display_Info();
    a1.setname("Johir");  
    a1.setemail("dariman@gmail.com");
    a1.setpass("vorobai");
    a1.display_Info();
    }

}
