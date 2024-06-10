import java.io.*;
import java.util.*;
public class prog_4
{
	public static void main(String[] args)throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Directory:");
		String s=sc.nextLine();
		
		File f=new File(s);
		File[] filesAndDirectories = f.listFiles();
        if (filesAndDirectories != null && filesAndDirectories.length > 0) {
            System.out.println("Files and directories in " + s + ":");
            Arrays.stream(filesAndDirectories).forEach(file -> System.out.println(file.getName()));
        } else {
            System.out.println("No files or directories found in " + s);
        }
	}
}
