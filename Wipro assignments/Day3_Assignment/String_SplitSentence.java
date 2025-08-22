package Day_3_Assignment;

public class String_SplitSentence {

	public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";

        String[] words = splitIntoWords(sentence);

        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String[] splitIntoWords(String sentence) {
        // Split by one or more spaces
        return sentence.trim().split("\\s+");
    }
}
