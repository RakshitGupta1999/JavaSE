
class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;

    public Account(String acc,String n,String add,String phno,String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;}

    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}



}

class SavingsAccount extends Account
{
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

public class Mypratice5
{
    public static void main(String[] args)
    {
        SavingsAccount n = new SavingsAccount("01","champ","gurgaon","876668","7/9/9999");
        n.deposit(2000);
        System.out.println("Current balance "+n.getBalance());
        System.out.println(n.getAddress());
        System.out.println(n.getName());
    }


}
