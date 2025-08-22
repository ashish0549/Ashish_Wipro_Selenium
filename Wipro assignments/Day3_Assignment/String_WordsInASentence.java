package Day_3_Assignment;

public class String_WordsInASentence {

	 public static void main(String[] args) {
	        String sentence = "Hello world! How are you doing today?";

	        int wordCount = countWords(sentence);

	        System.out.println("Number of words: " + wordCount);
	    }

	    public static int countWords(String sentence) {
	       
	        if (sentence == null || sentence.isEmpty()) {
	            return 0;
	        }

	        String[] words = sentence.trim().split("\\s+");
	        return words.length;
	    }
	}
