package dataStructures;

import java.util.*;

public class HaskTable1 
{
	Hashtable balance = new Hashtable();
	Enumeration names;
	String str;
	double bal;

	public void fullHash()
	{		
		balance.put("Zara", new Double(3434.34));
		balance.put("Mahnaz", new Double(123.22));
		balance.put("Daisy", new Double(99.32));
	}
	
	public void displayHash()
	{
		names = balance.keys();

		while(names.hasMoreElements())
		{
			str = (String) names.nextElement();
			System.out.println(str+": "+balance.get(str));
		}
	}
	
	public void changeBal()
	{
		bal = ((Double)balance.get("Zara")).doubleValue();
		balance.put("Zara", new Double(bal+1000));
		System.out.println("new balance: "+balance.get("Zara"));
	}
}
