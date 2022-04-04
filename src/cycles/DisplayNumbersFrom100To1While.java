package cycles;

public class DisplayNumbersFrom100To1While {
    public static void main(String[] args) {
        {
            // 100 - 1 -------------------------------
            // read source data
            var from = 100;
            var to = 1;
            var step = 1;

            // display results
            int i = from;
            while (i >= to) {
                System.out.print(i + " ");
                i -= step;
            }
            System.out.println();
        }
            // 50 - 1 --------------------------------
        {
            // read source data
            var from = 0;
            var to = 50;
            var step = 2;

            // display results
            var i = from;
            while (i <= to) {
                System.out.print(i + " ");
                i += step;
            }
            System.out.println();
        }
    }
}
