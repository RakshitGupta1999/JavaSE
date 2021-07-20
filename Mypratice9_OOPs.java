class Product
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;



    public Product(String itemno,String name,double price,short qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }

    public String getItemNo(){return  itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public short getQuantity(){return qty;}

    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short qty)
    {
        this.qty=qty;
    }
}

class Customerr
{
    private String custId;
    private String name;
    private String address;
    private String phno;

    public Customerr(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customerr(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }

    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}

    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}


public class Mypratice9_OOPs {
    public static void main(String[] args) {
        Product p = new Product("Chips ka packet", "Abc",50,(short) 1);

        System.out.println(p.getPrice());
        Customer p1 = new Customer("");

    }
}
