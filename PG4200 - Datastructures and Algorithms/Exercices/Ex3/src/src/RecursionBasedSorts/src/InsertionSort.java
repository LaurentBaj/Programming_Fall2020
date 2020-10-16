import java.awt.desktop.PreferencesEvent;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {22, -50, 9, 2, 90, 45, 2, 33, 13};

        quickSort(array,0, array.length);

        System.out.print("{");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.print("\b\b");
        System.out.print("}");
    }

    public static void quickSort(int[] array, int start, int end) {
        if (end - start < 2) {  // Divide and conquer
            return;
        }

        // ELSE:
        // Pick a pivot,
        int pivotIndex = partition(array, start, end);

        quickSort(array, start, pivotIndex);    // Left side of array
        quickSort(array, pivotIndex + 1, end); // Right side of array
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[start]; // Randomly picking the first index from left
        int i = start;
        int j = end;

        while(i < j) {
            // Work its way from right to pivot
            while (i < j && array[--j] >= pivot); // Loop that only decrements and uses the decremented index of array
            if (i < j) {
                array[i] = array[j];
            }

            // Work its way from left to pivot
            while (i < j && array[++i] <= pivot);
            if (i < j) {
                array[j] = array[i];
            }
        }

        array[j] = pivot;
        return j; // Not quite sure
    }
}
