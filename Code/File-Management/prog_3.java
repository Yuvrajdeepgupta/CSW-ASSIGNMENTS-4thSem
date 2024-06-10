import java.io.*;
import java.util.Scanner;
public class prog_3 
{
	public static void main(String[] args) throws IOException
	{
		FileWriter f=new FileWriter("D:\\diary.txt",true);
		
		String s=""+java.time.LocalDate.now()+java.time.LocalTime.now();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Content:");
		String diary=sc.nextLine();

		f.write("\n"+s+"\n");
		f.write(diary);
		
		f.close();
	}
}
