package Day_7_Assignment;

//5. Convert null to wrapper classes
class WrapperDemo5 {
 public static void main(String[] args) {
     Integer intObj = null;
     Double doubleObj = null;
     Boolean boolObj = null;
     
     System.out.println("Integer object: " + intObj);
     System.out.println("Double object: " + doubleObj);
     System.out.println("Boolean object: " + boolObj);
     
     try {
         int primitive = intObj;
         System.out.println("This will not be execute");
     } catch (NullPointerException e) {
         System.out.println("NullPointerException occurred");
     }
 }
}

