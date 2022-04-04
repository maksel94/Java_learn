package cycles;

public class NumberReverse {
    public static void main(String[] args) {
        //Реверс числа
        var number = 123456789;

        // Обработка
        var result = 0;
        var temp = number;
        while (temp != 0) {
            var digit = temp % 10;
            result = result * 10 + digit;
            temp /= 10;   // temp = temp / 10
        }

        // Вывод результата
        System.out.println("Reverse number: " + result);
    }
}
