package homework;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 3, 4, 6, 7, 8, 10, 13, 14};
        int query = 10;
        // processing
        int index = binarySearchRecursive(array, query, 0, array.length - 1);
        // display results
        System.out.println("Index=" + index);
    }

    private static int binarySearchRecursive(int[] array, int query, int startIndex, int endIndex) {
        if (startIndex <= endIndex) {
            // int middleIndex = (startIndex + endIndex) / 2;
            int middleIndex = (startIndex + endIndex) >>> 1;
            int middleValue = array[middleIndex];
            if(query > middleValue) {
                return binarySearchRecursive(array, query, middleIndex + 1, endIndex);
            }else if(query < middleValue) {
                return binarySearchRecursive(array, query, startIndex, middleIndex - 1);
            } else {
                return middleIndex;
            }
        }
        return -1;
    }
}
