package cycles;

public class SumFrom1To100 {
    public static void main(String[] args) {
        //Сумма чисел от 1 до 100
        var from = 1;
        var to = 100;

        var sum = 0;
        for (var i = from; i <= to; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
