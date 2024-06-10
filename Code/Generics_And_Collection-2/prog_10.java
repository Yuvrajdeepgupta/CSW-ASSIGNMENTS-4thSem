import java.util.*;
public class prog_10 
{
	public static void main(String[] args) 
	{
		String largeString = "Lorem ipsum dolor sit amet";

        Map<String, Integer> wordFrequency = new Hashtable<>();

        // Split the large string into words
        String[] words = largeString.split("\\s+");

        // Iterate through the words and update their frequency in the HashMap
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Find the most occurring word(s)
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // Print the most occurring word(s)
        System.out.println("Most occurring word(s) with frequency " + maxFrequency + ":");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey());
            }
        }
	}
}
