import java.util.*;
class Address 
{
    private String plotNo;
    private String at;
    private String post;

    public Address(String plotNo, String at, String post) 
    {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() 
    {
        return "Plot No: " + plotNo + ", At: " + at + ", Post: " + post;
    }
}
public class prog_7 
{
	public static void main(String[] args) 
	{
		Map<String,Address> addressBook=new TreeMap<>();
		
		addressBook.put("John", new Address("123", "Street A", "City X"));
        addressBook.put("Alice", new Address("456", "Street B", "City Y"));
        addressBook.put("Bob", new Address("789", "Street C", "City Z"));
        
        Iterator<Map.Entry<String,Address>> i1=addressBook.entrySet().iterator();
        
        while(i1.hasNext())
        {
        	Map.Entry<String,Address> entry=i1.next();
        	System.out.println("Name: " + entry.getKey() + ", Address: " + entry.getValue());
        }
	}
}
