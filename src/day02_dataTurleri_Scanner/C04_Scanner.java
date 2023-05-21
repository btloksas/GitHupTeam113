package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {


    public static void main(String[] args) {

        // 1.adim Scanner objesi oluşturun



        Scanner scan = new Scanner(System.in);

        //2. adim : kuıllanıcıya ne istediğinizi söyleyin

        System.out.println("Lütfen isminizi giriniz");

        // 3.adım girilen bbilgiyi içine oluşturacağımız bir variable oluşturun

        String kullaniciIsmi=  scan.next();

        System.out.println("Girilen isim:"+ kullaniciIsmi);



    }


}
