import java.util.Scanner;

public class prog_9 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Request a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Request two words from the user: one to search for and one to replace
        System.out.print("Enter a word to search for: ");
        String searchWord = scanner.nextLine();
        System.out.print("Enter a word to replace it with: ");
        String replaceWord = scanner.nextLine();

        // Find the first occurrence of the search word in the sentence
        int indexOfSearchWord = sentence.indexOf(searchWord);

        if (indexOfSearchWord != -1) {
            // Replace the search word with the replace word
            String modifiedSentence = sentence.substring(0, indexOfSearchWord) + replaceWord +
                                      sentence.substring(indexOfSearchWord + searchWord.length());

            // Display the original and modified sentences
            System.out.println("\nOriginal Sentence: " + sentence);
            System.out.println("Modified Sentence: " + modifiedSentence);
        } else {
            System.out.println("\nThe search word '" + searchWord + "' was not found in the sentence.");
        }

        scanner.close();
    }
}
