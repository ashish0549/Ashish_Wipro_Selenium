package Day_7_Assignment;

//4. Create Boolean Wrapper usage
class WrapperDemo4 {
 public static void main(String[] args) {
     Boolean b1 = new Boolean(true);
     Boolean b2 = Boolean.valueOf(false);
     Boolean b3 = Boolean.valueOf("true");
     
     System.out.println("b1: " + b1);
     System.out.println("b2: " + b2);
     System.out.println("b3: " + b3);
     
     boolean primitive = b1.booleanValue();
     System.out.println("Primitive value: " + primitive);
 }
}


