
public class Product {
    private String name, code, description;
    private double price;
    public void pName(String n)
    {
    name=n;
    }
    public void pCode(String c)
    {
    code=c;
   }
    public void pDis(String d)
    {
    description=d;
    }
    public void pPrice(double p)
    {
    price=p;
    }
    public void displayInfo(){
        System.out.println("Product Name: "+name);
        System.out.println("Product Code: "+code);
        System.out.println("Product Price: "+price);
        System.out.println(description);
        
    }
    public static void main(String[] args) {
       Product p1,p2,p3;
       p1=new Product();
       p1.pName("Tea");
       p1.pCode("t111");
       p1.pDis("Tej Pata");
       p1.pPrice(240);
       p1.displayInfo();
        System.out.println("");
       p2=new Product();
       p2.pName("A4 Tech");
       p2.pCode("t112");
       p2.pDis("Mouse");
       p2.pPrice(270);
       p2.displayInfo();
        System.out.println("");
        
       p3=new Product();
       p3.pName("BMW");
       p3.pCode("t113");
       p3.pDis("Specification is more & more");
       p3.pPrice(5480000);
       p3.displayInfo();
       
    }
    
}
