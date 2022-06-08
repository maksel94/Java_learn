package decomposition;

import java.util.Arrays;

public class PrintArrayElementsMoreThanAvg {
    public static void main(String[] args) {
        int[] array = {1, 4, -5, -2, 0, 12};

        int[] result = subArrayWithMoreThanAvgElements(array);

        System.out.println(Arrays.toString(result));
    }

    private static int[] subArrayWithMoreThanAvgElements(int[] array) {
        int avg = calculateAvg(array);
        return extractElementsMoreThanAvg(array, avg);
    }

    private static int calculateAvg(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return round(sum / array.length);
    }

    private static int round(double value) {
        int round = (int)value;
        if(value - round >= 0.5) {
            return +1;
        } else {
            return round;
        }
    }

    private static int[] extractElementsMoreThanAvg(int[] array, int avg) {
        int[] result = new int[array.length];
        int count = 0;
        for (int value : array) {
            if(value > avg) {
                result[count++] = value;
            }
        }
        return trim(result, count);
    }

    private static int[] trim(int[] array, int count) {
        int[] result = new int[count];
        /*
        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }
         */
        System.arraycopy(array, 0, result, 0, count);
        return result;
    }
}
