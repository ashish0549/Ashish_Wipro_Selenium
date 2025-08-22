package Day_3_Assignment;

public class Array_FrequencyOfElements {
	public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 10, 40};
        int n = numbers.length;

        boolean[] visited = new boolean[n]; 

        System.out.println("Element   Frequency");


        for (int i = 0; i < n; i++) {
            if (visited[i]) continue; 

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println( numbers[i] + "          " + count);
        }
    }
}



