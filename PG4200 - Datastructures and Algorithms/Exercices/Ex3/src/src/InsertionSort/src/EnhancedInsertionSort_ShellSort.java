public class EnhancedInsertionSort_ShellSort {

    public static void main(String[] args) {

         int[] array = {-22, 55, 7, -15, 20, 35, 5};

         for (int gap = array.length/2; gap > 0; gap /= 2) {    // Preliminary work by reducing gap

             for (int i = gap; i < array.length; i++) { // Gaping Insertion sort (last iteration it is a trad Insertion)
                 int newElement = array[i];             // because the gap will then decrease to one == Insertion Sort

                 int j = i;

                 while (j >= gap && array[j - gap] > newElement) {
                     array[j] = array[j- gap];
                     j -= gap;
                 }

                 array[j] = newElement;

             }

         }



         // Output
         for (int i = 0; i < array.length; i++) {
             System.out.println(array[i]);
         }


    }

}
