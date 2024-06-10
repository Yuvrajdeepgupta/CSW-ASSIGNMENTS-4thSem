import java.util.*;
import java.io.*;
public class prog_9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File Name:");
		String s=sc.nextLine();
		
		File f=new File(s);
		
		System.out.println("File Name:"+f.getName());
		System.out.println("File Path:"+f.getAbsolutePath());
		System.out.println("File Size:"+f.length());
		System.out.println("File Last Modified:"+f.lastModified());
	}
}
