//Lambda expressions
//1.Sum of Two Integers
//2.Define a functional interface SumCalculator { int sum(int a, int b); } and a lambda expression to sum two integers.
//3.Check If a String Is Empty
//    Create a lambda (via a functional interface like Predicate<String>) that returns true if a given string is empty.
//    Predicate<String> isEmpty = s -> s.isEmpty();
//4.Filter Even or Odd Numbers 
//5. Convert Strings to Uppercase/Lowercase
//6. Sort Strings by Length or Alphabetically
//7. Aggregate Operations (Sum, Max, Average) on Double Arrays
//8.Create similar lambdas for max/min. 
//9.Calculate Factorial



package Day_5_Assignment;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class LambdaTasks {

    // 2. Functional Interface
    interface SumCalculator {
        int sum(int a, int b);
    }
class Lambda_Expressions_1to9q {
	public static void main(String[] args) {
	// 1 & 2. Sum of Two Ints using Lambda
    SumCalculator calculator = (a, b) -> a + b;
    System.out.println("1. Sum: " + calculator.sum(10, 20));

    // 3.If a String Is Empty
    Predicate<String> isEmpty = s -> s.isEmpty();
    System.out.println("3. Is empty (\"\"): " + isEmpty.test(""));
    System.out.println("   Is empty (\"hello\"): " + isEmpty.test("hello"));

    // 4. Filter Even or Odd Num
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).toList();
    List<Integer> odds = numbers.stream().filter(n -> n % 2 != 0).toList();
    System.out.println("4. Evens: " + evens);
    System.out.println("   Odds: " + odds);

    // 5. Convert Strings to Upc/Lc
    List<String> names = Arrays.asList("alice", "BOB", "CharLie");
    List<String> upper = names.stream().map(String::toUpperCase).toList();
    List<String> lower = names.stream().map(String::toLowerCase).toList();
    System.out.println("5. Uppercase: " + upper);
    System.out.println("   Lowercase: " + lower);

    // 6. Sort Strings
    List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "kiwi", "mango"));
    List<String> byLength = words.stream().sorted(Comparator.comparingInt(String::length)).toList();
    List<String> alphabetical = words.stream().sorted().toList();
    System.out.println("6. Sorted by length: " + byLength);
    System.out.println("   Alphabetical: " + alphabetical);

    // 7. Aggregate Operations
    double[] values = {3.5, 6.7, 1.2, 9.8};
    DoubleSummaryStatistics stats = Arrays.stream(values).summaryStatistics();
    System.out.println("7. Sum: " + stats.getSum());
    System.out.println("   Max: " + stats.getMax());
    System.out.println("   Average: " + stats.getAverage());

    // 8. Lambdas for max/min
    BinaryOperator<Integer> max = Integer::max;
    BinaryOperator<Integer> min = Integer::min;
    System.out.println("8. Max of 5 & 10: " + max.apply(5, 10));
    System.out.println("   Min of 5 & 10: " + min.apply(5, 10));

    // 9. Factorial using lambda
    Function<Integer, Long> factorial = n -> {
        if (n < 0) return -1L;
        return IntStream.rangeClosed(1, n).mapToLong(i -> i).reduce(1, (a, b) -> a * b);
    };
    System.out.println("9. Factorial of 5: " + factorial.apply(5));
    System.out.println("   Factorial of 0: " + factorial.apply(0));
}
}
}
