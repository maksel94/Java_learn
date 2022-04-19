package array;

public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {
        // read source data
        int[] array = {-1, 2, 3, 4, 5, 6};

        // processing
        var allPositive = true;
        for (int value : array) {
            if (value < 0) {
                allPositive = false;
                break;
            }
        }

        // display results
        System.out.println(allPositive ? "All positive" : "Not all positive");
    }
}
