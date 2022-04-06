package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayElement {
    public static void main(String[] args) {

        int[] array = {8, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        array[0] = 45;
        System.out.println(Arrays.toString(array));

        System.out.println(array[0] + " ");
        System.out.println(array[1] + " ");
        System.out.println(array[2] + " ");
        System.out.println(array[3] + " ");
        System.out.println(array[4] + " ");
    }
}
