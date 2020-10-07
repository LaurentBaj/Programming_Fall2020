package BubbleSort;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {22, 5, -9, 32, 12, 2};

        // Bubble Sort Imp
        for (int lastSortedIndex = intArray.length; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i + 1, i);
                }
            }
        }

        // Output
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }

        System.out.println("\b\b");

    }

    // Swap Method
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
