package Day_3_Assignment;
import java.util.HashMap;
import java.util.Map;

public class String_CharacterFrequency {
	 public static void main(String[] args) {
	        String input = "programming";

	     
	        Map<Character, Integer> frequencyMap = findCharacterFrequency(input);

	  
	        System.out.println("Character frequency:");
	        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }

	    public static Map<Character, Integer> findCharacterFrequency(String str) {
	        Map<Character, Integer> frequencyMap = new HashMap<>();

	  
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
	        }

	        return frequencyMap;
	    }
	}

