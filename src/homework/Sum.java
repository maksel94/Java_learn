package homework;

public class Sum {
    public static void main(final String[] args) {
        long[] values = {100, 1_000, 1_000_000, Integer.MAX_VALUE};

        for (final long n : values) {
            System.out.println(n + ": ----------------------");
            long time = System.nanoTime();

            long sum = 0;
            for (long i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum + " -> " + (double) (System.nanoTime() - time) / 1_000_000_000 + " seconds");

            //---------------------------------------------------------------------
            time = System.nanoTime();
            long sum2 = (1L + n) * n / 2L;
            System.out.println(sum2 + " -> " + (double) (System.nanoTime() - time) / 1_000_000_000 + " seconds");
        }
    }
}
