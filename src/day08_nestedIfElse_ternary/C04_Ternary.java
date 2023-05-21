package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi%2==0 ? "Cift sayi" : "Tek sayi");


    }
}
