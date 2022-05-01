package string;

import javax.sound.midi.Soundbank;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s = "Hello world!";

        StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            builder.append(s.charAt(i));
        }

        /*
        StringBuilder builder = new StringBuilder();
        for (int i = 0; < s.length(); i++) {
            builder.insert(0, s.charAt(i));
            }
         */

        /*
        StringBuilder builder = new StringBuilder();
        builder.append(s).reverse();
        */

        System.out.println(builder.toString());
    }
}
