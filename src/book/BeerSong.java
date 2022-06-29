package book;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "бутылок";

        while (beerNum > 0) {
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum--;

            if (beerNum == 1) {
                word = " бутылка";
            }
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на стене");
                System.out.println();
            } else {
                System.out.println("Нет бутылок на стене");
                System.out.println();
            }
        }
    }
}
