package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C01_ArtikYil {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");

        int yil= scan.nextInt();if(yil%4!=0){
            System.out.println("Artik yil değil");
        }else if (yil%100!=0){
            System.out.println("artik yil");
        }else if (yil%400==0){
            System.out.println("Artik yil");
        }else{
            System.out.println("Artik yil değil");
        }
    }
}
