package day06_bagımsızIfCumleleri;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%5==0){
            System.out.println("Sayi 5'in tam kati");
        }
        if (sayi%3 ==0) {
            System.out.println("Uc ile bolunebilen sayi");
        }
    }
}
