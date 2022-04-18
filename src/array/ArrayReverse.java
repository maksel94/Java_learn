package array;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(array));

        // processing
        for (int i = 0; i < array.length / 2; i++) {
            var temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        // display results
        System.out.println(Arrays.toString(array));
    }
}
