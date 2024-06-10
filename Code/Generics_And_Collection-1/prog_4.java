import java.util.*;
class Student
{
	private String name;
	private String rollno;
	private int totalmarks;
	
	public Student(String name,String rollno,int totalmarks) 
	{
		this.name=name;
		this.rollno=rollno;
		this.totalmarks=totalmarks;
	}
	public Student(String name,int rollno,int age) 
	{
		this.name=name;
		this.rollno=String.valueOf(rollno);
		this.totalmarks=age;
	}
	
	void displaydetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll-No:"+rollno);
		System.out.println("Total-Marks:"+totalmarks);
	}
	
	public int getTotalmarks() {
		return totalmarks;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRollno() {
		return rollno;
	}
}
public class prog_4 
{
	public static void main(String[] args) 
	{
		Student arr1[]=new Student[3];
		
		arr1[0]=new Student("Yuvraj",1,80);
		arr1[1]=new Student("Satyam",2,90);
		arr1[2]=new Student("Modiji",3,400);
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i].displaydetails();
			System.out.println();
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks:");
		int marks=sc.nextInt();
		
		int key=0,obj=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i].getTotalmarks()==marks)
			{
				key=1;
				obj=i;
			}
		}
		
		if(key==1)
		{
			System.out.println("Student Found:"+arr1[obj].getName()+"|Roll No:"+arr1[obj].getRollno());
		}
		else
		{
			System.out.println("Student not found!");
		}
	}
}
