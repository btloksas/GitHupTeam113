package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen isminizi giriniz");

        String isim= scan.nextLine();

        System.out.print("Lutfen soyisminizi yaziniz");

        String soyisim= scan.nextLine();

        System.out.print("Lütfen yasinizi giriniz");
        double yas =scan.nextDouble();


/*
        System.out.println("Isminiz : " + isim);

        System.out.println("Soyisim : " + soyisim);

        System.out.println("Yasiniz : " + yas);

        System.out.println("Kaydiniz basariyla tamamlanmiştir");


*/
        System.out.print("Isminiz : " + isim);

        System.out.print("Soyisim : " + soyisim);

        System.out.print("Yasiniz : " + yas);

        System.out.print("Kaydiniz basariyla tamamlanmiştir");

        System.out.println("Isminiz : " + isim+
                "\nSoyisiminiz : " + soyisim+
                "\nYasiniz : " + yas+
                "\nKaydiniz basariyla tamamlanmiştir" );




    }
}
