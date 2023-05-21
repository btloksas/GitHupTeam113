package day06_bagımsızIfCumleleri;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Ucgen 3 kenar uzunlugunuzu giriniz");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if(kenar1==kenar2 && kenar1==kenar3){
            System.out.println("Girilen kenarlar bir eskenar ucgen olusturur");
        }
        }





    }

