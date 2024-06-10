import java.io.File;
import java.util.*;
public class prog_6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File Name:");
		String s=sc.nextLine();
		
		File f=new File(s);
		
		if(f.exists())
		{
			f.delete();
			System.out.println("File Deleted!");
		}
		else
		{
			System.out.println("File Not Found");
		}	
	}
}
