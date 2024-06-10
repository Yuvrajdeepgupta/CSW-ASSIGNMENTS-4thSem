import java.io.File;
import java.util.Scanner;

public class prog_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for directory path
        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();

        // Create file object for the directory
        File directory = new File(directoryPath);

        // Check if directory exists
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            scanner.close();
            return;
        }

        // Recursive method call to list contents of directory
        listContents(directory, 0);

        // Close scanner
        scanner.close();
    }

    private static void listContents(File directory, int depth) {
        // Print current directory or file name with appropriate indentation
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indent.append("  ");
        }
        System.out.println(indent + "+ " + directory.getName());

        // List files and subdirectories recursively
        File[] filesAndDirectories = directory.listFiles();
        if (filesAndDirectories != null) {
            for (File fileOrDir : filesAndDirectories) {
                if (fileOrDir.isDirectory()) {
                    // Recursive call for subdirectory
                    listContents(fileOrDir, depth + 1);
                } else {
                    // Print file name with appropriate indentation
                    System.out.println(indent + "  - " + fileOrDir.getName());
                }
            }
        }
    }
}
