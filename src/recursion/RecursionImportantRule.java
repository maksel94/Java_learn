package recursion;

public class RecursionImportantRule {
    public static void main(String[] args) {
        function1(500000);
    }

    private static void function1(int count) {
        if (count > 0) {
            System.out.println(count);
            function1(count - 1);
        }
    }
}
