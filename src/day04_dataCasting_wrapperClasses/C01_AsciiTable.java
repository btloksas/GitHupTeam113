package day04_dataCasting_wrapperClasses;

public class C01_AsciiTable {

    public static void main(String[] args) {

        System.out.println(5 + 'a'); // 5+97=102

        char ilkHarf =101 ;

        System.out.println(ilkHarf);

        char girilenChar = 'f';
        System.out.println(girilenChar+1);

        System.out.println("Girilen harfin 1 sonrası: " + (char) (girilenChar+1));

        girilenChar='M';

        System.out.println(girilenChar-2);

        System.out.println((char) (girilenChar-2));


    }
}
