package day06_bagımsızIfCumleleri;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);

        if ('a'<=krk && krk<='z'){
            System.out.println(Character.toUpperCase(krk));
        }else{
            System.out.println(krk);
        }
    }
}
