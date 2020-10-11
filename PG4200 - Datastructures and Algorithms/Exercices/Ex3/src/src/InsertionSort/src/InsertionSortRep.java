public class InsertionSortRep {
    public static void main(String[] args) {

        int[] array = {22, -15, 35, 20, 7, 55};

        for (int firstSortedIndex = 1; firstSortedIndex < array.length; firstSortedIndex++) {

            int newElement = array[firstSortedIndex];

            int i; // Initialize outside to make it more accessible

            // Insert element to correct index
            for (i = firstSortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }

            array[i] = newElement; // Insert new element to correct index

        }

        // Output
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
