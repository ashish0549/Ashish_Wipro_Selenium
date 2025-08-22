package Day_6_Assignment;
import java.util.Scanner;
class TypeCastingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        double doubleValue = intValue;
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);

        System.out.print("Enter a double: ");
        double inputDouble = scanner.nextDouble();
        int castedInt = (int) inputDouble;
        short castedShort = (short) castedInt;
        System.out.println("Original double: " + inputDouble);
        System.out.println("Casted to int: " + castedInt);
        System.out.println("Casted to short: " + castedShort);

        int x = 5;
        System.out.println("x = " + x);

        scanner.close();
    }
}

