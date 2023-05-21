package day14_methodOverloading_whileloop;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {

        // kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar,
        // her seferinde hatalari soyleyip yeni sifre isteyin
        // sartlarin saglayan sifre oldugunda
        // "5.denemenizde basarili sifre olusturuldu" seklinde aciklama yazin
        // - ilk harf kucuk harf olmali
        // - son harf buyuk harf olmali
        // - bosluk icermemeli
        // - 8 karakter veya daha uzun olmali

         Scanner scan = new Scanner(System.in);

         int girilenSayi=0;
         int toplam=0;
         int girilenSayiadedi=0;

         while (toplam<500){
             System.out.println("Toplanmak uzere bir tam sayi giriniz");
             girilenSayi=scan.nextInt();
             toplam+=girilenSayi;
             girilenSayiadedi++;


         }
        System.out.println("Toplam:"+ girilenSayiadedi+"adet sayi girildi ve toplami:"+ toplam);


    }
}
