package Day_7_Assignment;
//3. Pass primitive data types to a method
class PassByValue3 {
 static void modifyPrimitives(int a, double b, boolean c) {
     a = 999;
     b = 9.99;
     c = !c;
     System.out.println("Inside method: a=" + a + ", b=" + b + ", c=" + c);
 }
 
 public static void main(String[] args) {
     int num = 10;
     double decimal = 3.14;
     boolean flag = true;
     
     System.out.println("Before method: num=" + num + ", decimal=" + decimal + ", flag=" + flag);
     modifyPrimitives(num, decimal, flag);
     System.out.println("After method: num=" + num + ", decimal=" + decimal + ", flag=" + flag);
 }
}

