package SimpleBank;

public class CreditAccount extends Account
{
  private double ODLimit;
  
  public CreditAccount()
  {
    this.Account();
    ODLimit = 100;
  }
  
  public CreditAccount(double l, Account a)
  {
    this.Account(a);
    ODLimit = l;
  }
  
  
  public void setLimit(double l)
  {
    ODLimit = l;
  }
  
  public double getLimit()
  {
    return ODLimit;
  }
  
  public String ToString()
  {
    String acc = this.ToString()+"\nOD Limit"
  }
  
  public void debit(double d)
  {
    if(d>(this.getBalance()+ODLimit))
    {
      throw(Exception e)
      {
        System.out.println("Insufficient Funds - Transaction Cancelled");
      }
    }
    else
    {
      this.debit(amount);
    }
  }
}
