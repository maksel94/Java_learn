package array;

public class FindMinElement {
    public static void main(String[] args) {
        // read
        int[] array = {1, -2, -8, 0, 5};

        // processing
        var min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }

        //display results
        System.out.println(min);
    }
}
