package recursion;

public class SumFrom1To100UsingRecursion {
    public static void main(String[] args) {
        System.out.println(sumOf(1, 0));
        System.out.println(sumOf(100));
    }

    private static int sumOf(int current, int sum) {
        if (current > 100) {
            return sum;
        } else {
            var newSum = sum + current;
            return sumOf(current + 1, newSum);
        }
    }

    private static  int sumOf(int value) {
        if (value == 0) {
            return 0;
        } else {
            var prevSum = sumOf(value - 1);
            return value + prevSum;
        }
    }
}
