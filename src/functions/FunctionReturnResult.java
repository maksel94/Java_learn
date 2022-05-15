package functions;

public class FunctionReturnResult {
    private static int function01(){
        return 2 + 4;
    }

    private static int function02() {
        if (2 > 3) {
            return 2;
        }
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                return 8;
            }
        }
        return function01();
    }
    private static void function03() {

    }
    private static void function04() {
        int a = 0;
        if (a > 2) {
            return;
        }
    }

    public static void main(String[] args) {
    function03();
    function04();

    function01();
    function02();

        System.out.println(function01());
        System.out.println(function02());

        int a = function01();
        if (a > 0) {

        }
        int b = function02();
        int c = b + function01();

        if (function01() > 0) {

        }
        if (function02() % 12 < 0) {

        }
    }
}
