/*
 NullPointerException

ClassCastException

ClassNotFoundException

IllegalArgumentException

NumberFormatException

UnsupportedOperationException
 */



package Exceptions_practise;

public class Test_2 {

	public static void main(String[] args) {
		

		 // 1. NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // 2. ClassCastException
        try {
            Object obj = new Integer(100);
            String s = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }

        // 3. ClassNotFoundException
        try {
            Class.forName("com.nonexistent.Class");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }

        // 4. IllegalArgumentException
        try {
            Thread.sleep(-100);  // sleep throws IllegalArgumentException for negative values
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Caught InterruptedException: " + e.getMessage());
        }

        // 5. NumberFormatException
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        // 6. UnsupportedOperationException
        try {
            java.util.List<String> list = java.util.Collections.unmodifiableList(java.util.Arrays.asList("one", "two"));
            list.add("three");
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException: " + e.getMessage());
        }
    }
}