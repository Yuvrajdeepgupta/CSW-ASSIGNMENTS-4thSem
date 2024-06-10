import java.util.Scanner;

public class prog_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for base string and number of concatenations
        System.out.print("Enter the base string: ");
        String baseString = scanner.nextLine();
        System.out.print("Enter the number of times to concatenate the base string: ");
        int numConcatenations = scanner.nextInt();

        // Using StringBuilder
        long startTimeStringBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numConcatenations; i++) {
            stringBuilder.append(baseString);
        }
        long endTimeStringBuilder = System.nanoTime();
        long durationStringBuilder = endTimeStringBuilder - startTimeStringBuilder;

        // Using StringBuffer
        long startTimeStringBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < numConcatenations; i++) {
            stringBuffer.append(baseString);
        }
        long endTimeStringBuffer = System.nanoTime();
        long durationStringBuffer = endTimeStringBuffer - startTimeStringBuffer;

        // Output results
        System.out.println("\nStringBuilder:");
        System.out.println("Time taken: " + durationStringBuilder + " nanoseconds");
        System.out.println("Length of resulting string: " + stringBuilder.length());

        System.out.println("\nStringBuffer:");
        System.out.println("Time taken: " + durationStringBuffer + " nanoseconds");
        System.out.println("Length of resulting string: " + stringBuffer.length());
    }
}
