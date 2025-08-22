package Day_2_Assignment;

public class multiplication_table {

	public static void main(String[] args) {
		int number = 17;

        System.out.println("Multiplication Table for " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}