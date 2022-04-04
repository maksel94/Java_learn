package cycles;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {
        // read source data
        var from = 100;
        var to = 1;
        var step = 1;

        // display results
        for (int i = from; i >= to; i -= step) {
            System.out.print(i + " ");
        }
        System.out.println();

        // read source data
        var from1 = 1;
        var to1 = 100;
        var step1 = 1;

        // display results
        for (int i = from1; i <= to1; i += step1) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
