package day06_bagımsızIfCumleleri;

public class C01_ifStatements {
    public static void main(String[] args) {


        int a = 200;

        int b = 130;
        if (a > b) {
            System.out.println("a b'den buyuk");
        }

        if (a % 2 == 0) {
            System.out.println("a cift sayidir");
        }

        if (b > 100) {
            System.out.println("b 100'den buyuktur");
        }

        boolean sonuc = a * 7 > b;
        if (sonuc) {
            System.out.println("istenen sart saglandi");
        }

    }
}
