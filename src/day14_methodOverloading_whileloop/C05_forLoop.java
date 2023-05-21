package day14_methodOverloading_whileloop;

import java.util.Scanner;

public class C05_forLoop {

    public static void main(String[] args) {

        int toplam=0;

        for (int i = 50; i <=100 ; i++) {
            toplam+=i;

        }
        System.out.println("Toplam:" +toplam);

        // ayni soruyu while loop ile yapalim
        // for loop'da 3 seyi takip ederiz
        //  1- baslangic degeri
        //  2- bitis sarti
        //  3- artis veya azalis sekli
        toplam =0;
        int sayi=50;
        while (sayi<=100){
            toplam += sayi;
            sayi++;
        }
        System.out.println("while ile toplam : " + toplam);



    }
}
