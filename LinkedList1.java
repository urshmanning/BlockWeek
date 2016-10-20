package dataStructures;

import java.util.*;

public class LinkedList1 
{
	LinkedList<String> c = new LinkedList<String>();

	public void displayList()
	{

		c.add("First");
		c.add("Second");
		c.add("Third");
		c.addLast("Last");
		c.add("Fifth");
		
		Iterator<String> itr = c.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
