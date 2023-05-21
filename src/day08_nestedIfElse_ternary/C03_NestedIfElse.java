package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        System.out.println("Lutfen cinziyetinizi giriniz..." +
                "\nKadin icin:K, Erkek icin: E giriniz");
        char cinsiyet = scan.next().charAt(0);

        if (yas < 16 || yas > 80) {
            System.out.println("Gecersiz yas");
        } else if (yas < 60) {
            if (cinsiyet == 'k' || cinsiyet == 'K') {
                System.out.println("Emekli olmak icin " + (60 - yas) + "yil daha calısmalisin");
            } else if (cinsiyet == 'e' || cinsiyet == 'E') {
                System.out.println("Emekli olmak icin " + (65 - yas) + "yil daha calısmalisin");
            } else {
                System.out.println("Gecersiz cinsiyet girisi");
            }
        } else if (yas < 65) {
            if (cinsiyet == 'k' || cinsiyet == 'K') {
                System.out.println("Emekli olabilirsin");
            } else if (cinsiyet == 'e' || cinsiyet == 'E') {
                System.out.println("Emekli olmak icin " + (65 - yas) + "yil daha calısmalisin");
            } else {
                System.out.println("Gecersiz cinsiyet girisi");
            }
        } else {
            if (cinsiyet == 'e' || cinsiyet == 'E' || cinsiyet == 'k' || cinsiyet == 'K') {
                System.out.println("Emekli olabilirsin");

            } else {
                System.out.println("Gecersiz cinsiyet girisi");
            }
        }
    }
}