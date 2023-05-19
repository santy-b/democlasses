import java.util.ArrayList;
import java.util.List;

public class ExcellentTestClass {
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        printNames(names);
        System.out.println("Sum: " + addNumbers(10, 20));
        System.out.println("Concatenation: " + concatenateStrings("Hello", "World"));
        printEvenNumbers(10);
        System.out.println("Is 'madam' a palindrome? " + isPalindrome("madam"));
    }

    private static void printNames(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static int addNumbers(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Numbers should be positive");
        }
        return a + b;
    }

    public static String concatenateStrings(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new IllegalArgumentException("Strings cannot be null");
        }
        return s1 + s2;
    }

    public static void printEvenNumbers(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number should be positive");
        }
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    public static boolean isPalindrome(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Word cannot be null or empty");
        }
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static int[] generateFibonacciSeries(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Count should be positive");
        }
        int[] fibonacciSeries = new int[count];
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;
        for (int i = 2; i < count; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        return fibonacciSeries;
    }
}

