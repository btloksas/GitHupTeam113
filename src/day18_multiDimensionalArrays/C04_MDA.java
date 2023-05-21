package day18_multiDimensionalArrays;

public class C04_MDA {
    public static void main(String[] args) {

        String[][] siniflar ={{"A","B","G","M"},{"F","P","A","V"},{"K","D","Q"}};

        System.out.println(siniflar[0][2]);

        siniflar[2][2] ="Y";
        System.out.println(siniflar[0].length);

        int toplamOgrSayisi=0;
        for (int i = 0; i <siniflar.length ; i++) {
            toplamOgrSayisi += siniflar[i].length;
        }
        System.out.println("Toplam ogrenci sayisi : " + toplamOgrSayisi);




    }
}
