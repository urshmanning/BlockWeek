package People;

public class TestPeople 
{

	public static void main(String[] args) 
	{
		TestPeople t = new TestPeople();
		
		// test Address
		//t.TestAddress();
		
		// test person
		t.TestPerson();
	}
	
	public void TestAddress()
	{
		Address a1 = new Address();
		Address a2 = new Address("my street", "my town", "my postcode");
		
		System.out.println(a2.ToString());
		
		a1.setStreet("street");
		a1.setTown("town");
		a1.setPostCode("postcode");
		
		System.out.println(a1.getStreet() +"\n"+a1.getTown()+"\n"+a1.getPostCode());
	}
	
	public void TestPerson()
	{
		Person p1 = new Person();
		Person p2 = new Person("my street", "my town", "my pc", 1993, "name");
		
		p1.setAddress("street", "town", "pc");
		p1.setYOB(1997);
		p1.setName("marco");
		
		System.out.println(p1.getName() + "\n"+p1.getYOB()+"\n"+p1.getAddress());
		
		System.out.println(p2.ToString());
	}

}
