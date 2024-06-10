import java.util.*;
class Student
{
	private String name;
	private int age;
	private int mark;
	
	public Student(String name,int age,int mark) 
	{
		this.name=name;
		this.age=age;
		this.mark=mark;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getMark() {
		return mark;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() 
	{
		return "Student Name:"+name+"|Age"+age+"|Mark"+mark;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		Student s=(Student)obj;
		if(this.age==s.age && this.mark==s.mark && this.name.equals(s.name))
		{
			return true;
		}
		return false;
	}
}

public class prog_4 
{
	public static void main(String[] args) 
	{
		
		List<Student> slist=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		
		slist.add(new Student("John", 20, 85));
		slist.add(new Student("Alice", 21, 90));
		slist.add(new Student("Bob", 22, 75));
		
		Iterator<Student> i1=slist.listIterator();
		
//		Display the list
		System.out.println("List Of Students:");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
//		print the existence of the object
		System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Mark: ");
        int mark = sc.nextInt();
        Student tempstudent=new Student(name, age, mark);
        System.out.println("The Provided Object is Present:"+slist.contains(tempstudent));
	
//      Remove a specified Student object.
		System.out.print("Name: ");
		name = sc.next();
		System.out.print("Age: ");
		age = sc.nextInt();
		System.out.print("Mark: ");
		mark = sc.nextInt();
		Student tstudent=new Student(name, age, mark);
		if(slist.contains(tstudent))
		{
			slist.remove(tstudent);			
			System.out.println("The given Object is Removed");
		}
		else
		{
			System.out.println("The Object is Not Present");
		}
		
//   	Count the number of object present in the list.
		System.out.println("Number of Objects present in the List:"+slist.size());
		
//		Override equals method
        Student student1 = new Student("John", 20, 83);
        Student student2 = new Student("John", 20, 85);
        System.out.println("Are student1 and student2 equal? " + student1.equals(student2));
	}
}