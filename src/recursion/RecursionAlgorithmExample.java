package recursion;

public class RecursionAlgorithmExample {
    public static void main(String[] args) {
        printNumbersFrom1To10();
        printNumbersFromAndTo(1);
    }

    /*private static void printNumbersFrom1To10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }*/

    private static void printNumbersFrom1To10() {
        int i = 1;
        while (true) {
            if (i > 10) {
                System.out.println();
                break;
            }
            System.out.print(i + "\t");
            i++;
        }
    }

    private static void printNumbersFromAndTo(int i) {
        if (i > 10) {
            System.out.println();
        } else {
            System.out.print(i + "\t");
            printNumbersFromAndTo(i + 1);
        }
    }
}
