package SelectionSort;

public class Main {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, -22, 1, 55};

        for (int lastIndexOutOfBound = array.length - 1; lastIndexOutOfBound > 0; lastIndexOutOfBound--) {

            int largestNum = 0;

            for (int i = 1; i <= lastIndexOutOfBound; i++) {
                if (array[i] > array[largestNum]) {
                    largestNum = i;
                }
            }

            swap(array, largestNum, lastIndexOutOfBound);

        }

        // Output
        for (int i = 0; i < array.length; i++) {
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
