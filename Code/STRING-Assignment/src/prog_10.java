import java.util.Scanner;

public class prog_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Display the menu
        System.out.println("\n------ String Explorer Menu ------");
        System.out.println("1. Convert to lowercase");
        System.out.println("2. Convert to uppercase");
        System.out.println("3. Search for a character");
        System.out.println("4. Search for a character index");
        System.out.println("5. Concatenate with another string");
        System.out.println("6. Exit");

        // Process user's choice
        while (true) {
            System.out.print("\nEnter your choice (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Result: " + inputString.toLowerCase());
                    break;
                case 2:
                    System.out.println("Result: " + inputString.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter a character to search for: ");
                    char searchChar = scanner.nextLine().charAt(0);
                    System.out.println("Result: " + (inputString.contains(String.valueOf(searchChar)) ? "Character found" : "Character not found"));
                    break;
                case 4:
                    System.out.print("Enter a character to search for: ");
                    char searchCharIndex = scanner.nextLine().charAt(0);
                    int index = inputString.indexOf(searchCharIndex);
                    if (index != -1) {
                        System.out.println("Result: Character '" + searchCharIndex + "' found at index " + index);
                    } else {
                        System.out.println("Result: Character not found");
                    }
                    break;
                case 5:
                    System.out.print("Enter another string to concatenate: ");
                    String secondString = scanner.nextLine();
                    System.out.println("Result: " + inputString.concat(secondString));
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
