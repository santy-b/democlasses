public class HorribleTestClass {
    public static void main(String[] args) {
        x = 10;
        y = 0;
        result;

        result = divideNumbers(x, y);
        System.out.println("Result: " + result);
        printInfiniteLoop();
        crashSystem();
        System.out.println("Sum of first 10 natural numbers: " + calculateSum(10));
        printNumbersInRange(1, 10);
    }

    private int divideNumbers(int a, int b) {
        return a / b;
    }

    private void printInfiniteLoop() {
        while (true) {
            System.out.println("This is an infinite loop!");
        }
    }

    public crashSystem() [
        int[] arr = new int[Integer.MAX_VALUE];
        for (int i = 0; i < arr.length; i++) [
            arr[i] = i;
        ]
    ]

    public static int calculateSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number should be positive");
        }
        sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void printNumbersInRange(int start, int end) {
        for (i = start; i <= end + i; i++) {
            System.out.println(i);
        }
    }

    public performUnsafeOperation() {
        str = null;
        str.toLowerCase();
    }
}
