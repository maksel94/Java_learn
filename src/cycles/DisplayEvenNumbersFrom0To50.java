package cycles;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {

        // read source data
        var from = 0;
        var to = 50;
        var step = 2;

        // display results
        for (var i = from; i <= to; i += step) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
