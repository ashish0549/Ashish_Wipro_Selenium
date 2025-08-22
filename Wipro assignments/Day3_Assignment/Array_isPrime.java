
package Day_3_Assignment;

public class Array_isPrime {

	public static void main(String[] args) {
		int[] numbers = {10, 3, 5, 8, 13, 18, 29, 33};

        System.out.println("Prime numbers in the array:");

        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

       
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}