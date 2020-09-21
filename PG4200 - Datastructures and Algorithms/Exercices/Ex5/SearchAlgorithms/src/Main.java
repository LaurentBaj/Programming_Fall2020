public class Main {
    public static void main(String[] args) {
        int[] intArray = {20 ,35,-15, 7, 55, 1, -22};
        int[] a = new int[] {0, 1, 2, 3, 4, 5, 6, 7};

        // Testing Linear Search
        System.out.println(linearSeach(intArray, 55));
        System.out.println(linearSeach(intArray, 100));
        System.out.println(linearSeach(intArray, -22));

        System.out.println("\n");

        // Testing Binary Search
        System.out.println(iterativeBinarySeach(a, 6));
        System.out.println(iterativeBinarySeach(a, 10));
        System.out.println(iterativeBinarySeach(a, 2));

        // Testing Binary Search- Recursive Version
        System.out.println(recursiveBinarySearch(a, 6));
        System.out.println(recursiveBinarySearch(a, 10));
        System.out.println(recursiveBinarySearch(a, 2));

    }

    public static int linearSeach(int[] inputArray, int value) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Given that the array is sorted
    public static int iterativeBinarySeach(int[] inputArray, int value) {
        int start = 0;
        int end = inputArray.length;

        while (start < end) {
            int midpoint = (start + end)/2;
            if (inputArray[midpoint] == value) {
                return midpoint;
            } else if (inputArray[midpoint] < value) {
                start = midpoint+1;
            } else if (inputArray[midpoint] > value) {
                end = midpoint;
            }
        }
        return -1;
    }

    // Binary Search that uses recursion
    public static int recursiveBinarySearch(int[] inputArray, int value) {
        return recursiveBinarySearch(inputArray, 0, inputArray.length, value);
    }

    public static int recursiveBinarySearch(int[] inputArray, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;
        System.out.println("Midpoint = " + midpoint);

        if (inputArray[midpoint] == value) {
            return midpoint;
        }
        else if (inputArray[midpoint] < value) {
            return recursiveBinarySearch(inputArray, midpoint + 1, end, value);
        }
        else {
            return recursiveBinarySearch(inputArray, start, midpoint, value);
        }
    }

}
