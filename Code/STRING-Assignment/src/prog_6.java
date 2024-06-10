import java.util.Scanner;

public class prog_6 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input two strings
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Convert both strings to lowercase and uppercase
        String firstLower = firstString.toLowerCase();
        String firstUpper = firstString.toUpperCase();
        String secondLower = secondString.toLowerCase();
        String secondUpper = secondString.toUpperCase();

        // Compare the converted strings for case-insensitive equality
        boolean isEqual = firstLower.equals(secondLower);

        // Display the converted strings and the result of the comparison
        System.out.println("\nConverted strings:");
        System.out.println("First string in lowercase: " + firstLower);
        System.out.println("First string in uppercase: " + firstUpper);
        System.out.println("Second string in lowercase: " + secondLower);
        System.out.println("Second string in uppercase: " + secondUpper);
        System.out.println("\nCase-insensitive equality check: " + isEqual);

        scanner.close();
    }
}
