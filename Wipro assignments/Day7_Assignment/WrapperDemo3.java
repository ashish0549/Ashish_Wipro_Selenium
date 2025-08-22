package Day_7_Assignment;

//3. Convert using valueOf method
class WrapperDemo3 {
 public static void main(String[] args) {
     int num = 123;
     double d = 45.67;
     boolean b = true;
     
     String str1 = String.valueOf(num);
     String str2 = String.valueOf(d);
     String str3 = String.valueOf(b);
     
     System.out.println("int to String: " + str1);
     System.out.println("double to String: " + str2);
     System.out.println("boolean to String: " + str3);
     
     Integer intObj = Integer.valueOf("100");
     Double doubleObj = Double.valueOf("3.14");
     
     System.out.println("String to Integer: " + intObj);
     System.out.println("String to Double: " + doubleObj);
 }
}
