package Day_3_Assignment;

public class String_SpaceWithHypens {

	public static void main(String[] args) {
        String sentence = "Hello World! How are you?";

        // Replace all spaces with hyphens
        String modified = sentence.replace(' ', '-');

        System.out.println("Original sentence: " + sentence);
        System.out.println("Modified sentence: " + modified);
    }
}
