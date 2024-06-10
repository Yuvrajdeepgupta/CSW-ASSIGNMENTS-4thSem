import java.util.*;
public class prog_1 
{
	public static void main(String[] args) 
	{
        String str1 = "Hello";
        String str2 = "Hello";

        // Using new keyword
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        // Check if str1 and str2 reference the same object
        System.out.println("str1 == str2: " + (str1 == str2)); // true

        // Check if str1 and str3 reference the same object
        System.out.println("str1 == str3: " + (str1 == str3)); // false

        // Check if str3 and str4 reference the same object
        System.out.println("str3 == str4: " + (str3 == str4)); // false

        // Check if str1 and str3 have the same content
        System.out.println("str1.equals(str3): " + (str1.equals(str3))); // true

        // Check if str3 and str4 have the same content
        System.out.println("str3.equals(str4): " + (str3.equals(str4))); // true
	}
}
