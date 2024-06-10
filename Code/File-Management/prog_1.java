import java.io.*;
import java.util.*;
public class prog_1 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("D:\\diary.txt");
	
		if(f.exists())
		{
			System.out.println(f.getName()+" Already Exist!");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Content:");
		String s=sc.nextLine();
		
	
			FileWriter r=new FileWriter(f,true);
			
			String TimeandDate=java.time.LocalTime.now()+"|"+java.time.LocalDate.now();
			
			r.write(TimeandDate+"\n");
			r.write(s);
		
			r.close();
	}
}
