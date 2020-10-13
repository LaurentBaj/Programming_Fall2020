public class MergeSort {

    public static void main(String[] args) {

        int[] intArray = {22, 54, -17, 25, 4, 9, 21, -12, 1, 99};

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        //Split until there is only one left and right values
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);

        // This method merges the sub-array upwards until original array
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        // If desired relationship between left and right achieved
        // No need to use temp arrays
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        // If the elements are not at their desired position - DO EVERYTHING BELOW
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // If leftover value (from left arr) put it in desired index
        // i - is the index we have not handled yet
        // start + tempIndex is the end of the temp array (desired spot)
        // mid- 1 won't do anything
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        // Copy over the temp array
        // Only elements copied in the temp-array, not entire temp
        System.arraycopy(temp, 0, input, start, tempIndex); //
    }

}
