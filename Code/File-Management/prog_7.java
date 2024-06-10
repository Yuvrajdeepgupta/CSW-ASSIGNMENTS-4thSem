import java.util.*;
import java.io.*;
public class prog_7 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File Name To Copy From:");
		String s=sc.nextLine();
		
		System.out.println("Enter File Name To Paste:");
		String a=sc.nextLine();
		
		FileInputStream f=new FileInputStream(s);
		FileOutputStream r=new FileOutputStream(a);
		
		int i=0;
		while((i=f.read())!=-1)
		{
			r.write((char)i);
		}
		
		System.out.println("Coped Sucessfully!");
	}
}
