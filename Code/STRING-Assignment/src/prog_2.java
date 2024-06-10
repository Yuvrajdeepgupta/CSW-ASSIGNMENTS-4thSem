import java.util.*;
public class prog_2 
{
	public static void main(String[] args) 
	{
		String str1 = "Hello";
        System.out.println("Original string: " + str1);
        str1.concat(" World");
        System.out.println("Modified string: " + str1); // Prints "Hello"
        
        String str2 = "Hello";
        System.out.println("Original string: " + str2);
        str2 = str2.concat(" World");
        System.out.println("Modified string: " + str2); // Prints "Hello World"

        
	}
}
