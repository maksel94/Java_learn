package string;

import java.util.Arrays;

public class StringBasicMethods {
    public static void main(String[] args) {
    String s = "hello";

        System.out.println("s.lengt()=" + s.length());
        System.out.println("s.charAt(0)=" + s.charAt(0));
        System.out.println("s.toCharArray()=" + Arrays.toString(s.toCharArray()));
    }
}
