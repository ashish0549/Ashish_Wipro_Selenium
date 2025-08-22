package Day_3_Assignment;
import java.util.Scanner;

public class Variables_SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (R) in percentage: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (T) in years: ");
        double time = scanner.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("\nThe Simple Interest is: " + interest);
        scanner.close();
    }
}
