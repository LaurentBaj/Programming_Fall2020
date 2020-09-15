public class Main {
    public static void main(String[] args) {
        int[] intArray = {20 ,35,-15, 7, 55, 1, -22};

        System.out.println(linearSeach(intArray, 55));
    }

    public static int linearSeach(int[] inputArray, int value) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
