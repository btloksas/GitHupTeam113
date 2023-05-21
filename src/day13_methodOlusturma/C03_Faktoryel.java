package day13_methodOlusturma;

public class C03_Faktoryel {

    public static void main(String[] args) {

       int sonuc= faktoryelHesapla(5);
        System.out.println(sonuc);
    }

    public static int faktoryelHesapla(int sayi) {

        int faktoryel=1;
        for (int i = 0; i >=1; i--) {

            faktoryel *=i;


        }
        return faktoryel;

    }
}

