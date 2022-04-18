package array;

public class ArrayElementCount {
    public static void main(String[] args) {
        // read source data
        int[] array = {5, 2, 8, -2, 9, 2, 2, 2, 2, 2, 2, 2};
        var element = 2;

        // processing
        var count = 0;
        for (int value : array) {
            if (value == element) {
                count++;
            }
        }

        // display results
        System.out.println(count);
    }
}
