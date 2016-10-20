package dataStructures;

//import packages
import java.util.*;

//LinearArrayList
public class Task1 
{
	//declare global variables
	private int count;
	private ArrayList<Integer> values;
	
	//default constructor
	public Task1()
	{
		count = 0;
		values = new ArrayList<Integer>(10);
	}
	
	//constructor: takes in length of array
	public Task1(int l)
	{
		count = 0;
		values = new ArrayList<Integer>(l);
	}
	
	/*fillList method
	//fills array with values
	public void fillList()
	{
		for(int i = 0; i<values.length; i++)
		{
			//can request user input here
			//will use int i to fill array for simplities sake
			
			values[i]=i+1;
		}
	}*/
	
	
	//displayUI method
	//displays contents of list in standard output for testing purposes
	public void displayUI()
	{
		for(int i = 0; i<values.size(); i++)
		{
			System.out.println(values.get(i));
		}
	}
	
	//destroy method
	//empties list
	public void destroy()
	{
		/*calls library function from ArrayList class to empty the arraylist
		have renamed predefined function for the hell of it
		this method has no actual purpose other than to waste my time and yours
		you should have let me create an actual algorithm using arrays to build an arraylist
		that was the original homework assisgnment
		you changed it because you didnt bother reading through what you were meant to do
		it said create an ABSTRACT CLASS to build linear arraylists that you could then manipulate to build circular arrays
		you suck
		*/
		values.clear();
	}
	
	//method isEmpty
	//returns boolean of true if list is full
	public boolean isEmpty()
	{
		//once again, I have imported a predefined function to do this for me
		//this time you didn't want me to rename it
		//this is infinitely circular
		boolean check = values.isEmpty();
		return check;
	}
	
	/*isFull method
	//returns boolean of false if list is empty
	public boolean isFull()
	{
		boolean check = true;
		return check;
	}*/
	
	//addFirst
	//takes in an int to place in the first position of the array
	//throws exception if list is full
	//An arraylist can never be full, it expands
	public void addFirst(int f)
	{
		if(values.size()==20)
		{
			System.out.println("The array is full");
		}
		else
		{
			values.add(0, f);
			/*
			for(int i = values.size()-1; i>0; i--)
			{
				values.set(i, values.get(i-1));
			}
			values.set(0, f);
			*/
		}
	}
	
	//addLast
	//takes in an int to place in the last position of the array
	//throws exception if list is full
	public void addLast(int l)
	{
		if(values.size()==20)
		{
			System.out.println("The array is full");
		}
		else
		{
			for(int i = 0; i<values.size(); i++)
			{
				if(values.get(i)==null)
				{
					values.set(i, l);
					i=values.size();
				}
			}
		}
	}
	
	//removeFirst method
	//removes first value and returns it
	//throws exception if list is full
	public int removeFirst()
	{
		int first = values.get(0);
		
		return first;
	}
	
	//removeLast method
	//removes last value and returns it
	//throws exception if list is full
	public int removeLast()
	{
		int last = 0; //get value at pos length-1
		return last;
	}
	
}
