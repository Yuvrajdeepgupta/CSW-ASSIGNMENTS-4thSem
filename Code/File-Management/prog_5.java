import java.io.*;
import java.util.*;
public class prog_5 
{
	public static void main(String[] args) 
	{
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

        // List all ".txt" files in the specified directory
        File[] txtFiles = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
        if (txtFiles != null && txtFiles.length > 0) {
            System.out.println("Text files in " + directoryPath + ":");
            for (File txtFile : txtFiles) {
                System.out.println(txtFile.getName());
            }
        } else {
            System.out.println("No text files found in " + directoryPath);
        }
	}
}
