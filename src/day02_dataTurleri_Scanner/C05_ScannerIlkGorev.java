package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_ScannerIlkGorev {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir sayi girin");

        double girilenSayi= scan.nextDouble();

        System.out.println("Girilen sayinin karesi" + girilenSayi*girilenSayi);
    }


}
