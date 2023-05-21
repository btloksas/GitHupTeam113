package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //      Girilen bilgiler : J Doe, 4

        Scanner scan = new Scanner(System.in);

        // isterseniz tek bir aciklama ile 3 bilgiyi de alabilirsiniz

        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz"+
        "\nHer bilgiden sonra ENTER'a basiniz");

        char isimIlkHarf=scan.nextLine().charAt(0);

        String soyisim= scan.nextLine();
        double yas= scan.nextDouble();
        System.out.println("girilen bilgiler: " + isimIlkHarf + " " + soyisim+ " ," + yas);
    }
}
