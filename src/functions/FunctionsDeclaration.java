package functions;


import java.util.Scanner;

public class FunctionsDeclaration {
    private static void function1() {
        // sout current date
    }

    private static void function2(int a) {
        if (a > 0) {
            //..
        }
    }

    private static void function3(int firstParameter, int secondParameter) {

    }

    private static void function4(boolean a, String b, double c) {

    }

    private static void function5(int[] array1, double[] array2, boolean[][][][] array3) {

    }

    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        double e = 5.6;

        int[] array2 = new int[2];
        double[] array1 = new double[100];
        boolean[][][][] array3 = new boolean[0][0][0][0];

        function1();
        function2(2);
        function3(a, b);//  function3(2, 7);
        function4(true, "Hello", e);
        function5(array2, array1, array3);
    }
}