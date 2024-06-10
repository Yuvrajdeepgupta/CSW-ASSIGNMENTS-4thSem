import java.io.*;
public class prog_2 
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader r=new FileReader("D:\\diary.txt");
			
			int i=0;
			while((i=r.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
