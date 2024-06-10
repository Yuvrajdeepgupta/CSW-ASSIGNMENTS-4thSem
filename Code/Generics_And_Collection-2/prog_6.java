import java.util.*;
public class prog_6 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> list=new TreeSet<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
//		Display The Treeset
		Iterator<Integer> i1=list.iterator();
		
		System.out.println("The Given List:");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
//		Number is present or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=sc.nextInt();
		
		if(list.contains(a))
		{
			System.out.println("Present!");
		}
		else
		{
			System.out.println("Not Present!");
		}
		
//		Remove a Number
		System.out.println("Enter the Number to Remove:");
		int b=sc.nextInt();
		if(list.contains(b)) 
		{
			list.remove(b);			
			System.out.println(b+" Removed!");
		}
		else
		{
			System.out.println("Element Not Present!");
		}
	}
}
