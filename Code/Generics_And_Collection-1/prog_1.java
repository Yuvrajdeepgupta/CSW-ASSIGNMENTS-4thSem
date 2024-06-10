import java.util.*;
class Student
{
	private String name;
	private String rollno;
	private int age;
	
	public Student(String name,String rollno,int age) 
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}
	public Student(String name,int rollno,int age) 
	{
		this.name=name;
		this.rollno=String.valueOf(rollno);
		this.age=age;
	}
	
	void displaydetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll-No:"+rollno);
		System.out.println("Age:"+age);
	}
}
public class prog_1 
{
	public static void main(String[] args) 
	{
		 	Student student1 = new Student("Yuvraj", 101, 20);
	        Student student2 = new Student("Aamir", "102", 21);

	        System.out.println("Student 1 details:");
	        student1.displaydetails();
	        System.out.println();

	        System.out.println("Student 2 details:");
	        student2.displaydetails();
	}
}
