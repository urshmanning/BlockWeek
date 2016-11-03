package SimpleBank;

public abstract class Account 
{
	//declare global variables
	private long num = 0;
	public double balance;
	public long number;
	
	public Account()
	{
		balance = 0;
		number = num++;
	}
	
	public Account(double b)
	{
		balance = b;
		number = num++;
	}
	
	public void setBalance(double b)
	{
		balance = b;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setNumber()
	{
		number = num++;
	}
	
	public long getNumber()
	{
		return number;
	}
	
	public String ToString()
	{
		String acc;
		acc = "Account number: "+number+"\nBalance: £"+balance+"\n";
		return acc;
	}
	
	public void credit(double b)
	{
    	balance = balance + b;
	}

	public void debit(double b)     
	{
		//should simply debit the amount
		//does not check balance!
		balance = balance - b;
	}

}
