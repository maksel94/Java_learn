package array;

import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {
        // read source data
        int[] source = {1, -2, 3, -7, 5};
        int startIndex = 1;
        int endIndex = 4;

        // processing
        int[] destination = new  int[endIndex - startIndex];
        for (int i = 0; i < destination.length; i++) {
            destination[i] = source[i +startIndex];
        }
        // display results
        System.out.println(Arrays.toString(destination));
    }
}
