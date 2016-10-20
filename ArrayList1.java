package dataStructures;

import java.util.*;

public class ArrayList1 
{
	ArrayList b = new ArrayList();
	
	public void displayArrayList()
	{
		//System.out.println("Initial size: "+b.size()); 
		
		b.add("M");
		b.add("A");
		b.add("C");
		b.add("F");
		b.add("O");
		b.add(2, "R");
		b.remove("F");
		
	//	System.out.println("Size: "+b.size());
		System.out.println(b);
		
		//b.remove("M");
		//b.remove(2);
		
		Iterator itr = b.iterator();
		
		while(itr.hasNext())
		{
			Object element = itr.next();
			System.out.print(element+" ");
		}
	}
	
		
}
