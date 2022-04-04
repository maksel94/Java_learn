package cycles;

public class DoWhile100To1 {
    public static void main(String[] args) {

        {
            // read source data
            var from = 100;
            var to = 1;
            var step = 1;

            // display results
            int i = from;
            do {
                System.out.print(i + " ");
                i -= step;
            } while (i >= to);
            System.out.println();
        }

        {
            // read source data
            var from = 0;
            var to = 50;
            var step = 2;

            // display results
            var i = from;
            do {
                System.out.print(i + " ");
                i += step;
            } while (i <= to);
            System.out.println();
        }
    }
}
