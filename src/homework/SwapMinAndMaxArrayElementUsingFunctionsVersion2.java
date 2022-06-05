package homework;

import java.util.Arrays;

public class SwapMinAndMaxArrayElementUsingFunctionsVersion2 {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, -2, 3, 8, 5};

        // processing
        int[] indexes = getIndexesOfMinAndMaxElements(array);
        swap(array, indexes[0], indexes[1]);

        // display results
        System.out.println(Arrays.toString(array));
    }

    private static int[] getIndexesOfMinAndMaxElements(int[] array) {
        var indexOfMinElement = 0;
        var minValue = array[0];
        var indexOfMaxElement = 0;
        var maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            var current = array[i];
            if (current < minValue) {
                minValue = current;
                indexOfMinElement = i;
            }
            if (current > maxValue) {
                maxValue = current;
                indexOfMaxElement = i;
            }
        }
        return new int[]{indexOfMinElement, indexOfMaxElement};
    }

    private static void swap(int[] array, int index1, int index2) {
        var temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
}
