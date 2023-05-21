package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C05_Ternary {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();
        /*
        if (sayi>=0){
            System.out.println(sayi);
        }else{
            sayi=sayi*(-1);
            System.out.println(sayi);
            }

         */
        sayi= sayi>=0 ? sayi:sayi*(-1);
        System.out.println(sayi);
        }
    }



