import java.util.*;
import java.io.*;
public class prog_8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File Name To Change:");
		String s=sc.nextLine();
		
		System.out.println("Enter File Name To Change To:");
		String a=sc.nextLine();
		
		File f=new File(s);
		File r=new File(a);
		
		
		if(f.exists())
		{
			System.out.println(f.renameTo(r));
			System.out.println("Succesfully Renamed!");
		}
		else
		{
			System.out.println("File Do Not Exist!");
		}
	}
}
