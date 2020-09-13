
public class Product {
    
    private String name,code,discripstion;
    private double  prize;
    public void pName(String a) 
    {
        name=a;
    }
     public void pcode(String  a)
    {
       code=a;
    }
     public void pdescription(String  a)
    {
       this.discripstion=a;
    }
public void pPrize(double a)
    {
            this.prize=a;
        
    }
public void display_Info()
      {
            System.out.println(name);
            System.out.println(discripstion);
            System.out.println(code);
            System.out.println(prize);       
    }
    public static void main(String[] args) {
        Product s1=new Product();
        Product s2=new Product(); 
        s1.code="12364asd";
        s1.name="CAke";
        s1.prize=25;
        s1.discripstion="NICE";
        s1.display_Info();
        s2.pcode("asdsad454");
        s2.pName("pen");
        s2.pPrize(5);
        s2.pdescription("smoth");
        s2.display_Info();


    }
    
}
