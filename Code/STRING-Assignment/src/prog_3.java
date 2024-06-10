import java.util.Scanner;

public class prog_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer textBuffer = new StringBuffer();

        // Menu loop
        while (true) {
            System.out.println("------ Text Editor Menu ------");
            System.out.println("1. Append text");
            System.out.println("2. Insert text");
            System.out.println("3. Delete text");
            System.out.println("4. Reverse text");
            System.out.println("5. Replace text");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    String appendText = scanner.nextLine();
                    textBuffer.append(appendText);
                    printStatus(textBuffer);
                    break;
                case 2:
                    System.out.print("Enter index to insert: ");
                    int insertIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter text to insert: ");
                    String insertText = scanner.nextLine();
                    textBuffer.insert(insertIndex, insertText);
                    printStatus(textBuffer);
                    break;
                case 3:
                    System.out.print("Enter start index to delete: ");
                    int startIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter end index to delete: ");
                    int endIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    textBuffer.delete(startIndex, endIndex);
                    printStatus(textBuffer);
                    break;
                case 4:
                    textBuffer.reverse();
                    printStatus(textBuffer);
                    break;
                case 5:
                    System.out.print("Enter start index to replace: ");
                    int replaceStartIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter end index to replace: ");
                    int replaceEndIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter replacement text: ");
                    String replacementText = scanner.nextLine();
                    textBuffer.replace(replaceStartIndex, replaceEndIndex, replacementText);
                    printStatus(textBuffer);
                    break;
                case 6:
                    System.out.println("Exiting the text editor.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void printStatus(StringBuffer textBuffer) {
        System.out.println("Current text: " + textBuffer);
        System.out.println("Current length: " + textBuffer.length());
        System.out.println("Current capacity: " + textBuffer.capacity());
        System.out.println();
    }
}
