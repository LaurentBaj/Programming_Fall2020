package SelectionSort;

public class Main {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, -22, 1, 55};

        for (int lastUnsortedIndex = array.length - 1;
             lastUnsortedIndex > 0;
             lastUnsortedIndex--) {

            int largestNum = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largestNum]) {
                    largestNum = i;
                }
            }

            swap(array, largestNum, lastUnsortedIndex); // Swap Array[largestNum] and array[lastUnsortedIndex]

        }

        // Output
        for (int  i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    // Swap value positioning
    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
