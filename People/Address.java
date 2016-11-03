package People;

public class Address 
{
	//declare global variables
	public String street;
	public String town;
	public String postcode;
	
	//default constructor
	public Address()
	{
		street = "";
		town = "";
		postcode = "";
	}
	
	public Address(String s, String t, String p)
	{
		street = s;
		town = t;
		postcode = p;
	}
	
	public void setStreet(String s)
	{
		street = s;
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public void setTown(String t)
	{
		town = t;
	}
	
	public String getTown()
	{
		return town;
	}
	
	public void setPostCode(String p)
	{
		postcode = p;
	}
	
	public String getPostCode()
	{
		return postcode;
	}
	
	public String ToString()
	{
	  String fullAdd;
	  fullAdd = street + "\n" + town + "\n" + postcode + "\n";
	  return fullAdd;
	}

}
