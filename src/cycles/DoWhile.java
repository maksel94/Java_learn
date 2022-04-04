package cycles;

public class DoWhile {
    public static void main(String[] args) {

        {
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
        }

    }
}
