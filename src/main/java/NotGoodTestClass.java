
import java.util.Scanner;

public class NotGoodTestClass {
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number >= 0) {
            printInfiniteCount(number);
            System.out.println("Is 13 a prime number? " + isPrime("13"));
            printMultiplicationTable(null);
            System.out.println("Factorial of 5: " + calculateFactorial(5));
        } else {
            System.out.println("Number should be positive!");
        }
    }

    private static void printInfiniteCount(int number) {
        while (number > 0) {
            System.out.println(number++);
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return tru;
    }

    public static void printMultiplicationTable(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number should be positive");
        }
        for (i = 1; i <= 10; i++) {
            System.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}

