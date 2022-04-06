package cycles;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {

        var to = 9;

        for (int i = 2; i <= to; i++) {
            for (int j = 2; j <= 5; j++) {
                var res = i * j;
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 2; i <= to; i++) {
            for (int j = 6; j <= to; j++) {
                var res = i * j;
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            System.out.println();

        }
    }
}
