//1. Reverse CharSequence: Custom BackwardSequence
//•	Create a class BackwardSequence that implements java.lang.CharSequence.
//•	Internally store a String and implement all required methods: length(), charAt(), subSequence(), and toString().
//•	The sequence should be the reverse of the stored string (e.g., new BackwardSequence("hello") yields "olleh").
//•	Write a main() method to test each method.




package Day_5_Assignment;
class BackwardSequence implements CharSequence {
    private final String original;

    
    public BackwardSequence(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        this.original = input;
    }

    
    @Override
    public int length() {
        return original.length();
    }

    
    @Override
    public char charAt(int index) {
        if (index < 0 || index >= length()) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        return original.charAt(length() - 1 - index);
    }

    
    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > length() || start > end) {
            throw new IndexOutOfBoundsException("Invalid subsequence range.");
        }

        StringBuilder sub = new StringBuilder();
        for (int i = start; i < end; i++) {
            sub.append(charAt(i)); 
        }
        return sub.toString();
    }

    
    @Override
    public String toString() {
        return new StringBuilder(original).reverse().toString();
    }
public class Interface_1 {
	public static void main(String[] args) {
	BackwardSequence sequence = new BackwardSequence("NasirHussain");

    System.out.println("Original: hello");
    System.out.println("Reversed: " + sequence); 
    System.out.println("Length: " + sequence.length());
    System.out.println("charAt(0): " + sequence.charAt(0)); 
    System.out.println("charAt(4): " + sequence.charAt(4));
    System.out.println("subSequence(1, 4): " + sequence.subSequence(1, 4)); // "lle"
    }
  }
}

