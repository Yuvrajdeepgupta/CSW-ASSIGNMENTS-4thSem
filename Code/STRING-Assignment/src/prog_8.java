import java.util.Scanner;

public class prog_8 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two strings
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Concatenate the strings using String method and the + operator
        String concatenatedStringMethod = firstString.concat(secondString);
        String concatenatedStringOperator = firstString + secondString;

        // Display the concatenated strings
        System.out.println("\nConcatenated String using String method: " + concatenatedStringMethod);
        System.out.println("Concatenated String using + operator: " + concatenatedStringOperator);

        // Ask the user for an index number
        System.out.print("\nEnter an index number to retrieve the character: ");
        int index = scanner.nextInt();

        // Display the character at the specified index
        if (index >= 0 && index < concatenatedStringMethod.length()) {
            char characterAtIndex = concatenatedStringMethod.charAt(index);
            System.out.println("Character at index " + index + ": " + characterAtIndex);
        } else {
            System.out.println("Invalid index. Index should be within the range [0, " + (concatenatedStringMethod.length() - 1) + "]");
        }

        scanner.close();
    }
}
