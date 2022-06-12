package decomposition;

import java.util.Arrays;

public class ReturnNewArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNewArray1()));
        System.out.println(Arrays.toString(getNewArray2()));
        System.out.println(Arrays.toString(getNewArray3()));
    }

    private static int[] getNewArray1() {
        int[] ar = {1, 2, 3};
        return ar;
    }

    private static int[] getNewArray2() {
        int[] ar = new int[3];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        return ar;
    }

    private static int[] getNewArray3() {
        return new int[]{1, 2, 3};
    }
}
