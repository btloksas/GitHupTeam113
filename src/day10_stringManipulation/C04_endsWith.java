package day10_stringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen email adresinizi giriniz");

        String email = scan.nextLine();

        if (!email.contains("@")) {
            System.out.println("gecersiz mail");
        }else if(email.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        }else if(email.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }
    }
}