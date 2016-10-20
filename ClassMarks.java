package dataStructures;

import java.util.*;

public class ClassMarks 
{
	//remove top mark and replace with frank at 100%
	//10
	ArrayList marks = new ArrayList();
	
	public void fullArray()
	{
		marks.add("Marco");
		marks.add(85);
		marks.add("Michal");
		marks.add(82);
		marks.add("Ursula");
		marks.add(85);
		marks.add("Mark");
		marks.add(91);
	}
	
	//change to indexof
	public void displayArray()
	{
		for(int i = 0; i<8; i++)
		{
			System.out.print(marks.get(i)+" ");
			if(!((i&1)==0))
			{
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public void topMark()
	{
		int high = 0;
		int pos = 0;
		for(int i = 0; i<8; i++)
		{
			//System.out.println(marks.get(i));
			if(!((i&1)==0))
			{
				//System.out.println("here");
				if((int) marks.get(i) >= high)
				{					
					high = (int) marks.get(i);
					pos = i;
				}
			}
		}
		System.out.println("The highest mark was "+high+". Scored by "+marks.get(pos-1));
	}
	
	public void replaceTop()
	{
		int high = 0;
		int pos = 0;
		for(int i = 0; i<8; i++)
		{
			if(!((i&1)==0))
			{
				if((int) marks.get(i) >= high)
				{
					
					high = (int) marks.get(i);
					pos = i;
				}
			}
		}
		
		marks.set(pos-1, "Frank");
		marks.set(pos, 100);
	}
}
