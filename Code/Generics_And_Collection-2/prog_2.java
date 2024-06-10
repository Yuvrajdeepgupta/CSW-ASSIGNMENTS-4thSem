import java.util.*;
class User
{
	private String name;
	private int age;
	
	public User(String name,int age) 
	{
		this.name=name;
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

class ArrayListUser
{
	private List<User> list1;
	
	public ArrayListUser() 
	{
		list1=new ArrayList<>();
	}
	
	void addUser(User newuser)
	{
		list1.add(newuser);
	}
	
	void printUsers()
	{
		System.out.println("Users:");
		Iterator<User> t1=list1.iterator();
		
		while(t1.hasNext())
		{
			User user = t1.next();
	        System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
		}
	}
	
	void sortbyage()
	{
		Collections.sort(list1,new comapatorbyage());
	}
}

class comapatorbyage implements Comparator<User>
{
	@Override
	public int compare(User u1,User u2)
	{
		if(u1.getAge()<u2.getAge()) {return -1;}
		else if(u1.getAge()==u2.getAge()) {return 0;}
		else
		{
			return 1;
		}
	}
}

public class prog_2 
{
	public static void main(String[] args) 
	{
		ArrayListUser arrayListUser = new ArrayListUser();

        arrayListUser.addUser(new User("Alice", 25));
        arrayListUser.addUser(new User("Bob", 30));
        arrayListUser.addUser(new User("Charlie", 20));

        // Print users before sorting
        System.out.println("Users before sorting:");
        arrayListUser.printUsers();

        // Sort users by age
        arrayListUser.sortbyage();

        // Print users after sorting
        System.out.println("\nUsers after sorting by age:");
        arrayListUser.printUsers();
	}
}
