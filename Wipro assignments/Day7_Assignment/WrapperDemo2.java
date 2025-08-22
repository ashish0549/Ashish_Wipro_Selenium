package Day_7_Assignment;

//2. Compare two Strings
class WrapperDemo2 {
 public static void main(String[] args) {
     String str1 = "Java";
     String str2 = "java";
     
     System.out.println("str1.equals(str2): " + str1.equals(str2));
     System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
     System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
 }
}
