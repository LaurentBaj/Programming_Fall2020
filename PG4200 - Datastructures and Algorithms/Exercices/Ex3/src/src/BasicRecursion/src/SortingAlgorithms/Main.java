package SortingAlgorithms;

public class Main {

    public static void main(String[] args) {
        System.out.println(iterativeFactorial(4));
        System.out.println(recursiveFactorial(4));
    }

    // Method 1: Iteratively
    public static int iterativeFactorial(int num) {
        if (num == 0) { // Factorial of 0 is one for math-reasons I don't understand
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }


    // Method 2: Recursively
    public static int recursiveFactorial(int num) {
        if (num == 1 || num == 0) { // Base value
            return 1;
        }

        return num * recursiveFactorial(num - 1); // The order in which this method collects the values:
    }                                                  // 1 * 2 * 3 * 4

    
}
