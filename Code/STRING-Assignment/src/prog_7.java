import java.util.Scanner;

public class prog_7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = inputString.toCharArray();

        // Prompt user for a character to search
        System.out.print("Enter a character to search in the string: ");
        char searchChar = scanner.next().charAt(0);

        // Find the first and last occurrences of the character
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }

        // Display the character array and the positions found (if any)
        System.out.println("\nCharacter Array:");
        System.out.println(charArray);
        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + searchChar + "' at index: " + firstIndex);
            System.out.println("Last occurrence of '" + searchChar + "' at index: " + lastIndex);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }

        scanner.close();
    }
}
