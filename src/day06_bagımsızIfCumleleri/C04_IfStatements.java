package day06_bagımsızIfCumleleri;

import java.util.Scanner;

public class C04_IfStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");
        double not = scan.nextDouble();
        if (not >= 50&& not<=100) {
            System.out.println("Sinifi gectin");

        }


        if (not < 50) {
            System.out.println("Malesef kaldin");
        }

    }
}