package People;

public class Person 
{
	//declare global variables
	public Address address = new Address();
	public int yearOfBirth;
	public String name;
	
	public Person()
	{
		address.setStreet("");
		address.setTown("");
		address.setPostCode("");
		yearOfBirth = 0;
		name = "";
	}
	
	public Person(String as, String at, String ap, int y, String n)
	{
		address.setStreet(as);
		address.setTown(at);
		address.setPostCode(ap);
		yearOfBirth = y;
		name = n;
	}
	
	public void setAddress(String s, String t, String p)
	{
		address.setStreet(s);
		address.setTown(t);
		address.setPostCode(p);
	}
	
	public String getAddress()
	{
		return address.ToString();
	}
	
	public void setYOB(int y)
	{
		yearOfBirth = y;
	}
	
	public int getYOB()
	{
		return yearOfBirth;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	//Override
	public String ToString()
	{
		String fullDisp;
		fullDisp = name +" "+yearOfBirth+"\n"+address.ToString();
		return fullDisp;
	}
}
